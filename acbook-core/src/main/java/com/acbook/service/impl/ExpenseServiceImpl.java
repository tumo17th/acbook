package com.acbook.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.acbook.common.context.ACBookContext;
import com.acbook.dao.ExpenseDao;
import com.acbook.model.Expense;
import com.acbook.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private ExpenseDao expenseDao;

    @Override
    public void initialize() {
        expenseDao = (ExpenseDao)ACBookContext.getDao(ExpenseDao.class);
    }

    @Override
    public List<Expense> getExpenseList(Date from, Date to) {
        return expenseDao.find(from, to);
    }

    @Override
    public boolean createExpenses(List<Expense> expenseList) {
        return false;
    }

    @Override
    public boolean deleteExpenses(List<Integer> deleteIdList) {
        return false;
    }

}
