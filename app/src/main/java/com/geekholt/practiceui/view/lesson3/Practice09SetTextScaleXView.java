package com.geekholt.practiceui.view.lesson3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice09SetTextScaleXView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello Geekholt";

    public Practice09SetTextScaleXView(Context context) {
        super(context);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice09SetTextScaleXView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        // 使用 Paint.setTextScaleX() 来改变文字宽度
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setTextScaleX(1);
        canvas.drawText(text, 100, 150, paint);
        paint.setTextScaleX(0.8f);
        canvas.drawText(text, 100, 230, paint);
        paint.setTextScaleX(1.2f);
        canvas.drawText(text, 100, 310, paint);
    }
}
