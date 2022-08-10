package modelos;

import java.util.ArrayList;

public class Profesor extends Persona {
    public String codigo;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public Profesor(String codigo, InformacionAdicionalProfesor info, ArrayList<Paralelo> paralelos, Persona persona) {
        super(persona.getNombre(), persona.getApellido(), persona.getEdad(), persona.getDireccion(), persona.getTelefono());
        this.codigo = codigo;
        this.info = info;
        paralelos= new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public void setInfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(ArrayList<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }

    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= this.info.añosdeTrabajo*600 + this.info.BonoFijo;
        return sueldo;
    } 
    
}
