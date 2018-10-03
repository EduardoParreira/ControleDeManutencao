package manutencao;

public class Programador extends Funcionario{
    int qtdeProgramacaoRealizadas;

    public Programador(int codFuncionario, String nomeFuncionario, int numeroCTPS, int numeroCPF, int tipoFuncionario,int qtdeProgramacaoRealizadas) {
        super(codFuncionario, nomeFuncionario, numeroCTPS, numeroCPF, tipoFuncionario);
        setQtdeProgramacaoRealizadas(tipoFuncionario);
    }
    
    public int getQtdeProgramacaoRealizadas() {
        return qtdeProgramacaoRealizadas;
    }

    public void setQtdeProgramacaoRealizadas(int qtdeProgramacaoRealizadas) {
        this.qtdeProgramacaoRealizadas = qtdeProgramacaoRealizadas;
    }

    
    
    
}
