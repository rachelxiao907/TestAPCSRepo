public class Demo {
  public static void main(String[] args) {
    if (args.length == 0) {
      printLoop(5);
    } else {
      printLoop(Integer.parseInt(args[0]));
    }
  }

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for(int j = 0; j <= n-i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    String a = "";
    for (int i = 0; i < arr.length; i++) {
      a += arr[i];
      if (i != arr.length - 1) {
        a += ", ";
      }
    }
    a = "{" + a + "}";
    return a;
  }

  public static String arrayDeepToString (int[][]arr) {
    String deep = "";
    for (int i = 0; i < arr.length; i++) {
      deep += arrToString(arr[i]);
      if (i != arr.length - 1) {
        deep += ", ";
      }
    }
    deep = "{" + deep + "}";
    return deep;
  }
}
