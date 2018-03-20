package com.zheli.appletest.shorturl.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Zhe Li on 03/18/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlMappingDaoTest {

    @Autowired
    private UrlMappingDao dao;

    private JdbcTemplate jdbcTemplate;

    private Long initialCode = 0L;

    @Test
    public void create() throws Exception {
        dao.create(initialCode);
    }

    @Test
    public void insert() throws Exception {
        String url = "http://www.baidu.com";
        Long code = dao.insert(initialCode, url);
        String u = dao.queryUrl(code);

        assertEquals(url, u);
    }

    @Test
    public void delete() throws Exception {
        long code = 1003L;
        dao.delete(code);
    }

    @Test
    public void queryUrl() throws Exception {
        Long code = 3003L;
        String url = dao.queryUrl(code);
        System.out.println(url);
    }

    @Test
    public void getTableRowNum() throws Exception {
        System.out.println(dao.getTableRowNum(initialCode));
    }
}