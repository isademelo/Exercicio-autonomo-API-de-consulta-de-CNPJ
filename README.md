# 🏢 Consulta de CNPJ — Java

Aplicação desenvolvida em **Java** para realizar consultas de informações cadastrais de empresas através do CNPJ, utilizando uma API externa.

O projeto foi desenvolvido como um exercício autônomo, com o objetivo de praticar o consumo de APIs, requisições HTTP, manipulação de JSON e conversão de dados em objetos Java utilizando a biblioteca Gson.

---

## 🎯 Objetivo

Desenvolver uma aplicação de terminal capaz de receber um CNPJ informado pelo usuário, realizar uma consulta em uma API externa e apresentar os dados retornados de duas maneiras: JSON completo ou informações convertidas e organizadas em objetos Java.

## ⚙️ Funcionalidades

- 🔎 **Consulta de CNPJ:** pesquisa informações cadastrais de empresas.
- ✅ **Validação de CNPJ:** verifica se o número informado possui 14 dígitos, desconsiderando caracteres especiais.
- 🌐 **Requisições HTTP:** comunicação com uma API REST utilizando `HttpClient`.
- 📄 **Visualização de JSON:** permite visualizar a resposta completa retornada pela API.
- 🔄 **Conversão de JSON:** utiliza Gson para converter os dados recebidos em objetos Java.
- 🛡️ **Tratamento de erros:** utiliza `try/catch` para tratar entradas inválidas do usuário.
- 🔁 **Novas consultas:** permite realizar várias pesquisas durante a mesma execução.

## 🛠️ Tecnologias utilizadas

| Tecnologia    | Aplicação                        |
|---------------|----------------------------------|
| Java          | Linguagem de programação         |
| HttpClient    | Realização de requisições HTTP   |
| Gson          | Conversão e manipulação de JSON  |
| Scanner       | Entrada de dados pelo terminal   |
| API REST      | Obtenção dos dados cadastrais    |
| IntelliJ IDEA | Ambiente de desenvolvimento      |

## 📚 Bibliotecas

### Gson

Biblioteca utilizada para realizar a desserialização de JSON, convertendo os dados recebidos pela API em objetos Java.

Foram utilizados recursos como:

- `Gson`
- `GsonBuilder`
- `@SerializedName`
- `JsonParser`
- `JsonObject`

### HttpClient

Recurso nativo do Java utilizado para realizar a comunicação com a API externa.

Foram utilizadas as classes:

- `HttpClient`
- `HttpRequest`
- `HttpResponse`
- `URI`

## 🔄 Funcionamento da aplicação

O funcionamento do programa segue as seguintes etapas:

1. O usuário informa o CNPJ que deseja consultar.
2. O sistema remove os caracteres especiais e valida a quantidade de dígitos.
3. Após a validação, é construída uma requisição HTTP utilizando o método GET.
4. A aplicação envia a requisição para a API externa.
5. A resposta é recebida no formato JSON.
6. O usuário escolhe entre visualizar o JSON completo ou os dados formatados.
7. Caso escolha a visualização formatada, o Gson realiza a conversão dos dados para objetos Java.
8. Ao finalizar, o programa oferece a possibilidade de realizar uma nova consulta.

## 📂 Estrutura do projeto

```text
Exercicio-autonomo-API-de-consulta-de-CNPJ/
│
├── ConsultaDeCNPJ.java
│
├── InformacoesDoCNPJ.java
│
└── README.md
```

### Classes do projeto

#### `ConsultaDeCNPJ.java`

Responsável pela execução principal da aplicação, incluindo:

- Entrada de dados.
- Validação do CNPJ.
- Comunicação com a API.
- Recebimento da resposta JSON.
- Conversão dos dados utilizando Gson.
- Interação com o usuário.

#### `InformacoesDoCNPJ.java`

Classe responsável por representar as informações cadastrais retornadas pela API, armazenando os dados em atributos Java.

Utiliza a anotação `@SerializedName` para mapear os nomes das propriedades do JSON aos respectivos atributos da classe.

## 💻 Conceitos praticados

Durante o desenvolvimento desta atividade, foram trabalhados conceitos importantes da linguagem Java:

- Consumo de APIs REST.
- Requisições HTTP utilizando `HttpClient`.
- Manipulação de dados no formato JSON.
- Desserialização utilizando Gson.
- Mapeamento de atributos com `@SerializedName`.
- Manipulação de objetos JSON aninhados.
- Validação de entradas do usuário.
- Tratamento de exceções com `try/catch`.
- Utilização de métodos e classes.
- Integração com serviços externos.

## 🚀 Como executar o projeto

### Pré-requisitos

- Java JDK 11 ou superior.
- IntelliJ IDEA ou outra IDE compatível.
- Biblioteca Gson configurada no projeto.
- Conexão com a internet.
- Token de acesso válido para a API utilizada.

### Clonando o repositório

```bash
git clone https://github.com/isademelo/Exercicio-autonomo-API-de-consulta-de-CNPJ.git
```

### Executando

1. Abra o projeto na sua IDE.
2. Configure a biblioteca Gson.
3. Configure seu token de acesso à API por meio de uma variável de ambiente.
4. Execute a classe `ConsultaDeCNPJ.java`.
5. Informe o CNPJ desejado e siga as instruções apresentadas no terminal.

## 📌 Aprendizados e desafios

Um dos principais desafios durante o desenvolvimento foi compreender a estrutura do JSON retornado pela API.

Foi necessário identificar que as informações cadastrais da empresa estavam dentro de um objeto chamado `result`, sendo necessário acessar esse objeto antes de realizar a desserialização com Gson.

Essa experiência contribuiu para compreender melhor como APIs organizam suas respostas e como trabalhar com objetos JSON aninhados em aplicações Java.

## 👨‍💻 Autor

**Isack de Melo**

Estudante de Ciências da Computação, com foco em desenvolvimento Backend e aprendizado contínuo em Java.

[GitHub](https://github.com/isademelo)

---

⭐ Projeto desenvolvido para fins de estudo e prática de programação Java.
