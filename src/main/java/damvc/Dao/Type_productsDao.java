package damvc.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import damvc.Entity.MapperType_products;
import damvc.Entity.Type_products;

@Repository
public class Type_productsDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Type_products> getDataType() {
		List<Type_products> list = new ArrayList<Type_products>();
		String sql = "SELECT * FROM type_products";
		list = _jdbcTemplate.query(sql, new MapperType_products());
		return list;
}
}
