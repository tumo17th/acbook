package com.acbook.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.acbook.common.enums.ExpenseType;
import com.acbook.dao.ExpenseDao;
import com.acbook.model.Expense;

@Repository("ExpenseDaoMoc")
public class ExpenseDaoMoc implements ExpenseDao {

    @Override
    public List<Expense> find(Date from, Date to) {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(0, ExpenseType.FOOD, "朝定食", 400, new Date(), 1, new Date()));
        expenseList.add(new Expense(1, ExpenseType.FOOD, "コンビニ", 450, new Date(), 2, new Date()));
        expenseList.add(new Expense(2, ExpenseType.FOOD, "デミ玉ハンバーグ定食", 580, new Date(), 3, new Date()));
        expenseList.add(new Expense(3, ExpenseType.TRAFFIC, "通勤", 500, new Date(), 4, new Date()));
        return expenseList;
    }

    @Override
    public void create(List<Expense> expenseList) {
    }

}
