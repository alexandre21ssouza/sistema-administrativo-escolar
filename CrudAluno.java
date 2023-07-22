package secretaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CrudAluno {

	private ArrayList<Aluno> listaAlunos;

	public CrudAluno() {
		listaAlunos = new ArrayList<Aluno>();
	}

	public void createAluno() {

		int id = 0;
		while (id == 0) {
			String identificador = JOptionPane.showInputDialog("Digite o nome Id do aluno: ");
			try {
				id = Integer.parseInt(identificador);
				JOptionPane.showMessageDialog(null, "Id válido!");
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " Digite um número válido!");
			}

		}

		String nome = "";
		while (nome.isBlank() || hasNumbers(nome)) {
			nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");

			if (nome.isBlank()) {
				JOptionPane.showMessageDialog(null, " Digite um nome válido!");
			}

			else if (hasNumbers(nome)) {
				JOptionPane.showMessageDialog(null, " Digite um nome sem números!");

			} else {
				JOptionPane.showMessageDialog(null, "Nome válido!");

			}
		}

		int idade = 0;
		while (idade == 0 || idade > 100) {
			String entradaIdade = JOptionPane.showInputDialog("Digite idade do aluno: ");

			try {
				int confirmaIdade = Integer.parseInt(entradaIdade);
				if (confirmaIdade > 100 || confirmaIdade < 11) {
					JOptionPane.showMessageDialog(null,
							"Idade do Aluno está acima 100 ou abaixo de 11 Digite corretamente", entradaIdade, idade);
					idade = 0;

				} else if (confirmaIdade < 100 || confirmaIdade >= 11) {
					idade = confirmaIdade;
					JOptionPane.showMessageDialog(null, "Idade válida!");

				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma idade válida");
			}
		}

		String matriculaAluno = "";
		int matricula = 0;
		int digitos = 5;
		String avancar = "";
		while (matriculaAluno.isBlank() || avancar.equals("")) {

			do {
				matriculaAluno = JOptionPane
						.showInputDialog("Insira a matricula do aluno de no mínimo " + digitos + " digitos: ");

			} while (matriculaAluno.length() != digitos);
			

				try {
					matricula = Integer.parseInt(matriculaAluno);
					if (matricula == 0) {
						avancar = "";
						JOptionPane.showMessageDialog(null, "Digite a matricula diferente de " + matricula);
					} else {
						JOptionPane.showMessageDialog(null, "Matrícula válida!");
						avancar = "avançar";
					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");
					avancar = "";
				}

			
			
			
		}

		String turma = "";
		String nomeProfessor = "";
		while (turma.isBlank() ) {

			turma = JOptionPane.showInputDialog("Digite A ou B para indicar a turma do aluno: ");

			if (turma == "A" || turma == "a") {
				nomeProfessor = "Sandro";
			} else if (turma == "B" || turma == "b") {
				nomeProfessor = "Douglas";
			} else {
				JOptionPane.showInternalMessageDialog(null, "Digite uma turma válida!");
				turma = "";

			}

		}

		String turno = "";
		while (turno.isBlank()) {

			turno = JOptionPane.showInputDialog("Digite o turno do aluno: ");

			if (turno == "Matutino" || turno == "matutino") {
				JOptionPane.showMessageDialog(null, "Turno válido!");
			} else if (turno == "Vespertino" || turno == "vespertino") {
				JOptionPane.showInternalMessageDialog(null, "Turno válido!");
			} else {
				JOptionPane.showInternalMessageDialog(null, "Turno inválido!");
				turno = "";
			}
		}

		String nomeDaMae = "";
		while (nomeDaMae.isBlank()) {

			nomeDaMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");

			if (nomeDaMae.isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite um nome!");
			} else if (hasNumbers(nomeDaMae)) {
				JOptionPane.showMessageDialog(null, "Digite um nome válido!");
			} else {
				JOptionPane.showInternalMessageDialog(null, "Nome da Mãe válido!");
			}
		}

		Aluno pessoa = new Aluno(id, nome, idade, matricula, turma, nomeProfessor, turno, nomeDaMae);

		listaAlunos.add(pessoa);
		mostrarListaDeAlunos(listaAlunos);
		pessoa.informacoes();

	

	}
	
	public void mostrarListaDeAlunos(ArrayList<Aluno> listaAlunos){
		StringBuilder dadosAlunos = new StringBuilder("Lista de Alunos:/n");
		
		for(Aluno pessoa: listaAlunos) {
			dadosAlunos.append("Id:/n ").append(pessoa.getId()).append("Nome:/n ").append(pessoa.getNome()).append("Idade:n/ ").append(pessoa.getIdade())
			.append("Matrícula:n/ ").append(pessoa.getMatricula()).append("Turma:n/ ").append(pessoa.getTurma()).append("Nome do Professor:n/ ")
			.append(pessoa.getNomeProfessor()).append("Turno:n/ ").append(pessoa.getTurno()).append("Nome da Mãe:n/ ").append(pessoa.getNomeDaMae());
		}
		
		JOptionPane.showInternalMessageDialog(null, dadosAlunos.toString());
		
	}

	public void readAluno() {
		if (listaAlunos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há Alunos nesta lista!");

		} else {
			for (Aluno registroAlunos : listaAlunos) {
				System.out.println("---------lista---------");
				System.out.println(registroAlunos);
				JOptionPane.showMessageDialog(null, "Lista de Alunos: " + "\n" + " - " + registroAlunos.getNome());
			}
		}
	}

	public void updateAluno() {
		String alunoPesquisa = JOptionPane.showInputDialog(null, "Pesquise um aluno para atualizar o cadastro: ");

		int id = 0;
		while (id == 0) {
			String identificador = JOptionPane.showInputDialog("Digite o nome Id do aluno: ");
			try {
				id = Integer.parseInt(identificador);
				JOptionPane.showMessageDialog(null, "Id válido!");
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " Digite um número válido!");
			}

		}

		String nome;
		nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		int idade = 0;

		String entradaIdade = JOptionPane.showInputDialog("Digite idade do aluno: ");
		while (idade == 0) {
			int confirmaIdade = Integer.parseInt(entradaIdade);
			if (confirmaIdade > 100 || confirmaIdade < 11) {
				JOptionPane.showMessageDialog(null, "Idade do Aluno está acima 100 ou abaixo de 11 Digite corretamente",
						entradaIdade, idade);
				idade = 0;
				entradaIdade = JOptionPane.showInputDialog("Digite idade do aluno: ");
			} else if (confirmaIdade < 100 || confirmaIdade >= 11) {
				idade = confirmaIdade;
				JOptionPane.showMessageDialog(null, "Idade está ok!");
				System.out.println("Idade está ok!");
			}
		}

		String matriculaAluno = JOptionPane.showInputDialog("Digite a matricula do aluno: ");
		int matricula = Integer.parseInt(matriculaAluno);
		String turma = JOptionPane.showInputDialog("Digite a turma do aluno: ");
		String nomeProfessor = JOptionPane.showInputDialog("Digite o nome do professor do aluno: ");
		;
		String turno = JOptionPane.showInputDialog("Digite o turno do aluno: ");
		String nomeDaMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");

		Aluno atualizarAluno = new Aluno(id, nome, idade, matricula, turma, nomeProfessor, turno, nomeDaMae);

		for (int i = 0; i < listaAlunos.size(); i++) {
			Aluno aluno = listaAlunos.get(i);

			if (aluno.getNome().equals(alunoPesquisa)) {
				listaAlunos.set(i, atualizarAluno);
				break;

			}
		}
		for (Aluno aluno : listaAlunos) {
			System.out.println("-------------------Aluno atualizado -------------------");
			System.out.println("Id do aluno(a): " + aluno.getId() + "Nome do aluno(a): " + aluno.getNome()
					+ "Idade do aluno(a): " + aluno.getIdade() + "Matricula do aluno(a): " + aluno.getMatricula()
					+ "Turma do aluno: " + aluno.getTurma() + "Professor(a) do aluno(a): " + aluno.getNomeProfessor()
					+ "Turno do aluno(a): " + aluno.getTurno() + "Nome da mãe do aluno(a): " + aluno.getNomeDaMae());
		}

	}

	public void deleteAluno() {

	}

	private boolean hasNumbers(String texto) {
		return texto.matches(".*\\d.*");
	}
}
