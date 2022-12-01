import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        obtenerListaEquipos();


    }
    /**
     * Método que lee el fichero con los nombres de los equipos y los guarda en una lista de String. Esta es lista
     * es retornada por el método.
     * @return
     */
    public static void obtenerListaEquipos(){
        BufferedReader br;
        Scanner sc;
        PreparedStatement ps;
        String linea="";
        Boolean dejarLeer=false;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\david\\IdeaProjects\\fifa2\\agenda.txt"));
            sc = new Scanner(br);
/*
            while(sc.hasNext() && !dejarLeer ){


                linea= sc.nextLine();

                if(linea.equals("##")){
                    dejarLeer=true;
                }else {
                    System.out.println(linea);
                }


            }
*/

     /*       while(sc.hasNextInt()){

                linea= sc.nextLine();
                if(dejarLeer){
                    System.out.println(linea);
                }
                if(linea.equals("##")){

                    dejarLeer=true;

                }

            }
*/
        while (sc.hasNext()){
            linea = sc.nextLine();
            if(sc.hasNextInt()){
                System.out.println(linea );
            }

        }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }




}