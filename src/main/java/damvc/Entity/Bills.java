package damvc.Entity;

public class Bills {
	private long id;
	private String email;
	private String phone;
	private String password;
	private String full_name;
	private String address;
	private double total;
	private int quantity;
	private String note;
	
	
	
	public Bills() {
		super();
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getFull_name() {
		return full_name;
	}



	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getNote() {
		return note;
	}



	public void setNote(String note) {
		this.note = note;
	}
	
	
}
