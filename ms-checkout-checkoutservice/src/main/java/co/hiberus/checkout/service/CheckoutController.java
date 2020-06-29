package co.hiberus.checkout.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import co.hiberus.commons.model.OrderDTO;
import co.hiberus.commons.model.ProductDTO;

@RestController
@RequestMapping("api/checkout")
public class CheckoutController {
	/** URL of the ms-bill-billservice service */
	final String billServiceURL = "http://localhost:8082/api/bill/cost";
	/** URL of the ms-logistic-logisticservice service */
	final String createLogisticUrl = "http://localhost:8083/api/Logistic/createOrder";

	/**
	 * rest service for product checkout
	 * @param order
	 * @return message
	 */
	@PostMapping(path = "receiveOrders", produces = MediaType.APPLICATION_JSON_VALUE)
	public String setReceiveOrders(@RequestBody OrderDTO order) {
		RestTemplate restTemplate = new RestTemplate();		
		StringBuilder response = new StringBuilder();
		response.append(setOrder(restTemplate, order));
		response.append(", the  total  is: ");
		response.append(getTotalCostProducts(restTemplate, order.getListProduct()).toString());
		return response.toString();
	}

	/**
	 * method that gets the total cost of all products
	 * @param restTemplate
	 * @param listProduct
	 * @return Total cost
	 */
	public BigDecimal getTotalCostProducts(RestTemplate restTemplate, List<ProductDTO> listProduct) {
		return restTemplate.postForObject(billServiceURL, listProduct, BigDecimal.class);
	}
	/**
	 * method that creates product order
	 * @param restTemplate
	 * @param order
	 * @return message
	 */
	public String setOrder(RestTemplate restTemplate, OrderDTO order) {
		return restTemplate.postForObject(createLogisticUrl, order, String.class);
	}

}
