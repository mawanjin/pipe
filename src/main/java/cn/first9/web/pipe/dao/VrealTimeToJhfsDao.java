package cn.first9.web.pipe.dao;

import cn.first9.web.pipe.vo.DisposeInfo;
import cn.first9.web.pipe.vo.DisposeInfoDB;
import cn.first9.web.pipe.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VrealTimeToJhfsDao {
    List<DisposeInfoDB> selectAll(DisposeInfoDB disposeInfoDB);
}
