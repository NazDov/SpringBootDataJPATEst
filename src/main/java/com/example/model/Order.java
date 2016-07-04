package com.example.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by nazar.dovhyy on 04.07.2016.
 */
@Entity
@Table(name = "orders", schema = "public", catalog = "testdb")
public class Order {
    private Long orderId;
    private Date orderdate;

    @Id
    @Column(name = "order_id", nullable = false)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "orderdate", nullable = true)
    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order orders = (Order) o;

        if (orderId != null ? !orderId.equals(orders.orderId) : orders.orderId != null) return false;
        if (orderdate != null ? !orderdate.equals(orders.orderdate) : orders.orderdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (orderdate != null ? orderdate.hashCode() : 0);
        return result;
    }
}
