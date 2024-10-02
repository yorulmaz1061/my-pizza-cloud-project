package com.ozy.pizzacloud.bootstrap;

import com.ozy.pizzacloud.enums.Cheese;
import com.ozy.pizzacloud.enums.Sauce;
import com.ozy.pizzacloud.enums.Topping;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Cheese> cheeseTypeList;
    public static List<Sauce> sauceTypeList;
    public static List<Topping> toppingTypeList;

    static {

        cheeseTypeList = Arrays.asList(Cheese.values());
        sauceTypeList = Arrays.asList(Sauce.values());
        toppingTypeList = Arrays.asList(Topping.values());

    }

}
