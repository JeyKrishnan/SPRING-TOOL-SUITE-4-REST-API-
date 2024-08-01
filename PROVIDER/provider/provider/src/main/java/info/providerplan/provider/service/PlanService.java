package info.providerplan.provider.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.providerplan.provider.entity.providerEntity;
import info.providerplan.provider.repository.providerRepository;

@Service
public class PlanService {

    @Autowired
    private providerRepository providerRepository;

    public List<providerEntity> getAllPlans() {
        return providerRepository.findAll();
    }
}
