package com.company;
import javax.swing.*;
//end of budget class
public class FamilyBudget {
    static double income = 0;
    static double billsTotal = 0;
    static double bills[];
    static double payTotal = 0;
    static double pay[];

    public static void main(String args[]) {
        bills = new double[6];
        bills[0] = 0;//rent
        bills[1] = 0;//electric
        bills[2] = 0;//water
        bills[3] = 0;//food
        bills[4] = 0;//gas
        bills[5] = 0;//baby
        pay = new double[4];
        pay[0] = 0;
        pay[1] = 0;
        pay[2] = 0;
        pay[3] = 0;

        getExpenses (bills[0], bills[1], bills[2], bills[3], bills[4], bills[5]);

        getIncome (pay[0], pay[1], pay[2], pay[3]);

        JOptionPane.showMessageDialog (null, "*****Expenses and Budget*****\n\n" +
                "Rent:" + bills[0] + "\n" +
                "Electric: " + bills[1] + "\n" +
                "Water: " + bills[2] + "\n" +
                "Food: " + bills[3] + "\n" +
                "Gas: " + bills[4] + "\n" +
                "Total Income: " + payTotal + "\n" +
                "Total Expenses: " + billsTotal + "\n" +

                "Current Budget: " + (payTotal - billsTotal));

    }//end of main method

    public static double getExpenses(double rent, double elec, double water, double food, double gas, double baby) {

        bills[0] = rent = Integer.parseInt (JOptionPane.showInputDialog ("Enter rent ammount"));
        bills[1] = elec = Integer.parseInt (JOptionPane.showInputDialog ("Enter electric ammount"));
        bills[2] = water = Integer.parseInt (JOptionPane.showInputDialog ("Enter water ammount"));
        bills[3] = food = Integer.parseInt (JOptionPane.showInputDialog ("Enter food ammount"));
        bills[4] = gas = Integer.parseInt (JOptionPane.showInputDialog ("Enter gas ammount"));

        billsTotal = bills[0] + bills[1] + bills[2] + bills[3] + bills[4];

        return elec;
    }//end of getExpenses

    public static double getIncome(double one, double two, double three, double four) {
        pay[0] = one = Integer.parseInt (JOptionPane.showInputDialog ("Enter first check"));
        pay[1] = two = Integer.parseInt (JOptionPane.showInputDialog ("Enter second check"));
        pay[2] = three = Integer.parseInt (JOptionPane.showInputDialog ("Enter third check"));
        pay[3] = four = Integer.parseInt (JOptionPane.showInputDialog ("Enter forth check"));
        payTotal = pay[0] + pay[1] + pay[2] + pay[3];
        return one;

    }

}
