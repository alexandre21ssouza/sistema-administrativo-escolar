package secretaria;

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

	//Getters and Setters
	
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


	public void informacoes() {
		System.out.println("Id do aluno: " + id);
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matricula do aluno: " + idade);
		System.out.println("Matricula do aluno: " + matricula);
		System.out.println("Matricula do aluno: " + turma);
		System.out.println("Matricula do aluno: " + nomeProfessor);
		System.out.println("Matricula do aluno: " + turno);
		System.out.println("Matricula do aluno: " + nomeDaMae);
	}
}
