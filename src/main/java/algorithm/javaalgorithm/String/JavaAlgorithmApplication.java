package algorithm.javaalgorithm.String;

import algorithm.javaalgorithm.Array.*;
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
//        ReverseStringWithSpecial reverseStringWithSpecial = new ReverseStringWithSpecial();
//        String str = sc.next();
//        System.out.println(reverseStringWithSpecial.solution(str));

        /**
         * StringOverlab
         */
//        StringOverlab stringOverlab = new StringOverlab();
//        String str = sc.next();
//        System.out.println(stringOverlab.solution(str));

        /**
         * StringTrue
         */

//        StringTrue stringTrue = new StringTrue();
//        String str = sc.next();
//        System.out.println(stringTrue.solution(str));

        /**
         * StringTrueWithSpecial
         */
//        StringTrueWithSpecial stringTrueWithSpecial = new StringTrueWithSpecial();
//        String str = sc.nextLine();
//        System.out.println(stringTrueWithSpecial.solution(str));

        /**
         * StringWithNumber
         */
//        StringWithNumber stringWithNumber = new StringWithNumber();
//        String str = sc.next();
//        System.out.println(stringWithNumber.solution(str));

        /**
         * StringShort
         */
//        StringShort stringShort = new StringShort();
//        String s = sc.next();
//        char t = sc.next().charAt(0);
//        for (int x : stringShort.solution(s, t)) {
//            System.out.print(x+ " ");
//        }

        /**
         * StringZip
         */
//        StringZip stringZip = new StringZip();
//        String str = sc.next();
//        System.out.println(stringZip.solution(str));

        /**
         * StringPassword
         */
//        StringPassword stringPassword = new StringPassword();
//        int n = sc.nextInt();
//        String str = sc.next();
//        System.out.println(stringPassword.solution(n, str));

        /**
         * BigNumber
         */
//        BigNumber bigNumber = new BigNumber();
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i=0; i<n; i++) {
//            array[i] = sc.nextInt();
//        }
//        for (int x : bigNumber.solution(n, array)) {
//            System.out.print(x + " ");
//        }

        /**
         * StudentNumber
         */
//        StudentNumber studentNumber = new StudentNumber();
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(studentNumber.solution(n, arr));

        /**
         * RockPaper
         */
//        RockPaper rockPaper = new RockPaper();
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        int[] b = new int[n];
//        for (int i=0; i<n; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i=0; i<n; i++) {
//            b[i] = sc.nextInt();
//        }
//        for (char x : rockPaper.solution(n, a, b).toCharArray()) {
//            System.out.println(x);

        /**
         * Fibonacci
         */
//        Fibonacci fibonacci = new Fibonacci();
//        int n = sc.nextInt();
////        for (int x : fibonacci.solution(n)) {
////            System.out.print(x + " ");
////        }
//        fibonacci.solutionV2(n);

        /**
         * PrimeNumber
         */
//        PrimeNumber primeNumber = new PrimeNumber();
//        int n = sc.nextInt();
//        System.out.println(primeNumber.solution(n));

        /**
         * ReversePrimeNumber
         */
        ReversePrimeNumber reversePrimeNumber = new ReversePrimeNumber();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x: reversePrimeNumber.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

}
