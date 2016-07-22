package com.reven.dashline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

/**
 * Created by LiuCongshan on 2016/7/16.
 * DashLine
 */
public class DashLine extends View {
    private Paint paintLine;
    private int offset = 10;
    private int dashWidth = 10;

    public DashLine(Context context, AttributeSet attrs) {
        super(context, attrs);
        paintLine = new Paint();
        paintLine.setColor(0XFFFF0000);
        paintLine.setStrokeWidth(4);
    }

    public void setColor(int color) {
        paintLine.setColor(color);
        invalidate();
    }

    private int dp2px(int dp) {
        DisplayMetrics dm = getContext().getResources().getDisplayMetrics();
        return (int) (dm.density * dp);
    }

    public void setHeight(int height) {
        paintLine.setStrokeWidth(dp2px(height));
        invalidate();
    }

    public void setOffset(int offset) {
        this.offset = dp2px(offset);
        invalidate();
    }

    public void setDashWidth(int dashWidth) {
        this.dashWidth = dp2px(dashWidth);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        int start = 0;
        while (start < width) {
            canvas.drawLine(start, height / 2, start + dashWidth, height / 2, paintLine);
            start += (offset + dashWidth);
        }
    }
}
