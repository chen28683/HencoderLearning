package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaint1;
    private Paint mPaint2;
    private Paint mPaint3;
    private Paint mPaint4;

    private void init() {
        mPaint1 = new Paint();
        mPaint2 = new Paint();
        mPaint3 = new Paint();
        mPaint4 = new Paint();
        mPaint1.setColor(Color.BLACK);
        mPaint2.setColor(Color.BLACK);
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setStrokeWidth(4);

        mPaint2.setAntiAlias(true);//抗锯齿，不然边缘很粗糙

        mPaint3.setColor(Color.BLUE);
        mPaint4.setColor(Color.BLACK);
        mPaint4.setShadowLayer(5, 5, 5, Color.GRAY);
        //setShadowLayer 不支持硬件加速，需要关闭
        setLayerType(LAYER_TYPE_SOFTWARE, null);
        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(20);
    }

    public Practice2DrawCircleView(Context context) {
        super(context);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(100, 100, 100, mPaint1);
        canvas.drawCircle(400, 100, 100, mPaint2);
        canvas.drawCircle(100, 400, 100, mPaint3);
        canvas.drawCircle(400, 400, 100, mPaint4);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
