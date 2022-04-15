package ac.cnu.realcodingapi;

import org.junit.jupiter.api.Test;


public class FunctionalProgrammingTest {
    @Test
    public void testFunctionalProgramming() {
        // 선언형 프로그래밍 (어떻게 동작할지를 넘긴다)
        // 익명 함수
        LambdaPractice sayHi = new LambdaPractice() {
            @Override
            public String hi(String text) {
                return text;
            }
        };
        // 람다 사용
        LambdaPractice sayHiSimple = (text) -> text;
        run(sayHi, sayHiSimple);
    }

    private void run(LambdaPractice anonymousPractice, LambdaPractice lambdaPractice) {
        // 실행
        Printer printer = new Printer();
        String hi = "hi";
        printer.print(anonymousPractice, hi);
        printer.print(lambdaPractice, hi);

        printer.print(new LambdaPracticeImpl(), hi);
    }

//    @FunctionalInterface
    public interface LambdaPractice {
        String hi(String text);
    }

    public static class LambdaPracticeImpl implements LambdaPractice {
        @Override
        public String hi(String text) {
            return text;
        }
    }

    public static class Printer {
        public void print(LambdaPractice lambdaPractice, String text) {
            System.out.println(lambdaPractice.hi(text));
        }
    }

}
