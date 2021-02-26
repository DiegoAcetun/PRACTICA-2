package practica2;

import com.sun.imageio.plugins.common.I18N;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//import static practica2.Pokemon.arreglo;
public class PRACTICA2 {

    public static String arreglo[];
    static int id;
    static Pokemon[] array_NombrePokemon;
    static int contadorE;
    static int o;
    static int contadorAsignarPokeball;
    static int idPokemon;
    static int idCargaPokemon;
    static int idPokeball;
    static int idPokeballA;
    static int idEntrenador;
    static String tipo;
    static String nombre;
    static Double vida;
    static Double puntos_de_ataque;
    static boolean capturado;
    static boolean estado;
    static String lugar;
    static Pokemon[] array_Pokemon;
    static Entrenadores[] array_Entrenadores;
    static PokeBall[] array_pokeballs;
    static Gimnasio[] array_gimnasio;
    static Alimento[] array_alimentos;
    static Pokemon[] array_AsignarPokemon;
    static PokeBall[] array_AsignarPokeball;
    static PokeBall[] array_AsignarPokeballE;
    static PokeBall[] array_Asignacion;
    static Entrenadores[] array_DarPokeball;
    static Entrenadores[] array_AsignarPokeballEntrenador;
    static String NombrePokemon;
    static int i, j, k, h, contadorIDAsiganar;

    public static void main(String[] args) {
        Pokemon pokemones = new Pokemon();
        array_Pokemon = new Pokemon[150];
        archivos_pokemon();
        System.out.println("pokemon ");
        System.out.println(array_Pokemon[50].getId());
        // System.out.println(array[0].getNombre()+array[2].getPuntos_de_ataque());
        Entrenadores entrenadores = new Entrenadores();
        array_Entrenadores = new Entrenadores[25];
        array_DarPokeball = new Entrenadores[125];
        archivos_Entrenadores();
        System.out.println("");

        PokeBall pokeballs = new PokeBall();
        array_pokeballs = new PokeBall[150];
        archivos_Pokeball();
        System.out.println("");

        Gimnasio gimnasios = new Gimnasio();
        array_gimnasio = new Gimnasio[25];
        //archivos_Gimansio();
        System.out.println("");

        Alimento alimentos = new Alimento();
        array_alimentos = new Alimento[15];
        //archivos_Alimento();
        System.out.println("");

        /*AsignarPokeball asignarPokeball = new AsignarPokeball();
        array_AsignarPokeball = new AsignarPokeball[125];
        archivos_AsignarPokeball();*/
        System.out.println("Resultados:");

        archivos_AsignarPokemon();
        archivos_AsignarPokeballs();

        System.out.println("");

        //AsignarPokeball();
        //imprimir_AsignacionPokeball();
    }

    public static void archivos_pokemon() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Carga de Pokemons ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();
            i = 0;
            k = 0;
            h = 0;
            int contadorFilas = 0;
            j = 0;
            int m = 0;
            int n = 0;
            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                if (arreglo[5].toUpperCase().equals("CAPTURADO")) {
                    capturado = true;
                } else {
                    capturado = false;
                }

                if (arreglo[6].toUpperCase().equals("VIVO")) {
                    estado = true;
                } else {
                    estado = false;
                }

                idCargaPokemon = Integer.parseInt(arreglo[0]);
                tipo = arreglo[1];
                nombre = arreglo[2];
                vida = Double.valueOf(arreglo[3]);
                puntos_de_ataque = Double.valueOf(arreglo[4]);
                capturado = capturado;
                estado = estado;
                h = h;
                for (i = i; i <= h; i++) {

                    array_Pokemon[i] = new Pokemon(idCargaPokemon, tipo, nombre, vida, puntos_de_ataque, capturado, estado);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_Pokemon[k].imprimir());
                }
                j++;
                //System.out.println("");

            }

            if (i < 150) {
                for (m = i; m < 150; m++) {

                    array_Pokemon[m] = new Pokemon();
                    //System.out.println(array[i].imprimir());
                }
                i++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    public static void archivos_Entrenadores() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Carga de Entrenadores ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            int contadorFilas = 0;
            i = 0;
            j = 0;
            k = 0;
            h = 0;
            int b = 0;
            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                id = Integer.parseInt(arreglo[0]);

                nombre = arreglo[1];

                for (i = i; i <= h; i++) {

                    array_Entrenadores[i] = new Entrenadores(id, nombre);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_Entrenadores[k].imprimir());
                }
                j++;

            }
            contadorE = i;

            if(i<25){
                for (b = i; b < 25; b++) {

                    array_Entrenadores[b] = new Entrenadores();
                    
                    //System.out.println(array[i].imprimir());
                }
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void archivos_Pokeball() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Carga de Pokeballs ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            i = 0;
            j = 0;
            k = 0;
            h = 0;

            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                id = Integer.parseInt(arreglo[0]);

                tipo = arreglo[1];

                for (i = i; i <= h; i++) {

                    array_pokeballs[i] = new PokeBall(id, tipo);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_pokeballs[k].imprimir());
                }
                j++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void archivos_Gimansio() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Carga de Gimnasios ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            i = 0;
            j = 0;
            k = 0;
            h = 0;

            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                id = Integer.parseInt(arreglo[0]);

                lugar = arreglo[1];

                for (i = i; i <= h; i++) {

                    array_gimnasio[i] = new Gimnasio(id, lugar);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_gimnasio[k].imprimir());
                }
                j++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void archivos_Alimento() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Carga de alimentos ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            i = 0;
            j = 0;
            k = 0;
            h = 0;

            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                id = Integer.parseInt(arreglo[0]);

                nombre = arreglo[1];

                vida = Double.valueOf(arreglo[2]);

                for (i = i; i <= h; i++) {

                    array_alimentos[i] = new Alimento(id, nombre, vida);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_alimentos[k].imprimir());
                }
                j++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void archivos_AsignarPokemon() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Asigancion de Pokemon a sus Pokeballs ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            i = 1;
            j = 0;
            k = 0;
            h = 1;
            int p=0;
            contadorIDAsiganar = 0;
            PokeBall pokemonAsignacion = new PokeBall();
            array_AsignarPokeball = new PokeBall[150];
            Pokemon Apokeball = new Pokemon();
            array_AsignarPokemon = new Pokemon[150];
            array_NombrePokemon = new Pokemon[150];

            while ((linea = br.readLine()) != null) {
                //for (contadorIDAsiganar = contadorIDAsiganar; contadorIDAsiganar <= o; contadorIDAsiganar++) {
                arreglo = linea.split(",");

                idPokeball = Integer.parseInt(arreglo[0]);
                
                idPokemon = Integer.parseInt(arreglo[1]);
                for(p=0; p<150; p++){
                    if(idPokemon == array_Pokemon[p].getId()){
                        NombrePokemon = array_Pokemon[p].getNombre();
                    }
                }
                for (i = i; i <= h; i++) {

                    array_AsignarPokemon[i - 1] = new Pokemon(idPokemon);
                    array_AsignarPokeball[i - 1] = new PokeBall(idPokeball, NombrePokemon, 0);
                    
                    array_AsignarPokeball[i - 1].asignarPokemon(array_AsignarPokemon[i - 1]);
                    array_AsignarPokeball[i-1].MostrarDatos();
                    System.out.println("");
                }
                h++;

            }
            o=i;
            if(o<150){
                for (contadorAsignarPokeball=o; contadorAsignarPokeball<150; contadorAsignarPokeball++) {
                    array_AsignarPokemon[contadorAsignarPokeball] = new Pokemon();
                    array_AsignarPokeball[contadorAsignarPokeball] = new PokeBall();
                }
            }
            

            // for (i = i; i <= h; i++) {
            
            /*for (j = 0; j < i-1; j++) {
                array_AsignarPokeball[j].MostrarDatos();
                for (k = 0; k < 150; k++) {
                    if (array_AsignarPokemon[j].getId() == array_Pokemon[k].getId()) {
                        System.out.println(array_Pokemon[k].getNombre());
                        break;

                        //}
                    }

                }
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void archivos_AsignarPokeballs() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            System.out.println("Asigancion de Pkeball a entrenadores ");
            String ruta = sc.nextLine();
            archivo = new File(ruta);

            fr = new FileReader(archivo);

            br = new BufferedReader(fr);

            String linea = br.readLine();

            i = 1;
            j = 0;
            k = 0;
            h = 1;
            int y = 0;
            int g = 0;
            int v = 0;
            int z = 0;
            array_AsignarPokeballEntrenador = new Entrenadores[150];

            array_AsignarPokeballE = new PokeBall[150];

            while ((linea = br.readLine()) != null) {

                arreglo = linea.split(",");

                idEntrenador = Integer.parseInt(arreglo[0]);

                idPokeballA = Integer.parseInt(arreglo[1]);

                for (i = i; i <= h; i++) {

                    array_AsignarPokeballEntrenador[i - 1] = new Entrenadores(idEntrenador);
                    array_AsignarPokeballE[i - 1] = new PokeBall(idPokeballA, NombrePokemon, 0);

                }
                h++;

            }
            if(i<150){
                for (v = i-1; v < 150; v++) {

                    array_AsignarPokeballEntrenador[v] = new Entrenadores();
                    array_AsignarPokeballE[v] = new PokeBall();
                    //System.out.println(array[i].imprimir());
                }
               
            }

            for (g = 0; g < contadorE; g++) {
                System.out.print("El entrenador " + array_Entrenadores[g].getNombre() + " id " + array_Entrenadores[g].getId() + " tiene las pokebolas: ");
                System.out.println("");
                for (y = 0; y < 150; y++) {
                    if (array_Entrenadores[g].getId() == array_AsignarPokeballEntrenador[y].getIdEntrenador()) {
                        array_AsignarPokeballEntrenador[y].asignarPokeball(array_AsignarPokeballE[y]);

                        array_AsignarPokeballEntrenador[y].MostrarDatos();

                        
                for (j = 0; j < o-1; j++) {
                
                
                    if (array_AsignarPokeball[j].getIdd() == array_AsignarPokeballE[y].getIdd()) {
                        System.out.println(array_AsignarPokeball[j].getNombrepokemon());
                        break;

                        //}
                    

                }
            }
                        
                        
                        
                        
                        
                        
                        
                        /*for (j = 0; j < 150; j++) {
                            
                            
                                if (array_AsignarPokeball[j].getIdd() == array_AsignarPokeballE[y].getIdd()) {
                                    System.out.println(array_Pokemon[j].getNombre());
                                    break;

                                    //}
                                

                            }
                        }*/

                    }

                }
                System.out.println(" ");
            }

            // for (i = i; i <= h; i++) {
            /*for (j = 0; j < 9; j++) {
                System.out.println("");
                
                for (k = 0; k < 9; k++) {
                    if (array_AsignarPokeball[j].getIdd() == array_AsignarPokeballEntrenador[k].getId()) {
                        System.out.print(array_Pokemon[k].getNombre());
                        break;

                        //}
                    }

                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}
