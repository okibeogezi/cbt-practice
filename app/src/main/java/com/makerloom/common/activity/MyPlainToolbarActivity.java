package com.makerloom.common.activity;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.makerloom.ujcbt.R;

/**
 * Created by michael on 4/11/18.
 */

public class MyPlainToolbarActivity extends MyAppCompatActivity {
    public void setupToolbar () {
        toolbar = (Toolbar) this.findViewById(R.id.toolbar);

        if (null == toolbar) {
            return;
        }

        try {
            toolbar.setTitleTextAppearance(this, R.style.ToolbarTitle);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        if (null != toolbar) {
            this.setSupportActionBar(toolbar);

            ActionBar actionBar = this.getSupportActionBar();
            if (null != actionBar) {
                // actionBar.setDisplayHomeAsUpEnabled(true);
                // actionBar.setHomeButtonEnabled(true);
            }
        }
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setupToolbar();
    }
}
