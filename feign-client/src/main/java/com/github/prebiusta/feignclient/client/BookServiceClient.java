package com.github.prebiusta.feignclient.client;

import com.github.prebiusta.feignclient.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.github.prebiusta.feignclient.client.EurekaServices.BOOK_SERVICE;

@FeignClient(BOOK_SERVICE)
public interface BookServiceClient {
    @GetMapping("/get")
    Book getBook();
}
