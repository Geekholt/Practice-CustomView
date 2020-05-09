package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;

import androidx.annotation.Nullable;

import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        this(context, null);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
//        left, top, right, bottom 描述的是这个弧形所在的椭圆
//        startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度）
//        sweepAngle 是弧形划过的角度；
//        useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(100, 100, 500, 300, -90, 120, true, paint);

        canvas.drawArc(100, 100, 500, 300, 40, 100, false, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(100, 100, 500, 300, 150, 110, false, paint);
    }
}
