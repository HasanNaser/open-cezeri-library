/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cezeri.types;

import java.awt.Point;

/**
 *
 * @author BAP1
 */
public class TMatrixCell {
    public Point p=new Point();
    public double value;
    
    public String toString(){
        return "value:"+value+" indices:"+p.x+":"+p.y;
    }
    
    public void println(){
        System.out.println(this.toString());
    }
}
