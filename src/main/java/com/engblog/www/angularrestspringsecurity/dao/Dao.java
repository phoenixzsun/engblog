package com.engblog.www.angularrestspringsecurity.dao;

import java.util.List;

import com.engblog.www.angularrestspringsecurity.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}