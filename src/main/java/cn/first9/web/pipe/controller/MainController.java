package cn.first9.web.pipe.controller;

import cn.first9.web.pipe.service.EpaInfoService;
import cn.first9.web.pipe.service.EpaLiveService;
import cn.first9.web.pipe.service.UserService;
import cn.first9.web.pipe.service.VrealTimeToJhfsService;
import cn.first9.web.pipe.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MainController {

    @Autowired
    EpaInfoService epaInfoService;

    @Autowired
    EpaLiveService epaLiveService;

    @Autowired
    UserService userService;

    @Autowired
    VrealTimeToJhfsService vrealTimeToJhfsService;

    /**
     *
     * @return
     */
    @RequestMapping("")
    @ResponseBody
    public TestVO test(){
        TestVO t = new TestVO();
        t.setName("欢迎");
        return t;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/getDeviceInfo")
    @ResponseBody
    public List<DeviceInfoResponse> getDevice(){

        List<DeviceInfoResponse> rs = new ArrayList<>();

        List<String> tags = new ArrayList<>();
        tags.add("12#脱硫脱硝系统");
        tags.add("34#脱硫脱硝系统");
        tags.add("56#脱硫脱硝系统");
        tags.add("7#脱硫脱硝系统");
        tags.add("8#脱硫脱硝系统");

        List<String> subTags = new ArrayList<>();
        subTags.add("氧浓度");
        subTags.add("NOX浓度");
        subTags.add("SO2浓度");
        subTags.add("颗粒物浓度");

//        String[] types = new String[]{"进口","出口"};

        tags.forEach(tag->{
            DeviceInfoResponse item = new DeviceInfoResponse();

            item.setDevice(tag);

            subTags.forEach(st->{

                //进口
                String tagName = tag+st+"进口";
                EpaInfo info = new EpaInfo();
                info.setTAGINFO(tagName);
                List<EpaInfo> infos = epaInfoService.getDeviceInfo(info);
                if(infos!=null && infos.size()>0){
                    info = infos.get(0);

                    EpaLive live = new EpaLive();
                    live.setTagName(info.getTAGNAME());
                    List<EpaLive> lives = epaLiveService.selectAll(live);
                    if(lives!=null&&lives.size()>0){
                        EpaLive l = lives.get(0);
                        info.setValue(l.getValue());
                    }

                }

                info.setSubTag(st);
                item.getInfosIn().add(info);

                //出口
                tagName = tag+st+"出口";
                info = new EpaInfo();
                info.setTAGINFO(tagName);
                infos = epaInfoService.getDeviceInfo(info);
                if(infos!=null && infos.size()>0){
                    info = infos.get(0);
                    EpaLive live = new EpaLive();
                    live.setTagName(info.getTAGNAME());
                    List<EpaLive> lives = epaLiveService.selectAll(live);
                    if(lives!=null&&lives.size()>0){
                        EpaLive l = lives.get(0);
                        info.setValue(l.getValue());
                    }
                }

                info.setSubTag(st);
                item.getInfosOut().add(info);


            });

            rs.add(item);


        });

        return rs;

    }

    /**
     *
     * @return
     */
    @RequestMapping("/getDeviceInfoByTagName")
    @ResponseBody
    public List<DeviceInfoResponse> getDevice(String deviceTags){

        List<DeviceInfoResponse> rs = new ArrayList<>();

        List<String> tags = new ArrayList<>();
        if(deviceTags.contains(",")){

            String[] ts =  deviceTags.split(",");
            for (String t:ts){
                tags.add(t);
            }

        }else {
            tags.add(deviceTags);
        }


        List<String> subTags = new ArrayList<>();
        subTags.add("氧浓度");
        subTags.add("NOX浓度");
        subTags.add("SO2浓度");
        subTags.add("颗粒物浓度");

//        String[] types = new String[]{"进口","出口"};

        tags.forEach(tag->{
            DeviceInfoResponse item = new DeviceInfoResponse();

            item.setDevice(tag);

            subTags.forEach(st->{

                //进口
                String tagName = tag+st+"进口";
                EpaInfo info = new EpaInfo();
//                info.setTAGINFO(tagName);
                List<EpaInfo> infos = epaInfoService.getDeviceInfo(info);
                if(infos!=null && infos.size()>0){
                    info = infos.get(0);

                    EpaLive live = new EpaLive();
                    live.setTagName(info.getTAGNAME());
                    List<EpaLive> lives = epaLiveService.selectAll(live);
                    if(lives!=null&&lives.size()>0){
                        EpaLive l = lives.get(0);
                        info.setValue(l.getValue());
                    }

                }

                info.setSubTag(st);
                item.getInfosIn().add(info);

                //出口
                tagName = tag+st+"出口";
                info = new EpaInfo();
//                info.setTAGINFO(tagName);
                infos = epaInfoService.getDeviceInfo(info);
                if(infos!=null && infos.size()>0){
                    info = infos.get(0);
                    EpaLive live = new EpaLive();
                    live.setTagName(info.getTAGNAME());
                    List<EpaLive> lives = epaLiveService.selectAll(live);
                    if(lives!=null&&lives.size()>0){
                        EpaLive l = lives.get(0);
                        info.setValue(l.getValue());
                    }
                }

                info.setSubTag(st);
                item.getInfosOut().add(info);


            });

            rs.add(item);


        });

        return rs;

    }

    /**
     *
     * @return
     */
    @RequestMapping("/userList")
    @ResponseBody
    public List<User> userList(){
        return userService.selectAll(null);
    }


    @RequestMapping("/getDispose")
    @ResponseBody
    public DisposeInfoResponse getDispose(){

        DisposeInfoResponse rs = new DisposeInfoResponse();
        DisposeInfo info = new DisposeInfo();
        DisposeInfoDB infoDB1 = new DisposeInfoDB();
        infoDB1.setDescr("焦化化产车间一期出水");
        List<DisposeInfoDB> infoDB1s = vrealTimeToJhfsService.selectAll(infoDB1);
        if(infoDB1s!=null&&infoDB1s.size()>0){
            for (DisposeInfoDB data:infoDB1s){
                info.setName(infoDB1.getDescr());
                if(data.getDescrib().equalsIgnoreCase("ph")){
                    info.setPh(data.getVal());
                }else if(data.getDescrib().equalsIgnoreCase("cod")){
                    info.setCod(data.getVal());
                }else {
                    info.setQa(data.getVal());
                }
            }
            rs.getData().add(info);
        }

        DisposeInfoDB infoDB2 = new DisposeInfoDB();
        info = new DisposeInfo();
        infoDB2.setDescr("焦化化产车间四期出水");
        List<DisposeInfoDB> infoDB2s = vrealTimeToJhfsService.selectAll(infoDB2);
        if(infoDB2s!=null&&infoDB2s.size()>0){
            for (DisposeInfoDB data:infoDB2s){
                info.setName(infoDB2.getDescr());
                if(data.getDescrib().equalsIgnoreCase("ph")){
                    info.setPh(data.getVal());
                }else if(data.getDescrib().equalsIgnoreCase("cod")){
                    info.setCod(data.getVal());
                }else {
                    info.setQa(data.getVal());
                }
            }
            rs.getData().add(info);
        }

        return rs;

    }

}
