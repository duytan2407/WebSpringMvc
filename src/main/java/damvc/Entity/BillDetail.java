package damvc.Entity;

public class BillDetail {
	private long id; 
	private long id_product; 
	private int quantity; 
	private double total;
	
	
	public BillDetail() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_product() {
		return id_product;
	}
	public void setId_product(long id_product) {
		this.id_product = id_product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
}


//<form:form action="checkout" method="POST" modelAttribute="bills"
//class="form-horizontal">
//<h3>Thanh toán đơn hàng</h3>
//<div class="control-group">
//	<label class="control-label" for="inputName">Họ và tên</label>
//	<div class="controls">
//		<form:input type="text" class="span3"
//			placeholder="Nhập họ và tên" path="full_name" />
//	</div>
//</div>
//<div class="control-group">
//	<label class="control-label" for="inputEmail">E-mail</label>
//	<div class="controls">
//		<form:input type="email" class="span3" placeholder="Nhập email"
//			path="email" />
//	</div>
//</div>
//<div class="control-group">
//	<label class="control-label" for="inputPhone">SĐT</label>
//	<div class="controls">
//		<form:input type="text" class="span3"
//			placeholder="Nhập số điện thoại" path="phone" />
//	</div>
//</div>
//<div class="control-group">
//	<label class="control-label" for="inputAddress">Địa chỉ</label>
//	<div class="controls">
//		<form:input type="text" class="span3"
//			placeholder="Nhập địa chỉ" path="address" />
//	</div>
//</div>
//<div class="control-group">
//	<label class="control-label">Ghi chú<sup>*</sup></label>
//	<div class="controls">
//		<form:textarea path="note" rows="5" cols="30" />
//	</div>
//</div>
//<div class="control-group">
//	<div class="controls">
//		<input type="submit" name="submitOrder" value="Đặt hàng"
//			class="shopBtn exclusive">
//	</div>
//</div>
//</form:form>
















