/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller;

/**
 *
 * @author coloma
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee ep2 = new Employee(570.50F,"USD",0.50F,EmployeeType.Supervisor);
        System.out.print(ep2.cs());
    }
    
}
