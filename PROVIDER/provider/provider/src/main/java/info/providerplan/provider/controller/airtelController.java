package info.providerplan.provider.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.providerplan.provider.entity.airtelEntity;
import info.providerplan.provider.service.airtelService;



@RestController
@RequestMapping("/jio")
public class airtelController {
	@Autowired
	private airtelService AirtelService;
    @CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/airtel")
    public ResponseEntity<List<airtelEntity>> getAllPlans() {
        try {
            List<airtelEntity> airtel = AirtelService.getplans();
            return new ResponseEntity<>(airtel, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
		
}
