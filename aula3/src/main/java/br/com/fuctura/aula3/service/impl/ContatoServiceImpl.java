package br.com.fuctura.aula3.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.aula3.dto.ContatoRequestDTO;
import br.com.fuctura.aula3.service.IContatoService;

@Service
@Qualifier("ContatoServiceImpl")
public class ContatoServiceImpl implements IContatoService {
	
	private List<ContatoRequestDTO> contatos;
	
	public ContatoServiceImpl() {
		this.contatos = new ArrayList<ContatoRequestDTO>();
	}

	@Override
	public void salvar(ContatoRequestDTO contato) {
		this.contatos.add(contato);
		System.out.println("Cadastrado com sucesso!");
	}
}
