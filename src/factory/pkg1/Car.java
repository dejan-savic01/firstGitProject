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
public class Car {
    
     
   private String model;
   private int buildYear;
   private String color  ;
   private int maxSpeed;
   private int ccm;
   private int consumption;
   private int Mileage;
   
    public Car() {
       this.model = "undefined";
       this.buildYear = -1;
       this.color = "undefined";
       this.maxSpeed = -1;
       this.ccm = -1;
       this.consumption = 0;
       this.Mileage = 0;
    
     }
    
       public Car (String customModel, int customBuildYear, String customColor , int customMaxSpeed, int customCcm){
       
       this.model = customModel;
       this.buildYear = customBuildYear;
       this.color = customColor;
       this.maxSpeed = customMaxSpeed;
       this.ccm = customCcm;
       
       
       
       
       
   }

    public Car(String model, int buildYear, String color,int maxSpeed, int ccm, int consumption, int Mileage) {
        this.model = model;
        this.buildYear = buildYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.ccm = ccm;
        this.consumption = consumption;
        this.Mileage = 0;
    }

    
    
    public String getModel(){
        return this.model;
    
    }
    
    public void setModel(String customModel) {
        this.model= customModel;
    }
    
    public int getBuildYear(){
         return this.buildYear;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    public void setBuildYear(int customBuildYear) {
         this.buildYear = customBuildYear;   
        } 
        public int getMileage() {
        return Mileage;
    }

    public void setMileage(int Mileage) {
        this.Mileage = Mileage;
    }

    public void printAttributes() {
           System.out.println("Model: " + this.getModel());
           System.out.println("Godina proizvodnje: " + this.getBuildYear());
           System.out.println("Ccm: " + this.getCcm());
           System.out.println("Boja: " + this.getColor());
           System.out.println("Potrošnja: " + this.getConsumption());
           System.out.println("Kilometraža: " + this.getMileage());
           System.out.println("Maksimalna brzina: " + this.getMaxSpeed());
           System.out.println();
              
        }


    
        
        public void goToTravel(int distance){
             this.setMileage(this.getMileage() + distance);
        }
    
    }
    
    
        
    
    
 
         
