package com.acbook.service;

import java.util.Date;
import java.util.List;

import com.acbook.model.Expense;

public interface ExpenseService extends IService {

    /**
     * <p>Get ExpenseList</p>
     * 
     * @param from Search From Date
     * @param to Search To Date
     * @return ExpenseList
     */
    List<Expense> getExpenseList(Date from, Date to);

    /**
     * <p>Insert Expense Records.</p>
     * 
     * @param expenseList target ExpenseList
     * @return successFlg
     */
    boolean createExpenses(List<Expense> expenseList);

    /**
     * <p>Delete Expense Records.</p>
     * 
     * @param deleteIdList target ID List
     * @return successFlg
     */
    boolean deleteExpenses(List<Integer> deleteIdList);

    /**
     * <p>Update Expense Records.</p>
     * 
     * @param expenseList target ExpenseList
     * @return successFlg
     */
    boolean updateExpenses(List<Expense> expenseList);

}
