package ua.kostyniuk.quadratic.model;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="QUADRATIC")
public class QuadraticModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "A")
    @NotNull
    private double a;
    @Column(name = "B")
    @NotNull
    private double b;
    @Column(name = "C")
    @NotNull
    private double c;
    @Column(name = "X1")
    private double x1;
    @Column(name = "X2")
    private double x2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "Quadratic [id=" + id + ", a=" + a + ", b="
                + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2 +"]";
    }
}