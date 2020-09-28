package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class formulario extends JFrame {

	private JPanel contentPane;
	private int joao = 0;
	private int rafael = 0;
	private int ricardo = 0;
	private int jose = 0;
	private int nulo = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario frame = new formulario();
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
	public formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCandidato01 = new JButton("Votar Jo\u00E3o");
		btnCandidato01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				joao++;
			}
		});
		btnCandidato01.setBounds(158, 11, 127, 41);
		contentPane.add(btnCandidato01);
		
		JButton btnCandidato02 = new JButton("Votar Rafael");
		btnCandidato02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rafael++;
			}
		});
		btnCandidato02.setBounds(158, 52, 127, 41);
		contentPane.add(btnCandidato02);
		
		JButton btnCandidato03 = new JButton("Votar Ricardo");
		btnCandidato03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ricardo++;
			}
		});
		btnCandidato03.setBounds(158, 92, 127, 41);
		contentPane.add(btnCandidato03);
		
		JButton btnCandidato04 = new JButton("Votar Jos\u00E9");
		btnCandidato04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jose++;
			}
		});
		btnCandidato04.setBounds(158, 132, 127, 41);
		contentPane.add(btnCandidato04);
		
		JButton btnNulo = new JButton("Votar Nulo");
		btnNulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nulo++;
			}
		});
		btnNulo.setBounds(158, 173, 127, 41);
		contentPane.add(btnNulo);
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "João "+joao+" votos.\n Rafael "+rafael+" votos.\n Ricardo "+ricardo+" votos.\n José "+jose+" votos.\n Nulo "+nulo+" votos" );
			}
		});
		btnResultado.setBounds(323, 191, 89, 23);
		contentPane.add(btnResultado);
	}
}
