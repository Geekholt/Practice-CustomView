package com.geekholt.practiceui.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.geekholt.practiceui.R;
import com.geekholt.practiceui.util.LayoutIdUtil;

/**
 * @author 吴灏腾
 * @date 2020/5/6
 * @describe TODO
 */
public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);
    }

    public void drawColorView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_COLOR_VIEW.name());
    }

    public void drawCircleView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_CIRCLE_VIEW.name());
    }

    public void drawRectView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_RECT_VIEW.name());
    }

    public void drawPointView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_POINT_VIEW.name());
    }

    public void drawOvalView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_OVAL_VIEW.name());
    }

    public void drawLineView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_LINE_VIEW.name());
    }

    public void drawRoundRectView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_ROUND_RECT_VIEW.name());
    }

    public void drawArcView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_ARC_VIEW.name());
    }

    public void drawPathView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_PATH_VIEW.name());
    }

    public void drawHistogramView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_HISTOGRAM_VIEW.name());
    }

    public void drawPathChartView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.DRAW_PIE_CHART_VIEW.name());
    }
}
