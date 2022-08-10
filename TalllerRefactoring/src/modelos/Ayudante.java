package modelos;

import java.util.ArrayList;

    public class Ayudante extends Estudiante{
    protected Estudiante est;
    public ArrayList<Paralelo> paralelos;
    
    public Ayudante(){

    }   
    //Getters y Setters
    
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
