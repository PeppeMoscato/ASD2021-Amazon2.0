package asd.amazon.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PRODUCT_TO_SELL")
public class ProductToSell extends Product{

    //available quantity? greater than 0, at least one product if you want to add it to the "store"
    @Column(name = "AvailableQuantity", nullable = false)
    private String availableQuantity;
}
