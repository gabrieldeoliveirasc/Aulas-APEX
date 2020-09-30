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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txt05;
	private JTextField txt10;
	private JTextField txt25;
	private JTextField txt50;
	private JTextField txt100;

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
		
		JLabel lblNewLabel = new JLabel("R$ 0,05");
		lblNewLabel.setBounds(10, 11, 59, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblR = new JLabel("R$ 0,10");
		lblR.setBounds(10, 36, 59, 14);
		contentPane.add(lblR);
		
		JLabel lblR_1 = new JLabel("R$ 0,25");
		lblR_1.setBounds(10, 62, 59, 14);
		contentPane.add(lblR_1);
		
		JLabel lblR_2 = new JLabel("R$ 0,50");
		lblR_2.setBounds(10, 90, 59, 14);
		contentPane.add(lblR_2);
		
		JLabel lblR_3 = new JLabel("R$ 1,00");
		lblR_3.setBounds(10, 116, 59, 14);
		contentPane.add(lblR_3);
		
		txt05 = new JTextField();
		txt05.setBounds(79, 8, 86, 20);
		contentPane.add(txt05);
		txt05.setColumns(10);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		txt10.setBounds(79, 33, 86, 20);
		contentPane.add(txt10);
		
		txt25 = new JTextField();
		txt25.setColumns(10);
		txt25.setBounds(79, 59, 86, 20);
		contentPane.add(txt25);
		
		txt50 = new JTextField();
		txt50.setColumns(10);
		txt50.setBounds(79, 87, 86, 20);
		contentPane.add(txt50);
		
		txt100 = new JTextField();
		txt100.setColumns(10);
		txt100.setBounds(79, 113, 86, 20);
		contentPane.add(txt100);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double moeda05 = Double.parseDouble(txt05.getText());
				double moeda10 = Double.parseDouble(txt10.getText());
				double moeda25 = Double.parseDouble(txt25.getText());
				double moeda50 = Double.parseDouble(txt50.getText());
				double moeda100 = Double.parseDouble(txt100.getText());
				double soma = (moeda05*0.05) + (moeda10*0.1) + (moeda25*0.25) + (moeda50*0.5) + (moeda100*1);
				
				NumberFormat formato = new DecimalFormat("#.00"); 
				String somaFormatada = formato.format(soma);
				
				JOptionPane.showMessageDialog(null, "Você tem R$ "+somaFormatada);
				
						
			}
		});
		btnEnviar.setBounds(177, 174, 89, 23);
		contentPane.add(btnEnviar);
	}

}
