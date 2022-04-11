package damvc.Dto;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductsDtoMapper implements RowMapper<ProductsDto> {

	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductsDto products = new ProductsDto();
		products.setId(rs.getInt("id"));
		products.setName(rs.getString("name"));
		products.setId_type(rs.getInt("id_type"));
		products.setDescription(rs.getString("description"));
		products.setUnit_price(rs.getDouble("unit_price"));
		products.setPromotion_price(rs.getDouble("promotion_price"));
		products.setImage(rs.getString("image"));
		products.setUnit(rs.getString("unit"));
		products.setNeww(rs.getBoolean("neww"));
		products.setCreated_at(rs.getDate("created_at"));
		products.setUpdated_at(rs.getDate("updated_at"));
		return products;
	}

}
