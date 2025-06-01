# Sistema em Camadas com Spring Boot

Este é um projeto simples desenvolvido com **Java** e **Spring Boot**, utilizando arquitetura em camadas para a construção de uma API REST. O sistema permite realizar requisições HTTP para consulta, inserção, atualização e exclusão de dados persistidos em memória.

## 🔧 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database

## 📂 Estrutura do Projeto

- `controllers/` — Recebe e responde às requisições HTTP.
- `services/` — Contém as regras de negócio.
- `repositorys/` — Comunicação com o banco de dados via JPA.
- `entities/` — Entidades que representam as tabelas do banco.
- `dto/` — Objetos de transferência de dados usados para exibir ou receber dados da API.

## 💾 Banco de Dados

O projeto utiliza o banco de dados **H2 em memória**. Os dados foram populados manualmente no início da execução (via `import.sql`.).

### Console do H2



