/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chant
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;
    
    //constructor de la clase arranca la conexion a BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean insertUsuario(String nombre, String correo, String contra){
        
        String insertSQL = "INSERT INTO usuarios(nombre,correo,contrasena) VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear el usuario "+ e.getMessage());
            return false;
        }
    }//fin del insert
    
    //metodo para consultar por ID
    public ResultSet bucarporID (int id){
        String sqlBuscar = "SELECT * FROM usuarios WHERE id = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por id "+ e.getMessage());
            return null;
        }
    }//fin del consulta ID
    
    public ResultSet obtenerTodos(){
        String slqTodos = "SELECT * FROM usuarios";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+s.getMessage());
            return null;
        }
        
    }//fin del obtener todos
    
    public boolean updateUsuario(String nombre, String correo, String contra, int id){
        String sqlEditar = "UPDATE usuarios SET nombre = ?, correo = ?, contrasena = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEditar);
            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contra);
            ps.setInt(4, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al editar el usuario "+ e.getMessage());
            return false;
        }
    }
    
    public boolean deleteUsuario(int id){
        String sqlEliminar = "DELETE FROM usuarios WHERE id = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al eliminar el usuario "+ e.getMessage());
            return false;
        }
    }
    
    
}//
