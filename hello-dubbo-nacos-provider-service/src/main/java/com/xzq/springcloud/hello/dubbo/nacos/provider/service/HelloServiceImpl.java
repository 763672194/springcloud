package com.xzq.springcloud.hello.dubbo.nacos.provider.service;
import com.ty.springcloud.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
