# 💼 Sistema de Cadastro de Funcionários

![Java](https://img.shields.io/badge/Java-17+-blue)
![Status](https://img.shields.io/badge/status-Concluído-success)
![POO](https://img.shields.io/badge/Paradigma-POO-orange)

## 📖 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de aplicar, na prática, os principais conceitos de **Programação Orientada a Objetos (POO)** utilizando Java.

O sistema simula um cadastro de funcionários, diferenciando funcionários CLT e PJ, aplicando herança, polimorfismo e sobrescrita de métodos para cálculo de salário.

Apesar de ser uma aplicação simples em console, o foco foi a organização do código e a modelagem correta do domínio.

---

## 🧠 Conceitos Aplicados

- ✔️ Encapsulamento  
- ✔️ Herança  
- ✔️ Polimorfismo  
- ✔️ Sobrescrita de métodos (@Override)  
- ✔️ Classes abstratas  
- ✔️ Estrutura de dados (ArrayList)  
- ✔️ Separação de responsabilidades  
- ✔️ Organização em pacotes  

---

## 🏗️ Estrutura do Projeto
src
├── application
│ └── Main.java
└── entities
├── Empresa.java
├── Funcionario.java
├── FuncionarioClt.java
└── FuncionarioPj.java


### 🔹 application
Responsável pela execução do programa e interação principal.

### 🔹 entities
Contém as classes responsáveis pela modelagem do domínio da aplicação.

---

## ⚙️ Como Executar o Projeto

### 🔹 1. Clonar o repositório

```bash
git clone https://github.com/QualyFerrer/ExercicioCadastroFuncionario.git

🔹 2. Acessar a pasta do projeto

cd ExercicioCadastroFuncionario

3. Compilar o projeto (via terminal)
javac src/application/Main.java
🔹 4. Executar
java -cp src application.Main

Ou abra diretamente em sua IDE (IntelliJ, Eclipse ou VS Code) e execute a classe Main.

🧩 Exemplo de Funcionamento

O sistema permite:

Cadastrar funcionários

Diferenciar entre CLT e PJ

Calcular salários de acordo com o tipo de contrato

Listar funcionários cadastrados

🚀 Melhorias Futuras

🔹 Implementar menu interativo completo

🔹 Persistência em banco de dados

🔹 Tratamento de exceções

🔹 Interface gráfica

🔹 Refatoração para arquitetura em camadas (Service/Repository)

👨‍💻 Autor

Desenvolvido por César Ferrer
Estudante de Análise e Desenvolvimento de Sistemas
Foco em desenvolvimento backend com Java

📎 LinkedIn: (https://www.linkedin.com/in/c%C3%A9sar-menezes-9b6786361/)
📎 GitHub: https://github.com/QualyFerrer
