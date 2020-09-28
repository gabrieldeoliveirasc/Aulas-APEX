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
	private JTextField txt2;
	private JTextField txt5;
	private JTextField txt10;
	private JTextField txt20;
	private JTextField txt50;
	private JTextField txt100;
	private JTextField txt200;

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
		
		JLabel lbl2 = new JLabel("R$ 2,00");
		lbl2.setBounds(27, 22, 73, 20);
		contentPane.add(lbl2);
		
		JLabel lbl5 = new JLabel("R$ 5,00");
		lbl5.setBounds(27, 50, 73, 20);
		contentPane.add(lbl5);
		
		JLabel lbl10 = new JLabel("R$ 10,00");
		lbl10.setBounds(27, 76, 73, 20);
		contentPane.add(lbl10);
		
		JLabel lbl20 = new JLabel("R$ 20,00");
		lbl20.setBounds(27, 103, 73, 20);
		contentPane.add(lbl20);
		
		JLabel lbl50 = new JLabel("R$ 50,00");
		lbl50.setBounds(27, 131, 73, 20);
		contentPane.add(lbl50);
		
		JLabel lbl100 = new JLabel("R$ 100,00");
		lbl100.setBounds(27, 161, 73, 20);
		contentPane.add(lbl100);
		
		JLabel lbl200 = new JLabel("R$ 200,00");
		lbl200.setBounds(27, 192, 73, 20);
		contentPane.add(lbl200);
		
		txt2 = new JTextField();
		txt2.setBounds(132, 22, 86, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(132, 50, 86, 20);
		contentPane.add(txt5);
		
		txt10 = new JTextField();
		txt10.setColumns(10);
		txt10.setBounds(132, 76, 86, 20);
		contentPane.add(txt10);
		
		txt20 = new JTextField();
		txt20.setColumns(10);
		txt20.setBounds(132, 103, 86, 20);
		contentPane.add(txt20);
		
		txt50 = new JTextField();
		txt50.setColumns(10);
		txt50.setBounds(132, 131, 86, 20);
		contentPane.add(txt50);
		
		txt100 = new JTextField();
		txt100.setColumns(10);
		txt100.setBounds(132, 161, 86, 20);
		contentPane.add(txt100);
		
		txt200 = new JTextField();
		txt200.setColumns(10);
		txt200.setBounds(132, 192, 86, 20);
		contentPane.add(txt200);
		
		JButton btnExibir = new JButton("Exibir total");
		btnExibir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, (Integer.parseInt(txt2.getText()) * 2) + (Integer.parseInt(txt5.getText()) * 5) + (Integer.parseInt(txt10.getText()) * 10) + (Integer.parseInt(txt20.getText()) * 20) + (Integer.parseInt(txt50.getText()) * 50) + (Integer.parseInt(txt100.getText()) * 100) + (Integer.parseInt(txt200.getText()) * 200));
			}
		});
		btnExibir.setBounds(271, 191, 132, 23);
		contentPane.add(btnExibir);
	}
}
