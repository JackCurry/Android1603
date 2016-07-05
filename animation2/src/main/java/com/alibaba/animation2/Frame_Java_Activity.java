package com.alibaba.animation2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Frame_Java_Activity extends AppCompatActivity implements View.OnClickListener{
    private Button btn,btn2;
    private ImageView iv;
    private AnimationDrawable animationDrawable = new AnimationDrawable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__java_);
        btn = (Button) this.findViewById(R.id.frame_java_btn01);
        btn2 = (Button) this.findViewById(R.id.frame_java_btn02);
        iv = (ImageView) this.findViewById(R.id.frame_java_iv01);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);

        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic6) , 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic5) , 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic4) , 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic3) , 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic2) , 50);
        animationDrawable.addFrame(getResources().getDrawable(R.drawable.pic1) , 50);

        animationDrawable.setOneShot(false);
        iv.setBackgroundDrawable(animationDrawable);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.frame_java_btn01:
                animationDrawable.start();
                break;
            case R.id.frame_java_btn02:
                animationDrawable.stop();
                break;
        }
    }
}
