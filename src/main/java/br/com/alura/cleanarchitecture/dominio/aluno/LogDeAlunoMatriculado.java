package br.com.alura.cleanarchitecture.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.alura.cleanarchitecture.dominio.Evento;
import br.com.alura.cleanarchitecture.dominio.Ouvinte;

public class LogDeAlunoMatriculado extends Ouvinte {
	
	public void reageAo(Evento evento) {
		String momentoFormatado = evento
				.momento()
				.format(DateTimeFormatter
						.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(
				String.format(
						"Aluno com CPF %s matriculado em: %s"
						, ((AlunoMatriculado) evento).getCpfDoAluno(),
						momentoFormatado));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento instanceof AlunoMatriculado;
	}

}
