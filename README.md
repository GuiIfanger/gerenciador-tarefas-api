API REST - Gerenciador de Tarefas

API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de tarefas (CRUD), integrada ao banco de dados MySQL e documentada de forma interativa com Swagger (OpenAPI).

Tecnologias Utilizadas
Java 21
Spring Boot 3
Spring Data JPA (persistência de dados)
MySQL Connector/J (driver do banco de dados)
Springdoc OpenAPI / Swagger UI (documentação da API)
Maven (gerenciamento de dependências)
Endpoints

URL base: http://localhost:8080/tarefas

Método	Endpoint	Descrição	Status HTTP
GET	/tarefas	Retorna a lista de todas as tarefas	200 OK
GET	/tarefas/{id}	Busca uma tarefa específica pelo ID	200 OK / 404 Not Found
POST	/tarefas	Cria uma nova tarefa	201 Created
PUT	/tarefas/{id}	Atualiza uma tarefa existente pelo ID	200 OK / 404 Not Found
DELETE	/tarefas/{id}	Remove uma tarefa pelo ID	204 No Content / 404 Not Found
Modelo de Dados

Exemplo de corpo de requisição para POST e PUT:

json
{
  "nome": "Estudar Spring Data JPA",
  "descricao": "Aprender mapeamento de entidades e repositórios",
  "dataEntrega": "2026-10-10",
  "status": "EM_ANDAMENTO"
}
Campo	Tipo	Descrição
nome	String	Nome da tarefa
descricao	String	Detalhes da tarefa
dataEntrega	Date	Data de entrega no formato yyyy-MM-dd
status	Enum	PENDENTE, EM_ANDAMENTO ou CONCLUIDO
Como Executar
Pré-requisitos
Java 21
Maven
MySQL
Passo a passo
Clone o repositório e acesse a pasta do projeto:
bash
   git clone <url-do-repositorio>
   cd <nome-da-pasta>
Crie o banco de dados no MySQL:
sql
   CREATE DATABASE tarefas_db;
Configure o acesso ao banco em src/main/resources/application.properties:
properties
   spring.datasource.url=jdbc:mysql://localhost:3306/tarefas_db
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
Execute a aplicação:
bash
   mvn spring-boot:run

A API ficará disponível em http://localhost:8080.

Documentação Interativa (Swagger)

Com a aplicação em execução, acesse o Swagger UI no navegador para testar os endpoints:

http://localhost:8080/swagger-ui/index.html

Exemplos de Uso

Criar uma tarefa

bash
curl -X POST http://localhost:8080/tarefas \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Estudar Spring Data JPA",
    "descricao": "Aprender mapeamento de entidades e repositórios",
    "dataEntrega": "2026-10-10",
    "status": "PENDENTE"
  }'

Listar todas as tarefas

bash
curl http://localhost:8080/tarefas

Remover uma tarefa

bash
curl -X DELETE http://localhost:8080/tarefas/1
Estrutura do Projeto
src/main/java/.../
├── controller/   # Endpoints REST
├── service/      # Regras de negócio
├── repository/   # Acesso ao banco (Spring Data JPA)
└── model/        # Entidades e enums

Ajuste os nomes das pastas conforme a organização real do seu projeto.
