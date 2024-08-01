package info.providerplan.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import info.providerplan.provider.entity.bsnlEntity;



@Repository
public interface bsnlRepository extends JpaRepository <bsnlEntity,Integer>{

}
