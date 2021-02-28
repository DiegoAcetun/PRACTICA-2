package practica2;

import com.sun.imageio.plugins.common.I18N;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

//import static practica2.Pokemon.arreglo;
public class PRACTICA2 {

    public static String arreglo[];
    static int id;
    static int contadorPokemon;
    static Pokemon[] array_NombrePokemon;
    static int contadorE, contadorAlimentos;
    static int o;
    static int contadorAsignarPokeball;
    static int idPokemon;
    static int idCargaPokemon;
    static int idPokeball;
    static int idPokeballA;
    static int idEntrenador;
    static int idAlimento;
    static String tipo;
    static String nombre;
    static Double vida;
    static String NombreAlimento;
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
    static Alimento[] array_AsignarComida;
    static String NombrePokemon;
    static Pokemon[] array_AsignarCPokemon;
    static int i, j, k, h, y, g, v, z, c, contadorIDAsiganar, contadorPelas;
    static int opcion;
    static boolean valido;
    static int idPoke, idGimnasio; //idPoke1, idPoke2;
    static int[] idPoke1;
    static int[] idPoke2;
    static int f, l;
    static double[] array_Ali;
    static int opcionR;
    static String tipoPokemon;
    static double aux;
    static double[] array_puntosAtaque;
    static double[] array_vida;
    static Pokemon[] Pokemon2;
    static Pokemon[] Pokemon1;
    static double pelea;
    static int idgimnasio[];
    static double vidaPokemon1[], AtaquePokemon1[], vidaPokemon2[], AtaquePokemon2[];

    public static void main(String[] args) {

        menu();
        /*Pokemon pokemones = new Pokemon();
        array_Pokemon = new Pokemon[150];
        archivos_pokemon();
        
        // System.out.println(array[0].getNombre()+array[2].getPuntos_de_ataque());
        Entrenadores entrenadores = new Entrenadores();
        array_Entrenadores = new Entrenadores[25];
        //array_DarPokeball = new Entrenadores[125];
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

        AsignarPokeball asignarPokeball = new AsignarPokeball();
        array_AsignarPokeball = new AsignarPokeball[125];
        archivos_AsignarPokeball();
        System.out.println("Resultados:");

        archivos_AsignarPokemon();
        archivos_AsignarPokeballs();

        System.out.println("");*/

        //AsignarPokeball();
        //imprimir_AsignacionPokeball();
    }

    public static void menu() {
        opcion = 0;

        do {

            try {
                valido = true;

                while (opcion != 11) {

                    Scanner sc = new Scanner(System.in);
                    System.out.println("MENU");
                    System.out.println("1. Cargar Pokemon");
                    System.out.println("2. Cargar Entrenadores");
                    System.out.println("3. Cargar Pokeballs");
                    System.out.println("4. Cargar Gimnasios");
                    System.out.println("5. Cargar Alimentos");
                    System.out.println("6. Asignar pokemon sus pokeballs");
                    System.out.println("7. Asignar Pokeball a entrenadores");
                    System.out.println("8. Actividas Asignar comida");
                    System.out.println("9. Asignar actividad de pelea");
                    
                    System.out.println("10. Generar Reportes");
                    System.out.println("11. Salir");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            Pokemon pokemones = new Pokemon();
                            array_Pokemon = new Pokemon[150];
                            archivos_pokemon();
                            break;
                        case 2:
                            Entrenadores entrenadores = new Entrenadores();
                            array_Entrenadores = new Entrenadores[25];
                            //array_DarPokeball = new Entrenadores[125];
                            archivos_Entrenadores();
                            System.out.println("");
                            break;
                        case 3:
                            PokeBall pokeballs = new PokeBall();
                            array_pokeballs = new PokeBall[150];
                            archivos_Pokeball();
                            System.out.println("");

                            break;
                        case 4:
                            Gimnasio gimnasios = new Gimnasio();
                            array_gimnasio = new Gimnasio[25];
                            archivos_Gimansio();
                            System.out.println("");
                            break;
                        case 5:
                            Alimento alimentos = new Alimento();
                            array_alimentos = new Alimento[15];
                            archivos_Alimento();
                            System.out.println("");
                            break;
                        case 6:
                            archivos_AsignarPokemon();
                            break;
                        case 7:
                            archivos_AsignarPokeballs();
                            break;
                        case 8:
                            ActividadComida();
                            break;
                        case 9:
                            Pelea();
                            
                            break;
                            
                        case 10:
                            MenuReportes();
                            /*ReporteEntrenador();
                            ReportePokemonSalvajes();
                            ReporteComidas();
                            ReportePeleas();
                            ReportePuntosAtaque();
                            ReporteAlimentos();*/
//top
                            
                            break;
                        case 12:
                            ReportePuntosAtaque();
                            ReporteAlimentos();
                            break;
                        case 15:
                            Pelea();
                            break;
                        case 16:
                            ReportePeleas();
                            break;
                        case 13:

                            for (k = 0; k < contadorAlimentos - 1; k++) {
                                System.out.print(array_AsignarComida[k].getIdA() + " ");
                                System.out.print(array_AsignarComida[k].getNombreA() + " ");
                                for (y = 0; y < 150; y++) {

                                    if (array_AsignarCPokemon[k].getId() == array_Pokemon[y].getId()) {
                                        System.out.print(array_AsignarCPokemon[k].getId() + " ");
                                        System.out.println(array_AsignarCPokemon[k].getNombre());
                                        break;
                                    }

                                }
                            }
                            break;
                        case 11:
                            System.out.println("El programa finlaizó");
                            break;

                    }

                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Ingrese una opcion valida ");
                valido = false;
            }

        } while (valido == false);

    }

    public static void archivos_pokemon() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        do {

            try {
                valido = true;
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
                contadorPokemon = i;

                if (i < 150) {
                    for (m = i; m < 150; m++) {

                        array_Pokemon[m] = new Pokemon();
                        //System.out.println(array[i].imprimir());
                    }
                    i++;
                }

            } catch (Exception e) {
                System.out.println("No se encuentra la ruta del archivo vuelva a ingresarla ");
                valido = false;
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_Entrenadores() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        do {

            try {
                valido = true;
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

                if (i < 25) {
                    for (b = i; b < 25; b++) {

                        array_Entrenadores[b] = new Entrenadores();

                        //System.out.println(array[i].imprimir());
                    }

                }
            } catch (Exception e) {
                System.out.println("No se encontró el archivo, vuelva a ingresar la ruta");
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_Pokeball() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {
                valido = true;
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
                System.out.println("No se encontró la ruta ");
                valido = false;
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_Gimansio() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        do {

            try {
                valido = true;

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
                System.out.println("No se encontró la ruta ");
                valido = false;
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_Alimento() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {
                valido = true;

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
                contadorAlimentos = i - 1;
                if (i < 15) {
                    for (y = i; y < 15; y++) {
                        array_alimentos[y] = new Alimento();
                    }
                }

            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("No se encontró la ruta");
                valido = false;

            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_AsignarPokemon() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {
                valido = true;

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
                int p = 0;
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

                    for (p = 0; p < 150; p++) {
                        if (idPokemon == array_Pokemon[p].getId()) {
                            NombrePokemon = array_Pokemon[p].getNombre();
                            idPoke = array_Pokemon[p].getId();
                            tipoPokemon = array_Pokemon[p].getTipo();
                        }
                    }
                    for (i = i; i <= h; i++) {

                        array_AsignarPokemon[i - 1] = new Pokemon(idPokemon);
                        array_AsignarPokeball[i - 1] = new PokeBall(idPokeball, NombrePokemon, idPoke, tipoPokemon);

                        array_AsignarPokeball[i - 1].asignarPokemon(array_AsignarPokemon[i - 1]);
                        array_AsignarPokeball[i - 1].MostrarDatos();
                        System.out.println("");
                    }
                    h++;

                }
                o = i;
                if (o < 150) {
                    for (contadorAsignarPokeball = o; contadorAsignarPokeball < 150; contadorAsignarPokeball++) {
                        array_AsignarPokemon[contadorAsignarPokeball] = new Pokemon();
                        array_AsignarPokeball[contadorAsignarPokeball] = new PokeBall();
                    }
                }

            } catch (Exception e) {
                System.out.println("No se encontró la ruta");
                valido = false;

            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void archivos_AsignarPokeballs() {

        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {

                valido = true;

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
                y = 0;
                g = 0;
                v = 0;
                z = 0;
                c = 0;
                array_AsignarPokeballEntrenador = new Entrenadores[150];

                array_AsignarPokeballE = new PokeBall[150];

                while ((linea = br.readLine()) != null) {

                    arreglo = linea.split(",");

                    idEntrenador = Integer.parseInt(arreglo[0]);

                    idPokeballA = Integer.parseInt(arreglo[1]);

                    for (i = i; i <= h; i++) {

                        array_AsignarPokeballEntrenador[i - 1] = new Entrenadores(idEntrenador);
                        array_AsignarPokeballE[i - 1] = new PokeBall(idPokeballA, NombrePokemon, idPoke, tipoPokemon);

                    }
                    h++;

                }
                if (i < 150) {
                    for (v = i - 1; v < 150; v++) {

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

                            for (j = 0; j < o - 1; j++) {

                                if (array_AsignarPokeball[j].getIdd() == array_AsignarPokeballE[y].getIdd()) {
                                    System.out.print(array_AsignarPokeball[j].getNombrepokemon() + " ");
                                    System.out.print(array_AsignarPokeball[j].getId() + " ");
                                    System.out.println(array_AsignarPokeball[j].getTipo() + " ");
                                    break;

                                    //}
                                }
                            }
                        }
                    }

                    System.out.println(" ");
                }

            } catch (Exception e) {
                System.out.println("No se encontró la ruta");
                valido = false;
            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);

    }

    public static void ActividadComida() {
        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {
                valido = true;

                System.out.println("Asigancion de actividad de comida ");
                String ruta = sc.nextLine();
                archivo = new File(ruta);

                fr = new FileReader(archivo);

                br = new BufferedReader(fr);

                String linea = br.readLine();

                i = 1;
                j = 0;
                k = 0;
                h = 1;
                o = 0;
                int x = 0;

                Alimento pokemonAsignacionA = new Alimento();
                array_AsignarComida = new Alimento[150];
                Pokemon ApokeballA = new Pokemon();
                array_AsignarCPokemon = new Pokemon[150];
                //array_NombrePokemon = new Pokemon[150];

                while ((linea = br.readLine()) != null) {
                    //for (contadorIDAsiganar = contadorIDAsiganar; contadorIDAsiganar <= o; contadorIDAsiganar++) {
                    arreglo = linea.split(",");

                    idAlimento = Integer.parseInt(arreglo[0]);

                    idPokemon = Integer.parseInt(arreglo[1]);

                    for (y = 0; y < array_alimentos.length; y++) {
                        if (idAlimento == array_alimentos[y].getId()) {

                            NombreAlimento = array_alimentos[y].getNombre();
                        }
                    }
                    for (x = 0; x < 150; x++) {
                        if (idPokemon == array_Pokemon[x].getId()) {
                            NombrePokemon = array_Pokemon[x].getNombre();
                            //idPoke = array_Pokemon[x].getId();

                        }
                    }
                    for (i = i; i <= h; i++) {

                        array_AsignarCPokemon[i - 1] = new Pokemon(idPokemon, NombrePokemon);
                        array_AsignarComida[i - 1] = new Alimento(idAlimento, NombreAlimento);

                        array_AsignarComida[i - 1].AsignarActiv(array_AsignarCPokemon[i - 1]);

                        array_AsignarComida[i - 1].MostarDatos();
                        System.out.println("");

                        /*array_AsignarPokemon[i - 1] = new Pokemon(idPokemon);
                        array_AsignarPokeball[i - 1] = new PokeBall(idPokeball, NombrePokemon, idPoke, tipoPokemon);

                        array_AsignarPokeball[i - 1].asignarPokemon(array_AsignarPokemon[i - 1]);
                        array_AsignarPokeball[i - 1].MostrarDatos();
                        System.out.println("");*/
                    }
                    h++;

                }
                contadorAlimentos = i;
                if (i < 150) {
                    for (o = i; o < 150; o++) {
                        array_AsignarComida[o] = new Alimento();
                        array_AsignarCPokemon[o] = new Pokemon();
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                //System.out.println("No se encontró la ruta");
                //valido = false;

            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void Pelea() {
        Scanner sc = new Scanner(System.in);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        do {

            try {
                valido = true;

                System.out.println("Asigancion de actividad de pelea ");
                String ruta = sc.nextLine();
                archivo = new File(ruta);

                fr = new FileReader(archivo);

                br = new BufferedReader(fr);

                String linea = br.readLine();

                i = 1;
                j = 0;
                k = 0;
                h = 1;
                o = 0;
                int x = 0;
                int s = 0;

                vidaPokemon1 = new double[150];
                vidaPokemon2 = new double[150];
                AtaquePokemon1 = new double[150];
                AtaquePokemon2 = new double[150];
                idgimnasio = new int[150];
                Pokemon1 = new Pokemon[150];
                Pokemon2 = new Pokemon[150];
                idPoke1 = new int[150];
                idPoke2 = new int[150];
                while ((linea = br.readLine()) != null) {
                    //for (contadorIDAsiganar = contadorIDAsiganar; contadorIDAsiganar <= o; contadorIDAsiganar++) {
                    arreglo = linea.split(",");

                    idgimnasio[s] = Integer.parseInt(arreglo[0]);
                    s++;

                    idPoke1[s] = Integer.parseInt(arreglo[1]);
                    idPoke2[s] = Integer.parseInt(arreglo[2]);

                    for (j = 0; j < s; j++) {
                        for (y = 0; y < contadorPokemon; y++) {
                            if (idPoke1[s] == array_Pokemon[y].getId()) {
                                Pokemon1[j] = new Pokemon(idPoke1[s], array_Pokemon[y].getNombre(), array_Pokemon[y].getVida(), array_Pokemon[y].getPuntos_de_ataque());
                                vidaPokemon1[j] = Pokemon1[j].getVida();
                                AtaquePokemon1[j] = Pokemon1[j].getPuntos_de_ataque();

                            }

                            if (idPoke2[s] == array_Pokemon[y].getId()) {
                                Pokemon2[j] = new Pokemon(idPoke2[s], array_Pokemon[y].getNombre(), array_Pokemon[y].getVida(), array_Pokemon[y].getPuntos_de_ataque());
                                vidaPokemon2[j] = Pokemon2[j].getVida();
                                AtaquePokemon2[j] = Pokemon2[j].getPuntos_de_ataque();

                            }

                        }

                         for (i = 0; i < 3; i++) {

                            if (vidaPokemon1[j] > 0) {

                                vidaPokemon2[j] = vidaPokemon2[j] - AtaquePokemon1[j];
                                if (vidaPokemon2[j] > 0) {
                                    vidaPokemon1[j] = vidaPokemon1[j] - AtaquePokemon2[j];
                                }
                            }//2
                        }

                    }
                    if (vidaPokemon1[j - 1] > vidaPokemon2[j - 1]) {
                        for (z = 0; z < contadorPokemon; z++) {
                            if (idPoke1[s] == array_Pokemon[z].getId()) {
                                break;
                            }

                        }
                        System.out.println("El ganador es el pokemon 1 " +"id "+ array_Pokemon[z].getId()+" " + array_Pokemon[z].getNombre());

                    } else {
                        for (k = 0; k < contadorPokemon; k++) {
                            if (idPoke2[s] == array_Pokemon[k].getId()) {
                                break;
                            }
                        }
                        System.out.println("El ganador es el pokemon 2 " +"id "+array_Pokemon[k].getId()+" "+ array_Pokemon[k].getNombre());
                         
                    }

                }
                contadorPelas = s;

                //PELEA

                /*for (v = 0; v < s; v++) {

                        for (i = 0; i < 3; i++) {

                            if (vidaPokemon1[v] > 0) {

                                vidaPokemon2[v] = vidaPokemon2[v] - AtaquePokemon1[v];
                                if (vidaPokemon2[v] > 0) {
                                    vidaPokemon1[v] = vidaPokemon1[v] - AtaquePokemon2[v];
                                }
                            }//2

                        }
                     if(vidaPokemon1[v]>vidaPokemon2[v]){
                        System.out.println("El ganador es el pokemon 1"); 
                    }else{
                        System.out.println("El ganador es el pokemon 2222");
                                
                    } 
                        
                        
                    }*/
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("No se encontró la ruta");
                valido = false;

            } finally {

                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } while (valido = false);
    }

    public static void capturado() {
        for (g = 0; g < 150; g++) {

            for (y = 0; y < o - 1; y++) {
                if (array_Pokemon[g].getId() == array_AsignarPokeball[y].getId()) {

                    array_Pokemon[g].setCapturado(true);
                }
            }
        }
        System.out.println("Los Salvajes son: ");
        for (j = 0; j < contadorPokemon; j++) {
            if (array_Pokemon[j].isCapturado() == false) {
                System.out.println(array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre());
            }
        }
    }

    public static void ReporteComidas() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("REPORTE COMIDA.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE COMIDA </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE ACTIVIDAD DE COMIDA: </h3> </font>");
            pw.println("<table border =\"1\">");

            pw.print("<thead>");

            pw.print("<tr>");

            pw.print("<th> <font color=\"edff21\"> Id Alimento </th>");
            pw.print("<th> <font color=\"edff21\"> Nombre Alimento</th>");
            pw.print("<th> <font color=\"edff21\">  Id Pokemon </th>");
            pw.print("<th> <font color=\"edff21\">  Nombre Pokemon </th>");

            pw.print("</tr>");

            pw.print("</thead>");

            /*for(k=0;k<contadorAlimentos-1;k++){
    System.out.print(array_AsignarComida[k].getIdA()+" "); 
    System.out.print(array_AsignarComida[k].getNombreA()+" ");
    for(y=0; y<150;y++){

    if(array_AsignarCPokemon[k].getId()==array_Pokemon[y].getId()){
        System.out.print(array_AsignarCPokemon[k].getId()+" ");
        System.out.println(array_AsignarCPokemon[k].getNombre());
        break;
    }


                    }
                    }*/
            for (k = 0; k < contadorAlimentos - 1; k++) {
                pw.print("<tr>");
                //array_AsignarComida[y].AsignarActiv(array_AsignarCPokemon[y]);

                //pw.print("<td> <font color=\"#00FF00\">" +array_AsignarComida[y].getId()+ "</td>");
//                pw.print("<td> <font color=\"#00FF00\">" +array_AsignarComida[y].getNombre()+ "</td>");
                pw.print("<td> <font color=\"#00FF00\">" + array_AsignarComida[k].getIdA() + "</td>");
                pw.print("<td> <font color=\"#00FF00\">" + array_AsignarComida[k].getNombreA() + "</td>");
                for (y = 0; y < array_alimentos.length; y++) {

                    if (array_AsignarCPokemon[k].getId() == array_Pokemon[y].getId()) {

                        pw.print("<td> <font color=\"#00FF00\">" + array_AsignarCPokemon[k].getId() + "</td>");
                        pw.print("<td> <font color=\"#00FF00\">" + array_AsignarCPokemon[k].getNombre() + "</td>");
                    }
                    //pw.print("<td> <font color=\"#00FF00\">" +array_AsignarComida[y].getNombrePokemon()+ "</td>");
                }
                pw.print("</tr>");
            }

            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE ACTIVIDAD COMIDA GENERADO ");
        } catch (Exception e) {
            System.out.println("No se encontró la ruta ");
            //e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No hay entrenadores cargados");
            }
        }

    }

    public static void ReporteEntrenador() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("REPORTE ENTRENADORES.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE ENTRENADORES </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE ENTRENADORES: </h3> </font>");

            for (g = 0; g < contadorE; g++) {
                //pw.print("<font color=\"#FFFF00\">");
                pw.println("<table border =\"1\">");

                pw.print("<H3> <font color=\"#FFFFFF\">" + "El entrenador " + array_Entrenadores[g].getNombre() + " id " + array_Entrenadores[g].getId() + " tiene las pokeball: " + "</H3>" + "<br>");

                //pw.print("</font>");
                pw.print("<thead>");

                pw.print("<tr>");

                pw.print("<th> <font color=\"edff21\"> Id Pokeball </th>");
                pw.print("<th> <font color=\"edff21\"> Id Pokemon </th>");
                pw.print("<th> <font color=\"edff21\">  Nombre Pokemon </th>");
                pw.print("<th> <font color=\"edff21\">  Tipo Pokemon </th>");

                pw.print("</tr>");

                pw.print("</thead>");

                for (y = 0; y < 150; y++) {
                    if (array_Entrenadores[g].getId() == array_AsignarPokeballEntrenador[y].getIdEntrenador()) {

                        array_AsignarPokeballEntrenador[y].asignarPokeball(array_AsignarPokeballE[y]);
                        pw.print("<tr>");
                        pw.print("<font color=\"#00FF00\">");
                        pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeballEntrenador[y].MostrarDatos() + "</td> ");

                        for (j = 0; j < o - 1; j++) {

                            if (array_AsignarPokeball[j].getIdd() == array_AsignarPokeballE[y].getIdd()) {
                                //pw.println("Contiene al pokemon id " + array_AsignarPokeball[j].getId() + " Nombre " + array_AsignarPokeball[j].getNombrepokemon() + " tipo " + array_AsignarPokeball[j].getTipo() + "<br>" + "</font>");

                                pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeball[j].getId() + "</td> ");
                                pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeball[j].getNombrepokemon() + "</td> ");
                                pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeball[j].getTipo() + "</td> ");

                                pw.print("</tr>");

                                break;

                                //}
                            }
                        }

                    }

                }

            }

            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE ENTRENADORES GENERADOS ");
        } catch (Exception e) {
            System.out.println("No se encontró la ruta ");

        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No hay entrenadores cargados");
            }
        }
    }

    public static void ReportePokemonSalvajes() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("REPORTE POKEMON SALVAJES.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE POKEMON SALVAJES </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE POKEMON SALVAJES: </h3> </font>");

            for (g = 0; g < 150; g++) {

                for (y = 0; y < o - 1; y++) {
                    if (array_Pokemon[g].getId() == array_AsignarPokeball[y].getId()) {

                        array_Pokemon[g].setCapturado(true);
                    }
                }
            }
            pw.println("<table border =\"1\">");
            pw.print("<H3><font color=\"#FFFF00\"> Los Pokemon Salvajes son: </font> </H3>");
            pw.print("<thead>");

            pw.print("<tr>");
            pw.print("<th> <font color=\"edff21\"> ID </th>");
            pw.print("<th> <font color=\"edff21\"> Nombre </th>");
            pw.print("<th> <font color=\"edff21\">  Tipo </th>");
            pw.print("<th> <font color=\"edff21\">  Vida </th>");
            pw.print("<th> <font color=\"edff21\"> Puntos de ataque </th>");

            pw.print("</tr>");

            pw.print("</thead>");
            for (j = 0; j < contadorPokemon; j++) {

                if (array_Pokemon[j].isCapturado() == false) {
                    pw.print("<tr>");

                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getId() + "</td>");

                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getNombre() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getTipo() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getVida() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getPuntos_de_ataque() + "</td>");

                    pw.print("</tr>");

//pw.print("<font color=\"#00FF00\">" + array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre() + " " + array_Pokemon[j].getTipo() + " " + array_Pokemon[j].getVida() + " " + array_Pokemon[j].getPuntos_de_ataque() + "<br>" + "</font>");
                }

            }

            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE POKEMON SALVAJE GENERADO ");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("No se encontró la ruta ");

        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No se abrió el archivo");
            }
        }
    }

    public static void PuntosAtaque() {
        array_puntosAtaque = new double[150];
        for (z = 0; z < contadorPokemon; z++) {
            array_puntosAtaque[z] = array_Pokemon[z].getPuntos_de_ataque();

        }

        for (i = 0; i < contadorPokemon - 1; i++) {

            for (j = 0; j < contadorPokemon - 1; j++) {
                if (array_puntosAtaque[j] > array_puntosAtaque[j + 1]) {

                    aux = array_puntosAtaque[j];
                    array_puntosAtaque[j] = array_puntosAtaque[j + 1];
                    array_puntosAtaque[j + 1] = aux;

                }
            }
        }

        for (i = contadorPokemon - 1; i > contadorPokemon - 6; i--) {
            System.out.print(array_puntosAtaque[i]);
            for (j = 0; j < contadorPokemon; j++) {

                if (array_puntosAtaque[i] == array_Pokemon[j].getPuntos_de_ataque()) {
                    System.out.println(" " + array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre());
                    break;
                }

            }
        }

    }

    public static void ReportePuntosAtaque() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {
            array_puntosAtaque = new double[150];
            for (z = 0; z < contadorPokemon; z++) {
                array_puntosAtaque[z] = array_Pokemon[z].getPuntos_de_ataque();

            }

            for (i = 0; i < contadorPokemon - 1; i++) {

                for (j = 0; j < contadorPokemon - 1; j++) {
                    if (array_puntosAtaque[j] > array_puntosAtaque[j + 1]) {

                        aux = array_puntosAtaque[j];
                        array_puntosAtaque[j] = array_puntosAtaque[j + 1];
                        array_puntosAtaque[j + 1] = aux;

                    }
                }
            }

            fichero = new FileWriter("REPORTE TOP ATAQUE.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE TOP ATAQUE </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE POKEMON CON MAS PUNTOS DE ATAQUE: </h3> </font>");

            pw.println("<table border =\"1\">");

            pw.print("<thead>");

            pw.print("<tr>");
            pw.print("<th> <font color=\"edff21\"> Id </th>");
            pw.print("<th> <font color=\"edff21\"> Nombre </th>");
            pw.print("<th> <font color=\"edff21\">  Tipo </th>");
            pw.print("<th> <font color=\"edff21\"> Puntos de ataque </th>");

            pw.print("</tr>");

            pw.print("</thead>");

            /*for(i=contadorPokemon-1;i>contadorPokemon-6;i--){
            System.out.print(array_puntosAtaque[i]);
            for(j=0;j<contadorPokemon;j++){
                
            
            if(array_puntosAtaque[i]==array_Pokemon[j].getPuntos_de_ataque()){
                System.out.println(" "+array_Pokemon[i].getId()+" "+array_Pokemon[i].getNombre());
                break;
            }
            
        }
        }*/
            pw.print("<tr>");
            for (i = contadorPokemon - 1; i > contadorPokemon - 6; i--) {

                //pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getId() + "</td>");
                for (j = 0; j < contadorPokemon; j++) {

                    if (array_puntosAtaque[i] == array_Pokemon[j].getPuntos_de_ataque()) {
                        pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getId() + "</td>");

                        pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getNombre() + "</td>");
                        pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getTipo() + "</td>");

                        break;
                    }

                }
                pw.print("<td> <font color=\"#00FF00\">" + array_puntosAtaque[i] + "</td>");

                pw.print("</tr>");
            }

//pw.print("<font color=\"#00FF00\">" + array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre() + " " + array_Pokemon[j].getTipo() + " " + array_Pokemon[j].getVida() + " " + array_Pokemon[j].getPuntos_de_ataque() + "<br>" + "</font>");
            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE POKEMON CON MAS ATAQUE GENERADO ");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("No se encontró la ruta ");

        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No se abrió el archivo");
            }
        }

    }

    public static void ReporteAlimentos() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {
            array_Ali = new double[150];
            for (z = 0; z < contadorAlimentos; z++) {
                array_Ali[z] = array_alimentos[z].getVida();

            }

            for (i = 0; i < contadorAlimentos - 1; i++) {

                for (j = 0; j < contadorAlimentos - 1; j++) {
                    if (array_Ali[j] > array_Ali[j + 1]) {

                        aux = array_Ali[j];
                        array_Ali[j] = array_Ali[j + 1];
                        array_Ali[j + 1] = aux;

                    }
                }
            }

            fichero = new FileWriter("REPORTE ALIMENTOS.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE ALIMENTOS </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE ALIMENTOS CON MAS SALUD: </h3> </font>");

            pw.println("<table border =\"1\">");

            pw.print("<thead>");

            pw.print("<tr>");
            pw.print("<th> <font color=\"edff21\"> Id </th>");
            pw.print("<th> <font color=\"edff21\"> Nombre </th>");
            
            pw.print("<th> <font color=\"edff21\"> Vida </th>");

            pw.print("</tr>");

            pw.print("</thead>");

            /*for(i=contadorPokemon-1;i>contadorPokemon-6;i--){
            System.out.print(array_puntosAtaque[i]);
            for(j=0;j<contadorPokemon;j++){
                
            
            if(array_puntosAtaque[i]==array_Pokemon[j].getPuntos_de_ataque()){
                System.out.println(" "+array_Pokemon[i].getId()+" "+array_Pokemon[i].getNombre());
                break;
            }
            
        }
        }*/
            pw.print("<tr>");
            for (i = contadorAlimentos - 1; i > contadorAlimentos - 6; i--) {

                //pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getId() + "</td>");
                for (j = 0; j < contadorAlimentos; j++) {

                    if (array_Ali[i] == array_alimentos[j].getVida()) {
                        pw.print("<td> <font color=\"#00FF00\">" + array_alimentos[j].getId() + "</td>");

                        pw.print("<td> <font color=\"#00FF00\">" + array_alimentos[j].getNombre() + "</td>");
                        pw.print("<td> <font color=\"#00FF00\">" + array_alimentos[j].getVida()+ "</td>");

                        break;
                    }

                }
                //pw.print("<td> <font color=\"#00FF00\">" + array_Ali[i] + "</td>");

                pw.print("</tr>");
            }

//pw.print("<font color=\"#00FF00\">" + array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre() + " " + array_Pokemon[j].getTipo() + " " + array_Pokemon[j].getVida() + " " + array_Pokemon[j].getPuntos_de_ataque() + "<br>" + "</font>");
            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE ALIMENTOS CON MAYOR SALUD GENERADO ");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("No se encontró la ruta ");

        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No se abrió el archivo");
            }
        }
    }

    public static void ReportePeleas() {
        // FileWriter: para crear archivos
        FileWriter fichero = null;
        // PrintWritter: para escribir
        PrintWriter pw = null;
        try {

            fichero = new FileWriter("REPORTE PELEAS.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE PELEAS </title> ");
            pw.println("<body style=\"background-color: #154360 ;\">");

            pw.println("<h3> <font color=\"#F1948A\">  REPORTE PELEAS: </h3> </font>");

            pw.println("<table border =\"1\">");

            pw.print("<thead>");

            pw.print("<tr>");
            pw.print("<th> <font color=\"edff21\"> Pelea </th>");
            pw.print("<th> <font color=\"edff21\"> Pokemon 1 </th>");
            pw.print("<th> <font color=\"edff21\">  Pokemon 2 </th>");
            pw.print("<th> <font color=\"edff21\"> Ganador </th>");

            pw.print("</tr>");

            pw.print("</thead>");

            
            h = 0;
            pw.print("<tr>");
            for (y = 0; y < contadorPelas; y++) {

                pw.print("<td> <font color=\"#00FF00\">" + (y + 1) + "</td>");
                h++;

                for (j = 0; j < h; j++) {

                    for (i = 0; i < 3; i++) {

                            if (vidaPokemon1[j] > 0) {

                                vidaPokemon2[j] = vidaPokemon2[j] - AtaquePokemon1[j];
                                if (vidaPokemon2[j] > 0) {
                                    vidaPokemon1[j] = vidaPokemon1[j] - AtaquePokemon2[j];
                                }
                            }
                        }
                }
                
                
                if (vidaPokemon1[j - 1] > vidaPokemon2[j - 1]) {

                    for (z = 0; z < contadorPokemon; z++) {
                        if (idPoke1[h] == array_Pokemon[z].getId()) {
                            break;
                        }
                    }
                    for (f = 0; f < contadorPokemon; f++) {
                        if (idPoke2[h] == array_Pokemon[f].getId()) {
                            break;
                        }
                    }

                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[z].getNombre() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[f].getNombre() + "</td>");
                    pw.print("<td> <font color pw.print=\"#00FF00\">" + array_Pokemon[z].getNombre() + "</td>");

                } else if (vidaPokemon2[j - 1] > vidaPokemon1[j - 1]) {
                    for (k = 0; k < contadorPokemon; k++) {
                        if (idPoke2[h] == array_Pokemon[k].getId()) {
                            break;
                        }
                    }
                    for (c = 0; c < contadorPokemon; c++) {
                        if (idPoke1[h] == array_Pokemon[c].getId()) {
                            break;
                        }
                    }
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[c].getNombre() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[k].getNombre() + "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[k].getNombre() + "</td>");

                    //pw.print("<td> <font color=\"#00FF00\">" + array_vida[i] + "</td>");
                }

                pw.print("</tr>");
            }

            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE PELEAS GENERADO ");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("No se encontró la ruta ");

        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                System.out.println("No se abrió el archivo");
            }
            
            
        }
        
    }
    public static void MenuReportes(){
        
            opcion = 0;

        

            try {
                valido = true;

                

                    Scanner sc = new Scanner(System.in);
                    System.out.println("MENU REPORTES");
                    System.out.println("1. REPORTE ENTRENADORES");
                    System.out.println("2. REPORTE COMIDA ASIGNADA");
                    System.out.println("3. RAPORTE POKEMON CON MAS ATAQUE");
                    System.out.println("4. ALIMENTOS CON MAS SALUD");
                    System.out.println("5. REPORTE POKEMON SALVAJES");
                    System.out.println("6. REPORTE PELEAS");
                    
                    
                    
                    opcionR = sc.nextInt();

                    switch(opcionR){
                        case 1:
                            ReporteEntrenador();
                            break;
                        case 2:
                            ReporteComidas();
                            break;
                        case 3:
                            ReportePuntosAtaque();
                            break;
                        case 4:
                            ReporteAlimentos();
                            break;
                        case 5:
                            ReportePokemonSalvajes();
                            break;
                        case 6:
                            ReportePeleas();
                            break;
                                   
                    }

                
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Ingrese una opcion valida ");
                valido = false;
            }

        

        }
}
