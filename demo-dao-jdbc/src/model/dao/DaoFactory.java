package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {//opera��es est�ticas para instanciar os DAOs

	public static SellerDao createSellerDao() {//expor o metodo que retorna uma interface
		return new SellerDaoJDBC();//mas internamente retorna uma implementa��o
	}
}
