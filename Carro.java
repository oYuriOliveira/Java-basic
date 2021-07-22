package atvcarro;

import java.io.IOException;
import java.util.Scanner;


public class Carro {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int Quantidade;

        System.out.print("Quantidade de pessoas no carro: ");
        Quantidade = ler.nextInt();

        String Cor = "Branco";
        char saiu;


        int x,y;
        System.out.print("Desceu alguma pessoa do carro (S/N): ");
        saiu = (char)System.in.read();

        if (saiu == 'S') {

            System.out.print("Quantas pessoas: ");
            x = ler.nextInt();
        y = Quantidade - x;

        System.out.print("Quantidade final: ");
        System.out.print(y);}
        else {
            System.out.print("Quantidade final: ");
            System.out.print(Quantidade);}

        //String Sair = "Saindo uma pessoa no carro";

        //String Entrar = "Entrando uma pessoa no carro";


    }
}