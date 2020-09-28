package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bd.Conecxao;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtnome = new JTextField();
		txtnome.setBounds(113, 30, 199, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtidade = new JTextField();
		txtidade.setBounds(113, 73, 199, 20);
		contentPane.add(txtidade);
		txtidade.setColumns(10);
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setBounds(32, 33, 46, 14);
		contentPane.add(lblnome);
		
		JLabel lblidade = new JLabel("Idade");
		lblidade.setBounds(32, 76, 46, 14);
		contentPane.add(lblidade);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Obter o nome e a idade
				String nome = txtnome.getText();
				int idade = Integer.parseInt(txtidade.getText());
				
				try {
					String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";
					
					Conecxao.abrirConexao();
					
					PreparedStatement pstmt = Conecxao.con.prepareStatement(sql);
					pstmt.setString(1, nome);
					pstmt.setInt(2, idade);
					
					pstmt.execute();
					JOptionPane.showMessageDialog(null, "Cadastro OK");
				}catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Falha ao cadastrar");
				}finally {
					Conecxao.fecharConexao();
				}
			}
		});
		btncadastrar.setBounds(156, 188, 89, 23);
		contentPane.add(btncadastrar);
	}
}
