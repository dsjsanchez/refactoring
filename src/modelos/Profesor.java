package modelos;

import java.util.ArrayList;

public class Profesor extends persona {
    public String codigo;
    public InformacionAdicionalProfesor info;
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
  

    public Profesor(String codigo, String nombre, String apellido, String facultad, int edad, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        paralelos= new ArrayList<>();
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
   
    
    public double calcularSueldo(Profesor prof){
        return prof.añosdeTrabajo*600 + prof.BonoFijo;
    }  

    
}
