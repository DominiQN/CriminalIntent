package com.example.dominiqn.criminalintent;

import android.text.format.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.zip.DataFormatException;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public boolean isSolved() {
        return mSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setDate(Date date) { mDate = date; }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDateToString() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
            String formatString = DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyyMMdd");
            SimpleDateFormat dateFormatter = new SimpleDateFormat(formatString);
            String dateString = dateFormatter.format(mDate);

            return dateString;
        } else {
            String formatString = "yyyy. MM. dd";
            SimpleDateFormat dateFormatter = new SimpleDateFormat(formatString);
            String dateString = dateFormatter.format(mDate);

            return dateString;
        }
    }

    public String getTimeToString() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR2) {
            String formatString = DateFormat.getBestDateTimePattern(Locale.getDefault(), "hhmm");
            SimpleDateFormat dateFormatter = new SimpleDateFormat(formatString);
            String dateString = dateFormatter.format(mDate);

            return dateString;
        } else {
            String formatString = "hh:mm";
            SimpleDateFormat dateFormatter = new SimpleDateFormat(formatString);
            String dateString = dateFormatter.format(mDate);

            return dateString;
        }
    }
}
