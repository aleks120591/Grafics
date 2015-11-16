package kr.aleks.grafics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by BETMAN on 16.11.2015.
 */
public class Draw2D extends View{

    private Paint mPaint = new Paint();

    public Draw2D(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);
    }
}
