package cn.first9.web.pipe.controller;

import cn.first9.web.pipe.vo.TestVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    /**
     *
     * @return
     */
    @RequestMapping("test")
    @ResponseBody
    public TestVO test(){
        TestVO t = new TestVO();
        t.setName("lala");
        t.setAddress("xdsfdsafdsaf");
        return t;
    }
}
