# Retail Store Billing Counter

The service is [Spring Boot] project for Retail Store Billing counter. The service is used for creating products and 
also checkout functionality for the retail store.

Swagger documentation is also integrated with service. It can be accessed at 
`http://localhost:8080/swagger-ui.html`  

The service also creates the database and seeds few products.

[Spring Boot]: http://projects.spring.io/spring-boot/

## Contents

- [Setup](#setup)
- [Build](#build)
- [Development](#development)

## Setup

1. Prerequisites
    
    - JRE and JDK  
    - Maven 
    - MySQL

2. Clone project

    `$ git clone git@github.com:prasanna-webonise/billing-counter.git`
    
## Build

After the cloning repo run below command line for building   
```
mvn clean install 
```
Once the build is completed run below command line for running
```
mvn spring-boot:run 
```

## Development

This project uses [WebJars] to provide libraries via Maven dependencies. These dependencies are downloaded 
while building project. 