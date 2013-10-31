package me.xyzlast.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ykyoon
 * Date: 10/31/13
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name = "createTime")
    private Date createTime;
}
