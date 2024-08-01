package info.providerplan.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.providerplan.provider.entity.bsnlEntity;



@Service
public class bsnlService {
	@Autowired
	private info.providerplan.provider.repository.bsnlRepository bsnlrepository;
	public List<bsnlEntity> getplans(){
		return bsnlrepository.findAll();
	}
	
	
}
