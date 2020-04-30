package com.soft1851.data.check.entity;


import com.soft1851.data.check.annotation.PhoneNumber;
import com.soft1851.data.check.annotation.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotNull(message = "Id不能为空")
//    @Size(min = 6, max = 10)
    private String id;

    @Size(max = 30)
    @NotNull(message = "name不能为空")
//    @Size(max = 10)
    private String name;

    @Min(18)
    private Integer age;

//    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$", message = "手机号码格式错误")

    @PhoneNumber
    @NotBlank(message = "手机号码不能为空")
    private String phone;

    @NotNull(message = "email 不能为空")
    @Email(message = "邮箱格式错误")
    private String email;

    @Pattern(regexp = "((^Man$|^Woman$|^UGM$))", message = "sex值不在可选范围内")
    @NotNull(message = "sex 不能为空")
    private String sex;

    @Region
    private String region;
}
