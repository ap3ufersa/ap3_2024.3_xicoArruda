import java.text.DecimalFormat;

public class Aula1_Exercicio3 {

    public static void main(String[] args) {
        double valor = 1987.05;
        double valorDoImposto = valor * (6.38 / 100);

        DecimalFormat formatador = new DecimalFormat();
        formatador.applyPattern("R$ #,##0.00");

        System.out.println();
        System.out.println();
        System.out.println("Valor nao formatado=" + valorDoImposto);
        System.out.println("Valor formatado=" + formatador.format(valorDoImposto));
    }
}