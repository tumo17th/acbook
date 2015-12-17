package com.acbook.model;

import java.util.Date;

import com.acbook.enums.ExpenseType;

/**
 * 出費モデル
 * @author shibata_ts
 */
public class Expense {

	private Integer id;
	private ExpenseType expenseType;
	private String name;
	private Integer price;
	private Date date;

	public Expense() {
	}

	public Expense(Integer id, ExpenseType expenseType, String name, Integer price, Date date) {
		super();
		this.id = id;
		this.expenseType = expenseType;
		this.name = name;
		this.price = price;
		this.date = date;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ExpenseType getExpenseType() {
		return expenseType;
	}
	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
