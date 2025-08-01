// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// @SuppressWarnings("unchecked")
// class SqueakyClean {
//     static String clean(String identifier) {
//         return identifier.isEmpty()?identifier:
//                 toCamelCase(new ArrayList<String>(Arrays.asList(identifier.split(""))))
//                 .stream()
//                 .map(c -> c.equals(" ")?"_":c)
//                 .map(c -> Character.isISOControl(c.charAt(0))?"CTRL":c)
//                 .map(c -> ((c.charAt(0) >= 'α' && c.charAt(0) <= 'ω') || (!Character.isAlphabetic(c.charAt(0)) && !c.equals("_")))?"":c)
//                 .collect(Collectors.joining());
//     }
//     static List<String> toCamelCase(List list){
//         int[] indexes = IntStream.range(0, list.size()).filter(i -> list.get(i).equals("-")).toArray();
//         for (int i:indexes) list.set(i+1, list.get(i+1).toString().toUpperCase());
//         list.removeAll(Collections.singleton("-"));
//         return list;
//     }
// }
// chin

class SqueakyClean {
    static String clean(String identifier) {
        var result = new StringBuilder();
        var doUpper = false;

        for (int i = 0; i < identifier.length(); i++) {
            final var c = identifier.charAt(i);
            if (c == '4') {
                result.append('a');
            } else if (c == '3') {
                result.append('e');
            } else if (c == '0') {
                result.append('o');
            } else if (c == '1') {
                result.append('l');
            } else if (c == '7') {
                result.append('t');
            } else if (Character.isSpaceChar(c)) {
                result.append('_');
            } else if (Character.isISOControl(c)) {
                result.append("CTRL");
            } else if (c == '-') {
                // Turn state on.
                doUpper = true;
            } else if (c >= 'α' && c <= 'ω') {
                // Skip.
            } else if (doUpper) {
                result.append(Character.toUpperCase(c));

                // Turn state back off.
                doUpper = false;
            } else if (Character.isLetter(c) || c == '_') {
                // Copy over, no change.
                result.append(c);
            }
        }

        return result.toString();
    }
}

