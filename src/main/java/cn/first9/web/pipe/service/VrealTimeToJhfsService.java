package cn.first9.web.pipe.service;

import cn.first9.web.pipe.vo.DisposeInfo;
import cn.first9.web.pipe.vo.DisposeInfoDB;
import cn.first9.web.pipe.vo.EpaLive;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VrealTimeToJhfsService {
    List<DisposeInfoDB> selectAll(DisposeInfoDB disposeInfoDB);
}
