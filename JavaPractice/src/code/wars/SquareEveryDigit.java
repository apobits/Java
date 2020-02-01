package code.wars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEveryDigit {
    public static void main(String[] args) {
	System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
	return Integer.parseInt(Stream.of(String.valueOf(n).split("")).reduce("", (t, u) -> {
	    var r = Integer.valueOf(u);
	    return t + (r * r);
	}));
    }

}
