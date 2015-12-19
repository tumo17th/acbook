package com.acbook.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.acbook.enums.ExpenseType;
import com.acbook.model.Expense;

public class GetExpenseService {

    public List<Expense> getExpenseList(Date from, Date to) {
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(new Expense(0, ExpenseType.FOOD, "朝定食", 400, new Date(), 1));
        expenseList.add(new Expense(1, ExpenseType.FOOD, "コンビニ", 450, new Date(), 2));
        expenseList.add(new Expense(2, ExpenseType.FOOD, "デミ玉ハンバーグ定食", 580, new Date(), 3));
        expenseList.add(new Expense(3, ExpenseType.TRAFFIC, "通勤", 500, new Date(), 4));
        return expenseList;
    }
}
