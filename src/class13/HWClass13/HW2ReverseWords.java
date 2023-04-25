package class13.HWClass13;

public class HW2ReverseWords {
    public static void main(String[] args) {
        // How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever

        String sentence = "I'm gonna reverse this sentence";
        String[] sentenceArr = sentence.split(" ");
        for (String s : sentenceArr) {
            StringBuilder sb = new StringBuilder(s);
            System.out.print(sb.reverse() + " ");
        }
    }
}
