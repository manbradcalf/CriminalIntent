package com.bignerdranch.android.criminalintent;

import java.util.UUID;
import java.util.Date;

/**
 * Created by Ben on 2/10/16.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {return mDate;}

    public boolean isSolved() {return mSolved;}

    public void setDate(Date mDate) {this.mDate = mDate;}


    public void setSolved(boolean mSolved) {this.mSolved = mSolved;}
}
