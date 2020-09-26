package pl.sda.hellospring.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service //serive, który jest @component
public class MyService {
    public MyService() {

        log.info("MyService started.");
    }
}
