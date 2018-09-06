package com.exemple.elrine.mywallet.model;

import java.util.List;

public class QuestionBank {
    private List<Question> mQuestions;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> bank) {
        mQuestions.clear();
        mNextQuestionIndex = 0;
        mQuestions.addAll(bank);
    }

    public Question getQuestion() {
        mNextQuestionIndex++;
        return mQuestions.get(mNextQuestionIndex - 1);
    }
}
