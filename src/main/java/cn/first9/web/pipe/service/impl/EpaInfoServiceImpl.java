package cn.first9.web.pipe.service.impl;

import cn.first9.web.pipe.dao.EpaInfoDao;
import cn.first9.web.pipe.service.EpaInfoService;
import cn.first9.web.pipe.vo.EpaInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EpaInfoServiceImpl implements EpaInfoService {

    @Autowired
    private EpaInfoDao epaInfoDao;

    @Override
    public List<EpaInfo> selectAll(EpaInfo info) {
        return epaInfoDao.selectAll(info);
    }
}
