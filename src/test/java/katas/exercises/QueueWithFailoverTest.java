package katas.exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class QueueWithFailoverTest {
    @Test
    public void testQueueWithFailover(){
        QueueWithFailover jobQueue = new QueueWithFailover(3);

        jobQueue.sendJob("Job 1");
        jobQueue.sendJob("Job 2");
        jobQueue.sendJob("Job 3");

        assert(jobQueue.size()==3);

        String currentJob = jobQueue.getJob();
        jobQueue.jobDone(currentJob);

        currentJob = jobQueue.getJob();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        jobQueue.returnExpiredJobsToQueue();

        try {
            jobQueue.jobDone(currentJob);
        } catch (IllegalArgumentException _) {
        }
    }


    }
