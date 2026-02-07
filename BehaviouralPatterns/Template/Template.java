package BehaviouralPatterns.Template;

public abstract class Template {
    abstract void load();
    abstract void preProcess();
    abstract void train();
    abstract void evaluate();
    abstract void deploy();

//    Template(Template t){
//        this.algo = t;
//    }

    public final void trainPipeline(){
        load();         //step1
        preProcess();   //step2
        deploy();       //step5
        evaluate();     //step4
        train();        //step3
    }
}
