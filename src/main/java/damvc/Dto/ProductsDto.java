package damvc.Dto;
import java.sql.Date;
public class ProductsDto {
	private int id; 
	private String name;
	private int id_type;
	private String description;
	private Double unit_price;
	private Double promotion_price;
	private String image;
	private String unit;
	private boolean neww ;
	private Date created_at;
	private Date updated_at;
	
	public ProductsDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_type() {
		return id_type;
	}
	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(Double unit_price) {
		this.unit_price = unit_price;
	}
	public Double getPromotion_price() {
		return promotion_price;
	}
	public void setPromotion_price(Double promotion_price) {
		this.promotion_price = promotion_price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public boolean isNeww() {
		return neww;
	}
	public void setNeww(boolean neww) {
		this.neww = neww;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
