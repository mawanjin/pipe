package cn.first9.web.pipe.service;

import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.EpaLive;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EpaLiveService {
    List<EpaLive> selectAll(EpaLive live);
}
