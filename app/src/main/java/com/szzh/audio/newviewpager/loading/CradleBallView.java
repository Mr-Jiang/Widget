package com.szzh.audio.newviewpager.loading;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jzz
 * on 2017/6/18.
 * <p>
 * desc:
 */

public class CradleBallView extends View {


    private int width;

    private int height;

    private Paint paint;

    public CradleBallView(Context context) {

        super(context);

        initView();

    }

    public CradleBallView(Context context, AttributeSet attrs) {

        super(context, attrs);

        initView();

    }

    public CradleBallView(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);

        initView();

    }

    private void initView() {

        paint = new Paint();

        paint.setColor(Color.WHITE);

        paint.setStyle(Paint.Style.FILL);

        paint.setAntiAlias(true);

    }

    @Override

    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        super.onSizeChanged(w, h, oldw, oldh);

        width = w;

        height = h;

    }

    @Override

    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

        canvas.drawCircle(width / 2, height / 2, width / 2, paint);

    }

}
