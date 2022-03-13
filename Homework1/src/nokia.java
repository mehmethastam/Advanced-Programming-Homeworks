import java.util.Scanner;
public class nokia {
    public static String[] chars = new String[9];
    public static int[] numbers = new int[9];
    public static String getNum(char ch){
        String op = "";
        for(int i =0 ; i < 9 ; i++){
            if(chars[i].contains(""+ch)){
                int place = chars[i].indexOf(ch) + 1;
                for(int j=0 ; j < place ; j++){
                    op += (""+(numbers[i]+1)) ;
                }
                break;
            }
        }
        return op;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[] numbers = new int[9];
        for(int i = 0 ; i < 9 ; i++){
            int thing = scanner.nextInt() - 1;
            numbers[thing] = i;
        }
        //String[] chars = new String[9];
        chars[0] = "";
        chars[1] = "abc";
        chars[2] = "def";
        chars[3] = "ghi";
        chars[4] = "jkl";
        chars[5] = "mno";
        chars[6] = "pqrs";
        chars[7] = "tuv";
        chars[8] = "wxyz";
        String output = "";
        String str = scanner.next();
        for(int i=0 ; i < str.length() ; i++){
            output += getNum(str.charAt(i)) + "#";
        }
        output = output.substring(0 , output.length()-1);
        for(int i =0 ; i< output.length() ; i++){
            if(output.charAt(i) == '#' && output.charAt(i-1) != output.charAt(i+1)){
                output = output.substring(0,i) + output.substring(i+1);
            }
        }
        System.out.println(output);
        scanner.close();
    }
}
