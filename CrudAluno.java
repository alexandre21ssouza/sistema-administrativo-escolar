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
			int nomeMinimo = 6;
			
			if(nome.length() >= nomeMinimo ) {

			if (nome.isBlank()) {
				JOptionPane.showMessageDialog(null, " Digite um nome válido!");

			} else if (hasNumbers(nome)) {
				JOptionPane.showMessageDialog(null, " Digite um nome sem números!");

			} else {
				JOptionPane.showMessageDialog(null, "Nome válido!");

			}
			
			} else { 
				JOptionPane.showMessageDialog(null, "Digite um nome com no mínimo 6 letras!!");
				nome = "";
			}
		}

		String sobreNome = "";

		while (sobreNome.isBlank() || hasNumbers(sobreNome)) {

			sobreNome = JOptionPane.showInputDialog("Digite o Sobre Nome: ");

			if (sobreNome.isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite um Sobrenome válido!");

			} else if (hasNumbers(sobreNome)) {
				JOptionPane.showMessageDialog(null, "Digite um Sobrenome sem números!");
			} else {
				JOptionPane.showMessageDialog(null, "Sobrenome Válido!");
			}

	   }
	

	int idade = 0;

	while(idade==0||idade>100)
	{

		String entradaIdade = JOptionPane.showInputDialog("Digite idade do aluno: ");

		try {
			int confirmaIdade = Integer.parseInt(entradaIdade);

			if (confirmaIdade > 100 || confirmaIdade < 11) {
				JOptionPane.showMessageDialog(null, "Idade do Aluno está acima 100 ou abaixo de 11 Digite corretamente",
						entradaIdade, idade);
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

	while(matriculaAluno.isBlank()||avancar.equals(""))
	{

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

	while(turma.isBlank())
	{

		turma = JOptionPane.showInputDialog("Digite A ou B para indicar a turma do aluno: ");

		if (turma.equalsIgnoreCase("A")) {
			nomeProfessor = "Sandro";

		} else if (turma.equalsIgnoreCase("B")) {
			nomeProfessor = "Douglas";

		} else {
			JOptionPane.showMessageDialog(null, "Digite uma turma válida!");
			turma = "";

		}

	}

	String turno = "";

	while(turno.isBlank())
	{

		turno = JOptionPane.showInputDialog("Digite o turno do aluno: ");

		if (turno.equalsIgnoreCase("Matutino")) {
			JOptionPane.showMessageDialog(null, "Turno válido!");

		} else if (turno.equalsIgnoreCase("Vespertino")) {
			JOptionPane.showMessageDialog(null, "Turno válido!");

		} else {
			JOptionPane.showMessageDialog(null, "Turno inválido!");
			turno = "";
		}

	}

	String nomeDaMae = "";

	while(nomeDaMae.isBlank())
	{

		nomeDaMae = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");

		if (nomeDaMae.isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite um nome!");

		} else if (hasNumbers(nomeDaMae)) {
			JOptionPane.showMessageDialog(null, "Digite um nome válido!");

		} else {
			JOptionPane.showMessageDialog(null, "Nome da Mãe válido!");

		}

	}

	Aluno pessoa = new Aluno(id, nome, sobreNome, idade, matricula, turma, nomeProfessor, turno, nomeDaMae);

	listaAlunos.add(pessoa);

	mostrarListaDeAlunos(listaAlunos);

	}

	public void mostrarListaDeAlunos(ArrayList<Aluno> listaAlunos) {

		StringBuilder dadosAluno = new StringBuilder("Cadastro do Aluno ano de 2023:\n ");

		for (Aluno alunoPessoa : listaAlunos) {
			dadosAluno.append("------------Dados------------\n").append("Id: ").append(alunoPessoa.getId() + "\n")
					.append("Nome: ").append(alunoPessoa.getNome() + "\n").append("Idade: ")
					.append(alunoPessoa.getIdade() + "\n").append("Matrícula: ")
					.append(alunoPessoa.getMatricula() + "\n").append("Turma: 2º").append(alunoPessoa.getTurma() + "\n")
					.append("Nome do Professor: ").append(alunoPessoa.getNomeProfessor() + "\n").append("Turno: ")
					.append(alunoPessoa.getTurno() + "\n").append("Nome da Mãe: ")
					.append(alunoPessoa.getNomeDaMae() + "\n").append("-----------------------------\n");
		}

		JOptionPane.showMessageDialog(null, dadosAluno.toString());

	}

	public void readAluno() {

		StringBuilder dadosAluno = new StringBuilder("Aluno(a) cadastrado:\n ");

		StringBuilder dadosAlunos = new StringBuilder("Lista dos Alunos cadastrados:\n ");

		int escolhaFeita = -1;

		if (listaAlunos.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Não há Alunos nesta lista!");

		} else {

			while (true) {

				try {
					String qualAFormaDePesquisa = JOptionPane.showInputDialog("1-Pesquisar por nome do Aluno.\n"
							+ "2-Mostrar todos os Alunos.\n" + "0-Encerrar pesquisa.");

					escolhaFeita = Integer.parseInt(qualAFormaDePesquisa);

					if (escolhaFeita < 0 || escolhaFeita > 2) {
						JOptionPane.showMessageDialog(null, "Digite um número válido!");

					} else {
						break;

					}

				} catch (NumberFormatException resposta) {

					JOptionPane.showMessageDialog(null, "Digite um número correspondente a opção!");
				}
			}

			switch (escolhaFeita) {
			case 1:
				String nomePesquisado = JOptionPane.showInputDialog("Digite o nome do Aluno(a):\n ");
				for (Aluno pesquisaAluno : listaAlunos) {
					if (pesquisaAluno.getNome().equalsIgnoreCase(nomePesquisado)) {
						dadosAluno.append("------------Dados------------").append("Id: ")
								.append(pesquisaAluno.getId() + "\n").append("Nome: ")
								.append(pesquisaAluno.getNome() + "\n").append("Idade: ")
								.append(pesquisaAluno.getIdade() + "\n").append("Matrícula: ")
								.append(pesquisaAluno.getMatricula() + "\n").append("Turma: ")
								.append(pesquisaAluno.getTurma() + "\n").append("Turno: ")
								.append(pesquisaAluno.getTurno()).append("Nome do Professor: ")
								.append(pesquisaAluno.getNomeProfessor() + "\n").append("Nome da Mãe: ")
								.append(pesquisaAluno.getNomeDaMae() + "\n");
					}

				}

				JOptionPane.showMessageDialog(null, dadosAluno.toString());
				break;

			case 2:
				for (Aluno registroAlunos : listaAlunos) {
					dadosAlunos.append("------------Dados------------").append("Id: ")
							.append(registroAlunos.getId() + "\n").append("Nome: ")
							.append(registroAlunos.getNome() + "\n").append("Idade: ")
							.append(registroAlunos.getIdade() + "\n").append("Matrícula: ")
							.append(registroAlunos.getMatricula() + "\n").append("Turma: ")
							.append(registroAlunos.getTurma() + "\n").append("Turno: ")
							.append(registroAlunos.getTurno() + ("\n")).append("Nome do Professor: ")
							.append(registroAlunos.getNomeProfessor() + "\n").append("Nome da Mãe: ")
							.append(registroAlunos.getNomeDaMae() + "\n");
				}

				JOptionPane.showMessageDialog(null, dadosAlunos.toString());
				break;

			case 0: {
				JOptionPane.showMessageDialog(null, "Saindo da Pesquisa...");
			}
			}
		}
	}

	public void updateAluno() {

		if (listaAlunos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há Alunos nesta lista!");

		} else {

			String alunoPesquisado = JOptionPane.showInputDialog(null,
					"Pesquise o nome do aluno(a) para atualizar o cadastro: ");

			StringBuilder infoAluno = new StringBuilder("Informações Aluno(a):\n" + alunoPesquisado);

			Aluno alunoParaAtualizar = null;

			for (Aluno alunoCadastrado : listaAlunos) {
				if (alunoCadastrado.getNome().equalsIgnoreCase(alunoPesquisado)) {
					infoAluno.append("------------Dados------------" + "\n").append("Id: ")
							.append(alunoCadastrado.getId() + "\n").append("Nome: ")
							.append(alunoCadastrado.getNome() + "\n").append("Idade: ")
							.append(alunoCadastrado.getIdade() + "\n").append("Matricula: ")
							.append(alunoCadastrado.getMatricula() + "\n").append("Turma: ")
							.append(alunoCadastrado.getTurma() + "\n").append("Turno: ")
							.append(alunoCadastrado.getTurno() + "\n").append("Nome do Professor: ")
							.append(alunoCadastrado.getNomeProfessor() + "\n").append("Nome da Mãe: ")
							.append(alunoCadastrado.getNomeDaMae() + "\n");

					JOptionPane.showMessageDialog(null, infoAluno.toString());

					alunoParaAtualizar = alunoCadastrado;
					break;
				}
			}

			if (alunoParaAtualizar != null) {

				int idNovo = 0;

				while (idNovo == 0) {

					String identificador = JOptionPane.showInputDialog("Digite o nome Id do aluno: ");

					try {
						idNovo = Integer.parseInt(identificador);
						JOptionPane.showMessageDialog(null, "Id válido!");

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, " Digite um número válido!");
					}

				}

				String nomeNovo = "";

				while (nomeNovo.isBlank() || hasNumbers(nomeNovo)) {

					nomeNovo = JOptionPane.showInputDialog("Digite o nome do aluno: ");

					if (nomeNovo.isBlank()) {
						JOptionPane.showMessageDialog(null, " Digite um nome válido!");

					} else if (hasNumbers(nomeNovo)) {
						JOptionPane.showMessageDialog(null, " Digite um nome sem números!");

					} else {
						JOptionPane.showMessageDialog(null, "Nome válido!");

					}
				}

				int idadeNova = 0;

				while (idadeNova == 0 || idadeNova > 100) {

					String entradaIdade = JOptionPane.showInputDialog("Digite idade do aluno: ");

					try {
						int confirmaIdade = Integer.parseInt(entradaIdade);

						if (confirmaIdade > 100 || confirmaIdade < 11) {
							JOptionPane.showMessageDialog(null,
									"Idade do Aluno está acima 100 ou abaixo de 11 Digite corretamente");
							idadeNova = 0;

						} else if (confirmaIdade < 100 || confirmaIdade >= 11) {
							idadeNova = confirmaIdade;
							JOptionPane.showMessageDialog(null, "Idade válida!");

						}

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite uma idade válida");
					}
				}

				String matriculaAlunoNova = "";

				int matriculaNova = 0;

				int digitos = 5;

				String avancar = "";

				while (matriculaAlunoNova.isBlank() || avancar.equals("")) {

					do {
						matriculaAlunoNova = JOptionPane
								.showInputDialog("Insira a matricula do aluno de no mínimo " + digitos + " digitos: ");

					} while (matriculaAlunoNova.length() != digitos);

					try {
						matriculaNova = Integer.parseInt(matriculaAlunoNova);

						if (matriculaNova == 0) {
							avancar = "";
							JOptionPane.showMessageDialog(null, "Digite a matricula diferente de " + matriculaNova);

						} else {
							JOptionPane.showMessageDialog(null, "Matrícula válida!");
							avancar = "avançar";
						}

					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Digite uma matrícula válida!");
						avancar = "";
					}

				}

				String turmaNova = "";

				String nomeProfessorNovo = "";

				while (turmaNova.isBlank()) {

					turmaNova = JOptionPane.showInputDialog("Digite A ou B para indicar a turma do aluno: ");

					if (turmaNova.equalsIgnoreCase("A")) {
						nomeProfessorNovo = "Sandro";

					} else if (turmaNova.equalsIgnoreCase("B")) {
						nomeProfessorNovo = "Douglas";

					} else {
						JOptionPane.showMessageDialog(null, "Digite uma turma válida!");
						turmaNova = "";

					}

				}

				String turnoNovo = "";

				while (turnoNovo.isBlank()) {

					turnoNovo = JOptionPane.showInputDialog("Digite o turno do aluno: ");

					if (turnoNovo.equalsIgnoreCase("Matutino")) {
						JOptionPane.showMessageDialog(null, "Turno válido!");

					} else if (turnoNovo.equalsIgnoreCase("Vespertino")) {
						JOptionPane.showMessageDialog(null, "Turno válido!");

					} else {
						JOptionPane.showMessageDialog(null, "Turno inválido!");
						turnoNovo = "";
					}

				}

				String nomeDaMaeNovo = "";

				while (nomeDaMaeNovo.isBlank()) {

					nomeDaMaeNovo = JOptionPane.showInputDialog("Digite o nome da mãe do aluno: ");

					if (nomeDaMaeNovo.isBlank()) {
						JOptionPane.showMessageDialog(null, "Digite um nome!");

					} else if (hasNumbers(nomeDaMaeNovo)) {
						JOptionPane.showMessageDialog(null, "Digite um nome válido!");

					} else {
						JOptionPane.showMessageDialog(null, "Nome da Mãe válido!");

					}

					alunoParaAtualizar.setId(idNovo);
					alunoParaAtualizar.setNome(nomeNovo);
					alunoParaAtualizar.setIdade(idadeNova);
					alunoParaAtualizar.setMatricula(matriculaNova);
					alunoParaAtualizar.setTurma(turmaNova);
					alunoParaAtualizar.setTurno(turnoNovo);
					alunoParaAtualizar.setNomeProfessor(nomeProfessorNovo);
					alunoParaAtualizar.setNomeDaMae(nomeDaMaeNovo);

				}

				StringBuilder alunoNovo = new StringBuilder(
						"Informações atualizadas do \n Aluno(a):\n" + alunoPesquisado + "\n");

				for (Aluno alunoAtual : listaAlunos) {
					alunoNovo.append("------------Dados------------\n").append("Id: ").append(alunoAtual.getId() + "\n")
							.append("Nome: ").append(alunoAtual.getNome() + "\n").append("Idade: ")
							.append(alunoAtual.getIdade() + "\n").append("Matricula: ")
							.append(alunoAtual.getMatricula() + "\n").append("Turma: ")
							.append(alunoAtual.getTurma() + "\n").append("Turno: ").append(alunoAtual.getTurno() + "\n")
							.append("Nome do Professor: ").append(alunoAtual.getNomeProfessor() + "\n")
							.append("Nome da Mãe: ").append(alunoAtual.getNomeDaMae() + "\n");
				}

				JOptionPane.showMessageDialog(null, "Cadastro ANTIGO " + "\n" + infoAluno.toString() + "\n"
						+ "Cadastro NOVO " + "\n" + alunoNovo.toString());

			} else {

				JOptionPane.showMessageDialog(null,
						"Aluno(a) " + alunoPesquisado + " NÃO está Cadastrado! \n" + "Verifique a lista de Alunos!");

			}
		}
	}

	public void deleteAluno() {

		StringBuilder alunoAdeletar = new StringBuilder("Informações do Aluno(a)\n a ser deletado:\n");

		StringBuilder listaDeletado = new StringBuilder("Informações da lista\natual:\n");

		String pesquisaDeletar = "";

		if (listaAlunos.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Não há Alunos nesta lista!");

		} else {

			while (pesquisaDeletar.isBlank() || hasNumbers(pesquisaDeletar)) {

				pesquisaDeletar = JOptionPane.showInputDialog(null, "Digite o nome do Aluno a ser deletado:\n");

				if (pesquisaDeletar.isBlank()) {
					JOptionPane.showMessageDialog(null, "Digite um Nome!");

				} else if (hasNumbers(pesquisaDeletar)) {

					JOptionPane.showMessageDialog(null, "Digite um Nome sem números!");

				} else {

					JOptionPane.showMessageDialog(null, "Nome válido!");
				}
			}
		}

		Aluno alunoParaDeletar = null;

		for (Aluno deletaAluno : listaAlunos) {
			if (deletaAluno.getNome().equalsIgnoreCase(pesquisaDeletar)) {
				alunoAdeletar.append("------------Dados------------\n").append("Id: ")
						.append(deletaAluno.getId() + "\n").append("Nome: ").append(deletaAluno.getNome() + "\n")
						.append("Idade: ").append(deletaAluno.getIdade() + "\n").append("Matricula: ")
						.append(deletaAluno.getMatricula() + "\n").append("Turma: ")
						.append(deletaAluno.getTurma() + "\n").append("Turno: ").append(deletaAluno.getTurno() + "\n")
						.append("Nome do Professor: ").append(deletaAluno.getNomeProfessor() + "\n")
						.append("Nome da Mãe: ").append(deletaAluno.getNomeDaMae() + "\n");

				JOptionPane.showMessageDialog(null, alunoAdeletar.toString());

				alunoParaDeletar = deletaAluno;
				break;
			}

			if (alunoParaDeletar != null) {
				listaAlunos.remove(alunoParaDeletar);

				for (Aluno listaSemAlunoDeletado : listaAlunos) {
					listaDeletado.append("------------Dados------------\n").append("Nome: ")
							.append(listaSemAlunoDeletado.getNome());

					JOptionPane.showMessageDialog(null, listaDeletado.toString());
				}
			} else {

				JOptionPane.showMessageDialog(null, "O Aluno(a) não está na lista!");
			}
		}

	}

	private boolean hasNumbers(String texto) {
		return texto.matches(".*\\d.*");
	}
}
