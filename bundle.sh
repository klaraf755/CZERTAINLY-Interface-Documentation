for file in ./openapi/*.yaml
do
  redoc-cli bundle ./"$file" -o ./"${file/yaml/html}" --options.theme.logo.gutter=20px
done
