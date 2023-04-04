import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //6- Faça um programa que peça o raio de um círculo, calcule e mostre sua área. (A = π r²)

    //Entrada: raio de um círculo
    Scanner teclado;
    Double raio, area, pi;
    String pergunta;

    pergunta = ("Por favor, informe o valor do raio: ");
    System.out.print(pergunta);

    teclado = new Scanner(System.in);
    raio = teclado.nextDouble();

    teclado.close();

    //Processamento: calcular o raio do círculo
    pi = 3.14;
    area = pi * (raio *raio);

    //Saída: resultado da área
    System.out.println(area);
    }
}
