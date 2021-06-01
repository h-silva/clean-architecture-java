package br.com.alura.cleanarchitecture.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.alura.cleanarchitecture.dominio.PublicadorDeEventos;
import br.com.alura.cleanarchitecture.dominio.aluno.Aluno;
import br.com.alura.cleanarchitecture.dominio.aluno.CPF;
import br.com.alura.cleanarchitecture.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		// MOCK -> Mockito
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		
		MatricularAluno useCase = new MatricularAluno(repositorio, new PublicadorDeEventos());
		
		MatricularAlunoDto dados = new MatricularAlunoDto(
				"Fulano", 
				"123.456.789-00", 
				"fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(
				new CPF("123.456.789-00"));
		
		assertEquals("Fulano", encontrado.getNome());
		assertEquals(new CPF("123.456.789-00"), encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
