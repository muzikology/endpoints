package co.za.playsafe.service;

import co.za.playsafe.domain.Amount;
import co.za.playsafe.interfaces.AmountService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AmountServiceImpl implements AmountService{

    private final org.slf4j.Logger log = LoggerFactory.getLogger(AmountServiceImpl.class);

    public float getKtoc(float kelvin){

        float ktoc = kelvin - 273.15F;
        log.info("Converted " + kelvin + " kelvin " + " to " + ktoc + " celsius");
        return ktoc;
    }


    public float getCtok(float celsius){
        float ctok =  celsius + 273.15F;
        log.info("Converted " + celsius + " celsius " + " to " + ctok + " kelvin");
        return ctok;
    }


    public double geMtok(double miles){
        final double miles_per_kilometer = 1.60934;
        double mtok =  miles* miles_per_kilometer;
        log.info("Converted " + miles + " miles " + " to " + mtok + " kilometers");
        return mtok;
    }


    public double geKtom(double kilometer) {
        final double kilometer_per_miles = 0.621;
        double ktom =  kilometer* kilometer_per_miles;
        log.info("Converted " + kilometer + " Kilometer " + " to " + ktom + " miles");
        return ktom;
    }

}
