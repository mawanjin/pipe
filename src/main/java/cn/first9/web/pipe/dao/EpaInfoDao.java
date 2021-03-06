package cn.first9.web.pipe.dao;

import cn.first9.web.pipe.vo.EpaInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EpaInfoDao {
    List<EpaInfo> selectAll(EpaInfo epaInfo);

    List<EpaInfo> getDeviceInfo(EpaInfo info);
}
