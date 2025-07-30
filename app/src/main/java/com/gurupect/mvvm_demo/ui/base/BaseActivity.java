package com.gurupect.mvvm_demo.ui.base;

import android.content.Context;
import android.os.Bundle;

import com.gurupect.mvvm_demo.context.ContextManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ContextManager.getInstance().setAppContext(setContext());
    }

    public abstract Context setContext();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


}
