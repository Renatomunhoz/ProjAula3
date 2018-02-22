package br.com.proj.dados;

import java.util.List;

import br.com.proj.entidade.Moto;

public interface IMotoDB {

	
	boolean insert(Moto moto);
	boolean update(Moto moto);
	boolean delete(Moto moto);
	boolean select(Moto moto);
	List<Moto> select ();
		
	
	
}
