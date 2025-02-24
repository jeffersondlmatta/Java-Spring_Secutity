
## Como Executar o Projeto

### 1. **Clonar o repositório**

Clone este repositório em sua máquina local.

```bash
git clone <URL_DO_REPOSITORIO>
cd <PASTA_DO_REPOSITORIO>
```

### 2. **Compilar e Executar**

Se você estiver usando o **Maven**, execute o seguinte comando para compilar e executar o projeto:

```bash
mvn spring-boot:run
```

Caso utilize o **Gradle**, execute:

```bash
./gradlew bootRun
```

O aplicativo será executado em `http://localhost:8080`.

## Como Testar

### 1. **Login com Usuário 'user'**
- **Username**: `user`
- **Password**: `password`
- Acesso: Pode acessar as páginas **/hello** e **/home**.

### 2. **Login com Usuário 'master'**
- **Username**: `master`
- **Password**: `password`
- Acesso: Pode acessar as páginas **/hello**, **/home** e **/master-page**.

### 3. **Página de Acesso 'hello'**
- **Página**: `/hello`
- Acesso: Todos os usuários, incluindo **user** e **master**, podem acessar esta página.

### 4. **Página de Acesso 'master-page'**
- **Página**: `/master-page`
- Acesso: Apenas usuários com a role **MASTER** podem acessar. Caso um usuário sem a role **MASTER** tente acessar essa página, será exibida uma mensagem de erro.

## Endpoints e Acessos

| **Página**      | **Permissões**         | **Acesso**                                    |
|-----------------|------------------------|-----------------------------------------------|
| `/hello`        | Acesso a todos usuários | Pode ser acessada por **user** e **master**    |
| `/home`         | Acesso a todos usuários | Pode ser acessada por **user** e **master**    |
| `/master-page`  | Acesso exclusivo a **MASTER** | Apenas **master** pode acessar               |

## Testando com Postman

### 1. **Login com 'user'**

- **Método**: `POST`
- **URL**: `http://localhost:8080/login`
- **Corpo (formulário)**:

  ```text
  username=user
  password=password
  ```

### 2. **Login com 'master'**

- **Método**: `POST`
- **URL**: `http://localhost:8080/login`
- **Corpo (formulário)**:

  ```text
  username=master
  password=password
  ```

### 3. **Logout**

- **Método**: `POST`
- **URL**: `http://localhost:8080/logout`

**Nota**: Você deve incluir o cookie `JSESSIONID` no Postman após o login para realizar o logout corretamente.

---

### Observações:

- **Segurança**: O Spring Security cuida automaticamente da autenticação e da autorização. A página de logout (`/logout`) é configurada para encerrar a sessão.
- **Acesso Restrito**: Usuários sem a role **MASTER** não conseguirão acessar a página `/master-page` e serão redirecionados para a página de login.

---

Este README proporciona uma visão geral básica de como executar o projeto e testar as funcionalidades de login e permissões no seu aplicativo Spring Security.
