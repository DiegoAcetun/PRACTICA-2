package practica2;

public class Entrenadores {

    private int id;
    private String nombre;
    private int idPokeball;
    private int idEntrenador;
    PokeBall[] pokeballs;
    private int contador;
    private String pokemon;
    public Entrenadores() {

    }

    public Entrenadores(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;

    }
    
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdPokeball() {
        return idPokeball;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdPokeball(int idPokeball) {
        this.idPokeball = idPokeball;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

   
    
    public Entrenadores(int idEntrenador){
        //this.idPokeball = idPokeball;
        this.pokeballs = new PokeBall[150];
        this.contador=0;
        this.idEntrenador = idEntrenador;
    }

    public Entrenadores(String pokemon) {
        this.pokemon = pokemon;
    }

   
    
    
    
    
     
     public void asignarPokeball(PokeBall pokeball){
        
        if (contador < 150){
            
            this.pokeballs[contador] = pokeball;
            contador++;
            
        }else{
            System.out.println("Ya no se pueden asignar mas pokeballs");
        }
        
    }
      public int MostrarDatos(){
        // En este caso, estamos mostrando la informacion necesaria del objeto
        // podemos acceder a la informacion de la persona y de su arreglo de Carros por medio de un recorrido
          //System.out.print(idEntrenador+ " ");
          
        for (int j = 0; j < contador; j++) {
            System.out.print(pokeballs[j].getIdd()+ " ");
            
            //System.out.println(pokemones[j].getNombre());
            return pokeballs[j].getIdd();
        }
        return 0;
    }
    

    public String imprimir() {

        return id + " " + nombre;

    }

}
