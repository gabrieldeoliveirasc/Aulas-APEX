package Modelo;

public class MateriaModelo {

	// Atributos
	
	private String nome;
	private String prova;
	private double nota;
	
	// Construtor
	
	public MateriaModelo(String nome, String prova, double nota) {
		this.nome = nome;
		this.prova = prova;
		this.nota = nota;
	}

	// Get e Set
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProva() {
		return prova;
	}

	public void setProva(String prova) {
		this.prova = prova;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	

	
	
	
}
