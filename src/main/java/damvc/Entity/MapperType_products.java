package damvc.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperType_products implements RowMapper <Type_products> {

	@Override
	public Type_products mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Type_products type = new Type_products();
		type.setId(rs.getInt("id"));
		type.setName(rs.getString("name"));
		type.setDescription(rs.getString("description"));
		type.setImage(rs.getString("image"));
		return type;
	}
}
