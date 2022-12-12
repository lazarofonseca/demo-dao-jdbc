package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);
	void delete(Integer id);
	Seller findByid(Integer obj);
	List<Seller> findAll();

}
