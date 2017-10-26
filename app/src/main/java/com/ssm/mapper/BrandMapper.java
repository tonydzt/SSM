package com.ssm.mapper;

import com.ssm.pojo.Brand;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @author dzt
 */
public interface BrandMapper {

    @Select("SELECT * FROM brand")
    List<Brand> getAll();

    @Select("SELECT * FROM brand WHERE brand_id = #{id}")
    Brand getOne(Long id);

    @Insert("INSERT INTO brand(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(Brand user);

    @Update("UPDATE brand SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(Brand user);

    @Delete("DELETE FROM brand WHERE id =#{id}")
    void delete(Long id);

}