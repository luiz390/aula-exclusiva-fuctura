package br.com.fuctura.indo.repositorys;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fuctura.indo.entity.Noticia;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long>{
	
	//@Query
	/*public List<Noticia> findSituacaoId(@Param("situacao") long sit);
		
	
	
	public List<Noticia> findDisponiveis(@Param("inicio") LocalDateTime dt ini, @Param("fim") LocalDataTime dt fim);*/
		
}
	


