package br.com.alura.cleanarchitecture.infra.indicacao;

import br.com.alura.cleanarchitecture.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.cleanarchitecture.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
