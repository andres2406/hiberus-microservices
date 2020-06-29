package co.hiberus.bill.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.hiberus.commons.model.ProductDTO;

@RestController
@RequestMapping("api/bill")
public class BillController {
	
	
	/**
	 * service that adds the cost of each product by the quantity
	 * @param product
	 * @return
	 */
    @PostMapping(path = "cost", produces = MediaType.APPLICATION_JSON_VALUE)
	public BigDecimal getCost(@RequestBody List<ProductDTO> product) {
    	BigDecimal cost = BigDecimal.ZERO;
    	if(product!= null && !product.isEmpty()) {
    		for (ProductDTO productDTO : product) {
    			BigDecimal total = productDTO.getCost().multiply(productDTO.getQuantity());
    			cost = cost.add(total);
			}
    	}
		return cost;
	}

}
