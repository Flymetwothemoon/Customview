package view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class myView1 extends View {
    public Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public myView1(Context context) {
        super(context);
        initDraw();
    }
    public myView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initDraw();
    }

    public myView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDraw();
    }

    public myView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initDraw();
    }
    private void initDraw() {
        mPaint.setColor(Color.BLUE);
        mPaint.setStrokeWidth((float) 20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int left = getWidth();
        int top = getHeight();
        canvas.drawRect(0,0,left,top,mPaint);
    }
}
