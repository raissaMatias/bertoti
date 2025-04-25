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

# atividade individual 1 ao 6 (pasta AtividadeIndividual)

# Atividade 4 - CLASSE UML 
Biblioteca possui uma relação com Livros pois possui uma lista de livros List<Livro>, um caso de associação fraca pois livros pode existir sem a bibliteca.

![image](https://github.com/user-attachments/assets/aaf72f27-7c9e-4e4e-b384-294053dfe15d)

