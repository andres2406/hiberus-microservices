package co.hiberus.logistic.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.hiberus.commons.model.OrderDTO;

@RestController
@RequestMapping("api/Logistic")
public class LogisticController {
	
	/**
	 * service that create a product order
	 * @param order
	 * @return
	 */
	 @PostMapping(path = "createOrder", produces = MediaType.APPLICATION_JSON_VALUE)
	public String setCreateOrder(@RequestBody OrderDTO order) {
		 return "the order was successfully saved";
	}

}
