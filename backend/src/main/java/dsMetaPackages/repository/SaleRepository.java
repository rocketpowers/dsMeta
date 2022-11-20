package dsMetaPackages.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dsMetaPackages.entities.Sale;



@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
	

}
