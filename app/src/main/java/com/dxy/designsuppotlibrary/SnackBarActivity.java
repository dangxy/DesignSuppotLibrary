package com.dxy.designsuppotlibrary;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SnackBarActivity extends AppCompatActivity {

    @InjectView(R.id.normal_snack_bar_button)
    Button normalSnackBarButton;
    @InjectView(R.id.action_snack_bar_button)
    Button actionSnackBarButton;
    @InjectView(R.id.custom_snack_bar_button)
    Button customSnackBarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        ButterKnife.inject(this);
        normalSnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Normal Snack Bar", Snackbar.LENGTH_LONG).show();
            }
        });
        actionSnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(v, "ActionSnackBarShow", Snackbar.LENGTH_LONG);

                snackbar.setActionTextColor(ContextCompat.getColor(SnackBarActivity.this, android.R.color.holo_blue_light)).setAction("I konw", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        snackbar.dismiss();
                    }
                }).show();

            }
        });
        customSnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Snackbar snackbar =Snackbar.make(v,"CustomSnackBarShow",Snackbar.LENGTH_LONG);
               View view =  snackbar.getView();

                ((TextView)view.findViewById(R.id.snackbar_text)).setTextColor(ContextCompat.getColor(SnackBarActivity.this, android.R.color.holo_green_dark));
                view.setBackgroundColor(ContextCompat.getColor(SnackBarActivity.this, android.R.color.holo_orange_dark));
                view.setAlpha(0.8f);
                ViewGroup.LayoutParams V1 = view.getLayoutParams();
                LinearLayout.LayoutParams ll =new LinearLayout.LayoutParams(V1.width,V1.height);
                ll.gravity = Gravity.TOP;
                view.setLayoutParams(ll);
                snackbar.show();
            }
        });
    }
}
