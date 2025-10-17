# Projeto CRUD de Filmes com Spring Boot e Thymeleaf

## Descrição

Este projeto consiste em uma aplicação web para gerenciamento de filmes, desenvolvida a partir de um projeto inicial criado no [Spring Initializr](https://start.spring.io/) e utilizando a IDE NetBeans. A atividade foi solicitada pelo professor Mestre Gustavo Maruyama, na disciplina de Programação de Servidores Web, do curso superior de tecnologia em Sistemas para Internet, do Instituto Federal de Educação, Ciência e Tecnologia de Mato Grosso do Sul, câmpus Coxim, 5º semestre.

O sistema permite realizar operações de CRUD (Criar, Ler, Atualizar e Excluir) sobre filmes, utilizando as tecnologias Spring Boot, Spring Data JPA e Thymeleaf.

## Funcionalidades

* Listar todos os filmes cadastrados.
* Adicionar novos filmes com título e ano.
* Editar filmes existentes de forma simples.
* Excluir filmes da lista.

## Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Thymeleaf
* Banco de dados H2 (em memória)
* Maven

## Estrutura do projeto

* `src/main/java/br/edu/ifms/exjpa/`

  * `Filme.java` → Classe de entidade representando o filme.
  * `FilmeResource.java` → Interface de repositório JPA para persistência.
  * `FilmeController.java` → Controller responsável pelo CRUD.
* `src/main/resources/templates/`

  * `index.html` → Página principal com formulário de cadastro e tabela de filmes.
* `pom.xml` → Configuração das dependências Maven.

## Como executar

1. Clone o repositório:

```
git clone <URL_DO_REPOSITORIO>
```

2. Acesse a pasta do projeto:

```
cd nome-do-projeto
```

3. Execute a aplicação:

```
mvn spring-boot:run
```

4. Abra o navegador e acesse:

```
http://localhost:8080/
```

## Observações

* O banco de dados utilizado é o H2 em memória, portanto todos os registros serão perdidos ao reiniciar a aplicação.
* O formulário utiliza um campo oculto `id` para permitir a edição correta dos filmes.
* Os links de Editar e Excluir utilizam requisições GET para manter o formulário principal independente e evitar duplicação de registros.

## Autor

Maicon Cezar
