<h1 align="center">
  Projeto - TODO List 📃
</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior. 

O projeto foi elaborado [nesse vídeo](https://youtu.be/IjProDV001o) da desenvolvedora Giuliana Bezerra.

## Tecnologias 👨‍💻

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/):

- Criar Tarefa 
```
POST: localhost:8080/todos
 • Body da Requisição:
{
  "nome":"List Todo 1",
  "descricao":"Desc Todo 1",
  "prioridade": 1
}

[
  {
    "id": 1,
    "nome": "List Todo 1",
    "descricao": "Desc Todo 1",
    "realizado": false,
    "prioridade": 1
  }
]
```

- Listar Tarefas
```
GET: localhost:8080/todos

[
  {
    "id": 1,
    "nome": "List Todo 1",
    "descricao": "Desc Todo 1",
    "realizado": false,
    "prioridade": 1
  }
]
```

- Atualizar Tarefa
```
PUT: localhost:8080/todos
 • Body da Requisição:
{
  "id":1,
  "nome":"List Todo 1 - Up Test",
  "descricao":"Desc Todo 1 - Up Test",
  "prioridade":2
}

[
  {
    "id": 1,
    "nome": "List Todo 1 - Up Test",
    "descricao": "Desc Todo 1 - Up Test",
    "realizado": false,
    "prioridade": 2
  }
]
```

- Remover Tarefa
```
DELETE: localhost:8080/todos/1

[ ]
```
