package com.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {

        List<String> brands = new ArrayList<String>();

        if (color.equals("Amber")) {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }else if(color.equals("Light")) {
            brands.add("entro");
            brands.add("Red Moose");
        }else if (color.equals("Brown")){
            brands.add("Corona");
            brands.add("poker");
        }else if(color.equals("Dark")){
            brands.add("cebada");
        }

        return brands;
    }



}
