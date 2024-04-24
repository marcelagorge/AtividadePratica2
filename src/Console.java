import java.util.Scanner;

public class Console {

    
    private static Scanner leitor = new Scanner(System.in);


    public static String lerString() {
        String valor = leitor.nextLine();
        return valor;
    }

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine(); 
        return valor;
    }

    public static float lerFloat() {
        float valor = leitor.nextFloat();
        leitor.nextLine(); 
        return valor;
    }
}