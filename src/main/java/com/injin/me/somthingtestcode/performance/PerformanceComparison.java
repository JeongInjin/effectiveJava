package com.injin.me.somthingtestcode.performance;

import java.util.Random;

public class PerformanceComparison {
    private static final int ITERATION_COUNT = 10000000;

    public static void main(String[] args) {
        long startTimeIfElse = System.currentTimeMillis();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            MonthCheckerWithIfElse();
            resultProcess(0);
        }
        long endTimeIfElse = System.currentTimeMillis();
        System.out.println("If-else execution time: " + (endTimeIfElse - startTimeIfElse) + " milliseconds");

        long startTimeSwitch = System.currentTimeMillis();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            MonthCheckerWithSwitchCase();
            resultProcess(0);
        }
        long endTimeSwitch = System.currentTimeMillis();
        System.out.println("Switch execution time: " + (endTimeSwitch - startTimeSwitch) + " milliseconds");

        long startTimeSwitchMonthString = System.currentTimeMillis();
        for (int i = 0; i < ITERATION_COUNT; i++) {
            MonthCheckerWithSwitchCaseInOrder();
            resultProcess(0);
        }
        long endTimeSwitchMonthString = System.currentTimeMillis();
        System.out.println("endTimeSwitchMonthString time: " + (endTimeSwitch - startTimeSwitch) + " milliseconds");
    }

    private static void resultProcess(int result) {
        int x = result * result;
    }

    public static void MonthCheckerWithIfElse() {
        Random rand = new Random();
        int randomMonth = rand.nextInt(13) + 1;
        int month = -1;
        if (randomMonth == 1) {
            month = 1;
        } else if (randomMonth == 2) {
            month = 2;
        } else if (randomMonth == 3) {
            month = 3;
        } else if (randomMonth == 4) {
            month = 4;
        } else if (randomMonth == 5) {
            month = 5;
        } else if (randomMonth == 6) {
            month = 6;
        } else if (randomMonth == 7) {
            month = 7;
        } else if (randomMonth == 8) {
            month = 8;
        } else if (randomMonth == 9) {
            month = 9;
        } else if (randomMonth == 10) {
            month = 10;
        } else if (randomMonth == 11) {
            month = 11;
        } else if (randomMonth == 12) {
            month = 12;
        } else {
            month = 99;
        }
    }

    public static void MonthCheckerWithSwitchCase() {
        Random rand = new Random();
        int randomMonth = rand.nextInt(13) + 1;
        int month = -1;
        switch (randomMonth) {
            case 1:
                month = 1;
                break;
            case 2:
                month = 2;
                break;
            case 3:
                month = 3;
                break;
            case 4:
                month = 4;
                break;
            case 5:
                month = 5;
                break;
            case 6:
                month = 6;
                break;
            case 7:
                month = 7;
                break;
            case 8:
                month = 8;
                break;
            case 9:
                month = 9;
                break;
            case 10:
                month = 10;
                break;
            case 11:
                month = 11;
                break;
            case 12:
                month = 12;
                break;
            default:
                month = 99;
                break;
        }
    }

    private static void MonthCheckerWithSwitchCaseInOrder() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        Random rand = new Random();
        int randomIndex = rand.nextInt(months.length);
        String randomMonth = months[randomIndex];

        int month = -1;
        switch (randomMonth) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
        }
    }
}