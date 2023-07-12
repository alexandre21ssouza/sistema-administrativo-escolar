package secretaria;

import javax.swing.JOptionPane;

public class Aluno {

	// atributos
	private int id;
	private String nome;
	private int idade;
	private int matricula;
	private String turma;
	private String nomeProfessor;
	private String turno;
	private String nomeDaMae;

	
	
	public Aluno(int id, String nome, int idade, int matricula, String turma, String nomeProfessor, String turno,
			String nomeDaMae) {
		
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.turma = turma;
		this.nomeProfessor = nomeProfessor;
		this.turno = turno;
		this.nomeDaMae = nomeDaMae;
	}

	//Getters 
	
	public int getId() {
		return id;
	}

	
	public String getNome() {
		return nome;
	}

	
	public int getIdade() {
		return idade;
	}

	
	public int getMatricula() {
		return matricula;
	}


	public String getTurma() {
		return turma;
	}


	public String getNomeProfessor() {
		return nomeProfessor;
	}


	public String getTurno() {
		return turno;
	}


	public String getNomeDaMae() {
		return nomeDaMae;
	}
	
	//Setters

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public void informacoes() {
		JOptionPane.showMessageDialog(null, "Id do aluno: " + id + "Nome do aluno(a): " + nome + "Idade do aluno(a): " + idade + "Matricula do aluno(a): " + matricula + 
				"Turma do aluno(a): " + turma + "Professor(a) do aluno(a): " + nomeProfessor + "Turno do aluno(a): " + turno + "Nome da mãe do aluno(a): " + nomeDaMae, nome, id, null);
		System.out.println("Id do aluno(a): " + id);
		System.out.println("Nome do aluno(a): " + nome);
		System.out.println("Idade do aluno(a): " + idade);
		System.out.println("Matricula do aluno(a): " + matricula);
		System.out.println("Turma do aluno: " + turma);
		System.out.println("Professor(a) do aluno(a): " + nomeProfessor);
		System.out.println("Turno do aluno(a): " + turno);
		System.out.println("Nome da mãe do aluno(a): " + nomeDaMae);
	}
}
