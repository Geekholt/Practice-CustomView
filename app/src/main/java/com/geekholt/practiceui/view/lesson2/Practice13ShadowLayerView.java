package com.geekholt.practiceui.view.lesson2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class Practice13ShadowLayerView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice13ShadowLayerView(Context context) {
        super(context);
    }

    public Practice13ShadowLayerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice13ShadowLayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // 使用 Paint.setShadowLayer() 设置阴影
        //radius 是阴影的模糊范围； dx dy 是阴影的偏移量； shadowColor 是阴影的颜色
        paint.setShadowLayer(10, 0, 0, Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setTextSize(120);
        canvas.drawText("Hello Geekholt", 50, 200, paint);
    }
}
