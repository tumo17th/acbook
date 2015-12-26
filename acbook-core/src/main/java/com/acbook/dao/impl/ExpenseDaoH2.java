package com.acbook.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.acbook.dao.ExpenseDao;
import com.acbook.model.Expense;

@Repository("ExpenseDaoH2")
public class ExpenseDaoH2 implements ExpenseDao {

    private JdbcTemplate template;

    @Autowired
    public void setDataSource(DataSource ds) {
        template = new JdbcTemplate(ds);
    }

    private static final String SELECT_ALL = "SELECT * FROM expense";

    @Override
    public List<Expense> find() {
        RowMapper<Expense> mapper = new BeanPropertyRowMapper<Expense>(Expense.class);
        return template.query(SELECT_ALL, mapper);
    }

}
