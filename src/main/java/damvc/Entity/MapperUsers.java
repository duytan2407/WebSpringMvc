package damvc.Entity;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users>{
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException{
		Users user = new Users();
		user.setId(rs.getInt("id"));
		user.setFull_name(rs.getString("full_name"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setPhone(rs.getString("phone"));
		user.setAddress(rs.getString("address"));
		user.setRemember_token(rs.getString("remember_token"));
		user.setCreated_at(rs.getDate("created_at"));
		user.setUpdated_at(rs.getDate("updated_at"));
		return user;
	}
}
