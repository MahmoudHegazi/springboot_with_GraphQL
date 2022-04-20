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


# add graphql to spring boot

```xml
      <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>

        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphql-java-tools</artifactId>
            <version>5.2.4</version>
        </dependency>

        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>
```

### setup

```
spring.jpa.defer-datasource-initialization=true
spring.datasource.driverClassName=org.h2.Driver

spring.h2.console.enabled=true
spring.h2.console.path=/h2
spring.datasource.url=jdbc:h2:mem:newdogdata

graphql.servlet.mapping=/graphql
graphql.servlet.enabled=true
graphql.servlet.corsEnabled=true

graphiql.enabled=true
graphiql.endpoint=/graphql
graphiql.mapping=graphiql
```

#### auto incerment to work smooth with graphql mutations inserts
```@GeneratedValue(strategy = GenerationType.IDENTITY)``` instead of ```@GeneratedValue(strategy = GenerationType.AUTO)```

```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
@Column(name = "id", nullable = false)
private Long id;
```
