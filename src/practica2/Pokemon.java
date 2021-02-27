package practica2;



public class Pokemon {

    private int id;
    private String tipo;
    private String nombre;
    private Double vida;
    private Double puntos_de_ataque;
    private boolean capturado;
    private boolean estado;

    //public static String arreglo[];
   

    public Pokemon() {

    }

    public Pokemon(int id, String tipo, String nombre, Double vida, Double puntos_de_ataque, boolean capturado, boolean estado) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vida = vida;
        this.puntos_de_ataque = puntos_de_ataque;
        this.capturado = capturado;
        this.estado = estado;

    }

    
    

    public Pokemon(int id) {
        this.id = id;
        this.nombre = nombre;
    }
    

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getVida() {
        return vida;
    }

    public Double getPuntos_de_ataque() {
        return puntos_de_ataque;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public void setPuntos_de_ataque(Double puntos_de_ataque) {
        this.puntos_de_ataque = puntos_de_ataque;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    

    public String imprimir() {
        //PRACTICA2 pra = new PRACTICA2();
        
        /*System.out.print(" "+id);
        
        System.out.print(" " + nombre);
        System.out.print(" " + vida);
        System.out.print(" " +puntos_de_ataque);
        System.out.print(" " + capturado);
        System.out.print(" " + estado);*/
        
        return  +id+ " " + tipo +" "+nombre+ " "+vida+ " "+puntos_de_ataque +" "+capturado+" "+estado;
    }
}
