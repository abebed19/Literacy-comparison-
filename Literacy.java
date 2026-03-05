/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class Literacy {
    private String country;
    private String gender;
    private int year;
    private double literacy;
    
    public Literacy(String country,String gender, int year, double literacy){
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.literacy = literacy;
        
    }
    public String getCountry(){
        return this.country;
    }
    public String getGender(){
        return this.gender;
    }
    public int getYear(){
        return this.year;
    }
    public double getLiteracy(){
        return this.literacy;
    }
    
}
