package com.geekholt.practiceui.view.lesson3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

import androidx.annotation.Nullable;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice02StaticLayoutView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
    String text2 = "a\nbc\ndefghi\njklm\nnopqrst\nuvwx\nyz";
    StaticLayout staticLayout1;
    StaticLayout staticLayout2;

    public Practice02StaticLayoutView(Context context) {
        super(context);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        textPaint.setTextSize(60);
//     StaticLayout 支持换行，它既可以为文字设置宽度上限来让文字自动换行，也会在 \n 处主动换行
//        width 是文字区域的宽度，文字到达这个宽度后就会自动换行；
//        align 是文字的对齐方向；
//        spacingmult 是行间距的倍数，通常情况下填 1 就好；
//        spacingadd 是行间距的额外增加值，通常情况下填 0 就好；
//        includepad 是指是否在文字上下添加额外的空间，来避免某些过高的字符的绘制出现越界。
        staticLayout1 = new StaticLayout(text1, textPaint, 600,
                Layout.Alignment.ALIGN_NORMAL, 1, 0, true);

        staticLayout2 = new StaticLayout(text2, textPaint, 600,
                Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 StaticLayout 代替 Canvas.drawText() 来绘制文字，
        // 以绘制出带有换行的文字
        canvas.save();
        canvas.translate(50, 100);
        staticLayout1.draw(canvas);
        canvas.translate(0, 300);
        staticLayout2.draw(canvas);
        canvas.restore();

    }
}
