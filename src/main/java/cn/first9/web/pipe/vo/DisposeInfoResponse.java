package cn.first9.web.pipe.vo;

import java.util.ArrayList;
import java.util.List;

public class DisposeInfoResponse {
    List<DisposeInfo> data = new ArrayList<>();

    public List<DisposeInfo> getData() {
        return data;
    }

    public void setData(List<DisposeInfo> data) {
        this.data = data;
    }
}
