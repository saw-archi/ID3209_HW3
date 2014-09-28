/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author Administrator
 */
public class ComplexMatrix extends Matrix {

    protected ComplexNumber element[][];

    public ComplexMatrix() {
        this.element = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.element[i][j] = new ComplexNumber();
            }
        }
    }

    public ComplexMatrix(int initSIZE) {
        super(initSIZE);
        this.element = new ComplexNumber[super.SIZE][super.SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                this.element[i][j] = new ComplexNumber();
            }
        }
    }

    public static ComplexMatrix add(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = ComplexNumber.add(a.element[i][j], b.element[i][j]);
            }
        }
        return c;
    }

    public static ComplexMatrix substract(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                c.element[i][j] = ComplexNumber.substract(a.element[i][j], b.element[i][j]);
            }
        }
        return c;
    }

    public static ComplexMatrix multiplication(ComplexMatrix a, ComplexMatrix b) {
        ComplexMatrix c = new ComplexMatrix();
        for (int i = 0; i < a.SIZE; i++) {
            for (int j = 0; j < a.SIZE; j++) {
                for (int x = 0; x < a.SIZE; x++) {
                    c.element[i][j] = ComplexNumber.add(c.element[i][j], ComplexNumber.multipilcation(a.element[i][x], b.element[x][j]));
                }
            }
        }
        return c;
    }
}
