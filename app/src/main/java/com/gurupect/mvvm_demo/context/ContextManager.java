package com.gurupect.mvvm_demo.context;

import android.content.Context;

public class ContextManager {
    private Context appContext;
    private volatile static ContextManager contextManager = null;

    private ContextManager() {
    }

    public static ContextManager getInstance() {
        if (contextManager == null) {
            synchronized (ContextManager.class) {
                if (contextManager == null) {
                    contextManager = new ContextManager();
                }
            }
        }
        return contextManager;
    }

    public Context getAppContext() {
        return appContext;
    }

    public void setAppContext(Context context) {
        appContext = context;
    }
}
