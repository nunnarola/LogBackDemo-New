package com.narola.LogDemoApplication.Logger.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController extends BaseController{
    private static Logger logger1 = LoggerFactory.getLogger(BaseController.class);
    private static Logger logger2 = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        String data = "Hello from logger";
        logger1.trace("Trace Message!");
        logger1.debug("Debug Message!");
        logger1.info("Info Message!");
        logger1.warn("Warn Message!");
        logger1.error("Error Message!");

        logger2.trace("Trace Message!");
        logger2.debug("Debug Message!");
        logger2.info("Info Message!");
        logger2.warn("Warn Message!");
        logger2.error("Error Message!");

        return ResponseEntity.ok().body(data);
    }
}
