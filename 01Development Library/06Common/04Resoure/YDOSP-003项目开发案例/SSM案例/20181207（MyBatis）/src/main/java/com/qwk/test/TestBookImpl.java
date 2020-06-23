package com.qwk.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qwk.dao.BookDaoI;
import com.qwk.dao.impl.BookImpl;
import com.qwk.entity.Book;

public class TestBookImpl {

	static BookDaoI bookDao;

    @BeforeClass
    public static void beforeClass() {
        bookDao = new BookImpl();
    }

    @Test
    public void testGetAllBookTypes(){
        List<Book> books = bookDao.getAllBook();
        for(Book book:books){
            System.out.println(book.getBookName());
        }
        assertNotNull(books);
    }
    /*
    public static void main(String[] args) {
    	List<Book> books = bookDao.getAllBook();
    	System.out.println("1234567890");
    	/*
        for(Book book:books){            
            System.out.println(book.getBookName());
        }
    	
    }*/
}
