package ua.kostyniuk.quadratic.model;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuadraticModel)) return false;

        QuadraticModel that = (QuadraticModel) o;

        if (getId() != that.getId()) return false;
        if (Double.compare(that.getA(), getA()) != 0) return false;
        if (Double.compare(that.getB(), getB()) != 0) return false;
        if (Double.compare(that.getC(), getC()) != 0) return false;
        if (Double.compare(that.getX1(), getX1()) != 0) return false;
        return Double.compare(that.getX2(), getX2()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getId();
        temp = Double.doubleToLongBits(getA());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getC());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getX1());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getX2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}