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
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class InterfaceFuncionarios extends JFrame {

    JLabel codFuncionario = new JLabel("Código:");
    JLabel nomeFuncionario = new JLabel("Nome: ");
    JLabel numeroCTPS = new JLabel("CTPS: ");
    JLabel numeroCPF = new JLabel("CPF: ");
    JLabel tipoFuncionario = new JLabel("Tipo Funcionario: ");
    JLabel mec = new JLabel("Mecânico");
    JLabel prog = new JLabel("Programador de Manutenção");
    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnCancelar = new JButton("Cancelar");
    JRadioButton tipoFuncionarioMec = new JRadioButton();
    JRadioButton tipoFuncionarioPog = new JRadioButton();
    ButtonHandler handler = new ButtonHandler();

    public void InterfaceFuncionarios() {

        Container janela = getContentPane();
        setLayout(null);

        btnCadastrar.setBounds(50, 180, 100, 20);
        btnCancelar.setBounds(500, 180, 100, 20);
        btnCancelar.addActionListener(handler);
        btnCadastrar.addActionListener(handler);
        codFuncionario.setBounds(50,10,150,20);
        nomeFuncionario.setBounds(50, 40, 150, 20);
        numeroCPF.setBounds(50, 70, 150, 20);
        numeroCTPS.setBounds(50, 100, 150, 20);
        tipoFuncionario.setBounds(50,130,150,20);
        tipoFuncionarioMec.setBounds(220,130,20,20);
        tipoFuncionarioPog.setBounds(220,150,20,20);
        prog.setBounds(250,150,200,20);
        mec.setBounds(250,130,150,20);
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraCTPS = null;

        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraCpf.setPlaceholderCharacter('_');
            mascaraCTPS = new MaskFormatter("########");
            mascaraCTPS.setPlaceholderCharacter('_');
        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        JTextField txtNome = new JTextField();
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextCTPS = new JFormattedTextField(mascaraCTPS);
        txtNome.setBounds(220, 40, 300, 20);
        jFormattedTextCpf.setBounds(220, 70, 100, 20);
        jFormattedTextCTPS.setBounds(220, 100, 100, 20);

        janela.add(nomeFuncionario);
        janela.add(numeroCPF);
        janela.add(numeroCTPS);
        janela.add(mec);
        janela.add(prog);
        janela.add(tipoFuncionario);   
        janela.add(codFuncionario);

        janela.add(txtNome);
        janela.add(jFormattedTextCpf);
        janela.add(jFormattedTextCTPS);
        janela.add(btnCadastrar);
        janela.add(btnCancelar);
        janela.add(tipoFuncionarioMec);
        janela.add(tipoFuncionarioPog);
        
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
