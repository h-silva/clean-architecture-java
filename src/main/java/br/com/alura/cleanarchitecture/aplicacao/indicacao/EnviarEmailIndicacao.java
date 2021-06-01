package br.com.alura.cleanarchitecture.aplicacao.indicacao;

import br.com.alura.cleanarchitecture.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
