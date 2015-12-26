package com.acbook.model;

import java.util.Date;

import com.acbook.common.enums.ExpenseType;

/**
 * 出費モデル
 * @author shibata_ts
 */
public class Expense {

    /** 出費ID */
    private Integer expenseId;
    /** 出費タイプ */
    private ExpenseType expenseType;
    /** 名称 */
    private String expenseName;
    /** 価格 */
    private Integer price;
    /** 日付 */
    private Date expenseDate;
    /** 表示順 */
    private Integer ord;
    /** 更新日付 */
    private Date prcDate;

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    public Expense() {
    }

    public Expense(Integer expenseId, ExpenseType expenseType, String expenseName, Integer price, Date expenseDate,
            Integer ord, Date prcDate) {
        this.expenseId = expenseId;
        this.expenseType = expenseType;
        this.expenseName = expenseName;
        this.price = price;
        this.expenseDate = expenseDate;
        this.ord = ord;
        this.prcDate = prcDate;
    }

    // Getter & Setter /////////////////////////////////////////////////////////////////////////////////////////////////
    public Integer getExpenseId() {
        return expenseId;
    }
    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }
    public ExpenseType getExpenseType() {
        return expenseType;
    }
    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }
    public String getExpenseName() {
        return expenseName;
    }
    public void setExpenseName(String expenseName) {
        this.expenseName = expenseName;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Date getExpenseDate() {
        return expenseDate;
    }
    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }
    public Integer getOrd() {
        return ord;
    }
    public void setOrd(Integer ord) {
        this.ord = ord;
    }
    public Date getPrcDate() {
        return prcDate;
    }
    public void setPrcDate(Date prcDate) {
        this.prcDate = prcDate;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
