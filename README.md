# 🎬 Catálogo de Filmes

Um sistema de catálogo de filmes desenvolvido em Spring Boot com interface web minimalista e cores suaves.

## 🚀 Funcionalidades

- **Adicionar Filmes**: Cadastre novos filmes com título, diretor, ano e gênero
- **Buscar Filmes**: Encontre filmes pelo título
- **Atualizar Filmes**: Modifique informações dos filmes existentes
- **Remover Filmes**: Delete filmes do catálogo

## 🛠️ Tecnologias Utilizadas

- **Backend**: Spring Boot, JPA/Hibernate, H2 Database
- **Frontend**: HTML5, CSS3, JavaScript (Vanilla)
- **Design**: Interface minimalista com cores suaves e gradientes

## 🎨 Design

O projeto apresenta um design moderno e minimalista com:
- Gradientes suaves em tons de azul e roxo
- Cards com efeito glassmorphism
- Animações suaves e transições
- Interface responsiva para dispositivos móveis
- Cores suaves e agradáveis aos olhos

## 🚀 Como Executar

1. **Pré-requisitos**:
   - Java 17 ou superior
   - Maven 3.6+

2. **Executar o projeto**:
   ```bash
   mvn spring-boot:run
   ```

3. **Acessar a aplicação**:
   - URL: http://localhost:8083
   - Console H2: http://localhost:8083/h2-console

## 📊 Estrutura do Banco

A aplicação utiliza H2 Database em memória com a seguinte estrutura:

```sql
CREATE TABLE filme (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(255) UNIQUE NOT NULL,
    diretor VARCHAR(255),
    ano INTEGER,
    genero VARCHAR(255)
);
```

## 🔧 Configuração

O arquivo `application.properties` contém as configurações do banco H2:

```properties
spring.application.name=catalogo-filmes
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
server.port=8083
```

## 📱 Interface

A interface web oferece:
- **Seção de Adicionar**: Formulário para cadastrar novos filmes
- **Seção de Buscar**: Campo para buscar filmes por título
- **Seção de Remover**: Campo para deletar filmes
- **Seção de Atualizar**: Formulário para modificar filmes existentes

## 🎯 Características do Design

- **Cores Suaves**: Paleta de cores em tons pastéis
- **Gradientes**: Efeitos visuais modernos
- **Glassmorphism**: Efeito de vidro nos cards
- **Responsividade**: Adaptável a diferentes tamanhos de tela
- **Animações**: Transições suaves e elegantes

## 📝 Exemplo de Uso

1. Acesse http://localhost:8083
2. Adicione um filme preenchendo os campos na seção "Adicionar Filme"
3. Busque filmes usando o título na seção "Buscar Filme"
4. Atualize informações na seção "Atualizar Filme"
5. Remova filmes na seção "Remover Filme"

## 🔄 Transformação do Projeto

Este projeto foi transformado de um sistema de cadastro de usuários para um catálogo de filmes, mantendo a mesma estrutura técnica mas adaptando:
- Entidades (Usuario → Filme)
- Campos (nome, email → titulo, diretor, ano, genero)
- Interface (tema de usuários → tema de filmes)
- Design (cores básicas → design minimalista com cores suaves)

---

**Desenvolvido com ❤️ usando Spring Boot e design minimalista**
