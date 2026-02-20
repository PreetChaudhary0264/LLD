package DeadLocks.LockOrderingExample;

import java.util.Arrays;

public class LockOrderingExample {
    public static class Resource{
        int id;
        int value;

        Resource(int id,int v){
            this.id = id;
            this.value = v;
        }
    }

    public static void main(String[] args) {

    }

    public static void transfer(Resource from, Resource to,int amount){
        Resource[] arr = new Resource[]{from,to};
        Arrays.sort(arr, (a,b)-> Integer.compare(a.id,b.id));

        synchronized (arr[0]){
            System.out.println(Thread.currentThread().getName() + " locked" + arr[0].id);

            synchronized (arr[1]){
                System.out.println(Thread.currentThread().getName() + " locked" + arr[1].id);
            }
        }
    }
}
