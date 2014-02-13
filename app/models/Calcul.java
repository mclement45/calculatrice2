package models;

import java.util.*;
import java.lang.Math;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class Calcul {
    @Required
    public double nb1;
    public double nb2;
    public char op;
    public Calcul() {}
    public Calcul(double x, double y) {
		this.nb1 = x;
		this.nb2 = y;
    }
	
	/**
    public Calcul(double x) {
        this.nb1 = x;
    }
	*/
	
    public double addition(){
		double res;
		res=nb1+nb2;
		return res;
    }
    
    public double soustraction(){
		double res;
		res=nb1-nb2;
		return res;
    }

    public double multiplication(){
        double res;
        res=nb1*nb2;
        return res;
    }

    public double division(){
        double res;
        res=nb1/nb2;
        return res;
    }
    
    public double carre(){
        double res;
        res=nb1*nb1;
        return res;
    }
    
    public double racine(){
        double res;
        res=Math.sqrt(nb1);
        return res;
    }
}
