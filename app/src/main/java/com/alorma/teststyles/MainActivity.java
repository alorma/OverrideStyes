package com.alorma.teststyles;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.alorma.inbox.InboxActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    View buttonDefault = findViewById(R.id.buttonDefault);
    buttonDefault.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startIntent(InboxActivity.class);
      }
    });


    View buttonCustom = findViewById(R.id.buttonCustom);
    buttonCustom.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startIntent(CustomThemeInboxActivity.class);
      }
    });


  }

  private void startIntent(Class<? extends Activity> activityClass) {
    Intent intent = new Intent(this, activityClass);
    startActivity(intent);
  }
}
