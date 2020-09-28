package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.MarcaControle;
import controle.ProdutoControle;
import modelo.MarcaModelo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtProduto;
	private JTextField txtValor;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setForeground(Color.RED);
		lblProduto.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblProduto.setBounds(32, 25, 73, 58);
		contentPane.add(lblProduto);
		
		txtProduto = new JTextField();
		txtProduto.setBounds(115, 47, 233, 20);
		contentPane.add(txtProduto);
		txtProduto.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setForeground(Color.RED);
		lblMarca.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblMarca.setBounds(32, 94, 73, 58);
		contentPane.add(lblMarca);
		

		
		
		JComboBox<MarcaModelo> cbxMarca = new JComboBox<MarcaModelo>();
		cbxMarca.setModel(MarcaControle.listar());
		cbxMarca.setBounds(115, 116, 233, 20);
		contentPane.add(cbxMarca);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setForeground(Color.RED);
		lblValor.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblValor.setBounds(32, 144, 73, 58);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(115, 166, 233, 20);
		contentPane.add(txtValor);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(165, 212, 89, 23);
		contentPane.add(btnCadastrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 238, 414, 175);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(ProdutoControle.listar());
		scrollPane.setViewportView(table);
	}
}
