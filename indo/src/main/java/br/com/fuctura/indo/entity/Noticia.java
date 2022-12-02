package br.com.fuctura.indo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fuctura.indo.dtos.NoticiaDTO;
import lombok.Getter;

@Getter
@Entity
@Table(name = "noticia")
public class Noticia {

	@Id
	@Column(name = "not_id")
	private Long id;
	@Column(name = "not_titulo")
	private String titulo;
	@Column(name = "not_descricao")
	private String descricao;
	@Column(name = "inicio")
	private LocalDateTime  inicio;
	@Column(name = "fim")
	private LocalDateTime fim;
	@Column(name = "duracao")
	private int duracao;
	
	public NoticiaDTO toDto() {
		return new NoticiaDTO(this);
	}
	
	
}
