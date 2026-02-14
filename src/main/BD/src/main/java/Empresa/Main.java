package Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    static final java.sql.Connection con = DatabaseConnection.getConnection();
    public static void insertarEmpleado(int numero, String nombre, int departamento, int edad, float sueldo) throws SQLException {
        String sql = "INSERT INTO empleados (num, nombre, departamento, edad, sueldo)";
        sql += " VAlUES(?, ?, ?, ?, ?)";

        PreparedStatement st = con.prepareStatement(sql);

        st.setInt(1, numero);
        st.setString(2, nombre);
        st.setInt(3, departamento);
        st.setInt(4, edad);
        st.setFloat(5, sueldo);

        st.executeUpdate();
        imprimirEmpleados();
    }public static void imprimirEmpleados() throws SQLException {
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM empleados");

        System.out.println("Núm.\tNombre\tDepartamento\tEdad\t Sueldo");

        while (rs.next()) {
            System.out.print(rs.getInt(1) + "\t");
            System.out.print(rs.getString(2) + "\t");
            System.out.print(rs.getInt(3) + "\t");
            System.out.print(rs.getInt(4) + "\t");
            System.out.println(rs.getFloat(5) + "\t");
        }
    }private static void actualizarEmpleados() throws SQLException {
        Statement st = con.createStatement();

        String sql = "UPDATE empleados set sueldo = sueldo * 1.05";
        st.executeUpdate(sql);

        sql = "UPDATE empleados set departamento = 20 WHERE num = 3";
        st.executeUpdate(sql);
    }public static void main(String[] args) {
        try {
            imprimirEmpleados();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}