package cl.awakelab.spring0018.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Customer {

    @Id
    @Column(name = "customer_id", precision = 2, nullable = false)
    private int customer_id;
    private String first_name;
    private String last_name;
    private String email;
    private boolean active;

}
