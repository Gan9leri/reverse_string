import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        String str = "My magic string";
        System.out.println(str);
        String result = reverse_string(str);
        System.out.println(result);
        String result_without_split = reverse_string_without_split(str, ' ');
        System.out.println(result_without_split);
    }

    public static String reverse_string(String str){
        StringBuilder result = new StringBuilder();
        String[] words_split = str.split(" ");
        for (int i = words_split.length-1; i >= 0; i--){
            result.append(words_split[i]).append(" ");
        }
        return result.toString();
    }

    public static String reverse_string_without_split(String str, char sep){
        ArrayList<String> result = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        str = sep + str;
        char[] input_str = str.toCharArray();
        for(int i = input_str.length-1; i >= 0; i--){
            if(input_str[i] != sep){
                word.append(input_str[i]);
            } else{
                result.add(word.toString());
                word = new StringBuilder();
            }
        }
        return String.join(" ", result);
    }
}
