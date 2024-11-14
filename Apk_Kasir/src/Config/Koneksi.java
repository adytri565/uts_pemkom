package Config;
import java.sql.* ;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    public static Connection conn;
    
    public static Connection getConnection(){
        if (conn ==null){
            try {
                String url = "jdbc:mysql://localhost:3306/db_kasir";
                String user = "root";
                String pw   = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = (Connection)DriverManager.getConnection(url,user,pw);
            }catch (SQLException e){
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
            
        }
        return conn;
    }
    
}
