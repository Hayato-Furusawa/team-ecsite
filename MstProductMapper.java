package jp.co.internous.gaia.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.gaia.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {
	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();

	List<MstProduct> findByProductName(@Param("keywords") String[] keywords);

	List<MstProduct> findByCategoryAndProductName(@Param("id") int category, @Param("keywords") String[] keywords);

	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(@Param("id") int id);
}