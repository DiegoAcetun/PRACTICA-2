package practica2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//import static practica2.Pokemon.arreglo;
public class PRACTICA2 {

    public static String arreglo[];
    static int id;
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
    static int i, j, k, h;

    public static void main(String[] args) {
        Pokemon pokemones = new Pokemon();
        array_Pokemon = new Pokemon[150];
        archivos_pokemon();
        System.out.println("");

        // System.out.println(array[0].getNombre()+array[2].getPuntos_de_ataque());
        Entrenadores entrenadores = new Entrenadores();
        array_Entrenadores = new Entrenadores[25];
        archivos_Entrenadores();
        System.out.println("");

        PokeBall pokeballs = new PokeBall();
        array_pokeballs = new PokeBall[4];
        archivos_Pokeball();
        System.out.println("");

        Gimnasio gimnasios = new Gimnasio();
        array_gimnasio = new Gimnasio[25];
        archivos_Gimansio();
        
        Alimento alimentos = new Alimento();
        array_alimentos = new Alimento[15];
        archivos_Alimento();
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

                id = Integer.parseInt(arreglo[0]);
                tipo = arreglo[1];
                nombre = arreglo[2];
                vida = Double.valueOf(arreglo[3]);
                puntos_de_ataque = Double.valueOf(arreglo[4]);
                capturado = capturado;
                estado = estado;
                h = h;
                for (i = i; i <= h; i++) {

                    array_Pokemon[i] = new Pokemon(id, tipo, nombre, vida, puntos_de_ataque, capturado, estado);
                    //System.out.println(array[i].imprimir());
                }
                h++;

                j = j;

                for (k = k; k <= j; k++) {

                    System.out.println(array_Pokemon[k].imprimir());
                }
                j++;
                //System.out.println("");
                contadorFilas++;

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
}
