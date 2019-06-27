package com.cust.custopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity implements View.OnClickListener {
    ImageView one ,two ,three , four , five , six ,seven ,eight,nine , ten , eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        one = (ImageView)findViewById(R.id.imageView30);
        one.setOnClickListener(this);
        two = (ImageView)findViewById(R.id.imageView32);
        two.setOnClickListener(this);
        three = (ImageView)findViewById(R.id.imageView33);
        three.setOnClickListener(this);
        four = (ImageView)findViewById(R.id.imageView25);
        four.setOnClickListener(this);
        five    = (ImageView)findViewById(R.id.imageView26);
        five.setOnClickListener(this);
        six = (ImageView)findViewById(R.id.imageView27);
        six.setOnClickListener(this);
        seven = (ImageView)findViewById(R.id.imageView22);
        seven.setOnClickListener(this);
        eight = (ImageView)findViewById(R.id.imageView23);
        eight.setOnClickListener(this);
        nine = (ImageView)findViewById(R.id.imageView24);
        nine.setOnClickListener(this);
        ten = (ImageView)findViewById(R.id.imageView34);
        ten.setOnClickListener(this);
        eleven = (ImageView)findViewById(R.id.imageView36);
        eleven.setOnClickListener(this);
        twelve = (ImageView)findViewById(R.id.imageView37);
        twelve.setOnClickListener(this);
        thirteen = (ImageView)findViewById(R.id.imageView38);
        thirteen.setOnClickListener(this);
        fourteen = (ImageView)findViewById(R.id.imageView39);
        fourteen.setOnClickListener(this);
        fifteen = (ImageView)findViewById(R.id.imageView40);
        fifteen.setOnClickListener(this);
        sixteen = (ImageView)findViewById(R.id.imageView41);
        sixteen.setOnClickListener(this);
        seventeen = (ImageView)findViewById(R.id.imageView43);
        seventeen.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(".MainActivity");
        Session session;//global variable
        session = new Session(Homepage.this);


        switch (v.getId()){
            case R.id.imageView30:
                session.setproduct("Seduce Destiny");
                startActivity(intent);
                break;
            case R.id.imageView32:
                session.setproduct("Seduce Pleasure");
                startActivity(intent);
                break;
            case R.id.imageView33:
                session.setproduct("Seduce Panache");
                startActivity(intent);
                break;
            case R.id.imageView25:
                session.setproduct("Elegance Ice");
                startActivity(intent);
                break;
            case R.id.imageView26:
                session.setproduct("Elegance Men Body Lotion");
                startActivity(intent);
                break;
            case R.id.imageView27:
                session.setproduct("Elegance Men Body Cream");
                startActivity(intent);
                break;
            case R.id.imageView22:
                session.setproduct("Elegance Baby Joy");
                startActivity(intent);
                break;
            case R.id.imageView23:
                session.setproduct("Elegance Perfumed");
                startActivity(intent);
                break;
            case R.id.imageView24:
                session.setproduct("Elegance Deep Nourishing");
                startActivity(intent);
                break;
            case R.id.imageView34:
                session.setproduct("Elegance Cocoa Butter");
                startActivity(intent);
                break;
            case R.id.imageView36:
                session.setproduct("Elegance Normal Skin");
                startActivity(intent);
                break;
            case R.id.imageView37:
                session.setproduct("Elegance Dry Skin");
                startActivity(intent);
                break;
            case R.id.imageView38:
                session.setproduct("Elegance Maxi Smooth");
                startActivity(intent);
                break;
            case R.id.imageView39:
                session.setproduct("Elegance Herbal");
                startActivity(intent);
                break;
            case R.id.imageView40:
                session.setproduct("Elegance Rejuvinating Care");
                startActivity(intent);
                break;
            case R.id.imageView41:
                session.setproduct("Promise Cologne");
                startActivity(intent);
                break;
            case R.id.imageView43:
                session.setproduct("Elegance Oily Skin");
                startActivity(intent);
                break;

        }
    }
}
