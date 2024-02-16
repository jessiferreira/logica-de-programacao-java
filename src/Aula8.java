import java.util.Scanner;

public class Aula8 {

/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1 = domingo, 2 = segunda,
e assim por diante). Escrever na tela o dia da semana correspondente.
_____________________________________________________________________


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;
        if (x == 1) {
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda";
        } else if (x == 3) {
            dia = "Terca";
        } else if (x == 4) {
            dia = "Quarta";
        } else if (x == 5) {
            dia = "Quinta";
        } else if (x == 6) {
            dia = "Sexta";
        } else if (x == 7) {
            dia = "Sábado";
        } else {
            dia = "valor inválido";
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();

    }
}
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "valor inválido";
                break;
        }
        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}