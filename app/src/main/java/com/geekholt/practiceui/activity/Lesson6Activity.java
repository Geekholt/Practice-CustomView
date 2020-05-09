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
public class Lesson6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson6);
    }

    public void argbEvaluator(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_ARGB_EVALUATOR.name());
    }

    public void hsvEvaluator(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_HSV_EVALUATOR.name());
    }

    public void ofObject(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_OF_OBJECT.name());
    }

    public void propertyValuesHolder(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_PROPERTY_VALUES_HOLDER.name());
    }


    public void animatorSet(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_ANIMATOR_SET.name());
    }


    public void keyframe(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_KEY_FRAME.name());
    }

}
