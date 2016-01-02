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
     * @return success Flag
     */
    boolean createExpenses(List<Expense> expenseList);

}
