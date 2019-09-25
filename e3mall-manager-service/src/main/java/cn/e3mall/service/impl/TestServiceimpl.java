package cn.e3mall.service.impl;

import cn.e3mall.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceimpl implements TestService {

    public String testservice(){

        return "1234";
    }
}
