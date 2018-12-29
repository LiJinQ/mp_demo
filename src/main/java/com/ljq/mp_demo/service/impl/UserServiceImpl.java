package com.ljq.mp_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ljq.mp_demo.entity.User;
import com.ljq.mp_demo.dao.UserMapper;
import com.ljq.mp_demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 自动生成作者信息
 * @since 2018-12-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public void CrudDemo() {
        //用户信息
        User user = new User();
        user.setName("TomCat");
        user.setAge(11);
        user.setClassId("1");
        user.setEmail("666@666.com");
        //新增用户信息
        this.save(user);
        //修改用户信息
        this.updateById(user);
        //新增或修改
        this.saveOrUpdate(user);
        //删除
        /*
        sql:
        delete t_user tu where tu.id = 1
         */
        QueryWrapper<User> removeQueryWrapper = new QueryWrapper<>();
        removeQueryWrapper.eq("id",1);
        this.remove(removeQueryWrapper);
        //查找
        /*
        sql:
        select tu.* from t_user tu where tu.id = 1
         */
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",1);
        List<User> users = this.list(queryWrapper);
        /*
        sqk:
        select tu.name,tu.age from t_user tu where tu.name like '%L%'
        order by tu.id desc
         */
        QueryWrapper<User> queryWrapper2 = new QueryWrapper<>();
        queryWrapper2.select("name","age")
                .like("name","L")
                .orderByDesc("id");
    }
}
