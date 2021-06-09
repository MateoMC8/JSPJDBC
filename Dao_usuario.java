
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Dao_usuario {

    private PreparedStatement ps;
    private ResultSet rs;
    Connection Con;
    conex c = new conex();
    municipio m;

    Connection con() throws SQLException, ClassNotFoundException {
        Class.forName(c.getDriver());
        return DriverManager.getConnection(c.getUrl(), c.getUser(), c.getPass());
    }

    public ArrayList<municipio> mostrar() {
         ArrayList<municipio> li = new ArrayList<municipio>();
        try {
           
            Con = con();
            ps = con().prepareStatement("select * from municipio");
            rs = ps.executeQuery();
            while (rs.next()) {
                m = new municipio(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                li.add(m);
                JOptionPane.showMessageDialog(null,"entro");
            }
        } catch (Exception e) {
        }

        return li;
    }

    public boolean validar(String nombre, String pass) {
        try {
            ps = con().prepareStatement("select * from usuario where nombre = ? and pass= ?");
            ps.setString(1, nombre);
            ps.setString(2, pass);

            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void insert(String nombreU, String pass, String nombreC) {
        try {
            Con = con();
            ps = Con.prepareStatement("insert into usuario(nombre,pass,nombreCompleto) values(?,?,?)");
            ps.setString(1, nombreU);
            ps.setString(2, pass);
            ps.setString(3, nombreC);

            int v = ps.executeUpdate();

            if (v != 0) {
                System.out.println("se agrego");
            }

        } catch (Exception e) {
        }
    }

    public void insertMuni(String nombre, String descripcion, String kilometros, String telefono, String fecha, String subregion) {
        try {
            Con = con();
            ps = Con.prepareStatement("insert into municipio(nombre,descripcion,kilometros,telefono,fecha,,subregion) values(?,?,?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setString(3, kilometros);
            ps.setString(4, telefono);
            ps.setString(5, fecha);
            ps.setString(6, subregion);

            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Dao_usuario v = new Dao_usuario();
        v.mostrar();
    }

}
