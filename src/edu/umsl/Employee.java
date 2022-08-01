/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.io.Serializable;

/**
 *
 * @author 16366
 */
public class Employee implements Serializable {

    private int ID;
    private String Fname;
    private String Lname;
    private float rate = 30.0f;
    private float taxrate = 0.2f;
    private int hours = 45;
    private float gross = 0.0f;
    private float tax = 0.0f;
    private float net = 0.0f;
    private float net_percent = 0.0f;

    public Employee(int ID, String Fname, String Lname, float rate, float taxtrate, int hours) {
        this.ID = ID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.rate = rate;
        this.taxrate = taxrate;
        this.hours = hours;
    }

    public Employee(int ID, String Fname, String Lname) {
        this(ID, Fname, Lname, 30f, 0.2f, 40);
    }

    public Employee() {
        ID++;
    }

    /**
     * ******************
     *
     * Methods Calculate Gross Pay Calculate Tax Calculate Net Pay Calculate Net
     * Percent Display Employee (You can make this method calculate all before
     * displaying) Go Back or Exit
     *
     *******************
     */
    
    public float computeGross() {
        if (hours >= 0 && hours <= 40) {
            this.gross = this.hours * this.rate;
        }
        if (hours > 40) {
            this.gross = 40 * this.rate + (float) ((this.hours - 40) * this.rate * 1.5);
        }
        return gross;
    }

    protected float computeTax() {
        this.tax = this.gross * this.taxrate;
        return tax;
    }

    protected float computeNet() {
        this.net = this.gross - this.tax;
        return net;
    }

    protected float computeNetperc() {
        this.net_percent = this.net / this.gross;
        return net_percent;
    }

    protected void displayEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee First Name: " + Fname);
        System.out.println("Employee Last Name: " + Lname);
        System.out.println("Employee rate: " + rate);
        System.out.println("Employee tax rate: " + taxrate);
        System.out.println("Employee hours: " + hours);
        System.out.println("Employee gross: " + computeGross());
        System.out.println("Employee tax: " + computeTax());
        System.out.println("Employee net: " + computeNet());
        System.out.println("Employee net percent: " + computeNetperc());
    }

    public int getID() {
        return ID;
    }

    public void setID(int aID) {
        ID = aID;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(float taxrate) {
        this.taxrate = taxrate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getGross() {
        return gross;
    }

    public float getTax() {
        return tax;
    }

    public float getNet() {
        return net;
    }

    public float getNet_percent() {
        return net_percent;
    }
}
