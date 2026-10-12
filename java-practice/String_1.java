public class String_1 {


    // 1. Return a greeting using the given name.
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    // 2. Return a string in the order: a + b + b + a.
    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    // 3. Create an HTML string by wrapping the word with the given opening and closing tags.
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    // 4. Insert the given word between the first and last two characters of the out string.
    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    // 5. Return a string containing three copies of the last two characters of the given string.
    public static String extraEnd(String str) {
        return str.substring(str.length() - 2)
                + str.substring(str.length() - 2)
                + str.substring(str.length() - 2);
    }

}
