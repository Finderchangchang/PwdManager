package yy.pwdmanager.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2016/12/26.
 */

public class DrawView extends View {
    //前一个拖动事件前，拖动的横纵坐标
    float prex;
    float preY;
    private Path path;
    private Paint paint;
    private Bitmap cache_Bitmip;//图片缓冲区
    private Canvas cache_canvas;

    public DrawView(Context context) {
        super(context);
        cache_Bitmip = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        cache_canvas = new Canvas();
        path = new Path();
        cache_canvas.setBitmap(cache_Bitmip);
        paint = new Paint(Paint.DITHER_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setAntiAlias(true);//设置反锯齿
        paint.setDither(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                prex = x;
                preY = y;
                break;
            case MotionEvent.ACTION_UP:
                cache_canvas.drawPath(path, paint);
                break;
            case MotionEvent.ACTION_MOVE:
                path.quadTo(prex, preY, x, y);
                prex = x;
                preY = y;
                break;
        }
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint1 = new Paint();
        canvas.drawBitmap(cache_Bitmip, 0, 0, paint1);
        if (!isClear) {
            canvas.drawPath(path, paint);
        } else {
            path = new Path();
            canvas.drawPath(path, paint);
            isClear = false;
        }
    }

    boolean isClear = false;

    public void clearImg() {

        isClear = true;
        invalidate();
    }
}
