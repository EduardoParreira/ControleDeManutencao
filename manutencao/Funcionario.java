package manutencao;

public abstract class Funcionario {

    int codFuncionario;
    String nomeFuncionario;
    int numeroCTPS;
    int numeroCPF;
    int tipoFuncionario;

    public Funcionario(int codFuncionario, String nomeFuncionario, int numeroCTPS, int numeroCPF, int tipoFuncionario) {
        this.codFuncionario = codFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.numeroCTPS = numeroCTPS;
        this.numeroCPF = numeroCPF;
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getNumeroCTPS() {
        return numeroCTPS;
    }

    public void setNumeroCTPS(int numeroCTPS) {
        this.numeroCTPS = numeroCTPS;
    }

    public int getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
}
