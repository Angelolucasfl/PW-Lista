package lista;

import java.util.Scanner;

public class EstruturaDecisao {

    public void questaoSeis(){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Digite o preço dos tres produtos...");

        double p1 = s1.nextDouble();
        double p2 = s2.nextDouble();
        double p3 = s3.nextDouble();

        if (p1 < p2 & p1 < p3){
            System.out.println("Compre o produto no valor de " + p1 + " reais");
        } else if (p2 < p3) {
            System.out.println("Compre o produto no valor de " + p2 + " reais");
        }
        else {
            System.out.println("Compre o produto no valor de " + p3 + " reais");
        }

    }
}
