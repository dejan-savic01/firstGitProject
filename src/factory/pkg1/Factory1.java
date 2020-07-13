/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory.pkg1;

/**
 *
 * @author Home
 */
public class Factory1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Početak");
        
        int x=5;
        Car auto1 = new Car();
        auto1.model = "Audi";
        auto1.buildYear = 2003;
        auto1.ccm = 2000;
        
        System.out.println("Model automobila 1 je:" + auto1.model );
        
        
        int y = 29;
        Car auto2 = new Car();
        auto2.model = "Fiat";
        auto2.buildYear= 2004;
        System.out.println("Model automobila 2 je:" + auto2.model );
    }
    
}
