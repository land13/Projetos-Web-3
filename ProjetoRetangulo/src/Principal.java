import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author Gabriel Land
 * @since 00:02 - 22/11/2021
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Retangulo objetoRetangulo = new Retangulo();

        System.out.println("Digite o lado 1 do retangulo:");
        objetoRetangulo.setLado1(scanner.nextDouble());
        System.out.println("Digite o lado 2 do retangulo:");
        objetoRetangulo.setLado2(scanner.nextDouble());

        System.out.println(objetoRetangulo);
    }
}
