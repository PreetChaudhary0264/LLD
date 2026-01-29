package creationalPatterns.Singleton;

public class DoubleCheckedLocking {
    public static volatile DoubleCheckedLocking instance;

    //volatile ensurs that lastest value is available to all the threads
    //also prevnts instruction reordering
    //avoids partially constructed objects

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLocking.class){
                if(instance == null){
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }


    //Thread A            Thread B
    //--------            --------
    //instance == null    instance == null
    //enter sync          wait
    //create object
    //exit sync           enter sync
    //(instance != null)
    //return instance     return instance
}
