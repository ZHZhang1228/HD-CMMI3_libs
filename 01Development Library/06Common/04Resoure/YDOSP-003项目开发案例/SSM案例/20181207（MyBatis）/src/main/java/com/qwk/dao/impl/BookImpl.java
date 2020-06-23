package com.qwk.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.qwk.dao.BookDaoI;
import com.qwk.entity.Book;
import com.qwk.util.MyBatisUtil;

public class BookImpl implements BookDaoI{

	public List<Book> getAllBook() {
        //获得会话对象
        SqlSession session= MyBatisUtil.getSqlSession(true); 
        try {          
            BookDaoI bookDao = session.getMapper(BookDaoI.class);
            return bookDao.getAllBook();
        } finally {
            session.close();
        }
    }
}
