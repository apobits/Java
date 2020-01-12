package code.wars;

import java.util.stream.Stream;

public class DecodeTheMorseCode {
    public static void main(String[] args) {
	decode("h   j   ");
    }

    public static String decode(String morseCode) {
	var words = morseCode.trim().split("   ");
	var stringBuilder = new StringBuilder();
	Stream.of(words).forEach(t -> {
	    Stream.of(t.split(" ")).forEach(u -> stringBuilder.append(u));
	    stringBuilder.append(" ");
	});

	return stringBuilder.toString().trim();
    }

}
