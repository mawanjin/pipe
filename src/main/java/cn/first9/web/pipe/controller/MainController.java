package cn.first9.web.pipe.controller;

import cn.first9.web.pipe.service.EpaInfoService;
import cn.first9.web.pipe.vo.EpaInfo;
import cn.first9.web.pipe.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class MainController {

    @Autowired
    EpaInfoService epaInfoService;

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
    public List<EpaInfo> getDevice(){
        return epaInfoService.selectAll(null);

    }
}
