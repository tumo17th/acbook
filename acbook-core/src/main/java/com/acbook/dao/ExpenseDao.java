package com.acbook.dao;

import java.util.Date;
import java.util.List;

import com.acbook.model.Expense;

public interface ExpenseDao extends IDao {

    /**
     * <p>Get Expense models</p>
     * 
     * @param from Search From Date
     * @param to Search To Date
     * @return ExpenseList
     */
    List<Expense> find(Date from, Date to);

    /**
     * <p>Insert new Expense records</p>
     * 
     * @param expenseList target ExpenseList
     */
    void create(List<Expense> expenseList);

    /**
     * <p>Delete Expense records.</p>
     * 
     * @param targetIdList target ID List
     */
    void delete(List<Integer> targetIdList);

    /**
     * <p>Update Expense info.</p>
     * 
     * @param expenseList target ExpenseList
     */
    void update(List<Expense> expenseList);

}
