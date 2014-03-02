/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.hilsonrestaurant.domain;

import java.util.Date;

/**
 *
 * @author Lungelo
 */
public class Order {
    Meal meal;
    int quantiy;
    Date dateOfPurchace;

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public Date getDateOfPurchace() {
        return dateOfPurchace;
    }

    public void setDateOfPurchace(Date dateOfPurchace) {
        this.dateOfPurchace = dateOfPurchace;
    }
    
    
    
}
