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
public class Lesson5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);
    }

    public void animTranslation(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_TRANSLATE.name());
    }

    public void animRotation(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_ROTATION.name());
    }

    public void animScale(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_SCALE.name());
    }

    public void animAlpha(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_ALPHA.name());
    }


    public void animMultiProperties(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_MULTI_PROPERTIES.name());
    }


    public void animDuration(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_DURATION.name());
    }


    public void animInterpolator(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_INTERPOLATOR.name());
    }

    public void animObjectAnimator(View view) {
        ContainerActivity.startActivity(this, LayoutIdUtil.LayoutType.ANIM_OBJECT_ANIMATOR.name());
    }

}
