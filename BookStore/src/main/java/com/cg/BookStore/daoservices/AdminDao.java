package com.cg.BookStore.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.BookStore.beans.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
