# Spring Security OAuth2 GitHub

This project is a demo application demonstrating the integration of Spring Security with OAuth2 using GitHub as the authentication provider. The project uses Spring Boot for rapid development and ease of setup.

## Table of Contents

- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Configuration](#configuration)
- [Built With](#built-with)
- [Contributing](#contributing)
- [Authors](#authors)
- [License](#license)

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

## Prerequisites

- Java 17
- Maven 3.6.3 or higher
- A GitHub account

## Installation

1. **Clone the repository**
    ```sh
    git clone https://github.com/pwnmahto/Spring-Security-Oauth2-Github.git
    cd Spring-Security-Oauth2-Github
    ```

2. **Configure GitHub OAuth2 credentials**
    - Create an OAuth2 application in your GitHub account.
    - Set the callback URL to `http://localhost:8080/login/oauth2/code/github`.
    - Note the Client ID and Client Secret provided by GitHub.

3. **Update application.properties**
    - Open `src/main/resources/application.yml`.
    - Add your GitHub Client ID and Client Secret:
      ```yml
      spring:
        security: 
          oauth2:
            client:
              registration:
                github:
                  client-id: <!-- CLIENT ID -->
                  client-secret: <!-- CLIENT SECRET -->
      ```

## Running the Application

To run the application, execute the following command:

```sh
mvn spring-boot:run
```

The application will start and be accessible at `http://localhost:8080`.

## Configuration

The project uses the following dependencies:

- `spring-boot-starter-oauth2-client`: Provides OAuth2 client support.
- `spring-boot-starter-security`: Provides security features.
- `spring-boot-starter-web`: Provides web application support.
- `spring-boot-devtools`: Provides development tools.
- `lombok`: Reduces boilerplate code with annotations.
- `spring-boot-starter-test`: Provides testing support.
- `spring-security-test`: Provides testing support for Spring Security.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building production-ready applications.
- [Maven](https://maven.apache.org/) - Dependency management.

## Contributing

Contributions are welcome! Please fork the repository and create a pull request.

## Authors

- **Pawan Kumar** - [pwnmahto](https://github.com/pwnmahto)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---