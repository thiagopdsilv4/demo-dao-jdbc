package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj);//operação responsável por inserir no bd o objeto que enviar como parametro
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);//pegar id e consultar no bd um objeto com esse id, se exister irá retornar se não, null
	
	List<Department>findAll();
}
