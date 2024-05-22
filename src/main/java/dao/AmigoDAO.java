package dao;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Amigo;

public class AmigoDAO extends BaseDAO{
    public ArrayList<Amigo> minhaListaAmigo = new ArrayList<>();

    public ArrayList<Amigo> getMinhaListaAmigo() {
        minhaListaAmigo.clear();
        
        return minhaListaAmigo;
    }
    
    
}
