package com.stone.web.mapper;
import com.stone.web.po.UserEntity;
import java.util.List;
/**
 * Desc:用户表实体mapper接口类
 *
 */
public interface UserEntityMapper {
    /**
     * 查找所有的用户信息
     *
     * @return
     */
    List<UserEntity> getAllUsers();
}
