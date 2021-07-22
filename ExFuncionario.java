package Funcionario;

import java.util.Scanner;

public class ExFuncionario {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String n;
        System.out.print("Gerente, Supervisor ou Atendente: ");
        n = ler.nextLine();

        if (n.equals("Gerente")){

            gerente generico = new gerente();
            generico.setValorVenal(1000.0);

            System.out.println("Gerente: Otávio Souza");
            System.out.println(generico.calculaImposto());
        }
        else if (n.equals ("Supervisor")){
            supervisor generico = new supervisor();
            generico.setValorVenal(1000.0);

            System.out.println("Supervisor: Trolls Souza");
            System.out.println(generico.calculaImposto());
        }
        else if (n.equals ("Atendente")){
            atendente generico = new atendente();
            generico.setValorVenal(1000.0);

            System.out.println("Atendente: Gabriel Silva");
            System.out.println(generico.calculaImposto());
        }
        else {
            System.out.println("Não encontrado");


        }

}}
