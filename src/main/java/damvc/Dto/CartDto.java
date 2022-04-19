package damvc.Dto;

public class CartDto {
	private int quanty;
	private double total;
	private ProductsDto product;

	public CartDto() {

	}

	public CartDto(int quanty, double total, ProductsDto product) {
	
		this.quanty = quanty;
		this.total = total;
		this.product = product;
	}

	public int getquanty() {
		return quanty;
	}

	public void setquanty(int quanty) {
		this.quanty = quanty;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ProductsDto getProduct() {
		return product;
	}

	public void setProduct(ProductsDto product) {
		this.product = product;
	}

}
