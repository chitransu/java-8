package com.learn.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate "+localDate);
        LocalDate localDate1 = LocalDate.of(2020,6,1);
        System.out.println("localDate1 "+localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018,365);
        System.out.println("localDate2 "+localDate2);

        LocalDate localDate3 = LocalDate.ofYearDay(2020,1);
        System.out.println("localDate3 "+localDate3);
        /**
         * get values from localDate
         */
        System.out.println("getMonth "+localDate1.getMonth());
        System.out.println("getMonthValue "+localDate1.getMonthValue());
        System.out.println("getDayOfWeek "+localDate1.getDayOfWeek());
        System.out.println("getDayOfYear "+localDate1.getDayOfYear());

        /**
         * Modifying Local Date
         * 28 + 1 year + 7 days - 3 month
         */
        System.out.println("Delivery data "+localDate1.plusWeeks(40));
        System.out.println("Delivery data "+localDate1.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("Next day "+localDate.plus(1,ChronoUnit.DAYS));
        System.out.println("Next month "+localDate.plus(1,ChronoUnit.MONTHS));
        System.out.println("previous day "+localDate.minus(1,ChronoUnit.DAYS));
        System.out.println("previous month "+localDate.minus(1,ChronoUnit.MONTHS));

        /**
         * Additional support method
         */

        System.out.println("leap Year "+LocalDate.ofYearDay(2020,01).isLeapYear());
        System.out.println("isEqual "+localDate.equals(localDate1));
        System.out.println("isBefore "+localDate.isBefore(localDate1));
        System.out.println("isAfter "+localDate.isAfter(localDate1));
    }
}
