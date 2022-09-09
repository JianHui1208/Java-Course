package Project2;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xiiao
 */
public class CustomerAccount implements Serializable,Comparable<CustomerAccount>{
    private String  name;
    private int pn;
    private String id;
    private int point;
    
    public CustomerAccount(String name,int pn,String id,int point){
        this.name = name ;
        this.pn = pn;
        this.id = id;
        point = 0;
    }
    public String getName(){
        return name;
    }
    public int getPn(){
        return pn;
    }
    public String getId(){
        return id;
    }
    public int getPoint(){
        return point;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPn( int pn ) {
        this.pn = pn;
    }
    public void setPoint(int point){
        this.point = point;
    }
    public void setId( String id ) {
        this.id = id;
    }
    @Override
    public String toString(){
        String info ="Name:"+ name+" \nPhone Number:"+pn+" \nID"+id+" \nPoint"+point;
        return info;
    }

    @Override
    public int compareTo(CustomerAccount o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
