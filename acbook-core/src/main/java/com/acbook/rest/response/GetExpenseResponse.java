package com.acbook.rest.response;

import java.util.ArrayList;
import java.util.List;

import com.acbook.model.Expense;

public class GetExpenseResponse extends ACBookResponse {

    private List<Expense> expenseList = new ArrayList<>();

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    public GetExpenseResponse() {
        super();
    }

    public GetExpenseResponse(Boolean sucessFlg, List<String> messages, List<Expense> expenseList) {
        super(sucessFlg, messages);
        this.expenseList = expenseList;
    }

    // Getter & Setter /////////////////////////////////////////////////////////////////////////////////////////////////
    public List<Expense> getExpenseList() {
        return expenseList;
    }
    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
