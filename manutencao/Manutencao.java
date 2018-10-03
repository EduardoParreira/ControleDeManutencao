
package manutencao;

import java.util.Date;

public class Manutencao {
    int codManutencao;
    Maquinas maquina;
    LinhaMontagem linha;
    Mecanico mecanico;
    Date dataExecuxao;
    double qtdeHoras;

 
    public Manutencao(int codManutencao, Maquinas maquina, LinhaMontagem linha, Mecanico mecanico,Date dataExecucao,double qtdeHoras) {
        setCodManutencao(codManutencao);
        setMaquina(maquina);
        setLinha(linha);
        setMecanico(mecanico);
        setDataExecuxao(dataExecucao);
        setQtdeHoras(qtdeHoras);
    }
    
    public int getCodManutencao() {
        return codManutencao;
    }

    public void setCodManutencao(int codManutencao) {
        this.codManutencao = codManutencao;
    }
    
    public Maquinas getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquinas maquina) {
        this.maquina = maquina;
    }

    public LinhaMontagem getLinha() {
        return linha;
    }

    public void setLinha(LinhaMontagem linha) {
        this.linha = linha;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Date getDataExecuxao() {
        return dataExecuxao;
    }

    public void setDataExecuxao(Date dataExecuxao) {
        this.dataExecuxao = dataExecuxao;
    }

    public double getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(double qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }
   
    
    
}
