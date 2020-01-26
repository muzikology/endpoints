package co.za.playsafe.domain;

import java.io.Serializable;

public class Amount implements Serializable {

    private static final long serialVersionUID = 1L;
    Long id;

    private float amount;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

}
