package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author stey
 */
public class Productos {
    private String IdProducto,NombreProducto;int CantidadProducto;
    private float total,precio;

    public String getIdProducto() {
        return IdProducto;
        
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombreProducto() {
        return NombreProducto.toUpperCase();
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(int CantidadProducto) {
        this.CantidadProducto = CantidadProducto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public Productos() {
    }

    public Productos(String IdProducto, String NombreProducto, int CantidadProducto,float precio ,float total ) {
        this.IdProducto = IdProducto;
        this.NombreProducto = NombreProducto;
        this.CantidadProducto = CantidadProducto;
        this.total = total;
        this.precio = precio;
    }

   
    
    
}
