package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    // Método que estabelece conexão com o banco de dados
    public Connection getConexao() {
    
        Connection connection = null; //instância da conexão
            try {
                //Carregamento do JDBC Driver
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);
                
                //Configurar a conexão
                String server = "localhost"; // Endereço do servidor
                String database = "emprestimoa3"; // Nome do banco de dados
                String url = "jdbc:mysql://" + server + ":3306/" 
                        + database + "?useTimezone=true&serverTimezone=UTC"; // URL de conexão com o banco
                String user = "root"; // Usuário do banco de dados
                String password = "senhadosql18%"; // Senha do banco de dados
                
                // Estabelecendo a conexão
                connection = DriverManager.getConnection(url, user, password);

                // Verificação do status da conexão
                if (connection != null) {
                    System.out.println("Status: Conectado!");
                } else {
                    System.out.println("Status: NÃO CONECTADO!");
                }
                
                return connection;
                
            } catch (ClassNotFoundException e) { // Driver não encontrado
                System.out.println("O driver nao foi encontrado.");
                return null;
            } catch (SQLException e) { // Falha na conexão
                System.out.println("Nao foi possivel conectar...");
                return null;
            }
    }
}
