package dao;

import java.util.ArrayList;
import model.Ferramenta;

public class FerramentaDAO extends BaseDAO {
    public ArrayList<Ferramenta> minhaListaFerramenta = new ArrayList<>();

    public ArrayList<Ferramenta> getMinhaListaFerramenta() {
        minhaListaFerramenta.clear();
        
        return minhaListaFerramenta;
    }
}
