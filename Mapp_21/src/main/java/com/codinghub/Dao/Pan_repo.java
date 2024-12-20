package com.codinghub.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.model.Pan;

@Repository
public interface Pan_repo extends JpaRepository<Pan, Long> {

}
