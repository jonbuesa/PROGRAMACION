import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> meses = new ArrayList<>(List.of("enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"));
    public static void main(String[] args) {
        fecha();
    }
    public static void fecha(){
            introducirMes();
        }


        public static void introducirMes(){
            System.out.println("introduce el mes");
            String mes = sc.nextLine();
            if(meses.contains(mes)){
                System.out.println("mes valido");
            }else {
                System.out.println("mes invalido");
        }
    }
}



