package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;

import androidx.annotation.Nullable;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;


public class Practice9DrawPathView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    public Practice9DrawPathView(Context context) {
        this(context, null);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        canvas.drawPath(path, paint);


    }
}
