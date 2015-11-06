package co.laiup.sample.touchmechanism;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Project android-sample-touch-mechanism
 * Created by Ha on 11/5/2015.
 */
public class CustomView extends Button {


    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("View dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("View dispatchTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("View dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("View dispatchTouchEvent ACTION_CANCEL");
                break;
        }
        boolean result = false;
        result = super.dispatchTouchEvent(ev);
        L.m("View dispatchTouchEvent RETURN : " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        /*
         * Block touch event for layout (parent of this view)
         * Ex: Scroll RecyclerView into a ScrollView
         */
        getParent().requestDisallowInterceptTouchEvent(true);

        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("View onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("View onTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("View onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("View onTouchEvent ACTION_CANCEL");
                break;
        }
        boolean result = true;
//        result = super.onTouchEvent(ev);
        L.m("View onTouchEvent RETURN : " + result);
        return result;
    }
}
