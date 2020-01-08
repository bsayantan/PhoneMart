package com.example.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assignment.model.Phone;

public interface DataInterface extends JpaRepository<Phone, Integer>
{

}
