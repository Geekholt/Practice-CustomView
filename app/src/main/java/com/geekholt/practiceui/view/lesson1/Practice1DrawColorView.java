package com.geekholt.practiceui.view.lesson1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice1DrawColorView extends View {

    public Practice1DrawColorView(Context context) {
        this(context, null, 0);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice1DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawColor() 方法把 View 涂成黄色
//        黄色： Color.YELLOW
        canvas.drawColor(Color.YELLOW);
    }
}
