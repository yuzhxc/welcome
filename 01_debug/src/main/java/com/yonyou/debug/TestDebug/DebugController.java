package com.yonyou.debug.TestDebug;

import com.yonyou.debug.entity.DebugVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码调试类
 *
 * @author yzx
 * @Date: 2018/7/24 15:22
 */
@RestController
@RequestMapping("/debug")
public class DebugController {

    @RequestMapping("debugOne")
    public String debugOne() {
        mothodOne();
        return "哈哈";
    }

    private void mothodOne() {
        List<DebugVO> bugList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            DebugVO debugVO = new DebugVO();
            debugVO.setBugName("我是Bug" + i);
            debugVO.setBugCode("我的编号是:" + i);
/*            if (i == 100) {
                bugList.add(null);
            } else {
                bugList.add(debugVO);
            }*/
            bugList.add(debugVO);
            System.out.println(i);
        }
        methodTwo(bugList);
    }

    private void methodTwo(List<DebugVO> debugVOList) {
        debugVOList.get(100).getBugName();
    }
}
