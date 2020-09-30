package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtLado01;
	private JTextField txtLado02;
	private JTextField txtLado03;
	private JTextField txtLado04;

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
		
		JLabel lblNewLabel = new JLabel("Lado 01");
		lblNewLabel.setBounds(26, 27, 94, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblLado = new JLabel("Lado 02");
		lblLado.setBounds(26, 64, 94, 29);
		contentPane.add(lblLado);
		
		JLabel lblLado_1 = new JLabel("Lado 03");
		lblLado_1.setBounds(26, 102, 94, 29);
		contentPane.add(lblLado_1);
		
		JLabel lblLado_2 = new JLabel("Lado 04");
		lblLado_2.setBounds(26, 142, 94, 29);
		contentPane.add(lblLado_2);
		
		txtLado01 = new JTextField();
		txtLado01.setBounds(166, 31, 86, 20);
		contentPane.add(txtLado01);
		txtLado01.setColumns(10);
		
		txtLado02 = new JTextField();
		txtLado02.setColumns(10);
		txtLado02.setBounds(166, 68, 86, 20);
		contentPane.add(txtLado02);
		
		txtLado03 = new JTextField();
		txtLado03.setColumns(10);
		txtLado03.setBounds(166, 106, 86, 20);
		contentPane.add(txtLado03);
		
		txtLado04 = new JTextField();
		txtLado04.setColumns(10);
		txtLado04.setBounds(166, 146, 86, 20);
		contentPane.add(txtLado04);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double lado01 = Double.parseDouble(txtLado01.getText());
				double lado02 = Double.parseDouble(txtLado02.getText());
				double lado03 = Double.parseDouble(txtLado03.getText());
				double lado04 = Double.parseDouble(txtLado04.getText());
				String situacao = (lado01 == lado02 && lado02 == lado03 && lado03 == lado04) ? "É um quadrado" : "Não é um quadrado";
				
				System.out.println(situacao);
				
				
				
			}
		});
		btnEnviar.setBounds(163, 227, 89, 23);
		contentPane.add(btnEnviar);
	}

}
