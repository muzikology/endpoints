package co.za.playsafe.web.rest;

import co.za.playsafe.domain.Amount;
import co.za.playsafe.service.AmountServiceImpl;
import co.za.playsafe.web.rest.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/conversions")
public class AmountController {

    private final Logger log = LoggerFactory.getLogger(AmountController.class);
    private final AmountServiceImpl amountServiceImpl;

    public AmountController(AmountServiceImpl amountServiceImpl) {
        this.amountServiceImpl = amountServiceImpl;
    }

    @PostMapping("/ktoc")
    public ResponseEntity<Float> getKtoc(@Valid @RequestParam float amount) throws URISyntaxException {
        float ktoc = amountServiceImpl.getKtoc(amount);
        return new ResponseEntity<>(ktoc,  null, HttpStatus.OK);
    }

    @PostMapping("/ctok")
    public ResponseEntity<Float> getCtok(@Valid @RequestParam float amount) throws URISyntaxException  {
        float ctok = amountServiceImpl.getCtok(amount);
        return new ResponseEntity<>(ctok,  null, HttpStatus.OK);
    }

    @PostMapping("/mtok")
    public ResponseEntity<Double> getMtok(@Valid @RequestParam float amount) throws URISyntaxException {
        Double mtok = amountServiceImpl.geMtok(amount);
        return new ResponseEntity<>(mtok,  null, HttpStatus.OK);
    }

    @PostMapping("/ktom")
    public ResponseEntity<Double> getKtom(@Valid @RequestParam float amount) throws URISyntaxException {
        double ktom = amountServiceImpl.geKtom(amount);
        return new ResponseEntity<>(ktom,  null, HttpStatus.OK);
    }


}
