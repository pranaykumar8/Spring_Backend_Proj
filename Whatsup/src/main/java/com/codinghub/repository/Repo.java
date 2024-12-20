package com.codinghub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.model.Whatsup;
@Repository
public interface Repo extends CrudRepository<Whatsup,Long> {

}
