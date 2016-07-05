package com.alibaba.animation2;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btn,btn2;
    private ImageView iv;
    private AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) this.findViewById(R.id.animation2_iv01);
        btn = (Button) this.findViewById(R.id.animation2_btn01);
        btn2 = (Button) this.findViewById(R.id.animation2_btn02);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        iv = (ImageView) this.findViewById(R.id.animation2_iv01);
        animationDrawable = (AnimationDrawable) iv.getDrawable();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.animation2_btn01:
                animationDrawable.start();
                break;
            case R.id.animation2_btn02:
                animationDrawable.stop();
                break;
        }
    }
}
