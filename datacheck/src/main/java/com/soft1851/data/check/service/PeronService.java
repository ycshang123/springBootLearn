package com.soft1851.data.check.service;


import com.soft1851.data.check.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
@Slf4j
public class PeronService {
    public  void validatePerson(@Valid Person person){
        log.info("service方法验证");
    }
}
