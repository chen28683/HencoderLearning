package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint linePaint = new Paint();
    Paint gramPaint = new Paint();
    int[] height = {30, 50, 100, 200, 400, 450, 500};
    String[] title = {"a", "b", "c", "d", "e", "f", "z"};
    private final int CELL_WIDTH = 50;
    private final int BASELINE = 500;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        linePaint.setColor(Color.WHITE);
        linePaint.setTextSize(30);
        canvas.drawLine(100, 50, 100, BASELINE, linePaint);
        canvas.drawLine(100, BASELINE, 800, BASELINE, linePaint);
        gramPaint.setColor(Color.GREEN);
        int left = 100;
        for (int i = 0; i < height.length; i++) {
            left += CELL_WIDTH;
            Rect rect = new Rect(left, BASELINE - height[i], left + CELL_WIDTH, BASELINE);
            canvas.drawText(title[i], left, BASELINE + 20, linePaint);
            left += CELL_WIDTH;
            canvas.drawRect(rect, gramPaint);
        }
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
