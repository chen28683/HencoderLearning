package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice5DrawOvalView extends View {

    public Practice5DrawOvalView(Context context) {
        super(context);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice5DrawOvalView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint1 = new Paint();
        paint1.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawOval(50, 50, 350, 200, paint1);
        }

        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawOval(400, 50, 700, 200, paint2);
        }
//        练习内容：使用 canvas.drawOval() 方法画椭圆
    }
}
