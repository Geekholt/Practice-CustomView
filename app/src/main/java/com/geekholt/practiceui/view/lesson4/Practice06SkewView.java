package com.geekholt.practiceui.view.lesson4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.geekholt.practiceui.R;

public class Practice06SkewView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    Point point1 = new Point(200, 200);
    Point point2 = new Point(600, 200);

    public Practice06SkewView(Context context) {
        super(context);
    }

    public Practice06SkewView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice06SkewView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//       sx 和 sy 是 x 方向和 y 方向的错切系数

        canvas.save();
        canvas.skew(0, 0.5f);
        canvas.drawBitmap(bitmap, point1.x, point1.y, paint);
        canvas.restore();

        canvas.save();
        canvas.skew(-0.5f, 0);
        canvas.drawBitmap(bitmap, point2.x, point2.y, paint);
        canvas.restore();
    }
}
