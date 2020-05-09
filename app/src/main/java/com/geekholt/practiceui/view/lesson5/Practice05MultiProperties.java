package com.geekholt.practiceui.view.lesson5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.geekholt.practiceui.R;


public class Practice05MultiProperties extends ConstraintLayout {
    Button animateBt;
    ImageView imageView;

    public Practice05MultiProperties(Context context) {
        super(context);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05MultiProperties(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setScaleX(0);
        imageView.setScaleY(0);
        imageView.setAlpha(0f);
        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO 在这里处理点击事件，同时对多个属性做动画
                imageView.animate()
                        .scaleX(1.5f)
                        .scaleY(1.5f)
                        .alpha(1f)
                        .translationX(400f);
            }
        });
    }
}
