package com.chungjessica.lab08;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    private Paint grass = new Paint();
    private Paint duck = new Paint();
    private Paint wing = new Paint();
    private Paint beak = new Paint();
    private Paint cloud = new Paint();
    private int duckY = 0, duckdY = 1;
    private int cloudX = 0, clouddX = 1;
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
        beak.setColor(Color.argb(255, 245, 164, 66));
        grass.setShader(new LinearGradient(0, (float)(getHeight() * 0.5), 0, (float)getHeight(),
                Color.argb(255, 107, 186, 99),
                Color.argb(255, 59, 92, 59),
                Shader.TileMode.MIRROR));
        cloud.setColor(Color.WHITE);
        wing.setStrokeWidth(12f);
        beak.setStyle(Paint.Style.FILL);
        beak.setStrokeWidth(20f);
        wing.setStyle(Paint.Style.STROKE);
        canvas.drawRect(0f, (float)(getHeight() * 0.5), (float)(getWidth()), (float)getHeight(), grass);
        canvas.drawCircle(620f, 250f, 150f, duck);
        canvas.drawCircle(300 + cloudX, 310f, 110f, cloud);
        canvas.drawCircle(450 + cloudX, 280f, 150f, cloud);
        canvas.drawCircle(520f + cloudX, 170f, 100f, cloud);
        canvas.drawCircle(620f + cloudX, 290f, 130f, cloud);
        canvas.drawCircle(750f + cloudX, 340f, 80f, cloud);

        canvas.drawLine(440f, 1020f, 440f, 1160f, beak);
        canvas.drawLine(440f, 1160f, 360f, 1220f, beak);
        canvas.drawLine(440f, 1160f, 440f, 1240f, beak);
        canvas.drawLine(640f, 1020f, 640f, 1160f, beak);
        canvas.drawLine(640f, 1160f, 560f, 1220f, beak);
        canvas.drawLine(640f, 1160f, 640f, 1240f, beak);
        canvas.drawOval((float)(getWidth() * 0.25), (float)(getHeight() * 0.35), (float)(getWidth() * 0.75), (float)(getHeight() * 0.55), duck);
        canvas.drawCircle(320f, 660f, 120f, duck);
        canvas.drawCircle(295f, 640f, 18f, new Paint());
        canvas.drawLine(480f, 800f, 640f, (float)(850 + duckY), wing);
        canvas.drawArc(480f, (float)(820 + duckY), 640f, (float)(870 + duckY), 0, 150, false, wing);
        Path beakPath = new Path();
        beakPath.moveTo(205f, 620f);
        beakPath.lineTo(130f, 680f);
        beakPath.lineTo(230f, 710f);
        beakPath.lineTo(205f, 620f);
        canvas.drawPath(beakPath, beak);
        Path tailPath = new Path();
        tailPath.moveTo(780f, 860f);
        tailPath.lineTo(900f, 830f);
        tailPath.lineTo(780f, 930f);
        tailPath.lineTo(780f, 860f);
        canvas.drawPath(tailPath, duck);
        duckY += duckdY;
        if(duckY > 50)
            duckdY *= -1;
        else if(duckY < 0)
            duckdY *= -1;
        cloudX += clouddX;
        if(cloudX > 200)
            clouddX *= -1;
        if(cloudX < -80)
            clouddX *= -1;
        invalidate();
    }

//    public int getdY() {
//        return dY;
//    }
//
//    public void setdY(int dY) {
//        this.dY = dY;
//    }
}
