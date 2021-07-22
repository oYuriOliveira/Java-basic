package Funcionario;

public class atvfuncionario {

    private String Supervisor;
    private String Gerente;
    private String Atendente;


    private double valorVenal;

    public String getgerente (){return Gerente;}

    public void setgerente(String Gerente){this.Gerente = Gerente;}

    public String getsupervisor (){return Supervisor;}

    public void setsupervisor(String Supervisor){this.Supervisor = Supervisor;}

    public String getatendente (){return Atendente;}

    public void setatendente(String Atendente){this.Atendente = Atendente;}

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }

    public double calculaImposto() {
        return this.valorVenal * 0.01;
    }
}
