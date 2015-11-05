package co.laiup.sample.touchmechanism;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // #init component
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("Activity dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("Activity dispatchTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("Activity dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("Activity dispatchTouchEvent ACTION_CANCEL");
                break;
        }

        boolean result = super.dispatchTouchEvent(ev);
        L.m("Activity dispatchTouchEvent RETURN : " + result);
        return result;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                L.m("Activity onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                L.m("Activity onTouchEvent ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                L.m("Activity onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                L.m("Activity onTouchEvent ACTION_CANCEL");
                break;
        }

        boolean result = super.onTouchEvent(ev);
        L.m("Activity onTouchEvent RETURN : " + result);
        return result;
    }
}
