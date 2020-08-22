package cn.first9.web.pipe.service.impl;

import cn.first9.web.pipe.dao.EpaInfoDao;
import cn.first9.web.pipe.dao.UserDao;
import cn.first9.web.pipe.service.EpaInfoService;
import cn.first9.web.pipe.service.UserService;
import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectAll(User user) {
        return userDao.selectAll(user);
    }
}
