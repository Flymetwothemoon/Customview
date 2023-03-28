package view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class myView2 extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public myView2(Context context) {
        super(context);
        initPaint();
    }

    public myView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public myView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    public myView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initPaint();
    }
    public void initPaint(){
        mPaint.setColor(Color.GREEN);
        mPaint.setStrokeWidth((float)20);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int wigth = getWidth()-paddingLeft-paddingRight;
        int height = getHeight()-paddingBottom-paddingTop;
        canvas.drawRect(0+paddingLeft,0+paddingTop,wigth+paddingLeft
        ,height+paddingTop,mPaint);
    }
}
