package br.com.alura.cleanarchitecture.aplicacao.aluno.matricular;

import br.com.alura.cleanarchitecture.dominio.aluno.Aluno;
import br.com.alura.cleanarchitecture.dominio.aluno.CPF;
import br.com.alura.cleanarchitecture.dominio.aluno.Email;

public class MatricularAlunoDto {

	private String nomeAluno;
	private String cpfAluno;
	private String emailAluno;
	
	public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
	}

	public Aluno criarAluno() {
		return new Aluno(
				new CPF(cpfAluno), 
				nomeAluno, 
				new Email(emailAluno));
	}
	
}
