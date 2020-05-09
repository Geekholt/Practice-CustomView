package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice2DrawCircleView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice2DrawCircleView(Context context) {
        this(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        canvas.drawCircle(200, 200, 100, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500, 200, 100, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(200, 500, 100, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        canvas.drawCircle(500, 500, 100, paint);
    }
}
