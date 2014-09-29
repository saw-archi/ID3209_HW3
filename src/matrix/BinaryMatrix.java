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
public class BinaryMatrix extends Matrix {

    public BinaryMatrix() {
        super.SIZE = 2;

    }

    public BinaryMatrix(int initSIZE) {
        super(initSIZE);
    }

    @Override
    public void inputElement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for binary matrix's element: ");
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.element[i][j] = sc.nextByte();
            }
        }
    }

    public static BinaryMatrix add(BinaryMatrix a, BinaryMatrix b) {

        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = a.element[i][j] + b.element[i][j];
                if (c.element[i][j] > 1) {
                    c.element[i][j] = 1;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix substract(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = (byte) (a.element[i][j] - b.element[i][j]);
                if (c.element[i][j] < 0) {
                    c.element[i][j] = 0;
                }
            }
        }
        return c;
    }

    public static BinaryMatrix multiplication(BinaryMatrix a, BinaryMatrix b) {
        BinaryMatrix c = new BinaryMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int x = 0; x < a.SIZE; x++) {
                    c.element[i][j] += a.element[i][x] * b.element[x][j];
                    if (c.element[i][j] > 1) {
                        c.element[i][j] = 1;
                    }
                }
            }
        }
        return c;
    }

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
