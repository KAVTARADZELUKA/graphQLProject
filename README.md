# GraphQL Project

## Description
This project is a GraphQL service built with Spring Boot. It allows querying for books and their authors using a GraphQL API.


## Installation

Install my-project with npm
## Installation
1. Clone the repository:
```bash
  git clone <repository-url>
```
2. Navigate to the project directory:
```bash
  cd graphQLProject
```
3. Build the project using Maven:
```bash
  mvn clean install
```
    
## Usage/Examples
1. Run the application:
```bash
mvn spring-boot:run
```
2. Access the GraphQL endpoint at 'http://localhost:8080/graphql'.

## GraphQL Schema

```graphql
type Query {
    books: [Book]
    bookById(id: ID): Book
}

type Book {
    id: ID
    name: String
    pageCount: Int
    author: Author
}

type Author {
    id: ID
    name: String
}

```
