package asd.amazon.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "CUSTOMER")
public class CustomerAccount extends Account{

    //a customer account has a list of Orders (history of all its orders?)
    //One Order refers to One Customer, but a Customer can store more Orders
    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<Order>();
}
