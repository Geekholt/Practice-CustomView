package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;

import androidx.annotation.Nullable;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {
    Paint paint  = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice4DrawPointView(Context context) {
        this(context, null);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(20);
        paint.setColor(Color.BLACK);
        canvas.drawPoint(100, 100, paint);

        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200, 100, paint);

    }
}
