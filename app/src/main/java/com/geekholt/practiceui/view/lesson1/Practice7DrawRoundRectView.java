package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;

import androidx.annotation.Nullable;

import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class Practice7DrawRoundRectView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice7DrawRoundRectView(Context context) {
        this(context, null);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        //rx 和 ry 是圆角的横向半径和纵向半径
        canvas.drawRoundRect(100, 100, 300, 200, 20, 20, paint);
    }
}
