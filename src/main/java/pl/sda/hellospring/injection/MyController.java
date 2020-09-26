package pl.sda.hellospring.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class MyController {

    // do not do it!!!!
//    @Autowired
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public MyController() {
        log.trace("pl.sda.hellospring.injection.MyController");
        log.info("pl.sda.hellospring.injection.MyController");
    }
}
