package patterns.strings;

// Problem: Repeated String Building | Difficulty: Easy | Pattern: StringBuilder (avoid String concat in a loop) | Source: Interview concept drill | Time: O(n) | Space: O(n)
public class StringBuilderDemo {

    // Anti-pattern: String is immutable, so += in a loop creates a new String object every
    // iteration - O(n) work per append, O(n^2) total for n appends. Never do this in an interview.
    // public String slowConcat(String[] words) {
    //     String result = "";
    //     for (String w : words) {
    //         result += w; // allocates a brand-new String each time
    //     }
    //     return result;
    // }

    // Optimised: StringBuilder mutates an internal buffer, O(1) amortised per append, O(n) total.
    public String fastConcat(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (String w : words) {
            builder.append(w);
        }
        return builder.toString();
    }
}
