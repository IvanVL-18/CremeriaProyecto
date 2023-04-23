package Clase;
    
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class Data {
    
    private static String driver="com.mysql.jdbc.Driver";
    private static String user="root";
    private static String pass="";
    private static String url="jdbc:mysql://localhost/cremeria";
    private static Connection cn;

    public static Connection conectar(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection(url, user, pass); 
        } catch(Exception e){
            
        }
        return cn;
    }
    
    public static ResultSet tabla(String consulta){
        Connection cn = conectar();
        Statement st;
        ResultSet datos = null;
        try{
            st = (Statement) cn.createStatement();
            datos = st.executeQuery(consulta);
        }catch(Exception e){
            
        }
        return datos;
    }
}
