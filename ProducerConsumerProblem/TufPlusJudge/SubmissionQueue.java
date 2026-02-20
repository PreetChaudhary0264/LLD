package ProducerConsumerProblem.TufPlusJudge;

import java.util.LinkedList;
import java.util.Queue;

public class SubmissionQueue {
    private Queue<Submission> q = new LinkedList<>();
    private int maxCapacity = 5;


    public synchronized void submit(Submission submission) throws InterruptedException {
        while(q.size() == maxCapacity){
            System.out.println("Queue is full " + submission.getName() + " is trying to submit the solution");
            wait();
        }
        System.out.println(submission.getName() + " solution has started to submit");
        Thread.sleep(1000);
        q.offer(submission);
        System.out.println(submission.getName() + " solution has been submitted");
        notifyAll();
    }

    public synchronized void consume(String judgeName) throws InterruptedException {
        while(q.size() == 0){
            wait();
        }
        System.out.println(judgeName + " has started to evaluate the solution");
        Thread.sleep(1000);
        q.poll();
        System.out.println("solution has been evaluated");
        notifyAll();
    }
}
