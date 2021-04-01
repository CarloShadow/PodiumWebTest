# language: pt

Funcionalidade: deve fazer cadastro e login
    Cenário: deve fazer cadastro com sucesso
        Dado o usuario esta na tela de cadastro
        Quando preenche os seguintes dado
            | Username  |  Test             |
            | Email     |  tester@bdd.com   |
            | Password  |  123456Cd         |
            |ConPassword|  123456Cd         |
            | FirstName |  Carlos           |
            | LastName  |  Bastos           |
            |PhoneNumber|  123456789        |
            | Country   |  Brazil           |
            | Address   |  Rua Japao        |
            | PostalCode|  12346-052        |
            | City      |  Sao Paulo        |
            | State     |  Sao Paulo        |
        E clica em Agree e clica em registrar
        Então o usuario e cadastrado com sucesso

    Cenário: deve fazer login
        Dado que o usuario esta na tela de login
        Quando preenche o Username com <Test81>
        E preenche Password com <123456Cd>
        Então o login e feito com sucesso

