package com.codinghub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codinghub.Repository.Dao;
import com.codinghub.model.Movie;

@Service
public class ServiceImpl implements ServiceInterface 
{	
	@Autowired
	private Dao dao;

	@Override
	public Movie save(Movie movie) {
		// TODO Auto-generated method stub
		return dao.save(movie);
	}
	@Override
	public List<Movie> getData() {
		// TODO Auto-generated method stub
		return (List<Movie>)dao.findAll();
	}
	@Override
	public Movie getById(int m_no) {
		// TODO Auto-generated method stub
		Optional<Movie>optional=dao.findById(m_no)	;	
		Movie movie=optional.get();
		return movie;
	}
	@Override
	public List<Movie> getRating(double rating) {
		// TODO Auto-generated method stub
		return dao.findByRating(rating);
	}
	@Override
	public List<Movie> getGenere(String genere) {
		// TODO Auto-generated method stub
		return dao.findByGenere(genere);
	}
	@Override
	public List<Movie> getByMnameAndProductionno(String mname, long productionno) {
		// TODO Auto-generated method stub
		return dao.findByMnameAndProductionno(mname, productionno);
	}
	@Override
	public List<Movie> getByCollections(String collections) {
		// TODO Auto-generated method stub
		return dao.findByCollections(collections);
	}
	@Override
	public List<Movie> sortByRecords() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by("mname"));
	}
	@Override
	public List<Movie> pagination() {
		// TODO Auto-generated method stub
		PageRequest pagerequest=PageRequest.of(2, 2);
		Page<Movie> page=dao.findAll(pagerequest);
		return page.getContent();
	}
	@Override
	public Movie partial(Movie movie, int m_no) {
		// TODO Auto-generated method stub
		Movie m=getById(m_no);
		m.setM_no(movie.getM_no());
		m.setMname(movie.getMname());
		m.setM_hero(movie.getM_hero());
		m.setProductionno(movie.getProductionno());
		m.setGenere(movie.getGenere());
		m.setBudget(movie.getBudget());
		m.setCollections(movie.getCollections());
		return dao.save(m);
	}
	
	
}
