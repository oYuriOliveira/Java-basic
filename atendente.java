package Funcionario;

public class atendente extends atvfuncionario {
    public double calculaImposto() {
        return this.getValorVenal() * 0.0001;
    }
}
