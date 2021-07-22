package Funcionario;

public class supervisor extends atvfuncionario {

    public double calculaImposto() {
        return this.getValorVenal() * 0.0005;
    }
}
