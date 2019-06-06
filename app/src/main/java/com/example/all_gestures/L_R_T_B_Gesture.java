package com.example.all_gestures;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class L_R_T_B_Gesture extends AppCompatActivity implements View.OnTouchListener,GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
    TextView tvSwipDescription;
    private static final String DEBUG_TAG = "Gestures";
    private GestureDetectorCompat mDetector;
    private LottieAnimationView animationView;
    Dialog left_dialog;

    @Override
    @SuppressLint("ClickableViewAccessibility")
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        left_dialog=new Dialog(this);
        initializeView();
        mDetector = new GestureDetectorCompat(getApplicationContext(), this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(this);


        tvSwipDescription.setOnTouchListener(new OnSwipeTouchListener(getApplicationContext()) {
            public void onSwipeTop() {
               // Toast.makeText(getApplicationContext(), "top", Toast.LENGTH_SHORT).show();
                Top_Popup();
            }
            public void onSwipeRight() {
               // Toast.makeText(getApplicationContext(),"right", Toast.LENGTH_SHORT).show();
                Right_Popup();
            }
            public void onSwipeLeft() {
                left_Popup();
              //  Toast.makeText(getApplicationContext(),
                     //   "Left", Toast.LENGTH_SHORT).show();

            }
            public void onSwipeBottom() {
                //Toast.makeText(getApplicationContext(),"Bottom", Toast.LENGTH_SHORT).show();
                Bottom_Popup();
            }


        });


    }

    public void left_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.left_custom_popup);
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

    public void Right_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.right_custom_popup);
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

    public void Top_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.top_custom_popup);
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

    public void Bottom_Popup()
    {
        TextView txtclose;
        Button btnFollow;
        left_dialog.setContentView(R.layout.bottom_custom_popup);
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





    @Override
    public boolean onTouchEvent(MotionEvent event){
        if (this.mDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }
    private void initializeView() {

        tvSwipDescription=(TextView) findViewById(R.id.tvSwipDescription);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(getApplicationContext(),"oooooo", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Toast.makeText(getApplicationContext(),"llllll", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Toast.makeText(getApplicationContext(),"trttrtrrt", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Toast.makeText(getApplicationContext(),"gfgf", Toast.LENGTH_SHORT).show();
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}

       /* mDetector = new GestureDetectorCompat(this, this);
        // Set the gesture detector as the double tap
        // listener.
        mDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = MotionEventCompat.getActionMasked(event);

        switch (action) {
            case (MotionEvent.ACTION_DOWN):
                onDown(event);
            case (MotionEvent.ACTION_MOVE):
                onLongPress(event);
            case (MotionEvent.ACTION_UP):

            case (MotionEvent.ACTION_CANCEL):
                onLongPress(event);
            case (MotionEvent.ACTION_OUTSIDE):
                onLongPress(event);
            default:
                return super.onTouchEvent(event);
        }
    }


    ///////// GESTURE METHODS //////////
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("SingleTabConfirmed Gestures");
        builder.setMessage("You Press on tab of screen of it is Single Tap Confirmed Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("DoubleTap Gestures");
        builder.setMessage("You Press on tab of screen of it is DoubleTap Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("DoubleTap Event Gestures");
        builder.setMessage("You Press on tab of screen of it is DoubleTap Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("Down Event Gestures");
        builder.setMessage("You Press on tab of screen of it is Down Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

        dilogbox();


    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("DSingleTapUp Event Gestures");
        builder.setMessage("You Press on tab of screen of it is SingleTapUp Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("Scroll Event Gestures");
        builder.setMessage("You Press on tab of screen of it is Scroll Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("LongPress Event Gestures");
        builder.setMessage("You Press on tab of screen of it is LongPress Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(L_R_T_B_Gesture.this);
        builder.setTitle("Fling Event Gestures");
        builder.setMessage("You Press on tab of screen of it is Fling Event Gesture call")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                    public void onClick(DialogInterface dialog, int id) {

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        android.app.AlertDialog alert = builder.create();
        alert.show();
        return true;
    }

    ///////// GESTURE METHODS //////////




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        ///getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void dilogbox() {

    }
}


*/