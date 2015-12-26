package com.acbook.service;

import java.util.Date;
import java.util.List;

import com.acbook.model.Expense;

public interface ExpenseService extends IService {

    /**
     * Get ExpenseList
     * @param from Search From Date
     * @param to Search To Date
     * @return ExpenseList
     */
    List<Expense> getExpenseList(Date from, Date to);

}
