package org.sid.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.sid.bean.Todo;
import org.sid.dao.TodoDao;
import org.sid.service.facade.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoDao todoDao;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoDao.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoDao.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoDao.save(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {
		todoDao.save(new Todo(name, desc, targetDate, isDone));
	}

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoDao.findById(id);
		if (todo.isPresent()) {
			todoDao.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoDao.save(todo);
	}
}