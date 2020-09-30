package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota01;
	private JTextField txtNota02;

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
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 35, 103, 31);
		contentPane.add(lblNome);
		
		JLabel lblNota01 = new JLabel("Nota 01");
		lblNota01.setBounds(10, 79, 103, 31);
		contentPane.add(lblNota01);
		
		JLabel lblNota02 = new JLabel("Nota 02");
		lblNota02.setBounds(10, 121, 103, 31);
		contentPane.add(lblNota02);
		
		txtNome = new JTextField();
		txtNome.setBounds(170, 40, 189, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtNota01 = new JTextField();
		txtNota01.setColumns(10);
		txtNota01.setBounds(170, 84, 189, 20);
		contentPane.add(txtNota01);
		
		txtNota02 = new JTextField();
		txtNota02.setColumns(10);
		txtNota02.setBounds(170, 126, 189, 20);
		contentPane.add(txtNota02);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nome = txtNome.getText();
				double nota01 = Double.parseDouble(txtNota01.getText());
				double nota02 = Double.parseDouble(txtNota02.getText());
				double media = (nota01 + nota02) / 2;
				String situacao = media >=7?"Aprovado":"Reprovado";
				JOptionPane.showMessageDialog(null, media + " " +situacao);
				
			}
		});
		btnEnviar.setBounds(170, 175, 89, 23);
		contentPane.add(btnEnviar);
	}
}
