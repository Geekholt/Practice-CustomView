package com.geekholt.practiceui.activity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.geekholt.practiceui.R;
import com.geekholt.practiceui.util.LayoutIdUtil;

/**
 * @author 吴灏腾
 * @date 2020/5/6
 * @describe TODO
 */
public class Lesson3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);
    }


    public void drawTextView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_TEXT_VIEW.name());
    }

    public void staticLayoutView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.STATIC_LAYOUT_VIEW.name());
    }

    public void setTextSizeView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_TEXT_SIZE_VIEW.name());
    }

    public void setTypeFaceView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_TYPE_FACE_VIEW.name());
    }

    public void setFakeBoldTextView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_FAKE_BOLD_TEXT_VIEW.name());
    }

    public void setStrikeThruTextView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_STRIKE_THRU_TEXT_VIEW.name());
    }

    public void setUnderLineTextView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_UNDER_LINE_TEXT_VIEW.name());
    }

    public void setTextSkewXiew(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_TEXT_SKEW_X_VIEW.name());
    }


    public void setTextScaleXView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_TEXT_SCALE_X_VIEW.name());
    }

    public void setTextAlignView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SET_TEXT_ALIGN_VIEW.name());
    }

    public void getFontSpacingView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.GET_FONT_SPACING_VIEW.name());
    }


    public void measureTextView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MEASURE_TEXT_VIEW.name());
    }

    public void getTextBoundsView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.GET_TEXT_BOUNDS_VIEW.name());
    }

    public void getFontMetricsView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.GET_FONT_METRICS_VIEW.name());
    }
}
