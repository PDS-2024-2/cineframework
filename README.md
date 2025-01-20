# CineIMD

O **CineIMD-Framework** é uma solução de gestão para cinemas, projetada para suportar diferentes tipos de cinemas, como locais, Cinema Kids e Drive-In. 
O framework oferece funcionalidades como compra de ingressos online, recomendações personalizadas para clientes e painéis analíticos para administradores. 
Seu objetivo é criar uma base reutilizável e extensível, melhorando a eficiência na administração e proporcionando uma experiência aprimorada aos usuários.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal do sistema.
- **Spring Boot 3.3.0**: Framework para construção da API RESTful.
- **Spring Data JPA**: Abstração para acesso ao banco de dados.
- **PostgreSQL**: Banco de dados relacional executado em container Docker.
- **Maven**: Ferramenta de gerenciamento de dependências e build.
- **Docker**: Usado para configurar o banco de dados em containers.

## Requisitos

Antes de iniciar o projeto, certifique-se de que as seguintes ferramentas estejam instaladas:

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.8+](https://maven.apache.org/download.cgi)
- [Docker](https://docs.docker.com/get-docker/)
- [Git](https://git-scm.com/downloads)

## Configuração do Ambiente

### 1. Clonar o Repositório

```bash
git clone https://github.com/PDS-2024-2/cineimd-backend.git
cd cineimd-backend
```

### 2. Configurar o Banco de Dados com Docker

Navegue até a pasta **infra**:

```bash
cd infra
```

Execute o comando para iniciar o banco de dados em um container:

```bash
docker compose up -d
```

Isso irá configurar o banco de dados PostgreSQL na porta `5440`.

### 3. Construir e Executar o Projeto

Para rodar o projeto, utilize o Maven:

```bash
mvn spring-boot:run
```

A aplicação ficará acessível em `http://localhost:8080`.

## Contribuição

### Fluxo de Trabalho GitFlow

Este projeto segue o modelo **GitFlow**, que organiza o desenvolvimento em branches específicas para manter o controle de versões e facilitar a colaboração. O fluxo básico é o seguinte:

1. A branch principal do projeto é `main`, que contém o código de produção estável.
2. A branch `develop` contém o código mais recente e estável, pronto para integração contínua.
3. Para novas funcionalidades, crie branches a partir de `develop` com o padrão:

   ```bash
   git checkout -b feature/nome-da-feature
   ```

4. Para correção de bugs em produção, crie branches a partir de `main` usando o padrão:

   ```bash
   git checkout -b hotfix/nome-do-hotfix
   ```

5. Pull Requests para `main` só devem ser feitos a partir de `release` ou `hotfix`. Para `develop`, use branches `feature`.

### Commit Semântico

Adote o padrão de **Commit Semântico** para garantir que os commits sejam claros e consistentes. A estrutura básica é:

```
<tipo>(escopo): <descrição>
```

Tipos comuns de commit incluem:

- `feat`: Adição de nova funcionalidade.
- `fix`: Correção de bug.
- `docs`: Alterações na documentação.
- `refactor`: Refatoração do código sem adicionar funcionalidades ou corrigir bugs.
- `test`: Adição ou correção de testes.
- `chore`: Tarefas diversas como atualizações de dependências.

Exemplo:

```bash
git commit -m "feat(ingresso): permite selecionar assentos ao comprar ingressos"
```

### Padrão de Criação de Branch

As branches seguem o padrão do GitFlow, e devem ser nomeadas de acordo com o propósito:

- **Features**: `feature/nome-da-feature`
- **Hotfixes**: `hotfix/nome-do-hotfix`
- **Releases**: `release/versao-x.y.z`

### Etapas para Contribuir

1. Crie uma branch para sua contribuição (conforme os padrões de branch mencionados).
2. Commite suas alterações utilizando o commit semântico.
3. Envie sua branch para o repositório remoto (`git push origin feature/nome-da-feature`).
4. Abra um **Pull Request** para a branch correta (`develop` ou `main`).