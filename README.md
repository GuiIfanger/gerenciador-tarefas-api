# API REST - Gerenciador de Tarefas

API RESTful desenvolvida em Java com Spring Boot como parte de projetos práticos de engenharia de software. A aplicação implementa um CRUD completo de tarefas, com persistência em banco de dados MySQL e documentação interativa via Swagger (OpenAPI).

## Funcionalidades

* **Listagem:** Consulta de todas as tarefas cadastradas (`GET /tarefas`).
* **Busca por ID:** Retorna uma tarefa específica, ou `404 Not Found` caso não exista (`GET /tarefas/{id}`).
* **Cadastro:** Criação de novas tarefas informando nome, descrição, data de entrega e status (`POST /tarefas`).
* **Atualização (Update):** Modificação dos dados de uma tarefa existente buscando pelo ID (`PUT /tarefas/{id}`).
* **Exclusão (Delete):** Remoção de uma tarefa com base no ID (`DELETE /tarefas/{id}`).
* **Documentação Interativa:** Interface Swagger para testar todos os endpoints direto no navegador.

## Tecnologias Utilizadas

* Java (JDK 21)
* Spring Boot 3
* Spring Data JPA (persistência de dados)
* MySQL e MySQL Connector/J
* Springdoc OpenAPI / Swagger UI
* Maven (gerenciamento de dependências)

## Exemplo de Requisição

Corpo usado nos métodos `POST` e `PUT`:

```json
{
  "nome": "Estudar Spring Data JPA",
  "descricao": "Aprender mapeamento de entidades e repositórios",
  "dataEntrega": "2026-10-10",
  "status": "EM_ANDAMENTO"
}
```

Valores aceitos para o campo `status`: `PENDENTE`, `EM_ANDAMENTO` e `CONCLUIDO`.

## Como Executar

1. Tenha o Java 21, o Maven e o MySQL instalados.
2. Crie o banco de dados: `CREATE DATABASE tarefas_db;`
3. Ajuste usuário e senha do MySQL em `src/main/resources/application.properties`.
4. Execute o projeto com o comando:

```bash
mvn spring-boot:run
```

A API ficará disponível em `http://localhost:8080`.

## Documentação (Swagger)

Com a aplicação em execução, acesse:

`http://localhost:8080/swagger-ui/index.html`
