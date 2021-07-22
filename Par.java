package Teste1;

import java.io.IOException;
import java.util.Scanner;
public class Par {

public static void main(String[] args) throws IOException {

        double x;
        double resto;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero");
        x = ler.nextInt();

        for (int i = 1 ; i <=x  ; i++) {


        resto = i % 2;

        if (resto == 0) {System.out.println(i);}

        }
        }
        }