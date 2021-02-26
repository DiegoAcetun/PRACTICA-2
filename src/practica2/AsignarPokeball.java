package practica2;


public class AsignarPokeball {
    private int idPokeball; 
    private int idEntrenador;
   
    public AsignarPokeball(){
    
        
}

    public AsignarPokeball(int idEntrenador, int idPokeball) {
         this.idEntrenador = idEntrenador;
        this.idPokeball = idPokeball;
       
    }

    public int getIdPokeball() {
        return idPokeball;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdPokeball(int idPokeball) {
        this.idPokeball = idPokeball;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
    
    
    public String imprimir(){
        
        return idEntrenador + " " +idPokeball;
    }
  
    
}
