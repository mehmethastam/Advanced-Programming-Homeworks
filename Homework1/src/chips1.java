import java.util.Scanner;
public class chips1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = scanner.next();
        String temp = "";
        String str = scanner.next();
        String fStr = str;
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
            if(str.charAt(i) == 'a' && i != str.length()-1){
                aCounter++;
                if(str.charAt(i+1) != 'a'){
                    pos[step] = aCounter;
                    step ++;
                    aCounter = 0;
                    temp += "a";
                }
            }
            if(str.charAt(i) != 'a' && i != str.length()-1){
                pos[step] = 0;
                step ++;
                temp += str.charAt(i);
            }
            else if(i == str.length()-1){
                if(str.charAt(i) == 'a'){
                    aCounter++;
                    pos[step] = aCounter;
                    temp += "a";
                }
                else {
                    pos[step] = 0;
                    temp += str.charAt(i);
                }
            }
        }
        str = temp;
        //System.out.println(pattern);
        //System.out.println(str);
        // for(int i=0 ; i< pos.length ; i++){
        //     System.out.print(pos[i] +" ");
        // }
        int tempoli = 0 ;
        if(pattern.equals("a")){
            for(int i=0 ; i < pos.length ; i++){
                if(pos[i] != 0){
                tempoli = pos[i];
                break;
                }
            }
            for(int i=pos.length-1 ; i >= 0 ; i--){
                if(pos[i] != 0){
                tempoli *= pos[i];
                break;
                }
            }
            counter = tempoli;
        }
        else{
        if(str.equals(pattern)){
            counter = (fStr.length() * (fStr.length() +1)) / 2;
        }
        
        else{
        for(int i=0 ; i < str.length() -pattern.length() +1; i++){
            String sub = str.substring(i, i+pattern.length());
            //System.out.println(sub);
            if(pattern.equals(sub)){
                //System.out.println("Found it!");
                //System.out.println("Before: "+counter);
                if(pos[i] != 0 && pos[i+pattern.length()-1] != 0){
                    counter += pos[i] * pos[i+pattern.length()-1];
                    //System.out.println("Hmmm");
                }
                else if(pos[i] == 0 && pos[i+pattern.length()-1] !=0 ){
                    counter += pos[i+pattern.length()-1];
                    //System.out.println("AAAAmmmmm");
                }
                else if(pos[i] != 0 && pos[i+pattern.length()-1] == 0){
                    counter += pos[i];
                    //System.out.println("Huuuuuuuuummmmmmm");
                }
                else{
                    counter += 1;
                }
                //System.out.println("After" + counter);

            }
        }
    }
}
        System.out.println(counter);
        scanner.close();
    }
}
