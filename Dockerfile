# build environment
FROM maven:3.8.1-openjdk-11-slim as build
COPY * /home/app
COPY settings.xml /root/.m2/settings.xml
ARG SERVER_USERNAME
ARG SERVER_PASSWORD
RUN mvn -f /home/app/pom.xml clean package

# production environment
FROM nginx:stable-alpine
COPY --from=build /app/index.html /usr/share/nginx/html
COPY --from=build /app/openapi /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
