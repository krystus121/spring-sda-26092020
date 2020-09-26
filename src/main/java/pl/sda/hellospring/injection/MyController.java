package pl.sda.hellospring.injection;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class MyController {

    public MyController() {
        log.debug("MyController ran.");
        log.info("MyController ran.");
    }

}
