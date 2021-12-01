package asd.amazon.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "ORDER")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_ID")
    private CustomerAccount customer;

    @Basic(optional = false)
    @Column(name = "DATE")
    private LocalDateTime creationDate;

    //an order has a list of products and a product can refers or not to just one order?
    @OneToMany(mappedBy = "order")
    private List<Product> products = new ArrayList<Product>();

    //total price as an aggregate attribute (sum all product.price)
}
