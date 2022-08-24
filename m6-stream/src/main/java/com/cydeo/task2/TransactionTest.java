package com.cydeo.task2;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {

    public static void main(String[] args) {

        //1- Find all transactions in 2011 and sort by value

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- What are all the unique cities where the traders work?

        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all trader's names sorted alphabetically

        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(name1,name2)-> name1 + name2 + " ");


        System.out.println(result);


        //5- Are any traders based in Milan?

        boolean basedInMilan = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(basedInMilan);

        //6- Print the values of all transactions from the traders living in Cambridge

        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7 - What is the highest value of all the transactions

        Optional<Integer> high = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);

        System.out.println(high.get());

        //8-Find the transaction with the smallest value

        Optional<Transaction> smallestValue = TransactionData.getAll().stream()
                .reduce((t1,t2) -> t1.getValue()<t2.getValue()?t1:t2);

        System.out.println(smallestValue.get());

        Optional<Transaction> smValue = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));

        System.out.println(smValue.get());





    }
}
