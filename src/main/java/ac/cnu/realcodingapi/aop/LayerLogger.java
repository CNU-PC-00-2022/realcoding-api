package ac.cnu.realcodingapi.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LayerLogger {
    @Around("execution(* ac.cnu.realcodingapi..*(..))")
    public Object serviceLogging(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            log.info("=======================================================");
            log.info("[현재 실행 위치] : {}", getClassFromJoinPoint(joinPoint));
            return joinPoint.proceed();
        } catch (Throwable rethrow) {
            throw rethrow;
        }
    }

    private String getClassFromJoinPoint(ProceedingJoinPoint joinPoint) {
        String[] input = joinPoint.getTarget().toString().split("\\.");
        return input[input.length - 1];
    }
}
