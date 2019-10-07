package hu.flowacademy.test.foodorder.model;

import javax.persistence.*;

@Entity
@Table(name = "foodTable")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;

    @Column
    private String name;

    @Column
    private String parts;

    @ManyToMany(mappedBy="foods")
    @OrderColumn
    private Cart[] carts;

    public Long getId() {
        return foodId;
    }

    public void setId(Long id) {
        this.foodId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }
}
