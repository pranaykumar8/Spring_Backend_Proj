package com.codinghub.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codinghub.model.Movie;

@Service
public interface ServiceInterface {

	Movie save(Movie movie);

	List<Movie> getData();

	Movie getById(int m_no);

	List<Movie> getRating(double rating);

	List<Movie> getGenere(String genere);

	List<Movie> getByMnameAndProductionno(String mname, long productionno);

	List<Movie> getByCollections(String collections);

	List<Movie> sortByRecords();

	List<Movie> pagination();

	Movie partial(Movie movie, int m_no);



}
