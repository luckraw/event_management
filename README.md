O projeto é uma aplicação desenvolvida em Java com o framework Spring. O objetivo deste projeto é fornecer uma solução para criação, edição, listagem e exclusão de eventos. Essa aplicação é útil para organizações que desejam gerenciar seus eventos, como conferências, workshops, meetups e outras atividades relacionadas.

# Tecnologias Utilizadas

- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate
- Thymeleaf
- H2.

# Instalação

Para executar o projeto, siga as etapas abaixo:

Certifique-se de ter o Java JDK (versão 8 ou superior) instalado em sua máquina. Você pode verificar a versão do Java digitando o comando java -version no terminal.
Faça o download ou clone este repositório em seu ambiente de desenvolvimento.

Importe o projeto em sua IDE preferida, como IntelliJ IDEA ou Eclipse.

Certifique-se de ter o Apache Maven instalado em seu sistema. Você pode verificar digitando o comando mvn -v no terminal.

Configure as credenciais do banco de dados no arquivo application.properties localizado em src/main/resources. Verifique se as configurações estão corretas para o seu ambiente de desenvolvimento.

No diretório raiz do projeto, execute o comando mvn spring-boot:run para iniciar o servidor embutido do Spring Boot.

Acesse a aplicação em seu navegador, através da URL http://localhost:8080/events.

# Utilização

- Ao acessar a aplicação, você terá as seguintes funcionalidades disponíveis:

```
Listar todos os eventos cadastrados.
Criar um novo evento, fornecendo informações como título, data e local.
Editar um evento existente, podendo alterar título, data ou local.
Excluir um evento existente.
Visualizar detalhes de um evento específico.
```
