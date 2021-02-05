**desafio:**

Você está fazendo uma API REST que precisará gerar números aleatórios para loteria. Para facilitar na identificação da pessoa, você deverá associar cada número a um e-mail.

No primeiro passo, precisamos construir um endpoint que receberá o e-mail da pessoa e retornará um objeto de resposta com os números sorteados para a aposta. Você deverá garantir que estas informações estejam gravadas em um banco de dados e devidamente associadas à pessoa.

Também devemos construir um segundo endpoint para listar todas as apostas de um solicitante, passando seu e-mail como parâmetro, o sistema deverá retornar em ordem de criação todas as suas apostas.

Dado que você fosse implementar esse sistema utilizando Java como linguagem e Spring + Hibernate como stacks de tecnologia fundamentais da aplicação: **Escreva um post de blog explicando de maneira detalhada tudo que você faria para implementar esse código.**

No texto, queremos que você:

- Explique quais as tecnologias do mundo Spring você usaria.

  Conte qual o papel das tecnologias escolhidas e quais benefícios elas trazem para a implementação do código.

  Diga quais classes seriam criadas nesse processo e traga trechos autorais explicando a construção de cada classe do código.

  Explique as etapas do processo de construção do seu código e como faria a implementação do sistema na Web.

**Item bônus:** Se ficou fácil, considere que você também precisa explicar como faria para proteger a aplicação de e-mails duplicados e sequências de números iguais para o mesmo email.
--------------
--------------

OBS::

Preciso alterar e remover algumas regras de negócio que ficaram no Controle e passar para o service.  
