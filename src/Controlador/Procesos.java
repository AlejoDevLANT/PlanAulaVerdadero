/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Productos;
import Modelo.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author stey
 */
public class Procesos {
    
    public ArrayList<Usuarios> Usuarios = new ArrayList<>(); 
    
    
    
    
    
    
    
    
    
    /*
    public class Procesos {
    FileReader fr;
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    FileWriter fw;
    Empleado e;
    
    
    public ArrayList<Empleado> lista = new ArrayList<>();
    public void  agregar(Empleado e) throws FileNotFoundException, IOException {
        fw=new FileWriter("DATOS.txt",true);
        String cad=e.getId()+"-"+e.getApellido()+"-"+e.getNombre()+"-"+e.getSueldo()+"-"+e.getDias();
        fw.write(cad);
        fw.write(10);
        fw.close();
        
    }
    public void leer() throws FileNotFoundException, IOException{
        lista.clear();
        fr=new FileReader("DATOS.txt");
        scanner=new BufferedReader(fr);
        String cad= scanner.readLine();
        String vec[] ;
        while( cad != null){
            vec=cad.split("-");
            e=new Empleado(vec[0],vec[1],vec[2],Double.parseDouble(vec[3]),Integer.parseInt(vec[4]) );
            lista.add(e);
            cad=scanner.readLine();
        }
        
        
        
        
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
