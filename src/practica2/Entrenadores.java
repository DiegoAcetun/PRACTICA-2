package practica2;

public class Entrenadores {
    private int id;
    private String nombre;
    
    
    public Entrenadores(){
        
    }
    public Entrenadores(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
        
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public String imprimir() {
       
        return id +" " +nombre; 
        
       


    }
    
}
