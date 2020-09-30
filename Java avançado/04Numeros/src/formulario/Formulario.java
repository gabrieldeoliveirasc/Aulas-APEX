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
	private JTextField txtNumero01;
	private JTextField txtNumero02;
	private JTextField txtNumero03;

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
		
		JLabel lblNewLabel = new JLabel("Numero 01");
		lblNewLabel.setBounds(10, 30, 85, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 02");
		lblNumero.setBounds(10, 71, 85, 27);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 03");
		lblNumero_1.setBounds(10, 109, 85, 27);
		contentPane.add(lblNumero_1);
		
		txtNumero01 = new JTextField();
		txtNumero01.setBounds(159, 33, 86, 20);
		contentPane.add(txtNumero01);
		txtNumero01.setColumns(10);
		
		txtNumero02 = new JTextField();
		txtNumero02.setColumns(10);
		txtNumero02.setBounds(159, 74, 86, 20);
		contentPane.add(txtNumero02);
		
		txtNumero03 = new JTextField();
		txtNumero03.setColumns(10);
		txtNumero03.setBounds(159, 112, 86, 20);
		contentPane.add(txtNumero03);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double numero01 = Double.parseDouble(txtNumero01.getText());
				double numero02 = Double.parseDouble(txtNumero02.getText());
				double numero03 = Double.parseDouble(txtNumero03.getText());
				
				
				
				if (numero01 < numero02 && numero01 < numero03) {
					JOptionPane.showMessageDialog(null, numero01);
				}else if (numero02 < numero01 && numero02 < numero03) {
					JOptionPane.showMessageDialog(null, numero02);
				}else {
					JOptionPane.showMessageDialog(null, numero03);
				}
				
				
				
				
				
				
				
			}
		});
		btnEnviar.setBounds(159, 190, 89, 23);
		contentPane.add(btnEnviar);
	}

}
