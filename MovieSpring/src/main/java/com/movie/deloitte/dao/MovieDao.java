package com.movie.deloitte.dao;

import org.hibernate.query.criteria.internal.CriteriaUpdateImpl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movie.deloitte.model.Movie;

@Repository
public interface MovieDao extends CrudRepository<Movie, Integer>
{

}
