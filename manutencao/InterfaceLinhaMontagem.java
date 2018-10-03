
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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class InterfaceLinhaMontagem extends JFrame{
    JLabel codLinha = new JLabel("Código:");
    JLabel nomeLinha = new JLabel("Nome da Linha: ");
    JLabel maquinasLinha = new JLabel("Maquinas da Linha: ");
    JLabel mecanicoLinha = new JLabel("Mecânico da Linha: ");
    JComboBox maquinasLinhaSeleciona = new JComboBox();
    JComboBox mecanicoLinhaSeleciona = new JComboBox();
    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnCancelar = new JButton("Cancelar");
    ButtonHandler handler = new ButtonHandler();

    public void InterfaceLinhaMontagem() {

        Container janela = getContentPane();
        setLayout(null);
        
        mecanicoLinhaSeleciona.setBounds(220, 70, 300, 20);
        maquinasLinhaSeleciona.setBounds(220, 100, 300, 20);
        maquinasLinhaSeleciona.setName("Selecione as maquinas da linha");
        btnCadastrar.setBounds(50, 180, 100, 20);
        btnCancelar.setBounds(500, 180, 100, 20);
        btnCancelar.addActionListener(handler);
        btnCadastrar.addActionListener(handler);
        codLinha.setBounds(50,10,150,20);
        nomeLinha.setBounds(50, 40, 150, 20);
        mecanicoLinha.setBounds(50, 70, 150, 20);
        maquinasLinha.setBounds(50, 100, 150, 20);
        MaskFormatter mascaraMaquinasLinha = null;
        MaskFormatter mascaraMecanicoLinha = null;
        try {
        mascaraMaquinasLinha = new MaskFormatter("Selecione as maquinas da linha");
            mascaraMaquinasLinha.setPlaceholderCharacter('_');
            
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        JTextField txtNome = new JTextField();
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraMaquinasLinha);
        JFormattedTextField jFormattedTextCTPS = new JFormattedTextField(mascaraMecanicoLinha);
        txtNome.setBounds(220, 40, 300, 20);
        

        janela.add(nomeLinha);
        janela.add(mecanicoLinha);
        janela.add(maquinasLinha);
        janela.add(maquinasLinhaSeleciona);
        janela.add(mecanicoLinhaSeleciona);
        janela.add(codLinha);
                
        janela.add(txtNome);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextCTPS);
        janela.add(btnCadastrar);
        janela.add(btnCancelar);
        
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

    

