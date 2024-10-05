package iuh.fit.se.backend.repositories.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "product_price", schema = "productdb", catalog = "")
public class ProductPriceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "price_id")
    private int priceId;
    @Basic
    @Column(name = "product_id")
    private int productId;
    @Basic
    @Column(name = "apply_date")
    private Timestamp applyDate;
    @Basic
    @Column(name = "value")
    private double value;
    @Basic
    @Column(name = "note")
    private String note;

    public int getPriceId() {
        return priceId;
    }

    public void setPriceId(int priceId) {
        this.priceId = priceId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Timestamp getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductPriceEntity that = (ProductPriceEntity) o;

        if (priceId != that.priceId) return false;
        if (productId != that.productId) return false;
        if (Double.compare(value, that.value) != 0) return false;
        if (applyDate != null ? !applyDate.equals(that.applyDate) : that.applyDate != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = priceId;
        result = 31 * result + productId;
        result = 31 * result + (applyDate != null ? applyDate.hashCode() : 0);
        temp = Double.doubleToLongBits(value);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
