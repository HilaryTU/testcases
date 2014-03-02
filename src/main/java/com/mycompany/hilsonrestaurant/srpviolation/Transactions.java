/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.hilsonrestaurant.srpviolation;

import com.mycompany.hilsonrestaurant.domain.Meal;
import com.mycompany.hilsonrestaurant.domain.Order;
/**
 *
 * @author Hilson
 */
public interface Transactions {
    public Order makeOrder(Meal meal, int quantity);
    public Meal createMeal(Meal meal);
    public Double calculateTotal(Meal meal);
}
