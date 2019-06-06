package com.example.all_gestures;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Click_Gestures extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,GestureDetector.OnGestureListener {

    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    Dialog left_dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
        left_dialog=new Dialog(this);
        getSupportActionBar().hide();

        mDetector = new GestureDetectorCompat(this,this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(this);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent event) {
        Log.d(DEBUG_TAG,"onDown: " + event.toString());

        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2,
                           float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onLongPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onLongPress: " + event.toString());
      //  Toast.makeText(getApplicationContext(),"onLongPress",Toast.LENGTH_SHORT).show();
        long_press_Popup();
    }

    @Override
    public boolean onScroll(MotionEvent event1, MotionEvent event2, float distanceX,
                            float distanceY) {
        Log.d(DEBUG_TAG, "onScroll: " + event1.toString() + event2.toString());
        return true;
    }

    @Override
    public void onShowPress(MotionEvent event) {
        Log.d(DEBUG_TAG, "onShowPress: " + event.toString());
    }

    @Override
    public boolean onSingleTapUp(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapUp: " + event.toString());
       // Toast.makeText(getApplicationContext(),"onSingleTapUp",Toast.LENGTH_SHORT).show();
        single_tab_Popup();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTap: " + event.toString());
       // Toast.makeText(getApplicationContext(),"onDoubleTap",Toast.LENGTH_SHORT).show();
        double_tab_Popup();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent event) {
        Log.d(DEBUG_TAG, "onDoubleTapEvent: " + event.toString());
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent event) {
        Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + event.toString());
      //  Toast.makeText(getApplicationContext(),"onSingleTapConfirmed",Toast.LENGTH_SHORT).show();
        return true;
    }

    public void single_tab_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.single_tab_custom_popup);
        txtclose =(TextView) left_dialog.findViewById(R.id.txtclose);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left_dialog.dismiss();
            }
        });
        left_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        left_dialog.show();
    }
    public void double_tab_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.double_tab_custom_popup);
        txtclose =(TextView) left_dialog.findViewById(R.id.txtclose);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left_dialog.dismiss();
            }
        });
        left_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        left_dialog.show();
    }
    public void long_press_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.long_press_custom_popup);
        txtclose =(TextView) left_dialog.findViewById(R.id.txtclose);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                left_dialog.dismiss();
            }
        });
        left_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        left_dialog.show();
    }

}