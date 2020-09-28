package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txrProva;
	private JTextField txtNota;
	private JLabel lblNome;
	private JLabel lblProva;
	private JLabel lblNota;
	private JLabel lblMateria;
	private JComboBox cbxMeteria;
	private JScrollPane scrollPane;

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
		
		txtNome = new JTextField();
		txtNome.setText("Nome do aluno");
		txtNome.setBounds(184, 11, 98, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txrProva = new JTextField();
		txrProva.setText("Prova");
		txrProva.setBounds(184, 73, 98, 20);
		contentPane.add(txrProva);
		txrProva.setColumns(10);
		
		txtNota = new JTextField();
		txtNota.setText("Nota");
		txtNota.setBounds(184, 104, 98, 20);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		lblNome = new JLabel("Nome do aluno");
		lblNome.setBounds(31, 14, 98, 14);
		contentPane.add(lblNome);
		
		lblProva = new JLabel("Prova");
		lblProva.setBounds(31, 76, 46, 14);
		contentPane.add(lblProva);
		
		lblNota = new JLabel("Nota");
		lblNota.setBounds(31, 107, 46, 14);
		contentPane.add(lblNota);
		
		lblMateria = new JLabel("Mat\u00E9ria");
		lblMateria.setBounds(31, 39, 46, 14);
		contentPane.add(lblMateria);
		
		cbxMeteria = new JComboBox();
		cbxMeteria.setBounds(184, 42, 98, 20);
		contentPane.add(cbxMeteria);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 128, 414, 122);
		contentPane.add(scrollPane);
	}
}
