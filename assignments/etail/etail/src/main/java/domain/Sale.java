/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

/** Sale.java
 *  INFO 201, Lab 09
 *
 * Class defining the sale of a group of SaleItems.
 * 
 *@author Zac Seales - 6687905
 */
public class Sale {
    private Integer saleId;
    private LocalDateTime date;
    private String status;
    
    private Collection<SaleItem> items = new ArrayList();

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void addItem(SaleItem saleItem){
        items.add(saleItem);
    }
    /** Iterates the current items within this sale and returns the total price.
     * @return - the total price.
     */
    public BigDecimal getTotal(){
        Iterator<SaleItem> pIterate = items.iterator();
        BigDecimal total = new BigDecimal(0);
        while(pIterate.hasNext()){
            SaleItem s = pIterate.next();
            total.add(s.getItemTotal());
        }
        return total;
    }
    
}
