package manutencao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class InterfaceProgramar extends JFrame {

    JLabel dataI = new JLabel("Infome a data inicial: ");
    JLabel dataF = new JLabel("Infome a data final: ");
    JButton btnCancelar = new JButton("Cancelar");
    JButton btnGerarProgramacao = new JButton ("Gerar Programação");
    JButton btnExportProgramacao = new JButton ("Exportar Programação");
    JTable tabela = new JTable();
    ButtonHandler handler = new ButtonHandler();

    public void InterfaceProgramar() {

        Container janela = getContentPane();
        setLayout(null);

        
        btnCancelar.setBounds(750, 410, 100, 20);
        btnCancelar.addActionListener(handler);
        btnGerarProgramacao.setBounds(350, 53, 150, 20);
        btnGerarProgramacao.addActionListener(handler);
        btnExportProgramacao.setBounds(50,410,100,20);
        btnExportProgramacao.addActionListener(handler);
        btnGerarProgramacao.addActionListener(handler);
        dataI.setBounds(50,40,150,20);
        dataF.setBounds(50,70,150,20);
        tabela.setBounds(50,130,800,250);
        MaskFormatter mascaraDataI = null;
        MaskFormatter mascaraDataF = null;
        try {
        mascaraDataI = new MaskFormatter("##/##/####");
        mascaraDataF = new MaskFormatter("##/##/####");
            mascaraDataI.setPlaceholderCharacter('_');
            mascaraDataF.setPlaceholderCharacter('_');
           
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }
        JFormattedTextField jFormattedDataI = new JFormattedTextField(mascaraDataI);
        jFormattedDataI.setBounds(220, 40, 70, 20);
        JFormattedTextField jFormattedDataF = new JFormattedTextField(mascaraDataI);
        jFormattedDataF.setBounds(220, 70, 70, 20);
        
        janela.add(dataI);
        janela.add(dataF);
        janela.add(jFormattedDataI);
        janela.add(jFormattedDataF);
        janela.add(btnCancelar);
        janela.add(tabela);
        janela.add(btnGerarProgramacao);
        janela.add(btnExportProgramacao);

        setSize(920, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object obj = event.getSource();

            if (obj == btnCancelar) {
                setVisible(false);

            }
            if(obj == btnGerarProgramacao){
                JOptionPane.showMessageDialog(rootPane, "Opção ainda não disponivel");
            }
            if(obj == btnExportProgramacao){
                JOptionPane.showMessageDialog(rootPane, "Opção ainda não disponivel");
            }
            

        }
    }
}
