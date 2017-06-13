package com.testbookdao;

import com.dao.Dao;
import com.model.Model;

public class TestBookDao {
	public static void main(String[] args)
	{
	 Dao book= new Dao();
	Model cc= new Model();
		cc.setBook_id(26);
		cc.setBook_name("you can win");
		cc.setAuthor("shivkhera");
		book.saveOrUpdate(cc);
	book.delete(25);
	}
}
