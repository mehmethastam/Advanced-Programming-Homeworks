import java.util.Scanner;
public class yeAlameSibzamini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a,b,c1,c2,c3,b1,b2,b3,b4,xSina,xKhashayar,yKhashayar,ySina,cSina, cKhashayar,bSina,bKhashayar;
        a = scanner.nextLong();
        b = scanner.nextLong();
        scanner.nextLine();
        c1 = scanner.nextLong();
        c2 = scanner.nextLong();
        c3 = scanner.nextLong();
        scanner.nextLine();
        b1 = scanner.nextLong();
        b2 = scanner.nextLong();
        b3 = scanner.nextLong();
        b4 = scanner.nextLong();
        scanner.nextLine();
        xSina = scanner.nextLong();
        ySina = scanner.nextLong();
        double rSina = Math.pow(xSina, 2) + Math.pow(ySina, 2);
        
        xKhashayar = scanner.nextLong();
        yKhashayar = scanner.nextLong();
        double rKhashayar = Math.pow(xKhashayar, 2) + Math.pow(yKhashayar, 2);
        //System.out.println( rSina);
        //System.out.println(rKhashayar);
        cSina =0;
        cKhashayar=0;
        bSina = 0;
        bKhashayar = 0;
        //System.out.println("rsina"+ rSina);
        //System.out.println("rKhahsi" + rKhashayar);

        // C
        if(b>= a){
        if( rSina > Math.pow(a, 2) && rSina > Math.pow(b,2)){
            cSina = c3;
            //System.out.println("c3");
        }
        else if(rSina > Math.pow(a, 2) && rSina <Math.pow(b, 2)){
            cSina = c2;
            //System.out.println("c2");
        }
        else if(rSina < Math.pow(a, 2) && rSina < Math.pow(b,2) ){
            cSina = c1;
            //System.out.println("c1");
        }
        if(rKhashayar > Math.pow(a, 2) && rKhashayar > Math.pow(b,2)){
            cKhashayar = c3;
            //System.out.println("c3");
        }
        else if(rKhashayar > Math.pow(a, 2) && rKhashayar <Math.pow(b, 2)){
            cKhashayar = c2;
            //System.out.println("c2");
        }
        else if(rKhashayar < Math.pow(a, 2) && rKhashayar < Math.pow(b,2)){
            cKhashayar = c1;
            //System.out.println("c1");
        }
    }

        else if(a > b){
            if( rSina > Math.pow(a, 2) && rSina > Math.pow(b,2)){
                cSina = c3;
                //System.out.println("c3");
            }
            else if(rSina > Math.pow(b, 2) && rSina < Math.pow(a, 2)){
                cSina = c2;
                //System.out.println("c2");
            }
            else if(rSina < Math.pow(a, 2) && rSina < Math.pow(b,2) ){
                cSina = c1;
                //System.out.println("c1");
            }
            if(rKhashayar > Math.pow(a, 2) && rKhashayar > Math.pow(b,2)){
                cKhashayar = c3;
                //System.out.println("c3");
            }
            else if(rKhashayar > Math.pow(b, 2) && rKhashayar <Math.pow(a, 2)){
                cKhashayar = c2;
                //System.out.println("c2");
            }
            else if(rKhashayar < Math.pow(a, 2) && rKhashayar < Math.pow(b,2)){
                cKhashayar = c1;
                //System.out.println("c1");
            }
        }
        
        //B
        if(xSina > 0 && ySina > 0){
            bSina = b1;
            //System.out.println("b1");
        }
        else if(xSina > 0 && ySina < 0){
            bSina = b4;
            //System.out.println("b4");
        }
        else if(xSina <0 && ySina > 0){
            bSina = b2;
            //System.out.println("b2");
        }
        else if(xSina<0 && ySina <0){
            bSina = b3;
            //System.out.println("b3");
        }
        if(xKhashayar > 0 && yKhashayar > 0){
            bKhashayar= b1;
            //System.out.println("b1");
        }
        else if(xKhashayar > 0 && yKhashayar < 0){
            bKhashayar = b4;
            //System.out.println("b4");
        }
        else if(xKhashayar <0 && yKhashayar > 0){
            bKhashayar = b2;
            //System.out.println("b2");
        }
        else if(xKhashayar<0 && yKhashayar <0){
            bKhashayar = b3;
            //System.out.println("b3");
            
        }
        
        long resSina = cSina * bSina;
        long resKhashayar = cKhashayar * bKhashayar;

        System.out.println(Math.max(resKhashayar, resSina));
        scanner.close();
    }
}
