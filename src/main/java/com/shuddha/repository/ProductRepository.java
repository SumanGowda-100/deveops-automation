/**
 * 
 */
package com.shuddha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shuddha.entity.Product;

/**
 * @author Dell
 *
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
