package com.alibaba.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn, btn2, btn3, btn4, btn5;
    private ImageView iv;
    private AnimationSet animationSet;
    // 渐变动画
    private AlphaAnimation alphaAnimation;
    // 旋转动画
    private RotateAnimation rotateAnimation;
    // 缩放动画
    private ScaleAnimation scaleAnimation;
    // 位移动画
    private TranslateAnimation translateAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) this.findViewById(R.id.animation_activity_btn01);
        btn2 = (Button) this.findViewById(R.id.animation_activity_btn02);
        btn3 = (Button) this.findViewById(R.id.animation_activity_btn03);
        btn4 = (Button) this.findViewById(R.id.animation_activity_btn04);
        btn5 = (Button) this.findViewById(R.id.animation_activity_btn05);
        iv = (ImageView) this.findViewById(R.id.imageView);
        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.animation_activity_btn01:
                animationSet = new AnimationSet(true);
                alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
                alphaAnimation.setDuration(3000);
                animationSet.addAnimation(alphaAnimation);
                iv.startAnimation(animationSet);

                break;
            case R.id.animation_activity_btn02:
                animationSet = new AnimationSet(true);
                scaleAnimation = new ScaleAnimation(0,0.1f,0,0.1f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
                scaleAnimation.setDuration(3000);
                animationSet.addAnimation(scaleAnimation);
                iv.startAnimation(animationSet);

                break;
            case R.id.animation_activity_btn03:
                animationSet = new AnimationSet(true);
                // int fromXType, float fromXValue, int toXType, float toXValue, int fromYType, float fromYValue, int toYType, float toYValue
                translateAnimation = new TranslateAnimation(Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,1.0f,Animation.RELATIVE_TO_SELF,0f,Animation.RELATIVE_TO_SELF,1.0f);
                translateAnimation.setDuration(3000);
                animationSet.addAnimation(translateAnimation);
                iv.setAnimation(animationSet);
                break;
            case R.id.animation_activity_btn04:
                animationSet = new AnimationSet(true);
                rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateAnimation.setDuration(3000);
                animationSet.addAnimation(rotateAnimation);
                iv.startAnimation(animationSet);
                break;
            case R.id.animation_activity_btn05:
                break;


        }
    }
}
