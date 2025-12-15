import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SequencedCollection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Map< String, Integer > map = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        añadirContactos();
        menu();

    }
    public static void menu(){
        System.out.println("---------------------------------- \n"
                + "MENÚ DE CONTACTOS \n"
                + "1. Añadir nuevo numero \n"
                + "2. Borrar numero \n"
                + "3. Buscar por numero \n"
                + "4. Borrar por nombre \n"
                + "5. Buscar por nombre \n"
                + "6. Salir");
        int menu = sc.nextInt();
        sc.nextLine();
        switch (menu) {
            case 1:
                nuevoNumero();
                menu();
                break;
            case 2:

                menu();
                break;
            case 3:

                menu();
                break;
            case 4:

                menu();
                break;
            case 5:

                menu();
                break;
            case 6:
                System.out.println("Saliendo del programa...");
                break;
        }
    }

    public static void nuevoNumero(){
        System.out.println("que numero quieres agregar?");
        Pattern pat = Pattern.compile("^[0-9]{9}$");
        String numero = sc.nextLine();
        Matcher mat = pat.matcher(numero);
        if (mat.matches()){
            System.out.println("numero valido");
            int numeroContacto = Integer.parseInt(numero);
        }else {
            System.out.println("numero invalido");
        }
    }

    public static void borrarNumero(){

    }

    public static void añadirContactos(){

        System.out.println("como se llama el contacto: ");
        String contacto = sc.nextLine();
        System.out.println("añade el numero del contacto: ");
        int numCont = sc.nextInt();
        sc.nextLine();
        map.put(contacto, numCont);
    };

}