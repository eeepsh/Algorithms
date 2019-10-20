package pattern;

public class Pattern {
  public static void main(String[] s) {
    int n = 4;  //i
    int m=(n*2-1);//j
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if(j==n-1-i || j==n-1+i   || i==n-1){
//        if ((i==1&&j == n) ||(i==2 && (j == n-1 ||j==n+1)) || (i==3&& (j == n-2||j==n+2)) || i==n){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
