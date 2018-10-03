
package manutencao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class InterfaceManutencao extends JFrame{
    JLabel codManutencao = new JLabel("Código:");
    JLabel linhaMontagem = new JLabel("Linha de Montagem: ");
    JLabel maquinaLinha = new JLabel("Maquina da Linha: ");
    JLabel mecanico = new JLabel("Mecanico: ");
    JLabel data = new JLabel("Data: ");
    JLabel qtdeHoras = new JLabel("Quantidade de Horas: ");
    JComboBox linhaSeleciona = new JComboBox();
    JComboBox maquinasLinhaSeleciona = new JComboBox();
    JComboBox mecanicoLinhaSeleciona = new JComboBox();
    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnCancelar = new JButton("Cancelar");
    ButtonHandler handler = new ButtonHandler();
    
    public void InterfaceManutencao() {

        Container janela = getContentPane();
        setLayout(null);

        btnCadastrar.setBounds(50, 210, 100, 20);
        btnCancelar.setBounds(500, 210, 100, 20);
        btnCancelar.addActionListener(handler);
        btnCadastrar.addActionListener(handler);
        codManutencao.setBounds(50,10,150,20);
        linhaMontagem.setBounds(50, 40, 150, 20);
        maquinaLinha.setBounds(50, 70, 150, 20);
        mecanico.setBounds(50, 100, 150, 20);
        data.setBounds(50, 130, 150, 20);
        qtdeHoras.setBounds(50, 160, 150, 20);
        linhaSeleciona.setBounds(220,40,300,20);
        maquinasLinhaSeleciona.setBounds(220,70,300,20);
        mecanicoLinhaSeleciona.setBounds(220,100,300,20);
        MaskFormatter mascaraData = null;
        
        try {
        mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
           
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        JFormattedTextField jFormattedData = new JFormattedTextField(mascaraData);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(220, 160, 300, 20);
        jFormattedData.setBounds(220, 130, 70, 20);
        
        janela.add(linhaMontagem);
        janela.add(maquinaLinha);
        janela.add(mecanico);
        janela.add(data);
        janela.add(codManutencao);
        janela.add(qtdeHoras);

        janela.add(txtNome);
        janela.add(jFormattedData);
        janela.add(btnCadastrar);
        janela.add(btnCancelar);
        janela.add(linhaSeleciona);
        janela.add(maquinasLinhaSeleciona);
        janela.add(mecanicoLinhaSeleciona);
        
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
    }
    
    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object obj = event.getSource();

            if(obj == btnCancelar){
                setVisible(false);
                         
            }
            
             if(obj == btnCadastrar){
                JOptionPane.showMessageDialog(rootPane, "Opção ainda não disponivel");
            }
            
            }
    }
}
