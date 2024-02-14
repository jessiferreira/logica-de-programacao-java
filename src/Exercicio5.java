import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

/*
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
os valores devem ter uma casa decimal.

ENTRADA:    SAÍDA:
45.5        NOTA FINAL = 76.8
31.3

ENTRADA:    SAÍDA:
34.0        NOTA FINAL = 57.5
23.5        REPROVADO!
*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL = %.1f\n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("REPROVRADO!");
        }

        sc.close();

    }
}
