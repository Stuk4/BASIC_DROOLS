package edu.cibertec.drools.bean;

/**
 * Created by Java-VS on 02/07/2016.
 */
public class Bonus {

    private long amount;
    private String type;

    public Bonus() {
    }

    public Bonus(long amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bonus bonus = (Bonus) o;

        if (amount != bonus.amount) return false;
        return type != null ? type.equals(bonus.type) : bonus.type == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (amount ^ (amount >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
