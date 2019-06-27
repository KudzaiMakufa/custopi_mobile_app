package com.cust.custopi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Login extends AppCompatActivity {


    private static Button  buttonLogin , btnRegister ,test ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);





            OnclickButtonListener();



    }
    @Override
    public void onBackPressed() {

                        Login.super.onBackPressed();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    public void OnclickButtonListener(){

        btnRegister = (Button) findViewById(R.id.btnRegister)  ;
        buttonLogin = (Button)findViewById(R.id.btn_save);
        buttonLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {





                        final EditText edemail = (EditText)findViewById(R.id.edtxtemail);
                        final EditText edpass = (EditText)findViewById(R.id.editTextPassword);
                        final TextView textView5 = (TextView)findViewById(R.id.textView5);
                        final ImageView imageView = (ImageView)findViewById(R.id.imageView);
                        final Button btnRetry = (Button)findViewById(R.id.btnRetry);
                        final Button btnRegister = (Button)findViewById(R.id.btnRegister);






                        if(edemail.getText().equals("") && edpass.getText().equals(""))
                        {




                            edemail.setVisibility(View.GONE);
                            edpass.setVisibility(View.GONE);
                            textView5.setVisibility(View.GONE);
                            buttonLogin.setVisibility(View.GONE);
                            btnRegister.setVisibility(View.GONE);


                            imageView.setVisibility(View.VISIBLE);
                            btnRetry.setVisibility(View.VISIBLE);
                            btnRetry.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    imageView.setVisibility(View.GONE);
                                    btnRetry.setVisibility(View.GONE);

                                    edemail.setVisibility(View.VISIBLE);
                                    edpass.setVisibility(View.VISIBLE);
                                    textView5.setVisibility(View.VISIBLE);
                                    buttonLogin.setVisibility(View.VISIBLE);

                                }
                            });

                        }
                        else
                        {

                            Intent intent = new Intent(".Welcome");
                            startActivity(intent);


                        }


                        }


                    }

        );
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Failed to connect to server", Toast.LENGTH_SHORT).show();
            }
        });


    }



}
