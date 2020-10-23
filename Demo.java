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

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }
  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] arr = new int[rows][];
    for (int i = 0; i < rows; i++) {
      arr[i] = new int[(int)(Math.random() * (cols + 1))];
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }
    return arr;
  }
}
