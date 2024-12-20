package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.Automobiles;

public interface Repo  extends CrudRepository<Automobiles, Integer>{

}
