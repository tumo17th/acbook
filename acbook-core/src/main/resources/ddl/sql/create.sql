
CREATE TABLE IF NOT EXISTS expense (
    EXPENSE_ID INTEGER(10) AUTO_INCREMENT,
    EXPENSE_TYPE INTEGER(3),
    EXPENSE_NAME VARCHAR(100),
    PRICE INTEGER(8),
    EXPENSE_DATE DATE,
    ORD INTEGER(3),
    PRC_DATE DATE,
    PRIMARY KEY (EXPENSE_ID)
);

COMMIT;