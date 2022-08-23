package com.cydeo.java9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileDropWhile {

    public static void main(String[] args) {

        List<Stock> stocks = getStocks();
        System.out.println("Stocks sorted: \n" + stocks);

        //Using Filter
        List<String> stockBelow500Filter = getStocksBelowFiveHundredFilter(stocks);
        System.out.println("Filter output:" + stockBelow500Filter);

        //Using takeWhile
        List<String> stockBelow500 = getStocksBelowFiveHundred(stocks);
        System.out.println("Filter output:" + stockBelow500);

        //Using dropWhile
        List<String> stockAbove500 = getStocksAboveFiveHundred(stocks);
        System.out.println("Filter output:" + stockAbove500);
    }


    public static List<String> getStocksBelowFiveHundredFilter(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("Filter processing : " + stock))
                .filter(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
        //prints all and gives the output of <=500
    }

    public static List<String> getStocksBelowFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("takeWhile processing : " + stock))
                .takeWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)  //needs to be sorted
                .map(Stock::getName)
                .collect(Collectors.toList());
        //output until the first un-matching one
    }

    public static List<String> getStocksAboveFiveHundred(List<Stock> stocks){
        return stocks.stream()
                .peek(stock -> System.out.println("dropWhile processing : " + stock))
                .dropWhile(TakeWhileDropWhile::isStockLessThanFiveHundred)
                .map(Stock::getName)
                .collect(Collectors.toList());
        //drops all the matching ones
    }

    public static boolean isStockLessThanFiveHundred(Stock stock){
        return stock.getValue().compareTo(BigDecimal.valueOf(500))<=0;
    }

    private static List<Stock> getStocks(){

        List<Stock> stocks =  new ArrayList<>();
        stocks.add(new Stock("Apple", BigDecimal.valueOf(1000)));
        stocks.add(new Stock("Amazon", BigDecimal.valueOf(800)));
        stocks.add(new Stock("Tesla", BigDecimal.valueOf(400)));
        stocks.add(new Stock("Netflix", BigDecimal.valueOf(2000)));
        stocks.add(new Stock("Facebook", BigDecimal.valueOf(500)));
        stocks.add(new Stock("Instagram", BigDecimal.valueOf(100)));

        return stocks.stream()
                .sorted(Comparator.comparing(Stock::getValue))
                .collect(Collectors.toList());
    }
}