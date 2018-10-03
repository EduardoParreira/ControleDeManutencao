package manutencao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class Menu extends JFrame {

    private JMenuBar BarraMenu = null;
    private JMenu cadastros = null;
    private JMenu programarManutencao = null;
    private JMenu ajuda = null;
    private JMenuItem sobre = null;
    private JMenuItem programar = null;
    private JMenuItem funcionarios = null;
    private JMenuItem linhasMontagem = null;
    private JMenuItem maquinas = null;
    private JMenuItem manutencao = null;
    ButtonHandler handler = new ButtonHandler();

    public Menu() {
        super();
        initialize();
    }

    private void initialize() {
        Container janela = getContentPane();
        this.setTitle("Controle de Manutenções");
        this.setJMenuBar(getBarraMenu());
        int largura = 200, altura = 300;
        Icon imagem = new ImageIcon(getClass().getResource("utfpr.png"));
        JLabel aplicaImagem = new JLabel(imagem);
        aplicaImagem.setBounds(100,220,10,20);
        aplicaImagem.setSize(100, 200);
        janela.add(aplicaImagem);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 200);
        this.setVisible(true);

    }
    //gets do menu e dos itens

    private JMenuBar getBarraMenu() {
        if (BarraMenu == null) {
            BarraMenu = new JMenuBar();
            BarraMenu.add(getCadastros());
            BarraMenu.add(getProgramarManutencao());
            BarraMenu.add(getAjuda());
        }
        return BarraMenu;
    }

    private JMenu getCadastros() {
        if (cadastros == null) {
            cadastros = new JMenu();
            cadastros.setText("Cadastros");
            cadastros.add(getFuncionarios());
            cadastros.add(getLinhasMontagem());
            cadastros.add(getMaquinas());
            cadastros.add(getManutencao());
            
        }
        return cadastros;
    }

    private JMenu getProgramarManutencao() {
        if (programarManutencao == null) {
            programarManutencao = new JMenu();
            programarManutencao.setText("Manutenções");
            programarManutencao.add(getProgramar());
        }
        return programarManutencao;
    }

    private JMenu getAjuda() {
        if (ajuda == null) {
            ajuda = new JMenu();
            ajuda.setText("Ajuda");
            ajuda.add(getSobre());

        }
        return ajuda;
    }

    private JMenuItem getSobre() {
        if (sobre == null) {
            sobre = new JMenuItem();
            sobre.setText("Sobre");
            sobre.addActionListener(handler);
        }
        return sobre;
    }

    private JMenuItem getProgramar() {
        if (programar == null) {
            programar = new JMenuItem();
            programar.setText("Programar Manutenção");
            programar.addActionListener(handler);
        }
        return programar;
    }

    private JMenuItem getFuncionarios() {
        if (funcionarios == null) {
            funcionarios = new JMenuItem();
            funcionarios.setText("Funcionários");
            funcionarios.addActionListener(handler);
        }
        return funcionarios;
    }

    private JMenuItem getLinhasMontagem() {
        if (linhasMontagem == null) {
            linhasMontagem = new JMenuItem();
            linhasMontagem.setText("Linhas de Montagem");
            linhasMontagem.addActionListener(handler);
        }
        return linhasMontagem;
    }

    private JMenuItem getMaquinas() {
        if (maquinas == null) {
            maquinas = new JMenuItem();
            maquinas.setText("Máquinas");
            maquinas.addActionListener(handler);
        }
        return maquinas;
    }

    private JMenuItem getManutencao() {
        if (manutencao == null) {
            manutencao = new JMenuItem();
            manutencao.setText("Manutencão");
            manutencao.addActionListener(handler);
        }
        return manutencao;
    }
    //acao dos botoes

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object obj = event.getSource();

            if (obj == sobre) {
                Sobre field = new Sobre();
                field.interfaceSobre();
                field.setTitle("Sobre");
            }
            
            if (obj == funcionarios) {
                InterfaceFuncionarios field = new InterfaceFuncionarios();
                field.InterfaceFuncionarios();
                field.setTitle("Cadastrar Funcionários");
            }
            
            if (obj == linhasMontagem) {
                InterfaceLinhaMontagem field = new InterfaceLinhaMontagem();
                field.InterfaceLinhaMontagem();
                field.setTitle("Cadastrar Linhas de Montagem");
            }
            
            if (obj == maquinas) {
                InterfaceMaquinas field = new InterfaceMaquinas();
                field.InterfaceMaquinas();
                field.setTitle("Cadastrar Maquinas");
            }
            if (obj == manutencao) {
                InterfaceManutencao field = new InterfaceManutencao();
                field.InterfaceManutencao();
                field.setTitle("Cadastrar Manutencao");
            }
            if (obj == programar) {
                InterfaceProgramar field = new InterfaceProgramar();
                field.InterfaceProgramar();
                field.setTitle("Programar Manutenção");
            }

        }
    }

    public static void main(String[] args) {
        Menu field = new Menu();
        field.setVisible(true);
    }
}
