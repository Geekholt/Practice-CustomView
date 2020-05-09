package com.geekholt.practiceui.view.lesson2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;

import androidx.annotation.Nullable;

import android.util.AttributeSet;
import android.view.View;

import com.geekholt.practiceui.R;


public class Practice06LightingColorFilterView extends View {
    ColorFilter reduceRedFilter;
    ColorFilter addGreenFilter;
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice06LightingColorFilterView(Context context) {
        super(context);
    }

    public Practice06LightingColorFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06LightingColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);

//        R' = R * 0xff / 0xff + 0x0
//        G' = G * 0xff / 0xff + 0x0
//        B' = B * 0xff / 0xff + 0x0

//        R' = R * mul.R / 0xff + add.R
//        G' = G * mul.G / 0xff + add.G
//        B' = B * mul.B / 0xff + add.B
        reduceRedFilter = new LightingColorFilter(0x00ffff, 0x000000);
        addGreenFilter = new LightingColorFilter(0xffffff, 0x003000);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 Paint.setColorFilter() 来设置 LightingColorFilter

        // 第一个 LightingColorFilter：去掉红色部分
        paint.setColorFilter(reduceRedFilter);
        canvas.drawBitmap(bitmap, 0, 0, paint);

        // 第二个 LightingColorFilter：增强绿色部分
        paint.setColorFilter(addGreenFilter);
        canvas.drawBitmap(bitmap, bitmap.getWidth() + 100, 0, paint);

    }
}
