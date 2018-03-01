package br.com.proj.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.proj.entidade.Moto;
import br.com.proj.util.Conexao;

public class MotoDB implements IMotoDB{

	private Connection con;
	private PreparedStatement ps;
	
	
	public MotoDB() {
		
		// ABERTURA DA CONEXÃO COM A BASE DE DADOS 
		
		con = Conexao.getConnectio();
		
	}
	
		
	public boolean insert ( Moto moto) {
	
	System.out.println("Id: "+ moto.getId());
	System.out.println("Descricao : "+ moto.getDescricao());
	System.out.println("Ano : "+ moto.getAno());
		
	//IMPLEMENTAÇÃO DO INSERT NA BASE DE DADOS 	
		
     boolean status = false;
     
     StringBuilder sb = new StringBuilder();
     
     sb.append("INSERT INTO MOTO");
     sb.append("(id, descricao,ano) values (?,?,?)");
     
     try {
		ps = this.con.prepareStatement(sb.toString());
	 
     
     ps.setInt (1, moto.getId());
     ps.setString(2, moto.getDescricao());
     ps.setInt(3, moto.getAno());
     
     return ps.execute();
	
     }catch (SQLException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     
     return false;
	}


	@Override
	public boolean update(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean delete(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean select(Moto moto) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Moto> select() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
