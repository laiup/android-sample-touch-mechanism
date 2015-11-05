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

    /*
     * #description:
     * Life cycle (all method return false) : Activity - dispatchTouchEvent() -> supper.dispatchTouchEvent() call Layout - dispatchTouchEvent()
     * -> supper.dispatchTouchEvent() -> call View - dispatchTouchEvent() -> super.dispatchTouchEvent()
     * call View - onTouchEvent() -> View - dispatchTouchEvent() -> Layout - TouchEvent() -> Layout - dispatchTouchEvent()
     * -> Activity - onTouchEvent() -> Activity - dispatchTouchEvent()
     *
     * - in dispatchTouchEvent : super.dispatchTouchEvent -> call onInterceptTouchEvent
     * - if in dispatchTouchEvent you don't call super.dispatchTouchEvent -> Touch Lifecycle will be stopped there.
     */
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
        boolean result = true;
        result = super.dispatchTouchEvent(ev);
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
        boolean result = true;
        result = super.onInterceptTouchEvent(ev);
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
        boolean result = true;
        result = super.onTouchEvent(ev);
        L.m("Layout onTouchEvent RETURN : " + result);
        return result;
    }
}
