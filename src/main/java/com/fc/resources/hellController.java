package com.fc.resources;

import com.fc.domain.hell;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class hellController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public hell greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new hell(counter.incrementAndGet(),
                String.format(template, name));
    }
}
