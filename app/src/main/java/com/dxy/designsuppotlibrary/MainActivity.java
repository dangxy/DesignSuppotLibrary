package com.dxy.designsuppotlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.bt_floating_action_button)
    Button btFloatingActionButton;
    @InjectView(R.id.bt_snack_bar_button)
    Button btSnackBarButton;
    @InjectView(R.id.bt_Text_Input_button)
    Button btTextInputButton;
    @InjectView(R.id.bt_coordinator_layout_button)
    Button btCoordinatorLayoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {

        btFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), FloatingActionButtonActivity.class);

                startActivity(intent);


            }
        });

        btSnackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SnackBarActivity.class);

                startActivity(intent);
            }
        });

        btTextInputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TextInputLayoutActivity.class);

                startActivity(intent);
            }
        });
        btCoordinatorLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CoordinatorLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
