package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        return Arrays.asList(
                new Topic ("spring", "Spring Framework", "SpF Description"),
                new Topic ("summer", "Summer Framework", "SuF Description"),
                new Topic ("winter", "Winter Framework", "WiF Description")
        );
    }
}
