/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Productos;
import Modelo.Usuarios;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author stey
 */
public class Procesos {
    /*  ARRAYLIST QUE ALIMENTA LOS USUARIOS */
    public ArrayList<Usuarios> listaUsuarios = new ArrayList<>(); 
    /*************************************************************/
    FileReader fr;
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    FileWriter fw;
    Usuarios u;
    
    //FUNCION PARA AGREGAR 
    public void agregar(Usuarios u)throws FileNotFoundException, IOException{
        fw = new FileWriter("USUARIOS.txt",true);
        String cad=u.getNombreUsuario()+"-"+u.getNombre()+"-"+u.getApellido()+"-"+u.getCorreo()
                +"-"+u.getContraseña()+"-"+u.getDireccion();
        fw.write(cad);
        fw.write(10);
        fw.close();
    }
    
    
    public void leer()throws FileNotFoundException, IOException{
        listaUsuarios.clear();
        fr=new FileReader("USUARIOS.txt");
        scanner= new BufferedReader(fr);
        String cad= scanner.readLine();
        String vec[];
        while(cad!= null){
            vec= cad.split("-");
            u=new Usuarios(vec[0], vec[1],vec[2], vec[3], vec[4], vec[5]);
            listaUsuarios.add(u);
            cad=scanner.readLine();
        }
    }
    
    
    
    public void agregarCarrito(int cantidad, int precio){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /*
   
  
  
        
        
        
        
    }
    
    
    public void Modificar(String id,Empleado e) throws FileNotFoundException,IOException{
        ArrayList<String> listaT= new ArrayList<>();
        lista.clear();
        fr=new FileReader("DATOS.txt");
        scanner=new BufferedReader(fr);
        String cad;
        String vec[];
        while((cad =scanner.readLine())!= null){
            vec=cad.split("-");
           if(id.equals(vec[0]) ){
               cad=e.getId()+"-"+e.getApellido()+"-"+e.getNombre()+"-"+e.getSueldo()+"-"+e.getDias();
           }
           listaT.add(cad);
        }
        scanner.close();
         fr.close();
          fw = new FileWriter("DATOS.txt");
    BufferedWriter bw = new BufferedWriter(fw);

    for (String linea : listaT) {
        bw.write(linea);
        bw.newLine();
    }
         bw.close();
     fw.close();
         
         
    }
    
    public int Eliminar(String id,int vali) throws FileNotFoundException,IOException{
        ArrayList<String> listaT= new ArrayList<>();
        lista.clear();
        fr=new FileReader("DATOS.txt");
        scanner=new BufferedReader(fr);
        String cad;
        String vec[];
        while((cad =scanner.readLine())!= null){
            vec=cad.split("-");
           if(!(id.equals(vec[0])) ){
              listaT.add(cad);
           }
           if(id.equals(vec[0])){
               vali=1;
           }
        }
        scanner.close();
         fr.close();
          fw = new FileWriter("DATOS.txt");
    BufferedWriter bw = new BufferedWriter(fw);

    for (String linea : listaT) {
        bw.write(linea);
        bw.newLine();
    }
         bw.close();
     fw.close();
         
         return vali;
    }
    
    
    
    
    
}

    
    */
    
    
    
    
    
    
    
}
