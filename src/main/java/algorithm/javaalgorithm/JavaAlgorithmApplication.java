package algorithm.javaalgorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


@SpringBootApplication
public class JavaAlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaAlgorithmApplication.class, args);
        Scanner sc = new Scanner(System.in);

        /**
         * FindString
         */
//        FindString findString = new FindString();
//
//
//            String str = sc.next();
//            char c = sc.next().charAt(0);
//
//            System.out.println(findString.solution(str, c));

        /**
         * StringChange
         */
//        StringChange stringChange = new StringChange();
//
//        String str = sc.next();
//        System.out.println(stringChange.solution(str));

        /**
         * InString
         */
//        InString inString = new InString();
//        String str = sc.nextLine();
//        System.out.println(inString.solution(str));

        /**
         * ReverseString
         */
//        ReverseString reverseString = new ReverseString();
//        int n = sc.nextInt();
//        String[] str = new String[n];
//
//        for (int i=0; i<n; i++) {
//            str[i] = sc.next();
//        }
//        for(String x : reverseString.solution(n, str)) {
//            System.out.println(x);
//        }

        /**
         * ReverseStringWithSpecial
         */
        ReverseStringWithSpecial reverseStringWithSpecial = new ReverseStringWithSpecial();
        String str = sc.next();
        System.out.println(reverseStringWithSpecial.solution(str));
    }

}
