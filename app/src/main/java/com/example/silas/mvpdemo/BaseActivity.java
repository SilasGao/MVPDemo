package com.example.silas.mvpdemo;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Silas on 2016/10/7.
 */
public abstract class BaseActivity<T extends BasePresenter> extends Activity {
    
    protected T basepresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initView();
        basepresenter = initPresent();
        onPrepare();
    }

    abstract T initPresent();

    abstract int getLayout();

    abstract void initView();

    abstract void onPrepare();
}
