package com.soft1851.springboot.aop.aspect;/*@ClassName UserTokenAspect
 *@Description:todo
 *@author yc_shang
 *@Date2020/4/13
 *@Version 1.0
 **/

import com.soft1851.springboot.aop.annotation.UserToken;
import com.soft1851.springboot.aop.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
@Slf4j
public class UserTokenAspect {
    @Resource
    private UserMapper userMapper;
    
    @Pointcut("@annotation(userToken)")
    public void doUserToken(UserToken userToken){}

    @Around(value = "doUserToken(userToken)",argNames ="pjp,userToken" )
    public  Object doAround(ProceedingJoinPoint pjp,UserToken userToken) throws Throwable{
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert sra !=null;
        HttpServletRequest request = sra.getRequest();
        String[] codes = userToken.verification_code();
        if(codes.length <=1){
            String password =request.getHeader("password");
          if(password != null){
                return pjp.proceed();
            }
            return "请输入密码";
        }else{
            System.out.println(request.getHeader("verificationCode"));
            System.out.println(userMapper.LoginByCode(request.getHeader("verificationCode")));
            String getcode = userMapper.LoginByCode(request.getHeader("verificationCode")).getVerificationCode();
            System.out.println(getcode);
            log.info("verificationCode");
            for(String code :codes){
                if(code.equals(getcode)){
                    return pjp.proceed();
                }
            }
            return "请输入验证码";
        }
    }
}
