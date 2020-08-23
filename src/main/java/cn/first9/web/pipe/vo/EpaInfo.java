package cn.first9.web.pipe.vo;

public class EpaInfo {
    private String TAGNAME;
    private String TAGINFO;
    private String FREQUENCY;
    private String TANKNUM;
    private String SENSORNUM;

    private String subTag;

    private String value;

    public String getTAGNAME() {
        return TAGNAME;
    }

    public void setTAGNAME(String TAGNAME) {
        this.TAGNAME = TAGNAME;
    }

    public String getTAGINFO() {
        return TAGINFO;
    }

    public void setTAGINFO(String TAGINFO) {
        this.TAGINFO = TAGINFO;
    }

    public String getFREQUENCY() {
        return FREQUENCY;
    }

    public void setFREQUENCY(String FREQUENCY) {
        this.FREQUENCY = FREQUENCY;
    }

    public String getTANKNUM() {
        return TANKNUM;
    }

    public void setTANKNUM(String TANKNUM) {
        this.TANKNUM = TANKNUM;
    }

    public String getSENSORNUM() {
        return SENSORNUM;
    }

    public void setSENSORNUM(String SENSORNUM) {
        this.SENSORNUM = SENSORNUM;
    }

    public String getSubTag() {
        return subTag;
    }

    public void setSubTag(String subTag) {
        this.subTag = subTag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
