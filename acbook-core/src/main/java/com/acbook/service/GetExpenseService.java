package com.acbook.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acbook.model.Expense;
import com.acbook.model.dao.ExpenseDao;
import com.acbook.model.dao.impl.ExpenseDaoMoc;

@Service
public class GetExpenseService {

    private ExpenseDao expenseDao;

    public List<Expense> getExpenseList(Date from, Date to) {
        expenseDao = new ExpenseDaoMoc();
        return expenseDao.find();
    }
}
