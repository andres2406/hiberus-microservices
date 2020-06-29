package co.hiberus.commons.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderDTO {

	private ClientDTO clientId;
	private Date date;
	private String direction;
	private List<ProductDTO> listProduct;

	public ClientDTO getClientId() {
		return clientId;
	}

	public void setClientId(ClientDTO clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<ProductDTO> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<ProductDTO> listProduct) {
		this.listProduct = listProduct;
	}

	@Override
	public String toString() {
		return "OrderDTO [clientId=" + clientId + ", date=" + date + ", direction=" + direction + ", listProduct="
				+ listProduct + "]";
	}

}
