# Mudar senhas
#### São usadas senhas diferentes no MySQL da unisul e baixado em casa.
#### Ao baixar em casa, coloque a senha "senhadosql18%".
#### Ao utilizar na unisul, a senha é sempre "Unisul@1520".

## Onde alterar
Na classe BaseDAO.java do pacote "dao", vocês vão encontrar o seguinte bloco de código:
---------------------------------------
String server = "localhost";

String database = "emprestimoa3";

String url = "jdbc:mysql://" + server + ":3306/" 
        + database + "?useTimezone=true&serverTimezone=UTC";

String user = "root";

String password = "Unisul@1520";

--------------------------------------
Insira a senha no campo 'String password = "ASENHAVAIAQUI"'

Sempre que forem usar o código em casa/na unisul, coloquem as respectivas senhas, e avisem a todos os integrantes que a senha está sendo alterada/estão mexendo no projeto.
