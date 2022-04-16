# springboot_with_GraphQL
simple spring boot API with H2 database and GraphQL

If you need start simple spring boot with graphql you can use this repo



# query

```json
{"query":"{getAllDogs {id}}"}
```

# mutation
```
{ "query":"mutation {updateDogName(newName:\"Ghost\", id:4) { id name breed } }" }

```
