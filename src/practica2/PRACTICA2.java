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
    static int i, j, k, h, y, g, v, z, contadorIDAsiganar;
    static int opcion;
    static boolean valido;
    static int idPoke;
    static String tipoPokemon;

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
                    System.out.println("8. CAPTURADO");
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
                            //archivos_Gimansio();
                            System.out.println("");
                            break;
                        case 5:
                            Alimento alimentos = new Alimento();
                            array_alimentos = new Alimento[15];
                            //archivos_Alimento();
                            System.out.println("");
                            break;
                        case 6:
                            archivos_AsignarPokemon();
                            break;
                        case 7:
                            archivos_AsignarPokeballs();
                            break;
                        case 8:
                            capturado();
                            break;
                        case 10:
                            ReporteEntrenador();
                            ReportePokemonSalvajes();
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
                         pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeball[j].getNombrepokemon()+ "</td> ");
                          pw.print("<td> <font color=\"#00FF00\">" + array_AsignarPokeball[j].getTipo()+ "</td> ");
                           
                             pw.print("</tr>");
                                
                                
                                break;

                                //}
                                
                             
                            }
                        }

                    }

                }
                
            }
            /*for (g = 0; g < contadorE; g++) {
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
                }*/

           
            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE ENTRENADORES GENERADOS ");
        } catch (Exception e) {
            System.out.println("No hay entrenadores ");

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

            fichero = new FileWriter("REPORTE POKEMONSALVAJES.HTML");

            pw = new PrintWriter(fichero);

            pw.println("<HTML>");
            pw.println("<center> <title>   REPORTE POKEMONSALVAJES </title> ");
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
                    
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getNombre()+ "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getTipo()+ "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getVida()+ "</td>");
                    pw.print("<td> <font color=\"#00FF00\">" + array_Pokemon[j].getPuntos_de_ataque()+ "</td>");
                    
                    pw.print("</tr>");
                    
//pw.print("<font color=\"#00FF00\">" + array_Pokemon[j].getId() + " " + array_Pokemon[j].getNombre() + " " + array_Pokemon[j].getTipo() + " " + array_Pokemon[j].getVida() + " " + array_Pokemon[j].getPuntos_de_ataque() + "<br>" + "</font>");
                }

            }

            pw.println("</table>");
            pw.println("</center> ");
            System.out.println("REPORTE POKEMON SALVAJE GENERADO ");
        } catch (Exception e) {
            System.out.println("No hay entrenadores ");

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

}
