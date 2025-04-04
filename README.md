# 17/02/2025

Resumo dos trechos do livro: Software Engineering at Google, Oreilly

1) Os engenheiros de software são profissionais que criam aplicações que serão usadas no cotidiano usando conhecimentos teóricos, assim como engenheiros de outros setores. Tais aplicações são "menos tangíveis", porém não menos intergradas ao nosso cotidiano. 

2) O que difere a engenharia de software de outras engenharias é a suas aplicações serem menos tangíveis. Um programador e um engenheiro de software possuem ênfases diferentes em suas atuações. A segunda profissão requer conhecimento teórico prévio necessário em relação a primeira. Um programador geralmente limita-se ao conhecimento de uma deterninada linguagem. A relação entre tempo, escala e tradeoffs (escolha entre duas ou mais opções, onde cada uma tem vantagens e desvantagens).

Exemplos de tradeoffs: 

1) em relação a linguagem de programação:

Python vs. Java
Python
✅ Sintaxe simples e produtividade alta.
❌ Menor desempenho para aplicações críticas de CPU.

Java
✅ Melhor desempenho e robustez em aplicações empresariais.
❌ Mais verboso e curva de aprendizado maior.

2) em relação a banco de dados:

SQL (ex: PostgreSQL, MySQL)
✅ Suporte a transações ACID e ideal para dados estruturados.
❌ Escalabilidade horizontal pode ser mais complexa.

NoSQL (ex: MongoDB, Cassandra)
✅ Melhor para dados não estruturados e escalabilidade horizontal.
❌ Não possui suporte completo a transações como um banco relacional.

3) em relção a arquitetura de software: 

Monólito vs. Microsserviços
Monólito
✅ Mais fácil de desenvolver, testar e implantar no início.
❌ Dificuldade de escalar componentes independentemente e maior acoplamento.

Microsserviços
✅ Escalabilidade independente e maior flexibilidade tecnológica.
❌ Complexidade na comunicação entre serviços e necessidade de gerenciar deploys distribuídos.
////////////////////////////////////////////////////////////////////////////////////////////////


# ATIVIDADE 21/02 



# Atividade - CLASSE UML 
A UML possui diversos diagramas que servem para representar artefatos de sistemas orientados a objetos.

o sinal de + representa um atributo, que por sua vez armazena um estado de objeto e define as informções que o objeto mantém.

o sinal de - representa um método, que são funções ou procedimento que definem seu comportamento

# UML código TDD
![Captura de tela 2025-03-11 214027](https://github.com/user-attachments/assets/0c1ac0f5-51e0-4c0a-a5ba-fa643ac2651e)

# UML código ControledeCaixa
![Captura de tela 2025-03-11 212732](https://github.com/user-attachments/assets/869f80c8-c484-49d1-b183-8efa73581201)

# UML código Menu
![menu](https://github.com/user-attachments/assets/186bf62e-eef9-4273-8e9d-adfd6bd07b0e)


