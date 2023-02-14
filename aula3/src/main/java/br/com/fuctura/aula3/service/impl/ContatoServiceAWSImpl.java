package br.com.fuctura.aula3.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.aula3.dto.ContatoRequestDTO;
import br.com.fuctura.aula3.service.IContatoService;

@Service 
@Qualifier("ContatoServiceAWSImpl")
public class ContatoServiceAWSImpl implements IContatoService {

	@Override
	public void salvar(ContatoRequestDTO contato) {
		// TODO Auto-generated method stub
		System.out.println("AWS");
	}

}
