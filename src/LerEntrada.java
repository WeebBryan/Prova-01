import java.util.Scanner;

class LerEntrada {
    public static int readInt() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada inv�lida. Tente novamente.");
            return readInt();
        }
    }
}