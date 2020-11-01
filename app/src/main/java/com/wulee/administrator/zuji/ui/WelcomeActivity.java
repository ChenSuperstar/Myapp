package com.wulee.administrator.zuji.ui;

/**
 * Created by {zht} on 2020-11-02.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import com.wulee.administrator.zuji.R;

/**
 * 欢迎界面
 */
public class WelcomeActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_welcome);
    //两秒钟进入MainActivity
    new Handler().postDelayed(new Runnable() {
      @Override
      public void run() {
        //启动MainActivity主页面，这段代码是在主线程执行
        startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
        //关闭当前页面（结束WelcomeActivity）
        finish();
      }
    },2000);
  }
}

