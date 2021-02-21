package practica2;


public class Gimnasio {
    
    private int id;
    private String lugar;
    
    public Gimnasio(){
        
    }

    public Gimnasio(int id, String lugar) {
        this.id = id;
        this.lugar = lugar;
    }

    public int getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }
    
    public String imprimir(){
        return id +" "+lugar;
    }
}
