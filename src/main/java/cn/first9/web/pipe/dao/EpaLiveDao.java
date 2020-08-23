package cn.first9.web.pipe.dao;

import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.EpaLive;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EpaLiveDao {
    List<EpaLive> selectAll(EpaLive live);

}
