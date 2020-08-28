package cn.first9.web.pipe.service.impl;

import cn.first9.web.pipe.dao.VrealTimeToJhfsDao;
import cn.first9.web.pipe.service.VrealTimeToJhfsService;
import cn.first9.web.pipe.vo.DisposeInfoDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class VrealTimeToJhfsServiceImpl implements VrealTimeToJhfsService {

    @Autowired
    VrealTimeToJhfsDao vrealTimeToJhfsDao;

    @Override
    public List<DisposeInfoDB> selectAll(DisposeInfoDB disposeInfoDB) {
        return vrealTimeToJhfsDao.selectAll(disposeInfoDB);
    }
}
