
package manutencao;

public class Mecanico extends Funcionario{
    LinhaMontagem linhaMecanico;
    
    public Mecanico(int codFuncionario, String nomeFuncionario, int numeroCTPS, int numeroCPF, int tipoFuncionario,LinhaMontagem linha) {
        super(codFuncionario, nomeFuncionario, numeroCTPS, numeroCPF, tipoFuncionario);
        setLinhaMecanico(linha);
    }

    public LinhaMontagem getLinhaMecanico() {
        return linhaMecanico;
    }

    public void setLinhaMecanico(LinhaMontagem linhaMecanico) {
        this.linhaMecanico = linhaMecanico;
    }
    
}
