package secretaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AlunoCreate {

	// Create
	public ArrayList<Aluno> listaAlunos = new ArrayList<>();
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
	}

}
