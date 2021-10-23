/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
/**
 *
 * @author Ehab Elsheikh
 */
public class account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public account()
    {
        id=0;
        balance=0.0;
        annualInterestRate=0.0;
        dateCreated=new Date();
    }
    public account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
        annualInterestRate=0.0;
        dateCreated=new Date();
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate=annualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    public double getMonthlyInterest()
    {
        return balance*getMonthlyInterestRate();
    }
    public void withDraw(double withdrawBalance)
    {
        if (balance-withdrawBalance>0)
        {
            balance-=withdrawBalance;
            System.out.println("withdraw successfuled");
        }
        else
        {
           System.out.println("amount is not enough"); 
        }
        
    }
    
    public void deposit(double depositBalance)
    {
        balance+=depositBalance;
         System.out.println("deposit successfuled");
    }
}
