
package practica2;


public class AsignarPokemon {
    private int idAsigancionPokemon;
    private int id;
    private String nombre;
    
    public AsignarPokemon(){
    
}
    
    public AsignarPokemon(int idAsigancionPokemon) {
        this.idAsigancionPokemon = idAsigancionPokemon;
        //this.id = id;
        //this.nombre=nombre;
    }

    public int getIdAsigancionPokemon() {
        return idAsigancionPokemon;
    }

    public int getId() {
        return id;
    }

   
    
    
    
    public int imprimir(){
        return idAsigancionPokemon;
    }
}
