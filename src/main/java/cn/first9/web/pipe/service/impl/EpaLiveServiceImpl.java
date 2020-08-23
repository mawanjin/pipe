package cn.first9.web.pipe.service.impl;

import cn.first9.web.pipe.dao.EpaInfoDao;
import cn.first9.web.pipe.dao.EpaLiveDao;
import cn.first9.web.pipe.service.EpaInfoService;
import cn.first9.web.pipe.service.EpaLiveService;
import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.EpaLive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EpaLiveServiceImpl implements EpaLiveService {

    @Autowired
    private EpaLiveDao epaLiveDao;



    @Override
    public List<EpaLive> selectAll(EpaLive live) {
        return epaLiveDao.selectAll(live);
    }
}
