public class Static {
   private static int i;
   private static int y;

    public Static() {
        this.i = i;
        this.y = y;
    }
    public int forTeach() {
        for (int j = 0, y = 10; y - j < 10; j++, y++) {
            System.out.println(j);

        }
        return i;
    }

    }
