package co.za.playsafe.interfaces;

import co.za.playsafe.domain.Amount;

import java.util.List;

public interface AmountService {

    public float getKtoc(float amount);
    public float getCtok(float amount);
    public double geMtok(double amount);
    public double geKtom(double amount);

}
