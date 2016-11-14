package com.company;

public class Main {

    public static void main(String[] args) {
	    Minneapolis m = new Minneapolis();
        m.city = "minneapolis";
        m.population = 150000;
        m.stateCapital = false;

        Aldo a = new Aldo();
        a.aldo = "aldo";
        a.yearFounded = 1997;
        a.lowendBrand = true;

        Facebook f = new Facebook();
        f.username = "firstName";
        f.dateOfbirth = 01/01/15;
        f.male = true;

        IPhones i = new IPhones();
        i.iPhones = "iPhone6";
        i.year = 2016;
        i.newModel = false;

        Cars c = new Cars();
        c.model = "mercedes";
        c.year = 2016;
        c.suv = false;
    }
}
