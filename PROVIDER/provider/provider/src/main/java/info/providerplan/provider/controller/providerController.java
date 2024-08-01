package info.providerplan.provider.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.providerplan.provider.entity.providerEntity;
import info.providerplan.provider.service.PlanService;

@RestController
@RequestMapping("")
public class providerController {

    @Autowired
    private PlanService planService;
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/jio")
    public ResponseEntity<List<providerEntity>> getAllPlans() {
        try {
            List<providerEntity> plans = planService.getAllPlans();
            return new ResponseEntity<>(plans, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
