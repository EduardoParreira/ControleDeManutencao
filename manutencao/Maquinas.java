package manutencao;

public class Maquinas {
    int codMaquina;
    String nomeMaquina;
    

    public Maquinas(int codMaquina, String nomeMaquina, LinhaMontagem linha) {
        setCodMaquina(codMaquina);
        setNomeMaquina(nomeMaquina);
    
    }

    public Maquinas(){

    }

    public int getCodMaquina() {
        return codMaquina;
    }

    public void setCodMaquina(int codMaquina) {
        this.codMaquina = codMaquina;
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    
    
}
