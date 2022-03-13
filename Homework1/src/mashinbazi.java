import java.util.Scanner;
public class mashinbazi {
    public static int x,y = 0;
    public static void move(char direction) {
        switch (direction) {
            case 'U':
                y--;
                break;
            case 'D':
                y++;
                break;
            case 'L':
                x--;
                break;
            case 'R':
                x++;
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        x--;
        y = m - y;
        int[][] table = new int[m][n];
        int[][] arshya = new int[m][n];
        for(int i=0 ; i < m ; i++ ){
            for(int j=0 ; j < n ; j++){
                table[i][j] = scanner.nextInt();
                arshya[i][j] = 0;
            }
        }
        long point = 0;
        String a = scanner.next();
        for(int i =0 ; i < a.length() ; i++){
            char ch = a.charAt(i);
            move(ch);
            arshya[y][x]++;
            if(table[y][x] <= 0 ){
                point += (long)arshya[y][x] * table[y][x];
            }
            else {
                point += (long)table[y][x];
            }
        }
        System.out.println(point);
        scanner.close();
    }
}
