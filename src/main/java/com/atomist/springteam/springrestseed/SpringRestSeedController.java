// I come from the loving space of my heart, and I know that love opens all doors.

package com.atomist.springteam.springrestseed;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class SpringRestSeedController {

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "App running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
