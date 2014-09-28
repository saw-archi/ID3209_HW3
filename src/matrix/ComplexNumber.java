/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class ComplexNumber {

    private int rePart; // Real part
    private int imPart;// Immagination part

    public ComplexNumber() {
        this.rePart = 0;
        this.imPart = 0;
    }

    public ComplexNumber(int rePart, int imPart) {
        this.rePart = rePart;
        this.imPart = imPart;
    }

    public void setRealPart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        this.rePart = sc.nextInt();
    }

    public void setImPart() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter imaginary part: ");
        this.imPart = sc.nextInt();
    }

    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart + b.rePart;
        int im = a.imPart + b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber substract(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart - b.rePart;
        int im = a.imPart - b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber multipilcation(ComplexNumber a, ComplexNumber b) {
        int re = (a.rePart * b.rePart) - (a.imPart * b.imPart);
        int im = (a.rePart * b.imPart) + (a.imPart * b.rePart);
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    /*
     * Compare two complex number
     * return -1 if a < b
     * return 0 if a = b
     * return 1 if a > b
     */
    public static int compare(ComplexNumber a, ComplexNumber b) {
        int ans = 0;
        if (Math.abs(a.magnitude() - b.magnitude()) < 0.0000001) {
            ans = 0;
        } else if (a.magnitude() < b.magnitude()) {
            ans = -1;
        } else if (a.magnitude() > b.magnitude()) {
            ans = 1;
        }
        return ans;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(rePart, 2) + Math.pow(imPart, 2));
    }

    // Print out complex number
    @Override
    public String toString() {
        return this.rePart + "+" + this.imPart + "i";
    }
}
