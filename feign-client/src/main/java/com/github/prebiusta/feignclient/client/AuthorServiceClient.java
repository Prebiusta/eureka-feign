package com.github.prebiusta.feignclient.client;

import com.github.prebiusta.feignclient.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.github.prebiusta.feignclient.client.EurekaServices.AUTHOR_SERVICE;

@FeignClient(AUTHOR_SERVICE)
public interface AuthorServiceClient {
    @GetMapping("/get/{authorId}")
    Author getAuthor(@PathVariable String authorId);
}
