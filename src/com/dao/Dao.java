package com.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.connectionutil.ConnectionUtil;
import com.model.Model;

public class Dao {
	private JdbcTemplate jdbcTemplate= ConnectionUtil.getJdbcTemplate();
 	
 	
	 public List<Model> findAll(){
	 		String sql = "SELECT * FROM BOOK";
	 
	 		List<Model> books  = jdbcTemplate.query(sql,
	 				new BeanPropertyRowMapper(Model.class));
	 
	 		return books;  
	 	}
	 	
	 	/*public int findTotalBook(){
	 
	 		String sql = "SELECT COUNT(*) FROM BOOK";
	 
	 		int total = jdbcTemplate.queryForInt(sql);
	               
	 		return 0;
	 	}*/
	 	
	 	public void saveOrUpdate(Model model) {
	 	    if (model.getBook_id() < 0) {
	 	        // update
	 	        String sql = "UPDATE book SET book_id=?, book_name=?, author=?, "
	 	                    + " WHERE book_id=?";
	 	        jdbcTemplate.update(sql, model.getBook_id(), model.getBook_name(),
	 	                model.getAuthor(),model.getBook_id());
	     } else {
	 	        // insert
	 	        String sql = "INSERT INTO book (book_id,book_name,author)"
	 	                    + " VALUES (?, ?, ?)";
	 	        jdbcTemplate.update(sql, model.getBook_id(), model.getBook_name(),
	                 model.getAuthor());
	 	    }
	 	 
	 	}
	 	
	 	public void delete(int book_id) {
	 	    String sql = "DELETE FROM book WHERE book_id=?";
	 	    jdbcTemplate.update(sql, book_id);
	 	    
	 	    System.out.println("Successfully deleted");
	 	}
}
