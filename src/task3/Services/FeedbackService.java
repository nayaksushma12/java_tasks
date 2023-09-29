package task3.Services;

import task3.Utility.Feedback;

public class FeedbackService {
    public int index = 0;
    public Feedback[] feedbacks = new Feedback[5];
    public void addFeedback(Feedback feedback){
        feedbacks[index] = feedback;
        index+=1;
    }

}
