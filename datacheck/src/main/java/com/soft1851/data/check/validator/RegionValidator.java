package com.soft1851.data.check.validator;


import com.soft1851.data.check.annotation.Region;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * 自定义校验规则
 */
public class RegionValidator implements ConstraintValidator<Region,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        HashSet<Object> regions = new HashSet<>();
        regions.add("China");
        regions.add("China-Taiwan");
        regions.add("China-HongKong");
        return  regions.contains(s);
    }
}
