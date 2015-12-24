package com.acbook.common.enums;

public enum ExpenseKind {

    /** 変動費 */
    FLOAT(0, "変動費"),

    /** 固定費 */
    FIXED(1, "固定費");

    /** 出費種別ID */
    private int expenseKindId;

    /** 出費種別名称 */
    private String name;

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    private ExpenseKind(int expenseKindId, String name) {
        this.expenseKindId = expenseKindId;
        this.name = name;
    }

    public int getExpenseKindId() {
        return expenseKindId;
    }
    public String getName() {
        return name;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
