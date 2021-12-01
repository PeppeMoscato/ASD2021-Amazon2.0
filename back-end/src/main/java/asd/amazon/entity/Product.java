package asd.amazon.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ")
    @SequenceGenerator(name = "PRODUCT_SEQ", sequenceName = "seq_t_product_id", allocationSize = 1)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    //description
    @Column(name = "Description", nullable = true)
    private String description;

    //available quantity?
    @Column(name = "AvailableQuantity", nullable = false)
    private String availableQuantity;

    //price? Float or Integer?
    @Column(name = "Price", nullable = false)
    private Float price;

    //addition date? (to identify when a product was added by a seller)
    @Basic(optional = false)
    @Column(name = "ADDITION_DATE")
    private LocalDateTime additionDate;

    @ManyToOne
    @JoinColumn(name="SELLER_ID")
    private SellerAccount seller;

    @ManyToOne
    @JoinColumn(name="ORDER_ID")
    private Order order;

    //CATEGORY = ENUM?
}
