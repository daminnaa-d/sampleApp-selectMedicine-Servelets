package com.sample;

import com.sample.model.MedicineType;

import java.util.ArrayList;
import java.util.List;


public class MedicineService {

    public List getAvailableBrands(MedicineType type){

        List brands = new ArrayList();

        if(type.equals(MedicineType.Liquid)){
            brands.add("Nobel");
            brands.add(("Dolce-Pharm"));

        }else if(type.equals(MedicineType.Tablets)){
            brands.add("MedPlus");
            brands.add("Amanat");

        }else if(type.equals(MedicineType.Capsules)){
            brands.add("21thCentury");

        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}
