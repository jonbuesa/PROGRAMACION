import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Deque<String> libros = new LinkedList<>();


        System.out.println("quieres haacer alguna consulta? (1.Si / 2.No)" );
        int menu = sc.nextInt();
        switch (menu){
            case 1:

                break;
            case 2:
                System.exit(0);
        }
    }
    public static void menu(){
        System.out.println("QUE ACCION DESEAS REALIZAR? \n" +
                "1. Añadir un libro \n" +
                "2. Consultar libro del TOP \n" +
                "3. Retirar libro del TOP \n" +
                "4. Mostrar todos los libros \n" +
                "5. Verificar si la pila esta vacia \n" +
                "6. Salir del programa");
    }
}