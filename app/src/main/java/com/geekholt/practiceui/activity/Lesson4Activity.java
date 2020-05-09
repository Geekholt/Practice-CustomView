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
public class Lesson4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);
    }

    public void clipRectView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.CLIP_RECT_VIEW.name());
    }

    public void clipPathView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.CLIP_PATH_VIEW.name());
    }

    public void transLateView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.TRANS_LATE_VIEW.name());
    }

    public void scaleView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SCALE_VIEW.name());
    }

    public void rotateView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ROTATE_VIEW.name());
    }

    public void skewView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SKEW_VIEW.name());
    }

    public void matrixTranslateView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MATRIX_TRANSLATE_VIEW.name());
    }

    public void matrixScaleView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MATRIX_SCALE_VIEW.name());
    }


    public void matrixRotateView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MATRIX_ROTATE_VIEW.name());
    }

    public void matrixSkewView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MATRIX_SKEW_VIEW.name());
    }

    public void cameraRotateView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.CAMERA_ROTATE_VIEW.name());
    }


    public void cameraRotateFixedView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.CAMERA_ROTATE_FIXED_VIEW.name());
    }

    public void cameraRotateHittingFaceView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.CAMERA_ROTATE_HITTING_FACE_VIEW.name());
    }

    public void flipBoardView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.FLIP_BOARD_VIEW.name());
    }

}
