package br.com.fuctura.indo.dtos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Id;

import br.com.fuctura.indo.entity.Noticia;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public  class NoticiaDTO {
	
	
	private Long numer;
	private String titulo;
	private String descricao;
	private LocalDateTime  inicio;
	private LocalDateTime fim;
	private int duracao_segundos;
	
	public NoticiaDTO(Noticia noticia) {
		if (null != noticia) {
			
			this.numer = noticia.getId();
			this.titulo = noticia.getTitulo();
			this.descricao = noticia.getDescricao();
			this.inicio = noticia.getInicio();
			this.fim = noticia.getFim();
			this.duracao_segundos = noticia.getDuracao();
			
		}
		
	}
	
	
	

}
