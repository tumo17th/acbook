package com.acbook.model.dao;

import java.util.List;

import com.acbook.model.Expense;

public interface ExpenseDao extends IDao {
    List<Expense> find();
}
