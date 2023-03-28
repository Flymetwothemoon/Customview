package view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class myView extends TextView {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public myView(Context context) {
        super(context);
        initDraw();
    }

    public myView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initDraw();
    }

    public myView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDraw();
    }

    public myView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initDraw();
    }
    public void initDraw(){
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth((float) 20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int left =  getWidth();
        int height = getHeight();
        canvas.drawLine(0,height,left,height,mPaint);
    }
}
