INSERT INTO expense
    (EXPENSE_TYPE, EXPENSE_NAME, PRICE, EXPENSE_DATE, ORD, PRC_DATE)
 VALUES
    (10, 'パン&コーヒー', 230, {ts '2015-12-24 10:47:52.69'}, 0, {ts '2015-12-27 06:02:52.69'}),
    (10, 'コンビニ', 550, {ts '2015-12-24 11:47:52.69'}, 1, {ts '2015-12-27 06:02:52.69'}),
    (30, '広島→勝どき', 2010, {ts '2015-12-24 20:47:52.69'}, 0, {ts '2015-12-27 06:02:52.69'});

COMMIT;