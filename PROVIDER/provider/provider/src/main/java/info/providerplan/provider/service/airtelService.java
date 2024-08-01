/**
 * 
 */
package info.providerplan.provider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.providerplan.provider.entity.airtelEntity;

@Service
public class airtelService {
	@Autowired
	private info.providerplan.provider.repository.airtelRepository airtelRepository;
	 
	public List<airtelEntity> getplans(){
		return airtelRepository.findAll();
	}
	
}
