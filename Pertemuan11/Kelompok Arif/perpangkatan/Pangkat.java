class Pangkat {
   public static int pangkatRekursif(int x, int y) {
      if (y == 0) {
         return 1;
      }
      else {
         return x * pangkatRekursif(x, y - 1);
      }
   }
   public static void main(String[] args) {
       System.out.println("10 dipangkatkan 3 = "+pangkatRekursif(10,3));
   }
}