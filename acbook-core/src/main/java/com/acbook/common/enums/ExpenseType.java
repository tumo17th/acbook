package com.acbook.common.enums;

/**
 * 出費タイプ
 * @author tumo
 */
public enum ExpenseType {

    /** 食費 */
    FOOD(10, "食費", ExpenseKind.FLOAT),
    /** 日用品 */
    COMMODITY(20, "日用品", ExpenseKind.FLOAT),
    /** 交通費 */
    TRAFFIC(30, "交通費", ExpenseKind.FLOAT),
    /** 交際費 */
    EVENT(40, "交際費", ExpenseKind.FLOAT),
    /** 特別費(ご祝儀、旅行、PC購入、など) */
    SPECIAL(50, "特別費", ExpenseKind.FLOAT),
    /** その他 */
    OTHER(99, "その他", ExpenseKind.FLOAT),

    /** 住宅費 */
    HOUSE(100, "住宅費", ExpenseKind.FIXED),
    /** 電気代 */
    ELECTRIC(110, "電気代", ExpenseKind.FIXED),
    /** ガス代 */
    GAS(120, "ガス代", ExpenseKind.FIXED),
    /** 水道代 */
    WATER(130, "水道代", ExpenseKind.FIXED),
    /** 携帯代 */
    MOBILE(140, "携帯代", ExpenseKind.FIXED),
    /** インターネット代 */
    INTERNET(150, "インターネット代", ExpenseKind.FIXED),
    /** 教育費 */
    SCHOOL(160, "教育費", ExpenseKind.FIXED),
    /** ジム */
    GYM(170, "ジム", ExpenseKind.FIXED);

    /** 出費タイプID */
    private int expenseTypeId;
    /** 出費タイプ名称 */
    private String name;
    /** 出費種別 */
    private ExpenseKind expenseKind;

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    private ExpenseType(int expenseTypeId, String name, ExpenseKind expenseKind) {
        this.expenseTypeId = expenseTypeId;
        this.name = name;
        this.expenseKind = expenseKind;
    }

    public int getExpenseTypeId() {
        return expenseTypeId;
    }
    public String getName() {
        return name;
    }
    public ExpenseKind getExpenseKind() {
        return expenseKind;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
