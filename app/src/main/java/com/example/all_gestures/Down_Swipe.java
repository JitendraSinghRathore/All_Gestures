package com.example.all_gestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.liuguangqiang.swipeback.SwipeBackLayout;


public class Down_Swipe extends AppCompatActivity {

    private SwipeBackLayout swipeBackLayout;
    ImageView cross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe);
        cross=(ImageView)findViewById(R.id.cross);
        initViews();
    }
    private void initViews() {
        swipeBackLayout = (SwipeBackLayout) findViewById(R.id.swipe_layout);
        swipeBackLayout.setEnableFlingBack(false);

        swipeBackLayout.setOnPullToBackListener(new SwipeBackLayout.SwipeBackListener() {
            @Override
            public void onViewPositionChanged(float fractionAnchor, float fractionScreen) {
                Toast.makeText(getApplicationContext(),"Down Down_Swipe",Toast.LENGTH_SHORT).show();
                cross.setImageResource(R.drawable.ic_launcher);

            }
        });
    }
}
