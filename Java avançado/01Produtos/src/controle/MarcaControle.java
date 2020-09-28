package controle;

import javax.swing.DefaultComboBoxModel;

import modelo.MarcaModelo;

public class MarcaControle {

	public static DefaultComboBoxModel<MarcaModelo> listar(){
		
	// Objetos de classe MarcaModelo
		MarcaModelo obj1 = new MarcaModelo("Apple", 1);
		MarcaModelo obj2 = new MarcaModelo("Dell", 2);
		MarcaModelo obj3 = new MarcaModelo("LG", 3);
		MarcaModelo obj4 = new MarcaModelo("Samsung", 4);
		MarcaModelo obj5 = new MarcaModelo("Sony", 5);
		
		//DefaultComboBoxModel
		DefaultComboBoxModel<MarcaModelo> lst = new DefaultComboBoxModel<MarcaModelo>();
	lst.addElement(obj1);
	lst.addElement(obj2);
	lst.addElement(obj3);
	lst.addElement(obj4);
	lst.addElement(obj5);
	
	return lst;
	}
}
