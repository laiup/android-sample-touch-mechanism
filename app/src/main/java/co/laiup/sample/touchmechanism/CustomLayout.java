package co.laiup.sample.touchmechanism;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Project android-sample-touch-mechanism
 * Created by Ha on 11/5/2015.
 */
public class CustomLayout extends RelativeLayout {


    public CustomLayout(Context context) {
        super(context);
    }

    public CustomLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("Layout dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("Layout dispatchTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("Layout dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("Layout dispatchTouchEvent ACTION_CANCEL");
                break;
        }

        boolean result = super.dispatchTouchEvent(ev);
        L.m("Layout dispatchTouchEvent RETURN : " + result);
        return result;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("Layout onInterceptTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("Layout onInterceptTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("Layout onInterceptTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("Layout onInterceptTouchEvent ACTION_CANCEL");
                break;
        }

        boolean result = super.onInterceptTouchEvent(ev);
        L.m("Layout onInterceptTouchEvent RETURN : " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("Layout onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("Layout onTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("Layout onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("Layout onTouchEvent ACTION_CANCEL");
                break;
        }

        boolean result = super.onTouchEvent(ev);
        L.m("Layout onTouchEvent RETURN : " + result);
        return result;
    }
}
