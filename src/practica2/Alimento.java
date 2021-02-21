package practica2;


public class Alimento {
    private int id;
    private String nombre;
    private double vida;
    
    public Alimento(){
        
    }

    public Alimento(int id, String nombre, double vida) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getVida() {
        return vida;
    }
    
    public String imprimir(){
        return id +" "+nombre+" "+vida;
    }
}
