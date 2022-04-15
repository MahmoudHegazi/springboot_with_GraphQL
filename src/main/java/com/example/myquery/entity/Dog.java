package com.example.myquery.entity;
import javax.persistence.*;


@Entity
@Table(name="dog")
public class Dog {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "modal")
    private String modal;


    public int getId() {
        return id;
    }

    public Dog(){
    }

    public Dog(String name, String modal){
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
}
