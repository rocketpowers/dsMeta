package dsMetaPackages.services;



import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import dsMetaPackages.entities.Sale;
import dsMetaPackages.repository.SaleRepository;


@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	//public List<Sale> findSales() {
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		
		LocalDate min=LocalDate.parse(minDate);
		LocalDate max=LocalDate.parse(maxDate);
		
		return repository.findSales(min,max, pageable);
		
		
		
		
		
	}

}
