package org.sid;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TodoDaoTest {

	
	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@Test
    @DisplayName("Test save todo")
    void testSave() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode saveTodo()");  
    }

	@Test
    @DisplayName("Test getTodosByUser")
    void testgetTodosByUser() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode getTodosByUser()");  
    }
	
	@Test
    @DisplayName("Test getTodoById")
    void testgetTodoById() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode getTodoById()");  
    }
	

	@Test
    @DisplayName("Test addTodo")
    void testaddTodo() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode addTodo()");  
    }
	
	@Test
    @DisplayName("Test updateTodo")
    void testupdateTodo() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode updateTodo()");  
    }
	
	
	@Test
    @DisplayName("Test deleteTodo")
    void testdeleteTodo() {
        // Setup our mock repository
        System.out.println("Test unitaire de la methode deleteTodo");  
    }

	

}
