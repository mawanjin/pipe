package cn.first9.web.pipe.service;

import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> selectAll(User user);
}
