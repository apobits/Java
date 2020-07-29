package hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    public static int B;
    public static int H;
    public static boolean flag;

    static {
	try (Scanner scanner = new Scanner(System.in)) {
	    B = scanner.nextInt();
	    H = scanner.nextInt();
	    if (B < 1 || H < 1) {
		System.out.println("java.lang.Exception: Breadth and height must be positive");
	    } else {
		flag = true;
	    }
	}
    }

    public static void main(String[] args) {
	if (flag) {
	    int area = B * H;
	    System.out.print(area);
	}
    }
}
