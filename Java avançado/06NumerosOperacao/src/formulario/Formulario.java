package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero01;
	private JTextField txtNumero02;

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
		lblNewLabel.setBounds(10, 11, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 02");
		lblNumero.setBounds(10, 36, 75, 14);
		contentPane.add(lblNumero);
		
		txtNumero01 = new JTextField();
		txtNumero01.setBounds(180, 8, 86, 20);
		contentPane.add(txtNumero01);
		txtNumero01.setColumns(10);
		
		txtNumero02 = new JTextField();
		txtNumero02.setColumns(10);
		txtNumero02.setBounds(180, 33, 86, 20);
		contentPane.add(txtNumero02);
		
		JRadioButton rdbtnSomar = new JRadioButton("Somar");
		rdbtnSomar.setBounds(180, 73, 109, 23);
		contentPane.add(rdbtnSomar);
		rdbtnSomar.setActionCommand("Somar");
		
		JRadioButton rdbtnSubtrair = new JRadioButton("Subtrair");
		rdbtnSubtrair.setBounds(180, 99, 109, 23);
		contentPane.add(rdbtnSubtrair);
		rdbtnSubtrair.setActionCommand("Subtrair");
		
		JRadioButton rdbtnDividir = new JRadioButton("Dividir");
		rdbtnDividir.setBounds(180, 125, 109, 23);
		contentPane.add(rdbtnDividir);
		rdbtnDividir.setActionCommand("Dividir");
		
		JRadioButton rdbtnMultiplicar = new JRadioButton("Multiplicar");
		rdbtnMultiplicar.setBounds(180, 151, 109, 23);
		contentPane.add(rdbtnMultiplicar);
		rdbtnMultiplicar.setActionCommand("Multiplicar");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnSomar);
		grupo.add(rdbtnSubtrair);
		grupo.add(rdbtnMultiplicar);
		grupo.add(rdbtnDividir);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double numero01 = Double.parseDouble(txtNumero01.getText());
				double numero02 = Double.parseDouble(txtNumero02.getText());
				
				String operacao = grupo.getSelection().getActionCommand();
				
				if (operacao == "Somar") {
					JOptionPane.showMessageDialog(null, numero01 + numero02);
				}else if (operacao == "Subtrair") {
					JOptionPane.showMessageDialog(null, numero01 - numero02);
				}else if (operacao == "Multiplicar") {
					JOptionPane.showMessageDialog(null, numero01 * numero02);
				}else{
					JOptionPane.showMessageDialog(null, numero01 / numero02);
				}
				
				
				
			}
		});
		btnEnviar.setBounds(157, 195, 89, 23);
		contentPane.add(btnEnviar);
	}
}
