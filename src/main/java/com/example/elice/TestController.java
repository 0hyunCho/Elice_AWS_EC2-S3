package com.example.elice;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class TestController {

    private TestService testService;

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS})
    @GetMapping
    public String home() {
        return "Hello Elice";
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS})
    @GetMapping("/content")
    public ResponseEntity<List<String>> getAllContents() {
        List<String> contents = new ArrayList<>();
        contents.add("Hello Elice");
        contents.add("Hello World");
        return ResponseEntity.ok(contents);
//        return ResponseEntity.ok(testService.findAll());
    }

    @CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.OPTIONS})
    @PostMapping("/content")
    public ResponseEntity<Map<String, String>> postContent(@RequestBody String content) {
//    public ResponseEntity<TestEntity> postContent(@RequestBody String content) {
        Map<String, String> response = new HashMap<>();
        response.put("content", content);
        return ResponseEntity.ok(response);
//        return ResponseEntity.ok(testService.createContent(content));
    }
}
