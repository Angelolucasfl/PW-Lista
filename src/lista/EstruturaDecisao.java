package lista;

import java.util.Scanner;

public class EstruturaDecisao {

    public static void questaoSeis() {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite o preço dos tres produtos...");

        double p1 = s1.nextDouble();
        double p2 = s2.nextDouble();
        double p3 = s3.nextDouble();

        if (p1 < p2 & p1 < p3) {
            System.out.println("Compre o produto no valor de " + p1 + " reais");
        } else if (p2 < p3) {
            System.out.println("Compre o produto no valor de " + p2 + " reais");
        } else {
            System.out.println("Compre o produto no valor de " + p3 + " reais");
        }

    }

    public static void questaoSete() {
        double notasSum = 0;

        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite quantas notas você tem...");
        int numNotas = s1.nextInt();
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notasSum += s1.nextDouble();
        }
        s1.close();
        double media = notasSum / numNotas;
        if (media >= 7) {
            System.out.println("Sua media eh: " + media);System.out.println("Aprovado!");
        } else if (media < 7 & media > 4) {
            System.out.println("Sua media eh: " + media);
            System.out.println("Você esta de AF");
        } else {
            System.out.println("Sua media eh: " + media);
            System.out.println("Reprovado!");
        }
    }

    public static void questaoOito() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite a primeira nota...");
        double notaUm = s1.nextDouble();
        System.out.println("Digite a outra nota...");
        double notaDois = s1.nextDouble();
        double media = (notaUm + notaDois) / 2;

        if (media >= 7) {
            System.out.println("Sua media eh: " + media);
            System.out.println("Aprovado!");
        } else if (media < 7 & media > 4) {
            System.out.println("Sua media eh: " + media);
            System.out.println("Você esta de AF");
            System.out.println("Digite a nota da sua AF...");
            double notaAf = s1.nextDouble();
            if (notaAf >= 4 & (notaAf + media) / 2 >= 5) {
                System.out.println("Sua media é: " + media);
                System.out.println("Você passou na AF!");
            }

        } else {
            System.out.println("Sua media eh: " + media);
            System.out.println("Reprovado!");
        }
        s1.close();
    }

    public static void questaoNove(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite 3 numeros...");
        double numUm = s1.nextDouble();
        double numDois = s1.nextDouble();
        double numTres = s1.nextDouble();

        if (numUm > numDois & numUm > numTres){
            System.out.println("O numero maior é o " + numUm);
        } else if (numDois > numUm & numDois > numTres) {
            System.out.println("O numero maior é o " + numDois);
        }  else if (numTres > numUm & numTres > numDois) {
            System.out.println("O numero maior é o " + numTres);
        } else {
            System.out.println("Digite numeros distintos");
        }
        s1.close();
    }

    public static void questaoDez(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite um numero...");
        int numUm = s1.nextInt();

        if (numUm % 2 == 0){
            System.out.println("O numero " + numUm + " é par");
        } else {
            System.out.println("O numero " + numUm + " é impar");
        }
    }
}
