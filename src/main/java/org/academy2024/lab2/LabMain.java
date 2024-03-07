package org.academy2024.lab2;

import org.academy2024.Color;
import org.academy2024.DataHelper;
import org.academy2024.LinePrinter;
import org.academy2024.Transaction;

import java.util.List;

public class LabMain {

    private List<Transaction> transactions = DataHelper.loadTransactions();

    private void exercise_2_1_printTransactionsWithAmountGreaterThan5000() {
        //transactions.stream()
                //.filter(?????)
                //.forEach(????)
        LinePrinter.resetColor();
    }

    private void exercise_2_2_convertToStatementLinesAndColorize() {
        //transactions.stream()
                //.map(????)
                //.forEach(????);

        LinePrinter.resetColor();
    }

    private StatementLine transactionToStatementLine(Color color, Transaction transaction) {
        return new StatementLine(color,transaction.accountId(), transaction.date(), transaction.amount());
    }

    public static void main(String[] args) {

        LabMain lab = new LabMain();

        lab.exercise_2_1_printTransactionsWithAmountGreaterThan5000();
        //lab.exercise_2_2_convertToStatementLinesAndColorize();

    }
}