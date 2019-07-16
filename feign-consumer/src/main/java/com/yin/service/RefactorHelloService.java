package com.yin.service;

import com.yin.entity.User;
import com.yin.helloserviceapi.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService{

}
