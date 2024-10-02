package com.ozy.pizzacloud.model;

import com.ozy.pizzacloud.enums.Cheese;
import com.ozy.pizzacloud.enums.Sauce;
import com.ozy.pizzacloud.enums.Topping;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class Pizza {

    private UUID id;
    private List<Cheese> cheeseList;
    private List<Sauce> sauceList;
    private List<Topping> toppingList;

}
