package com.phadon.drivecambodia;

import android.graphics.drawable.Drawable;
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

    public CourseCard(ImageView image, TextView text, ContentLoadingProgressBar progressBar) {
        mCourseImage = image;
        mCourseText = text;
        mCourseProgressBar = progressBar;
    }

    public CourseCard(View view) {
        mCardView = (CardView) view;

        mCourseImage = view.findViewById(R.id.course_image);
        mCourseText = view.findViewById(R.id.course_text);
        mCourseProgressBar = view.findViewById(R.id.course_progress_bar);
    }


    public void setText(String text) {
        mCourseText.setText(text);
    }

    public void setBackgroundColor(int backgroundColor) {
        mCardView.setCardBackgroundColor(backgroundColor);
    }

    public void setCourseImage(int resId) {
        mCourseImage.setImageResource(resId);
    }

}
