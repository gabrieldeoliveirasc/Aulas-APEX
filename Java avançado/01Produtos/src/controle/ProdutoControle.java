package controle;

import javax.swing.table.DefaultTableModel;

import modelo.ProdutoModelo;

public class ProdutoControle {

	// Retornar um conjunto de produtos
	public static DefaultTableModel listar(){
		
		ProdutoModelo pm1 = new ProdutoModelo("iphone 11", "Apple", 4300);
		ProdutoModelo pm2 = new ProdutoModelo("Galaxy S20", "Samsung", 5000);
	
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Produto");
		dtm.addColumn("Marca");
		dtm.addColumn("Valor");
		
		dtm.addRow(new Object[] {
				pm1.getProduto(),
				pm1.getMarca(),
				pm1.getValor()
		});

		dtm.addRow(new Object[] {
				pm2.getProduto(),
				pm2.getMarca(),
				pm2.getValor()
		});		
		
		return dtm;
		
	}
	
	
	
}
