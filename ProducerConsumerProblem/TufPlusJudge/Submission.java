package ProducerConsumerProblem.TufPlusJudge;

public class Submission {
    public int submissionID;
    public String name;
    int count = 0;

    Submission(String name){
        this.name = name;
        this.submissionID = count++;
    }

    public String  getName(){
        return name;
    }
    public int getSubmissionID(){
        return submissionID;
    }
}
