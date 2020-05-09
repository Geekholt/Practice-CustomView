package com.geekholt.practiceui.view.lesson2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.Nullable;

import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import com.geekholt.practiceui.R;

public class Practice04BitmapShaderView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice04BitmapShaderView(Context context) {
        this(context, null);
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        // 用 Paint.setShader(shader) 设置一个 BitmapShader
        // Bitmap: R.drawable.batman
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);
        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        paint.setShader(shader);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(200, 200, 200, paint);
    }
}
