package secretaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class RegistroDeTurmas {

	ArrayList<Aluno> listaAlunos = new ArrayList<>();

	public static void main(String[] args) {
		CrudAluno aluno = new CrudAluno();

		JOptionPane.showMessageDialog(null, "Olá, Seja muito bem vindo ao Sistema de alunos!");

		String opcaoDeAcao = "Iniciar";
		
		while(opcaoDeAcao.equals("Iniciar") || opcaoDeAcao.equals("Reiniciar")) {
			
			int numeroDeAcao = -1;
			while(true) {

			try {
						opcaoDeAcao = JOptionPane.showInputDialog(null,
						"Digite a opção desejada: \n" + "1-Cadastrar novo Aluno(a).\n"
								+ "2-Visualizar Alunos cadastados.\n" + "3-Atualizar cadastro de Aluno(a).\n"
								+ "4-Deletar Aluno cadastrado.\n" + "0-Sair do Programa.");
				 numeroDeAcao = Integer.parseInt(opcaoDeAcao);
				 if(numeroDeAcao > 4 || numeroDeAcao < 0) {
					 JOptionPane.showMessageDialog(null, "Digite um número válido");
				 } else {
				 break;
				 }
				 
			} catch(NumberFormatException numero) {
				JOptionPane.showMessageDialog(null, "Digite uma opção válida!!");
							
			 }
			}

			switch (numeroDeAcao) {
			case 1:
				aluno.createAluno();
				break;
			case 2:
				aluno.readAluno();
				break;
			case 3:
				aluno.updateAluno();
				break;
			case 4:
				aluno.deleteAluno();
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "Operação Finalizada!");
				break;

			}

			int refazerOperacao = JOptionPane.showConfirmDialog(null, "Deseja refazer uma das Operaçôes? ",
					"Confirmação", JOptionPane.YES_NO_OPTION);

			if (refazerOperacao == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Reiniciando operação!");
				opcaoDeAcao = "Reiniciar";
			} else {
				opcaoDeAcao = "Sair do Programa!";

			}
		}
	}		
}


