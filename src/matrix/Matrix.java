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
public class Matrix {

    protected int SIZE;
    protected int element[][];

    public Matrix() {
        SIZE = 2;
        element = new int[SIZE][SIZE];
    }

    public Matrix(int initSIZE) {
        SIZE = initSIZE;
        element = new int[SIZE][SIZE];
    }

    public void setElement(int i, int j, int val) {
        this.element[i][j] = val;
    }

    // Input all matrix's element
    public void inputElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.element[i][j] = sc.nextInt();
            }
        }
    }

    public static Matrix add(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = a.element[i][j] + b.element[i][j];
            }
        }
        return c;
    }

    public static Matrix substract(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = a.element[i][j] - b.element[i][j];
            }
        }
        return c;
    }

    public static Matrix multiplication(Matrix a, Matrix b) {
        Matrix c = new Matrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int x = 0; x < a.SIZE; x++) {
                    c.element[i][j] += a.element[i][x] * b.element[x][j];
                }
            }
        }
        return c;
    }

    // Print matrix
    @Override
    public String toString() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                System.out.print(this.element[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }

}
