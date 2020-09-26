package pl.sda.hellospring.injection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyService {

    private final MyRepo myRepo;

    @Autowired
    public MyService(MyRepo myRepo) {
        this.myRepo = myRepo;
        log.info("pl.sda.hellospring.injection.MyService");
    }
}
