# build environment
FROM maven:3.8.1-openjdk-11-slim as build
COPY ./ /home/app
COPY settings.xml /root/.m2/settings.xml
ARG SERVER_USERNAME
ARG SERVER_PASSWORD
RUN mvn -f /home/app/pom.xml clean verify

# build documentation
FROM node:alpine as docs
RUN npm install -g redoc-cli
COPY --from=build /home/app/openapi /home/app
RUN redoc-cli bundle /home/app/doc-openapi-ca-connector.yaml -o /home/app/doc-openapi-ca-connector.html --options.theme.logo.gutter=20px
RUN redoc-cli bundle /home/app/doc-openapi-credential-provider.yaml -o /home/app/doc-openapi-credential-provider.html --options.theme.logo.gutter=20px

# production environment
FROM nginx:stable-alpine
COPY --from=build /home/app/index.html /usr/share/nginx/html/index.html
COPY --from=build /home/app/images/3keycompany.png /usr/share/nginx/html/images/3keycompany.png
COPY --from=docs /home/app /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
