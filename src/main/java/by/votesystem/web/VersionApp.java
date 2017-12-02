package by.votesystem.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class VersionApp {
    private final String versionApp = "v1.0";

    @GetMapping("/version")
    public String getVersion() {
        return versionApp;
    }
}