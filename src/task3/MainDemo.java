package task3;

import task3.Services.CustomerService;
import task3.Services.FeedbackService;
import task3.Utility.Customer;
import task3.Utility.Feedback;

import java.util.ArrayList;

public class MainDemo {

    public ArrayList<String> fetchFeedbacksByCustomerId(int custId, Feedback[]feedbacks){
        ArrayList<String> fbResultArray = new ArrayList<>();
        int index = 0;
        for(Feedback feedback : feedbacks){
            if(feedback.customer.getId() == custId){
                fbResultArray.add("feedback id: "+feedback.getId() + ", feedback description: "+feedback.getDescription());
            }
        }
        return fbResultArray;
    }


    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        FeedbackService feedbackService = new FeedbackService();

        customerService.addCustomer(new Customer(10,"Sushma Nayak"));
        customerService.addCustomer(new Customer(20, "Rashmi BK"));
        customerService.addCustomer(new Customer(30, "Shreya Prabhu"));
        customerService.addCustomer(new Customer(40, "Soumya Bhat"));
        customerService.addCustomer(new Customer(50, "Ramya Kharvi"));

        feedbackService.addFeedback(new Feedback(1,"Good",customerService.getCustomers()[0]));
        feedbackService.addFeedback(new Feedback(2,"Bad",customerService.getCustomers()[1]));
        feedbackService.addFeedback(new Feedback(3,"Best",customerService.getCustomers()[0]));
        feedbackService.addFeedback(new Feedback(4,"Average",customerService.getCustomers()[3]));
        feedbackService.addFeedback(new Feedback(5,"Okay",customerService.getCustomers()[2]));


        MainDemo mainDemo = new MainDemo();


        int custId = 10;
        ArrayList<String> feedbackResult = mainDemo.fetchFeedbacksByCustomerId(custId, feedbackService.feedbacks);

        System.out.println("feedback by Customer id "+ custId+": ");
        for(int i=0; i<feedbackResult.size(); i++){
            System.out.println(feedbackResult.get(i));
        }

    }

}
