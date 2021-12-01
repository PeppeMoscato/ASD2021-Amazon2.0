package asd.amazon.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PRODUCT_TO_BUY")
public class SoldProduct extends Product{

    @Column(name = "Quantity", nullable = false)
    private String Quantity;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;
}
