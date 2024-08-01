/**
 * 
 */
package info.providerplan.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.providerplan.provider.entity.airtelEntity;

/**
 * 
 */
@Repository
public interface airtelRepository extends JpaRepository <airtelEntity,Integer> {

}
