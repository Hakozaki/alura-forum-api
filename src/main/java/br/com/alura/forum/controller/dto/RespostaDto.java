package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {

	private Long id;
	private LocalDateTime dataCriacao;
	private String mensagem;
	private String nomeAutor;
	
	public RespostaDto(Resposta resposta) {
		
		this.id = resposta.getId();
		this.dataCriacao = resposta.getDataCriacao();
		this.mensagem = resposta.getMensagem();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}
	
	
	
}
