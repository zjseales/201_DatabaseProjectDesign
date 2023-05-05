/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/** SaleItem.java
 *  INFO 201, Lab 09
 * 
 *  Class representing the sale of an individual item.
 *@author Zac Seales - 6687905
 */
public class SaleItem {
    
    private BigDecimal quantityPurchased;
    private BigDecimal salePrice;
    
    public BigDecimal getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(BigDecimal quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
    
    public BigDecimal getItemTotal(){
        return quantityPurchased.multiply(salePrice);
    }
    
}
