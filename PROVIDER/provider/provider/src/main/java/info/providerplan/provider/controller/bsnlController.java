package info.providerplan.provider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import info.providerplan.provider.entity.airtelEntity;
import info.providerplan.provider.entity.bsnlEntity;
import info.providerplan.provider.service.bsnlService;

@RestController
@RequestMapping("/jio/airtel")
public class bsnlController {
	@Autowired
	private bsnlService bsnlService;
    @CrossOrigin(origins = "http://127.0.0.1:5500")

	@GetMapping("/bsnl")
	public ResponseEntity<List<bsnlEntity>>getplans(){
        try {
            List<bsnlEntity> bsnl = bsnlService.getplans();
            return new ResponseEntity<>(bsnl, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
