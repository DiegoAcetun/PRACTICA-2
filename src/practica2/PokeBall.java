package practica2;


public class PokeBall {
    private int id;
    private int idd;
    private String tipo;
    private int idPokemon;
    private String pokemon;
    private int contador;
    private Pokemon[] pokemones;
    private String nombrepokemon;
    public PokeBall(){
        
    }
    public PokeBall(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        
    }
    

    public PokeBall(int idd, String nombrepokemon, int id) {
        this.idd = idd;
        this.pokemones = new Pokemon[150];
        this.contador = 0;
        this.nombrepokemon = nombrepokemon;
        this.id = id;
        
    }

    public PokeBall(String nombrepokemon) {
        
    }
    
    

    public String getNombrepokemon() {
        return nombrepokemon;
    }

    public void setNombrepokemon(String nombrepokemon) {
        this.nombrepokemon = nombrepokemon;
    }
    




    

   

   
    
    public void asignarPokemon(Pokemon poke){
        
        if (contador < 150){
            this.pokemones[contador] = poke;
            contador++;
            
        }else{
            System.out.println("Ya no se pueden asignar mas pokemon");
        }
        
    }
      public void MostrarDatos(){
        // En este caso, estamos mostrando la informacion necesaria del objeto
        // podemos acceder a la informacion de la persona y de su arreglo de Carros por medio de un recorrido
          System.out.print(idd+ " ");
          System.out.print(nombrepokemon);
        for (int j = 0; j < contador; j++) {
            System.out.print(" "+pokemones[j].getId() );
            //System.out.println(pokemones[j].getNombre());
        }
    }
    
    public String imprimir(){
        return id+" " +tipo;
        
    }
    
        public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getPokemon() {
        return pokemon;
    }

    public void setPokemon(String pokemon) {
        this.pokemon = pokemon;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public Pokemon[] getPokemones() {
        return pokemones;
    }

    public void setPokemones(Pokemon[] pokemones) {
        this.pokemones = pokemones;
    }
    
    
}
