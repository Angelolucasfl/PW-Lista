package lista;

import java.util.Scanner;

public class EstruturaSequencial {

    public void questaoUm(){
        System.out.println("Alô Mundo!");
    }

    public void questaoDois(){
        Scanner s1 = new Scanner(System.in);
         System.out.println("Digite um numero...");
        int num = s1.nextInt();
        System.out.println("Seu numero eh o " + num);
        s1.close();
    }

    public void questaoTres(){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        System.out.println("Digite suas notas...");
        double not1  = s1.nextDouble();
        double not2 = s2.nextDouble();
        double not3 = s3.nextDouble();

        double media = (not1 + not2 + not3)/3;
        System.out.println("Sua media eh: " + media);

        s1.close();
        s2.close();
        s3.close();
    }

    public void questaoQuatro(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite sua altura em metros...");

        double metros = s1.nextDouble();
        System.out.println("Sua altura em centimetros eh: " + (metros * 100) + " cm");

        s1.close();
    }

    public void  questaoCinco(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Digite o raio do circulo...");

        double raio = s1.nextDouble();
        System.out.println("A area do circulo eh: " + (3.14*(raio*raio)));

        s1.close();
    }
}
