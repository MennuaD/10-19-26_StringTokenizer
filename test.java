import java.util.StringTokenizer;

public class test {
    public static void main(String[] args){
        StringTokenizer d = new StringTokenizer("10:20:30:40:50:60", ":", true);
        while(d.hasMoreTokens()){
            System.out.println(d.nextToken());
        }
    }
}
