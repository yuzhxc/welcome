package noscan;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 扫描不到的地方
 *
 * @author yzx
 * @Date: 2018/7/28 10:18
 */
@Component
@RequestMapping("/noScan")
public class NoScanController {
    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser() {
        return "张三";
    }
}
