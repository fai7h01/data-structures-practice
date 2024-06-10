package review;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    //declare stacks and current
    Deque<String> history;
    Deque<String> forwardStack;
    String currentPage;

    public BrowserHistory(String homePage){
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = homePage;
    }

    public void visit(String url){
        history.push(currentPage);
        currentPage = url;
        System.out.println(url + " is visited");
        forwardStack = new ArrayDeque<>();
    }


    public String back(int steps){
        int steps2 = steps;
        while(steps > 0 && !history.isEmpty()){
            forwardStack.push(currentPage);
            currentPage = history.pop();
            steps--;
        }
        System.out.println("Back operation of " + steps2 + " brings " + currentPage);
        return currentPage;
    }


    public String forward(int steps){
        int steps2 = steps;
        while(steps > 0 && !forwardStack.isEmpty()){
            history.push(currentPage);
            currentPage = forwardStack.pop();
            steps--;
        }
        System.out.println("Forward operation of " + steps2 + " brings " + currentPage);
        return currentPage;
    }

}
