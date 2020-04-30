package com.soft1851.data.check.validator;


import com.soft1851.data.check.annotation.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pat = Pattern.compile("^1(3|4|5|7|8)\\d{9}$");
        Matcher matcher = pat.matcher(s);
        return  matcher.find();
    }
}
