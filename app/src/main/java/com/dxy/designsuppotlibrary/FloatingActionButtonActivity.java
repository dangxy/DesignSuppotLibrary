package com.dxy.designsuppotlibrary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class FloatingActionButtonActivity extends AppCompatActivity {

    @InjectView(R.id.bt_floating_action_button)
    FloatingActionButton btFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        ButterKnife.inject(this);

        btFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"click",Snackbar.LENGTH_LONG).setAction("close", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(getApplicationContext(),"snack bar",Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }
        });
    }


}
