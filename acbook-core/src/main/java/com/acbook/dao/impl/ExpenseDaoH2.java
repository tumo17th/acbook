package com.acbook.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.acbook.common.enums.ExpenseType;
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

    /**
     * {@inheritDoc}
     * <p>Enumをうまく変換する方法がわからなかったので、ひとまずBeanPropertyRowMapperは使わず、ベタに処理を書くことにした。</p>
     */
    @Override
    public List<Expense> find(Date from, Date to) {
        // return template.query(SELECT_ALL, new BeanPropertyRowMapper<Expense>(Expense.class));
        return template.query(SELECT_ALL, new RowMapper<Expense>() {
            @Override
            public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
                Expense expense = new Expense();
                expense.setExpenseId(rs.getInt("EXPENSE_ID"));
                expense.setExpenseType(ExpenseType.getExpenseType(rs.getInt("EXPENSE_TYPE")));
                expense.setExpenseName(rs.getString("EXPENSE_NAME"));
                expense.setPrice(rs.getInt("PRICE"));
                expense.setExpenseDate(rs.getDate("EXPENSE_DATE"));
                expense.setOrd(rs.getInt("ORD"));
                expense.setPrcDate(rs.getDate("PRC_DATE"));
                return expense;
            }
        });
    }

    @Override
    public void create(List<Expense> expenseList) {
    }

    @Override
    public void delete(List<Integer> targetIdList) {
    }

    @Override
    public void update(List<Expense> expenseList) {
    }

}
