package secretaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ReadAluno {
	
	ArrayList<Aluno> listaAlunos = new ArrayList<>();
	
	public void ReadAlunoLista() {
		if(listaAlunos.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Não há Alunos nesta lista!");
		} else {
			for(Aluno registroAlunos : listaAlunos) {
				System.out.println(registroAlunos);
				JOptionPane.showMessageDialog(null, "Lista de Alunos: " + "\n" + "- " + registroAlunos);
			}
		}
		
				
	}
	
	
	
	
	

}
