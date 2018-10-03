
package manutencao;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Sobre extends JFrame {
    private JLabel texto = new JLabel("Desenvolvido por: Eduardo Parreira");
    
     public static void main(String[] args) {
        Sobre field = new Sobre();
        field.interfaceSobre();
    }

    public void interfaceSobre() {

        Container janela = getContentPane();
        setLayout(null);
        
        texto.setBounds(50, 5, 200, 60);
        janela.add(texto);
        
        setSize(600, 100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        

    }
}
