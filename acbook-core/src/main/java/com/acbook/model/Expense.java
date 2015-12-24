package com.acbook.model;

import java.util.Date;

import com.acbook.common.enums.ExpenseType;

/**
 * 出費モデル
 * @author shibata_ts
 */
public class Expense {

    /** 出費ID */
    private Integer id;
    /** 出費タイプ */
    private ExpenseType expenseType;
    /** 名称 */
    private String name;
    /** 価格 */
    private Integer price;
    /** 日付 */
    private Date date;
    /** 表示順 */
    private Integer ord;

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    public Expense() {
    }

    public Expense(Integer id, ExpenseType expenseType, String name, Integer price, Date date, Integer ord) {
        this.id = id;
        this.expenseType = expenseType;
        this.name = name;
        this.price = price;
        this.date = date;
        this.ord = ord;
    }

    // Getter & Setter /////////////////////////////////////////////////////////////////////////////////////////////////
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
    public Integer getOrd() {
        return ord;
    }
    public void setOrd(Integer ord) {
        this.ord = ord;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
