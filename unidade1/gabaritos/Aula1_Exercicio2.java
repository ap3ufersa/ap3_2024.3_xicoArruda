import java.util.Random;

public class Aula1_Exercicio2 {

    public static void main(String[] args) {

        Random geradorAleatorio = new Random();
        
        for (int i = 0; i < 999; i++) {
            System.out.println(geradorAleatorio.nextInt());
        }
    }
}