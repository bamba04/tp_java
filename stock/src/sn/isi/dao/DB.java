package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    private Connection cxion;
    private PreparedStatement pstm;
    private ResultSet rset;

    //ouverture de la connexion
    public void open() throws Exception{
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String mysqluser = "root";
        String mysqlpassword = "";

            Class.forName("com.mysql.jdbc.Driver");
            cxion = DriverManager.getConnection(url,mysqluser,mysqlpassword);
    }
    //fermeture de la connexion
    public void close() throws Exception{
        if(cxion != null){
            cxion.close();
        }
    }
    //initialisation des requetes
    public void init(String sql) throws Exception{
        pstm = cxion.prepareStatement(sql);
    }

// execution des requetes update
public int executeUpdate() throws Exception{
        int ok = 0;
        ok = pstm.executeUpdate();
        return ok;
}
// execution des requetes select
    public ResultSet executeSelect() throws Exception{
        rset = pstm.executeQuery();
        return rset;
    }
    //getteur de pstm
    public PreparedStatement getPstm() {
        return pstm;
    }


}
