package com.yash.WebProductManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productDB extends JpaRepository<Product, Integer>
{
	Product findByname(String name);
}
