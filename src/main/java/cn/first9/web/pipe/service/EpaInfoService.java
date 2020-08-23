package cn.first9.web.pipe.service;

import cn.first9.web.pipe.vo.EpaInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EpaInfoService {
    List<EpaInfo> selectAll(EpaInfo info);
    List<EpaInfo> getDeviceInfo(EpaInfo info);
}
