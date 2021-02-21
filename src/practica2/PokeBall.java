package practica2;


public class PokeBall {
    private int id;
    private String tipo;

    
    
    public PokeBall(){
        
    }
    public PokeBall(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String imprimir(){
        return id+" " +tipo;
        
    }
    
}
