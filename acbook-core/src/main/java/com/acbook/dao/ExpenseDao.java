package com.acbook.dao;

import java.util.Date;
import java.util.List;

import com.acbook.model.Expense;

public interface ExpenseDao extends IDao {

    /**
     * <p>Get ExpenseModel List</p>
     * 
     * @param from Search From Date
     * @param to Search To Date
     * @return ExpenseList
     */
    List<Expense> find(Date from, Date to);

    /**
     * <p>Insert ExpenseList Records</p>
     * 
     * @param expenseList target ExpenseList
     */
    void create(List<Expense> expenseList);
}
