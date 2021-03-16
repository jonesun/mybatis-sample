package org.jonesun.mybatis.sample.dao;

import org.apache.ibatis.annotations.Mapper;
import org.jonesun.mybatis.sample.entity.User;

import java.io.Serializable;
import java.util.List;

/**
 * 用户dao层
 *
 * @author jone.sun
 * 2021/3/16 10:51
 */
@Mapper
public interface UserDao {

    int insert(User user);

    int deleteById(Serializable id);

    int updateById(User user);

    User selectById(Serializable id);

    List<User> selectList();

}