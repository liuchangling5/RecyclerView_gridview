package com.example.liuchangling.myapplication;

/**
 * Created by liuchangling on 2020/7/22.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
/**
 * Created by inerdstack on 2016/9/14.
 */
public class MyGridView extends GridView {

    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);

    }
}
