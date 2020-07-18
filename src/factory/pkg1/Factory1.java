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
            
        Car audi8 = new Car();
        audi8.printAttributes();
        
        audi8.setModel("Audi broj 8");
        audi8.setBuildYear(2003) ;
        audi8.setCcm (2000);
        audi8.setColor("green");
        
        //Car audi9 = new Car ( "Audi9", 2020, 3000, "silver");
        
        audi8.printAttributes();
        
        
        Car fiatPunto = new Car();
        fiatPunto.setModel("Fiat");
        fiatPunto.setBuildYear(2019);
        
        fiatPunto.printAttributes();
        
        Car lada = new Car ("Lada NIva", 1990, "green", 120, 50);
        lada.printAttributes();
        
        Car opel= new Car("Opel", 2003, "blue", 200, 1300, 7, 150000);
        opel.printAttributes();
        opel.goToTravel(200);
        opel.printAttributes();
        opel.goToTravel(400);
        opel.printAttributes();
    
        
        }

    public Factory1() {
    }
}