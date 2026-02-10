# Sistema Bancário em Java (CLI)

Projeto de um sistema bancário simples feito em Java, executado no terminal, que permite criar uma conta, sacar, depositar, pagar mensalidade e visualizar os dados da conta.  
O objetivo do projeto é praticar lógica de programação e Programação Orientada a Objetos (POO).

---

## Como foi feito

**Tecnologias usadas:**  
Java, Terminal

Aqui eu desenvolvi um sistema bancário simples utilizando Java puro, aplicando conceitos de Programação Orientada a Objetos como classes, métodos, encapsulamento e controle de estado do objeto (status da conta).  

O projeto funciona através de um menu interativo no terminal, onde o usuário escolhe ações como abrir conta, sacar, depositar, pagar mensalidade e visualizar os dados da conta.  
Utilizei `Scanner` para leitura de dados do usuário e estruturas como `switch` e `if/else` para controlar o fluxo do programa.

Esse projeto foi importante pra entender melhor:
- Como organizar responsabilidades entre `Main` e a classe `ContaBanco`
- Como passar valores por parâmetro para métodos
- Como controlar regras de negócio (não sacar mais que o saldo, não pagar mensalidade com conta fechada, etc.)

---

## Otimizações

- Melhorei a lógica de validação de saque para impedir valores maiores que o saldo.
- Organizei melhor o menu para evitar ações que alterassem o saldo sem necessidade (como visualizar detalhes).

---

## Lições aprendidas

  - Entendi na prática a diferença entre:
  - Métodos `void` (que só executam ações)
  - Métodos que retornam valores (`double`, `boolean`, etc.)
  - Aprendi a estruturar melhor um programa usando classes.
  - Percebi a importância de validar entradas do usuário.
  - Aprendi a lidar com bugs comuns de entrada de dados com `Scanner`.

---