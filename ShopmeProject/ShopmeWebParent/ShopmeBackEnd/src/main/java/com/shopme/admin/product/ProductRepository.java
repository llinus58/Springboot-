package com.shopme.admin.product;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.shopme.common.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

	@Query("UPDATE Product p SET p.enabled = ?2 WHERE p.id = ?1")
	@Modifying
	public void updateEnabledStatus(Integer id, boolean enabled);
	public Product findByName(String name);
	public Long countById(Integer id);
}