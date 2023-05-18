package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_3 {
    public static void main(String[] args) {
        Function<String, Integer>   f = (s) -> Integer.parseInt(s, 16); // 입력 String, 출력 Integer
        Function<Integer, String>   g = (i) -> Integer.toBinaryString(i);     // 입력 Integer, 출력 String

        Function<String, String>    h = f.andThen(g);   // f를 적용하고 그다음 g를 결합, 앞의 출력과 뒤의 입력의 타입이 같아야함
        Function<Integer, Integer> h2 = f.compose(g);   // g.andThen과 같음. g를 앞에 세우고 f를 뒤에 세워서 결합.

        System.out.println(h.apply("FF"));  // "FF" -> 255 -> "11111111
        System.out.println(h2.apply(2));    // 2 -> "10" -> 16

        Function<String, String> f2 = x -> x;   // 항등함수(identity Function) ->  입력받은걸 그대로 주는것을 항등함수라 한다.
        System.out.println(f2.apply("AAA"));    /// AAA가 그대로 출력됨

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate();   // i >= 100

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));      // true

        String str1 = new String("abc");
        String str2 = new String("abc");

        // str1과 str2가 같은지 비교한 결과를 반환
//        Predicate<String> p2 = Predicate.isEqual(str1);
//        boolean result = p2.test(str2);
        boolean result = Predicate.isEqual(str1).test(str2);
        System.out.println(result);

    }
}
