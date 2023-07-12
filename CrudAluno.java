package secretaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CrudAluno {

	private ArrayList<Aluno> listaAlunos;

	public CrudAluno() {
		listaAlunos = new ArrayList<Aluno>();
	}

	public void criarAluno() {

		int id = 0;
		while (id == 0) {
			String identificador = JOptionPane.showInputDialog("Digite o nome Id do aluno: ");
			try {
				id = Integer.parseInt(identificador);
				JOptionPane.showMessageDialog(null, "Id ok!");
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " Digite um número!");
			}

		}

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
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

		Aluno pessoa = new Aluno(id, nome, idade, matricula, turma, nomeProfessor, turno, nomeDaMae);

		listaAlunos.add(pessoa);
		pessoa.informacoes();

		for (Aluno g : listaAlunos) {
			System.out.println("---------------------------------------------//-------------");
			System.out.println("Nome do Aluno: " + g.getNome());
		}

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
				JOptionPane.showMessageDialog(null, "Id ok!");
			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " Digite um número!");
			}

		}

		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
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
}
