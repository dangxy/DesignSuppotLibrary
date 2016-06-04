package com.dxy.designsuppotlibrary;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class TextInputLayoutActivity extends AppCompatActivity {

    @InjectView(R.id.et_username)
    EditText etUsername;
    @InjectView(R.id.tl_username)
    TextInputLayout tlUsername;
    @InjectView(R.id.et_password)
    EditText etPassword;
    @InjectView(R.id.tl_password)
    TextInputLayout tlPassword;
    @InjectView(R.id.login)
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input_layout);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.equals(etUsername.getText().toString(),"dang")){
                    tlUsername.setErrorEnabled(false);
                }else{
                    tlUsername.setErrorEnabled(true);
                    tlUsername.setError("用户名错误");

                }

                if (TextUtils.isEmpty(etPassword.getText().toString())) {
                    tlPassword.setErrorEnabled(true);
                    tlPassword.setError("密码不能为空!");
                } else {
                    tlPassword.setErrorEnabled(false);
                }
            }
        });
    }
}
