/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;


import java.util.Calendar;


public class Fecha {

    private int day;
    private int month;
    private int year;
   
    //Constructor con los parámetros con día, mes y año.
    
    public Fecha(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    
    // Métodos set y get para los 3 atributos.
    public int getDia(){
        return this.day;
    }
    public int getMes(){
        return this.month;
    }
    public int getAnyo(){
        return this.year;
    }
    public void setDia(int day){
        this.day=day;
    }
    public void setMes(int month){
        this.month=month;
    }
    public void setAnyo(int year){
        this.year=year;
    }
    //corta(): mostrará la fecha en formato corto (02-09-2003). 
    public String corta(){
        return this.day+"-"+this.month+"-"+this.year;
    }
    
     public boolean menorQue(Fecha fecha){
        boolean lower=false;
        if (this.year < fecha.year ){
            lower=true;
        }else if (this.year  == fecha.year && this.month <fecha.month  ){
            lower=true;
        }else if ( this.year ==fecha.year && this.month == fecha.month &&  this.day < fecha.day ){ 
            lower=true;
        }else{
            lower=false;
        }
        return lower;
    }
     public boolean mayorQue(Fecha fecha){
        boolean upper=false;
        if (this.year > fecha.year){
            upper=true;
        }else if((this.year == fecha.year) && ( this.month >fecha.month ) ){
            upper=true;
        }else if((this.year == fecha.year ) && (this.month == fecha.month ) && (this.day > fecha.day )){
            upper=true;
        }else{
            upper=false;
        }
        return upper;
    }
}
