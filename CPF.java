package Teste1;

import java.util.Scanner;
import java.util.Locale;

public class CPF{
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];

        //continue a solucao

        cpf = sc.nextLine().split("      ");


        for(int i= 0; i < cpf.length; i++) {
            System.out.println(cpf[i].replace(".","\n").replace("-","\n").toUpperCase());

        }

        sc.close();
    }
}