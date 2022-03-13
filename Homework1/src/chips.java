import java.util.Scanner;
public class chips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.next();
        String temp = "";
        String str = scanner.next();
        int[] pos = new int[str.length()+1];
        int counter = 0;
        for(int i=0 ; i<pattern.length() ; i++){
            if(Character.isLetter(pattern.charAt(i))){
                temp += "a";
            }
            else{
                temp += Character.toString(pattern.charAt(i));
            }
        }
        pattern = temp;
        temp = "";
        for(int i=0; i<str.length() ; i++){
            if(Character.isLetter(str.charAt(i))){
                temp += "a";
            }
            else{
                temp += Character.toString(str.charAt(i));
            }
        }
        str = temp;
        temp = "";
        int aCounter = 0;
        int step = 0;
        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) == 'a'){
                aCounter++;
            }
            else if(str.charAt(i) != 'a' && i+1 != str.length()-1 && str.charAt(i+1) == 'a' ){
                pos[step] = aCounter;
                pos[step+1] = 0;
                aCounter =0;
                step += 2;
                temp += "a" + str.charAt(i);
            }
            else if(str.charAt(i) != 'a' && i+1 != str.length()-1 && str.charAt(i+1) != 'a'){
                pos[step] = aCounter;
                pos[step+1] = 0;
                step += 3;
                temp += str.charAt(i) + str.charAt(i+1);
            }
            else if(str.charAt(i) != 'a' && i+1 == str.length()-1){
                pos[step] = aCounter;
                if(str.charAt(i+1) == 'a'){
                    temp += "a";
                    pos[step+1] = 1;
                }
                else{
                    temp += str.charAt(i+1);
                    pos[step+1] = 0;
                }
                break;
            }

        }
        str = temp;
        System.out.println(pattern);
        System.out.println(str);
        for(int i=0 ; i< pos.length ; i++){
            System.out.print(pos[i] +" ");
        }
        for(int i=0 ; i < str.length() -pattern.length() +1; i++){
            String sub = str.substring(i, i+pattern.length());
            System.out.println(sub);
            if(pattern.equals(sub)){
                System.out.println("Found it!");
                if(pos[i] != 0 && pos[i+pattern.length()-1] != 0){
                    counter += pos[i] * pos[i+pattern.length()-1];
                }
                else if(pos[i] == 0 && pos[i+pattern.length()-1] !=0 ){
                    counter += pos[i+pattern.length()-1];
                }
                else if(pos[i] != 0 && pos[i+pattern.length()-1] == 0){
                    counter += pos[i];
                }
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
