package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    public Connection getConexao() {
    
        Connection connection = null; //instância da conexão
            try {

                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);

                String server = "localhost";
                String database = "futuro nome da tabela do banco de dados";
                String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
                String user = "root";
                String password = "root";
    
                connection = DriverManager.getConnection(url, user, password);

                if (connection != null) {
                    System.out.println("Status: Conectado!");
                } else {
                    System.out.println("Status: NÃO CONECTADO!");
                }
                return connection;
            } catch (ClassNotFoundException e) { //Driver não encontrado
                System.out.println("O driver nao foi encontrado.");
                return null;
            } catch (SQLException e) {
                System.out.println("Nao foi possivel conectar...");
                return null;
            }
    }
}
