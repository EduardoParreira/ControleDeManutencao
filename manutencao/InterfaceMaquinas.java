package manutencao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class InterfaceMaquinas extends JFrame {


    JLabel codMaquina = new JLabel("Código:");
    JLabel nomeMaquina = new JLabel("Nome: ");
    JButton btnCadastrar = new JButton("Cadastrar");
    JButton btnBuscar = new JButton("Buscar");
    JButton btnExcluir = new JButton("Excluir");
    JButton btnAlterar = new JButton("Alterar");
    JButton btnCancelar = new JButton("Cancelar");
    JTextField txtNome = new JTextField();
    JTextField txtCodigo = new JTextField();

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/bdmanutencao";

    public void InterfaceMaquinas() {

        
        Container janela = getContentPane();
        setLayout(null);

        btnCadastrar.setBounds(50, 180, 100, 20);
        btnCancelar.setBounds(500, 180, 100, 20);
        btnExcluir.setBounds(350,180,100,20);
        btnAlterar.setBounds(200,180,100,20);
        btnBuscar.setBounds(300, 10, 100, 20);
        InterfaceMaquinas.ButtonHandler handler = new InterfaceMaquinas.ButtonHandler();
        btnCancelar.addActionListener(handler);
        btnAlterar.addActionListener(handler);
        btnExcluir.addActionListener(handler);
        btnCadastrar.addActionListener(handler);
        btnBuscar.addActionListener(handler);
        codMaquina.setBounds(50, 10, 150, 20);
        nomeMaquina.setBounds(50, 40, 150, 20);

        
        txtNome.setBounds(220, 40, 300, 20);
        txtCodigo.setBounds(220, 10, 60, 20);
        
        janela.add(nomeMaquina);
        janela.add(codMaquina);

        janela.add(txtNome);
        janela.add(txtCodigo);
        janela.add(btnCadastrar);
        janela.add(btnCancelar);
        janela.add(btnBuscar);
        janela.add(btnExcluir);
        janela.add(btnAlterar);
        
        setSize(800, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }
    
    public void salvar(Maquinas maquina){
		String sql = "insert into maquina(nomeMaquinas)" + 
		" VALUES(?)";

		Connection conn = null;
		PreparedStatement psql = null;

		try {
			//Cria uma conexão com o banco
			conn = ConectaBanco.criaConexao();

			//Cria uma PreparedStatment
			psql = conn.prepareStatement(sql);

			//Adiciona o valor do primeiro parâmetro da sql
			psql.setString(1, maquina.getNomeMaquina());
			

			//Executa a sql para inserção dos dados
			psql.execute();
                        

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//Fecha as conexões
			try{
				if(psql != null)
					psql.close();

				if(conn != null)
					conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
     public void remover (Maquinas  maquina){
		String sql = "delete from maquina where codMaquinas = ?";

		Connection conn = null;
		PreparedStatement psql = null;

		try{
			conn = ConectaBanco.criaConexao();
			psql = conn.prepareStatement(sql);

			psql.setInt(1, maquina.getCodMaquina());
			psql.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (psql != null)
					psql.close();

				if (conn != null)
					conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
      public void consulta (int codCliente){
		String sql = "select * from maquina";
		
		List<Maquinas> maquinas = new ArrayList<Maquinas>();
		
		Connection conn = null;
		PreparedStatement psql = null;
		//Classe que vai recuperar os dados do banco de dados
		ResultSet set = null;
		
		//Bloco try/catch/finally que tenta criar conex�o, recuperar os dados e
		//fecha a conex�o ao final
		try{
			conn = ConectaBanco.criaConexao();
			psql = conn.prepareStatement(sql);
			set = psql.executeQuery();
			
			//enquanto existir dados no banco de dados, fa�a (ou seja, enquanto
			//houver elementos no ResultSet, fa�a
			while (set.next()){
                                
				Maquinas maquina = new Maquinas();
                                if(set.getInt(1)==codCliente){
				JOptionPane.showMessageDialog(rootPane, "Busca concluida");
                                maquina.setCodMaquina(set.getInt(1));
                                maquina.setNomeMaquina(set.getString(2));
                                txtNome.setText(maquina.getNomeMaquina());
				txtCodigo.setText(Integer.toString(maquina.getCodMaquina()));
				maquinas.add(maquina);
                                }
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				if (set != null)
					set.close();
				if (psql != null)
					psql.close();
				if (conn != null)
					conn.close();
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	
	}
    public void atualizar (Maquinas maquina){
		String sql = "UPDATE maquina SET nomeMaquinas= ?" + 
			"WHERE codMaquinas = ?";
		
		Connection conn = null;
		PreparedStatement psql = null;
		
		try {
			conn = ConectaBanco.criaConexao();
			psql = conn.prepareStatement(sql);
			
			psql.setString(1, maquina.getNomeMaquina());
                        psql.setInt(2, Integer.parseInt(txtCodigo.getText()));
			psql.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (psql != null)
					psql.close();
				
				if (conn != null)
					conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object obj = event.getSource();

            if (obj == btnCancelar) {
                setVisible(false);

            }
            
            if(obj==btnCadastrar){
                Maquinas maquina = new Maquinas();
                maquina.setNomeMaquina(txtNome.getText());
                salvar(maquina);    
                JOptionPane.showMessageDialog(rootPane, "Cadastro Realizado!");
                setVisible(false);
            }
            
            if (obj == btnExcluir) {
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o COD do cliente que deseja Remover: "));
                Maquinas maquina = new Maquinas();
                maquina.setCodMaquina(op);
                int opc = JOptionPane.showConfirmDialog(null, "Deseja remover o Cliente?",
                        "Atenção", 2,
                        JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.YES_OPTION) {
                    remover(maquina);
                    JOptionPane.showMessageDialog(rootPane, "Removido com Sucesso");
                    setVisible(false);

                }
            }
            
            if(obj==btnBuscar){
                consulta(Integer.parseInt(txtCodigo.getText()));
                
            }
            
             if(obj==btnAlterar){
                Maquinas maquina = new Maquinas();
                maquina.setNomeMaquina(txtNome.getText());
                atualizar(maquina);    
                JOptionPane.showMessageDialog(rootPane, "Cadastro alterado!");
                setVisible(false);
                
            }

        }
    }
}
