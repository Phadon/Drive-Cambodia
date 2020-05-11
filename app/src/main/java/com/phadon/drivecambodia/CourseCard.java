package com.phadon.drivecambodia;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.widget.ContentLoadingProgressBar;

public class CourseCard {
    private CardView mCardView;
    private ImageView mCourseImage;
    private TextView mCourseText;
    private ContentLoadingProgressBar mCourseProgressBar;

    public CourseCard(View view) {
        mCardView = (CardView) view;

        mCourseImage = view.findViewById(R.id.course_image);
        mCourseText = view.findViewById(R.id.course_text);
        mCourseProgressBar = view.findViewById(R.id.course_progress_bar);
    }


    public CourseCard setText(String text) {
        mCourseText.setText(text);
        return this;
    }

    public CourseCard setBackgroundColor(int backgroundColor) {
        mCardView.setCardBackgroundColor(backgroundColor);
        return this;
    }

    public CourseCard setCourseImage(int resId) {
        mCourseImage.setImageResource(resId);
        return this;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        mCardView.setOnClickListener(listener);
    }
}
