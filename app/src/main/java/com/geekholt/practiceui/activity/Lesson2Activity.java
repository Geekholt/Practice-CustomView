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
public class Lesson2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);
    }


    public void drawLinearGradientView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.LINEAR_GRADIENT_VIEW.name());
    }

    public void drawRadialGradientView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.RADIAL_GRADIENT_VIEW.name());
    }

    public void drawSweepGradientView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SWEEP_GRADIENT_VIEW.name());
    }

    public void drawBitmapShaderView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.BITMAP_SHADER_VIEW.name());
    }

    public void drawComposeShaderView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.COMPOSE_SHADER_VIEW.name());
    }

    public void drawLightingColorFilterView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.LIGHTING_COLOR_FILTER_VIEW.name());
    }

    public void drawColorMatrixColorFilterView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.COLOR_MATRIX_COLOR_FILTER_VIEW.name());
    }

    public void drawXfermodeView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.X_FER_MODE_VIEW.name());
    }


    public void drawStrokeCapView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.STROKE_CAP_VIEW.name());
    }

    public void drawStrokeJoinView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.STROKE_JOIN_VIEW.name());
    }

    public void drawStrokeMiterView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.STOCK_MITER_VIEW.name());
    }


    public void drawPathEffectView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.PATH_EFFECT_VIEW.name());
    }

    public void drawShadowLayerView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.SHADOW_LAYER_VIEW.name());
    }

    public void drawMaskFilterView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.MASK_FILTER_VIEW.name());
    }

    public void drawFillPathView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.FILL_PATH_VIEW.name());
    }

    public void drawTextPathView(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.TEXT_PATH_VIEW.name());
    }
}
