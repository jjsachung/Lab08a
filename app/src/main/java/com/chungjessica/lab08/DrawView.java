package com.chungjessica.lab08;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    private Paint grass = new Paint();
    private Paint duck = new Paint();
    private Paint wing = new Paint();
//    private int y = 0, dY = 5;
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        p.setColor(Color.CYAN);
//        canvas.drawCircle(100, y, 130.5f, p);
//        canvas.drawCircle(400, 200, 130.5f, new Paint());
//        y += dY;
//        y%=getHeight();
//        invalidate();
        grass.setColor(Color.argb(255, 107, 186, 99));
        duck.setColor(Color.argb(255, 237, 211, 95));
        wing.setColor(Color.argb(255, 237, 190, 36));
        wing.setStrokeWidth(12f);
        wing.setStyle(Paint.Style.STROKE);
        canvas.drawRect(0f, (float)(getHeight() * 0.5), (float)(getWidth()), (float)getHeight(), grass);
        canvas.drawOval((float)(getWidth() * 0.25), (float)(getHeight() * 0.35), (float)(getWidth() * 0.75), (float)(getHeight() * 0.55), duck);
        canvas.drawCircle(320f, 660f, 120f, duck);
        canvas.drawCircle(295f, 640f, 18f, new Paint());
        canvas.drawLine(480f, 800f, 640f, 850f, wing);
        canvas.drawArc(480f, 820f, 640f, 870f, 0, 150, false, wing);
    }

//    public int getdY() {
//        return dY;
//    }
//
//    public void setdY(int dY) {
//        this.dY = dY;
//    }
}
