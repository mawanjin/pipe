package cn.first9.web.pipe.vo;

import java.util.ArrayList;
import java.util.List;

public class DeviceInfoResponse {
    private String device;
    List<EpaInfo> infosIn = new ArrayList<>();
    List<EpaInfo> infosOut = new ArrayList<>();

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public List<EpaInfo> getInfosIn() {
        return infosIn;
    }

    public void setInfosIn(List<EpaInfo> infosIn) {
        this.infosIn = infosIn;
    }

    public List<EpaInfo> getInfosOut() {
        return infosOut;
    }

    public void setInfosOut(List<EpaInfo> infosOut) {
        this.infosOut = infosOut;
    }
}
