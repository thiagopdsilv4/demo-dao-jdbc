package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);//operação responsável por inserir no bd o objeto que enviar como parametro
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);//pegar id e consultar no bd um objeto com esse id, se exister irá retornar se não, null
	
	List<Seller>findAll();
}
