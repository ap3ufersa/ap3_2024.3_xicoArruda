/**
 * Classe TiposPrimitivos
 * 
 * Este programa demonstra a declaração e inicialização de variáveis de todos os
 * tipos primitivos em Java,
 * além de uma variável do tipo String e Integer. Ele imprime os valores dessas
 * variáveis no console.
 *
 * Para mais informações sobre tipos de dados em Java, consulte:
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * 
 * @author Xico
 * @version 1.0
 * @since 2024-07-24
 */

public class u1_exercicio3_TiposPrimitivos {

    public static void mostrarTiposPrimitivos() {
        byte varByte = 100;
        short varShort = 10000;
        int varInt = 1234;
        Integer varInteger = 1235;
        long varLong = 90000000000L; // Sufixo 'L' para indicar literal de long
        float varFloat = 10.5f; // Sufixo 'f' para indicar literal de float
        double varDouble = 20.99;
        boolean varBoolean = true;
        char varChar = 'A';

        // Declaração e inicialização de uma variável do tipo String
        String varString = "Olá, Java!";

        // Impressão dos valores no console
        System.out.println("umByte: " + varByte);
        System.out.println("umShort: " + varShort);
        System.out.println("umInt: " + varInt);
        System.out.println("umInteger: " + varInteger);
        System.out.println("umLong: " + varLong);
        System.out.println("umFloat: " + varFloat);
        System.out.println("umDouble: " + varDouble);
        System.out.println("umBoolean: " + varBoolean);
        System.out.println("umChar: " + varChar);
        System.out.println("umaString: " + varString);
        System.out.println("umInt + umInteger = " + (varInt + varInteger));
    }

    // Primitivos: Comparações são feitas com operadores ==,<, >
    // Classes: Usa-se o método .equals(). Usar == compara referências de memória.
    public static void iguaisOuDiferentes() {
        // Comparação de tipos primitivos
        int a = 10;
        int b = 20;
        System.out.println("Comparando tipos primitivos:");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("a é igual a b? " + (a == b));

        // Comparação de objetos do tipo String
        System.out.println();
        System.out.println("Comparando objetos:");
        String str1 = "Olá";
        String str2 = "Olá";
        String str3 = new String("Olá");

        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3=" + str3);

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println("str1.equals(str3)? " + (str1.equals(str3)));

        System.out.println("Endereço str1: " + System.identityHashCode(str1));
        System.out.println("Endereço str2: " + System.identityHashCode(str2));
        System.out.println("Endereço str3: " + System.identityHashCode(str3));
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Método mostrarTiposPrimitivos()");
        System.out.println();
        mostrarTiposPrimitivos();

        System.out.println();
        System.out.println("Método iguaisOuDiferentes()");
        System.out.println();
        iguaisOuDiferentes();
    }

}
