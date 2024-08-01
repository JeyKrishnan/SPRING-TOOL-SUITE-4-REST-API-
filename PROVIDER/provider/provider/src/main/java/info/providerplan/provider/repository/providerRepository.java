package info.providerplan.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import info.providerplan.provider.entity.providerEntity;

@Repository
public interface providerRepository extends JpaRepository<providerEntity, Integer> {
}
