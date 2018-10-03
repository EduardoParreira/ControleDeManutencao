package manutencao;

import java.util.ArrayList;

public class LinhaMontagem {
    int codLinha;
    String nomeLinha;
    ArrayList<Maquinas> maquinasLinha;
    Mecanico codMecanico;

    public LinhaMontagem(int codLinha, String nomeLinha, Maquinas maquinasLinhas, Mecanico codMecanico) {
        setCodLinha(codLinha);
        setNomeLinha(nomeLinha);
        setMaquinasLinha(maquinasLinhas);
        setCodMecanico(codMecanico);
    }

    public int getCodLinha() {
        return codLinha;
    }

    public void setCodLinha(int codLinha) {
        this.codLinha = codLinha;
    }

    public String getNomeLinha() {
        return nomeLinha;
    }

    public void setNomeLinha(String nomeLinha) {
        this.nomeLinha = nomeLinha;
    }

    public ArrayList<Maquinas> getMaquinasLinhas() {
        return maquinasLinha;
    }

    public void setMaquinasLinha(Maquinas maquinasLinhas) {
        maquinasLinha.add(maquinasLinhas);
    }

    public Mecanico getCodMecanico() {
        return codMecanico;
    }

    public void setCodMecanico(Mecanico codMecanico) {
        this.codMecanico = codMecanico;
    }
    
}
