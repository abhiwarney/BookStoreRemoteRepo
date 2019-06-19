package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Review;

public interface ReviewDao extends JpaRepository<Review, Integer> {

}
