
import java.sql.*;
import javax.swing.*;
public class Conexao {
    /**
     *
     */
    public static Connection con = null;
    /**
     *
     * @return
     */
    public static Connection conectar(){
     try{  
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendajava","root","root");
         System.out.println("Conectado com sucesso!");
     }
     catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
     }
     return con;
   }
    public static void desConectar(){
     try{  
         con.close();
         System.out.println("Desconectado com sucesso!");
     }
     catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex);
     }
    
   }
}
