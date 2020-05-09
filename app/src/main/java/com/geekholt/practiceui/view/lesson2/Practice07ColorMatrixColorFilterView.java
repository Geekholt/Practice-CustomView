package com.geekholt.practiceui.view.lesson2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.geekholt.practiceui.R;


public class Practice07ColorMatrixColorFilterView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;

    public Practice07ColorMatrixColorFilterView(Context context) {
        super(context);
    }

    public Practice07ColorMatrixColorFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice07ColorMatrixColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);

        // 使用 setColorFilter() 设置一个 ColorMatrixColorFilter
        // 用 ColorMatrix.setSaturation() 把饱和度去掉
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0f);
        ColorMatrixColorFilter colorFilter = new ColorMatrixColorFilter(colorMatrix);
        paint.setColorFilter(colorFilter);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(bitmap, 0, 0, paint);
    }
}
