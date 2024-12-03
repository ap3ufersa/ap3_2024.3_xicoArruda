import java.text.DecimalFormat;

public class Aula1_Exercicio3 {

    public static void main(String[] args) {
        double valor = 8711.77;
        double valorcomImposto = valor * (6.38 / 100);

        DecimalFormat formatador = new DecimalFormat();
        formatador.applyPattern("R$ #,##0.00");

        System.out.println();
        System.out.println();
        System.out.println("Valor com imposto: " + formatador.format(valorcomImposto));
    }
}