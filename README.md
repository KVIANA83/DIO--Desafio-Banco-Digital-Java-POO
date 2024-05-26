# DIO--Desafio-Banco-Digital-Java-POO
**Bootcamp Desenvolvimento Java com IA** 

## Desafio de Projeto
Criando um Banco Digital com Java e Orientação a Objetos

### Estrutura do Projeto

#### Pacotes
1. **`bank`**: Pacote principal que contém os subpacotes para contas, clientes e serviços.
2. **`bank.account`**: Subpacote para classes relacionadas às contas bancárias.
3. **`bank.client`**: Subpacote para classes relacionadas aos clientes do banco.
4. **`bank.service`**: Subpacote para classes de serviços bancários.

#### Classes

1. **Classe Principal (`Main`)**:
   - Ponto de entrada da aplicação.
   - Responsável por inicializar o sistema e criar instâncias das classes principais.

2. **Pacote `bank.account`**:
   - **`Account`**: Classe abstrata representando uma conta bancária genérica.
     - Atributos: `balance` (saldo).
     - Métodos: `deposit`, `withdraw`, `printStatement` (método abstrato).
   - **`CheckingAccount`**: Classe concreta que herda de `Account`, representando uma conta corrente.
   - **`SavingsAccount`**: Classe concreta que herda de `Account`, representando uma conta poupança.

3. **Pacote `bank.client`**:
   - **`Client`**: Classe representando um cliente do banco.
     - Atributos: `name` (nome), `accounts` (lista de contas).
     - Métodos: `addAccount`, `printAccounts`.

4. **Pacote `bank.service`**:
   - **`BankService`**: Classe responsável pelos serviços bancários, como criar contas, realizar transferências, etc.
     - Métodos: `createAccount`, `transfer`, etc.

### Detalhamento da Estrutura

#### 1. Pacote `bank.account`

- **`Account`** (Classe Abstrata)
  - Atributos:
    - `balance` (double): Saldo da conta.
  - Métodos:
    - `deposit(double amount)`: Método para depositar dinheiro na conta.
    - `withdraw(double amount)`: Método para sacar dinheiro da conta.
    - `printStatement()`: Método abstrato para imprimir o extrato da conta.

- **`CheckingAccount`** (Classe Concreta)
  - Herda de `Account`.
  - Implementa o método `printStatement()`.

- **`SavingsAccount`** (Classe Concreta)
  - Herda de `Account`.
  - Implementa o método `printStatement()`.

#### 2. Pacote `bank.client`

- **`Client`** (Classe Cliente)
  - Atributos:
    - `name` (String): Nome do cliente.
    - `accounts` (List<Account>): Lista de contas do cliente.
  - Métodos:
    - `addAccount(Account account)`: Método para adicionar uma conta ao cliente.
    - `printAccounts()`: Método para imprimir as informações das contas do cliente.

#### 3. Pacote `bank.service`

- **`BankService`** (Classe de Serviços)
  - Métodos:
    - `createAccount(String type, double initialBalance)`: Método para criar uma nova conta (corrente ou poupança).
    - `transfer(Account fromAccount, Account toAccount, double amount)`: Método para transferir dinheiro entre contas.

### Exemplo de Estrutura de Arquivos e Pacotes

```
src/
│   Main.java
└───bank/
    ├───account/
    │       Account.java
    │       CheckingAccount.java
    │       SavingsAccount.java
    ├───client/
    │       Client.java
    └───service/
            BankService.java
```

### Fluxo Básico do Sistema

1. **Inicialização**: A classe `Main` inicializa o sistema e cria um objeto da classe `BankService`.
2. **Criação de Cliente e Contas**:
   - Um cliente é criado e associado a uma ou mais contas (corrente e/ou poupança).
3. **Operações Bancárias**:
   - O cliente pode realizar operações como depósitos, saques e transferências através da `BankService`.

### Considerações Finais

Esta estrutura modulariza bem o sistema bancário, facilitando a manutenção e a expansão futura do projeto.
