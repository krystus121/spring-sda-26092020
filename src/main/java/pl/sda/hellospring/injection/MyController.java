package pl.sda.hellospring.injection;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class MyController {

    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public MyController() {
        log.debug("MyController ran.");
        log.info("MyController ran.");
    }

}
