import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Se llena la lista con los equipos obtenidos por el método obtenerListaEquipos()
        List<String> listaCompleta = obtenerListaEquipos();



        menu();


    }


    /**
     * Método que lee el fichero con los nombres de los equipos y los guarda en una lista de String. Esta es lista
     * es retornada por el método.
     * @return
     */
    public static List<String> obtenerListaEquipos(){
        BufferedReader br;
        Scanner sc;
        List<String> listaCompleta = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\dperea\\IdeaProjects\\fifa2\\equipos.txt"));
            sc = new Scanner(br);

            while(sc.hasNext()){
                listaCompleta.add(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return listaCompleta;
    }



    public static int menu(){
        int opcion=0;


        opcionesMenu();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una opcion");
        opcion = sc.nextInt();

        return  opcion;
    }

    public static void opcionesMenu(){

        System.out.println("1. Iniciar octavos");
        System.out.println("2. Iniciar cuartos");
        System.out.println("3. Iniciar semifinales");
        System.out.println("4. Iniciar la final");
        System.out.println("5. Reiniciar");
        System.out.println("6. Salir");
    }
}