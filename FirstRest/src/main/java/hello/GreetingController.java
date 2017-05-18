package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Алекс on 18.05.2017.
 */

    @RestController
    public class GreetingController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @RequestMapping("/greeting")
        public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
            return new Greeting(counter.incrementAndGet(),
                    String.format(template, name));
        }
}
