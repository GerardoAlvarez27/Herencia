package herencia;

/**
 *
 * @author galva
 */
import java.util.Scanner;

public class ClasHerencia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserte un numero:");
        int a = in.nextInt();
        System.out.println("Inserte otro numero");
        int b = in.nextInt();

        SubClasHerencia subClase = new SubClasHerencia(a, b);
        System.out.println("EL RESULTADO DE LA OPERACION ES: ");
        System.out.println(subClase.getnum1() + " + " + subClase.getnum2() + " = " + subClase.suma());

    }
}
