package com.codinghub.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.model.Movie;

@Repository
public interface Dao extends JpaRepository<Movie, Integer> 
{

	List<Movie> findByRating(double rating);

	List<Movie> findByGenere(String genere);

	

	List<Movie> findByMnameAndProductionno(String mname, long productionno);

	List<Movie> findByCollections(String collections);

}
