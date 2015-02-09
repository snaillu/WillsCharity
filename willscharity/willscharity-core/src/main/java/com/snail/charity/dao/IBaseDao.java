package com.snail.charity.dao;

import java.io.Serializable;
import java.util.Collection;

public interface IBaseDao<T> extends Serializable {
	//http://www.open-open.com/lib/view/open1341672480729.html
	//save entity not sure is the entity exist
	public T save(T t);
	public Collection<T> save(Collection<T> ts);
	
	//persist entity the entity is not exist
	public T persist(T t);
	public Collection<T> persist(Collection<T> ts);
	
	//if entity in db, get the entity
	public T merge(T t);
	public Collection<T> merge(Collection<T> ts);
	
	//remove entity
	public void remove(T t);
	public void remove(Collection<T> ts);
	public void remove(Class<T> clazz,String id);
}
