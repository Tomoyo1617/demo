package com.example.demotest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demotest.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author Tomoyo
 * @version V1.0
 * @Package com.example.demotest.mapper
 * @date 2022/5/28 15:48
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
