package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stey
 */
public class Usuarios extends Persona {
    String NombreUsuario,Contraseña,Correo;

    public Usuarios() {
    }

    public Usuarios(String NombreUsuario ,String Nombre, String Apellido, String Correo, String Contraseña, String Direccion) {
        super(Nombre, Apellido, Direccion);
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
}
