package damvc.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import damvc.Dto.ProductsDto;
import damvc.Dto.ProductsDtoMapper;

@Repository
public class ProductsDao extends BaseDao {

	private String sqlString() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT p.id as id ");
		sql.append(",p.name ");
		sql.append(",p.id_type ");
		sql.append(",p.description ");
		sql.append(",p.unit_price ");
		sql.append(",p.promotion_price ");
		sql.append(",p.image ");
		sql.append(",p.unit ");
		sql.append(",p.neww ");
		sql.append(",p.created_at ");
		sql.append(",P.updated_at ");
		sql.append("FROM products AS p");
		return sql.toString();
	}

	public List<ProductsDto> getDataProducts() {
		String sql = sqlString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}
}
