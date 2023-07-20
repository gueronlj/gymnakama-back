package gymnakama.back.gymnakama;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class UserController {

    private AtomicLong idCounter = new AtomicLong();

    @GetMapping("/user")
    public User user( @RequestParam(value = "userName", defaultValue = "NewUser") String userName ){  
        return new User((idCounter.incrementAndGet()+1000), String.format(userName));
    }   
}
