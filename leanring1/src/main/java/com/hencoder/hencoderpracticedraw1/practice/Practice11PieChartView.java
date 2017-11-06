package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paint = new Paint();
    float[] percent = {0.1f, 0.3f, 0.4f, 0.1f, 0.05f};
    int[] colors = {Color.GRAY, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN};

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float angle = 0f;
        for (int i = 0; i < percent.length; i++) {
            paint.setColor(colors[i]);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                canvas.drawArc(100, 100, 600, 600, angle * 360, percent[i] * 360, true, paint);
            }
            angle += percent[i] + 0.008;
        }
        if (angle < 0.992) {
            paint.setColor(Color.BLACK);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                canvas.drawArc(100, 100, 600, 600, angle * 360, (1 - angle) * 360, true, paint);
            }
        }
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
