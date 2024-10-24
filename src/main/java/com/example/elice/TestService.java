package com.example.elice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TestService {

//    private TestRepository testRepository;
//
//    public List<String> findAll() {
//        return testRepository.findAll().stream()
//                .map(TestEntity::getContent)
//                .collect(Collectors.toList());
//    }
//
//    public TestEntity createContent(String content) {
//        return testRepository.save(new TestEntity(content));
//    }
}
