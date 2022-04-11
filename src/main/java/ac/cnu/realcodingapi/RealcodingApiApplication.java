package ac.cnu.realcodingapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class RealcodingApiApplication {

    public static void main(String[] args) {
        log.info("여기가 시작점이야");
        for (String arg : args) {
            log.info("옵션 확인: , {}", arg);
        }
        SpringApplication.run(RealcodingApiApplication.class, args); // 이 한 줄로 실행되는 것
        log.info("웹 서버 실행 완료");
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            log.info("커멘드 실행");
        };
    }

}
