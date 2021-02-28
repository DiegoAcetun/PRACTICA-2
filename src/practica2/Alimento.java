package practica2;


public class Alimento {
    private int id;
    private String nombreA;
    private int idA;
    private String nombre;
    private double vida;
    private Pokemon[] actividad;
    private int idPokemon;
    private String nombrePokemon;
    private int cont;
    public Alimento(){
        
    }

    public Alimento(int id, String nombre, double vida) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
       
    }
    
    public Alimento(int idA, String nombreA){
        this.actividad = new Pokemon[150];
        this.idA = idA;
        this.nombreA = nombreA;
        //this.idPokemon = idPokemon;
        //this.nombrePokemon = nombrePokemon;
        this.cont=0;
        
    }
    
    public void AsignarActiv(Pokemon Poke){
        if(cont<150){
            
        
        this.actividad[cont]=Poke;
        cont++;
        }
    }
    public void MostarDatos(){
        System.out.print(idA+" ");
        System.out.print(nombreA+ " ");
       // System.out.print(idPokemon+" ");
        //System.out.print(nombrePokemon+" ");
        
        for (int j = 0; j < cont; j++) {
            System.out.print(" "+actividad[j].getId() );
            //System.out.print(" "+actividad[j].getId());
            System.out.print(" "+actividad[j].getNombre());
            //System.out.println(pokemones[j].getNombre());
           
        }
            
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    public double getVida() {
        return vida;
    }

    public Pokemon[] getActividad() {
        return actividad;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public void setActividad(Pokemon[] actividad) {
        this.actividad = actividad;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }
    
    
    
    public String imprimir(){
        return id +" "+nombre+" "+vida;
    }
}
