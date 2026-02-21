import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 2. 사용자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        // 3. 연산 수행
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;  // 정수 나눗셈

        // 4. 결과 출력
        System.out.println("덧셈 결과: " + sum);
        System.out.println("뺄셈 결과: " + diff);
        System.out.println("곱셈 결과: " + mul);
        System.out.println("나눗셈 결과: " + div);

        // 5. Scanner 닫기
        sc.close();
    }
}