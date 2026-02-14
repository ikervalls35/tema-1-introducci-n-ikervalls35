package Empresa;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
    private static Connection con;
    public static Connection getConnection(){
        try {
            String host = "jdbc:sqlite:src/main/resources/empresa.bd";
            con = DriverManager.getConnection(host);
            System.out.println("Conexión realizada");
        } catch (java.sql.SQLException ex) {
            System.out.println("Se ha producido un error al conectar: " + ex.getMessage());
        }
        return con;

    }
}