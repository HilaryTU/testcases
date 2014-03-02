/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.hilsonrestaurant.srpviolation;

import com.mycompany.hilsonrestaurant.domain.Meal;
import com.mycompany.hilsonrestaurant.domain.Order;
import java.util.Date;


public class TransactionImpl implements Transactions {

    @Override
    public Order makeOrder(Meal meal, int quantity) {
       Order order = new Order();
       order.setMeal(meal);
       order.setQuantiy(quantity + 1);
       order.setDateOfPurchace(new Date());
       return order;
    }

    @Override
    public Meal createMeal(Meal meal) {
        meal.setName("Chicken Sandwich");
        meal.setStock(100);
        meal.setPrice(20.99);
        return meal;
    }

    @Override
    public Double calculateTotal(Meal meal) {
        Double totalPrice = meal.getPrice() * meal.getQuantity();
        return totalPrice;
    }
    
}
