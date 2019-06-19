package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
