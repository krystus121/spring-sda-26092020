package pl.sda.hellospring.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class MyRepo {

    public MyRepo() {
        log.info("MyRepo");
    }
}
