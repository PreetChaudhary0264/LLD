package creationalPatterns.Singleton;

public class Problem {
    private int run = 0;

    public void countRun(){
        run++;
    }
    public int getCount(){
        return run;
    }

    public static void main(String[] args) {
        Problem obj = new Problem();
        obj.countRun();

        Problem obj2 = new Problem();
        obj2.countRun();

        System.out.println(obj2.getCount());
    }
}
