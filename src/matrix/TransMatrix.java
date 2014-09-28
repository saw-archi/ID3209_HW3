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
public class TransMatrix extends Matrix {

    public Matrix Transpose() {

        Matrix c = new Matrix();
        for (int i = 0; i < super.SIZE; i++) {
            for (int j = 0; j < super.SIZE; j++) {
                c.element[i][j] = this.element[j][i];
            }
        }
        return c;
    }
}
