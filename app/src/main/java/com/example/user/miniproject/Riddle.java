package com.example.user.miniproject;

/**
 * Created by user on 10/06/2016.
 */
public class Riddle {

    private String question;
    private String answer;

    public Riddle(String question, String answer){
        this.question=question;
        this.answer=answer;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer() {
        return answer;
    }
}
