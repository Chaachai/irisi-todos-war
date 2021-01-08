package org.sid.dao;

import java.util.List;

import org.sid.bean.Todo;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoDao extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
