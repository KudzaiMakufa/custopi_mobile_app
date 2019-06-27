package com.cust.custopi;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    RadioButton radio1,radio2,radio3,radio4,radio5 ;
    Button btnsubmit ;
    @Override
    public void onBackPressed() {

        MainActivity.super.onBackPressed();

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maintest);
        btnsubmit = (Button)findViewById(R.id.btnsubmit);
        TextView prdname =  (TextView)findViewById(R.id.txtproduct);
        TextView  dislike = (TextView)findViewById(R.id.txtdislike);

        final Session session = new Session(MainActivity.this);
        dislike.setText("What did you dislike about \n "+session.getproductname()+" ?");

        prdname.setText(session.getproductname());
        // Spinner spinnerproduct =  (Spinner)findViewById(R.id.spinnerproduct);
        final TextView like =  (TextView)findViewById(R.id.edtxtlike);
        final TextView suggestion =  (TextView)findViewById(R.id.edtxtsuggestion);
        radio1 = (RadioButton)findViewById(R.id.radio1);
        radio2 = (RadioButton)findViewById(R.id.radio2);
        radio3 = (RadioButton)findViewById(R.id.radio3);
        radio4 = (RadioButton)findViewById(R.id.radio4);
        radio5 = (RadioButton)findViewById(R.id.radio5);

        final String[][] coordinates = {null};

        MyLocation.LocationResult locationResult = new MyLocation.LocationResult(){
            @Override
            public void gotLocation(Location location){

                coordinates[0] = new String[]{""+location.getLatitude(),""+location.getLongitude()};
                //Got the location!
                           /* coordinates[0] = new String[]{""+location.getLatitude(),""+location.getLongitude()};
                            AlertDialog.Builder alertWrong = new AlertDialog.Builder(MainActivity.this);



                            alertWrong.setMessage("User location Coordinates  \n"+"latitude : "+ coordinates[0][0]+"\nlongitude :"+ coordinates[0][1]+"\nProduct : "+session.getproductname()+"\nDislikes : "+
                                    like.getText().toString()+"\nSuggestions : "+suggestion.getText().toString()+"\nrating : "+rating[0]).setCancelable(false)
                                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.cancel();
                                        }
                                    });
                            AlertDialog alert = alertWrong.create();
                            alert.setTitle("Information send to server");
                            alert.show();*/
            }
        };
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(MainActivity.this, locationResult);

        final String[] rating = {""};

        radio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false); radio5.setChecked(false);
                rating[0] = "1" ;
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1.setChecked(false); radio3.setChecked(false); radio4.setChecked(false); radio5.setChecked(false);
                rating[0] = "2" ;
            }
        });
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio2.setChecked(false); radio1.setChecked(false); radio4.setChecked(false); radio5.setChecked(false);
                rating[0] = "3" ;
            }
        });
        radio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio2.setChecked(false); radio3.setChecked(false); radio1.setChecked(false); radio5.setChecked(false);
                rating[0] = "4" ;
            }
        });
        radio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio2.setChecked(false); radio3.setChecked(false); radio4.setChecked(false); radio1.setChecked(false);
                rating[0] = "5" ;
            }
        });


    /*    String []  product = new String[]{"Select Body lotion type","Elegance Men Ice Lotion","Elegance Lanonlin and Glycerine Lotion",
                "Elegance Cocoa Butter Lotion ", "Elegance Aloe Vera " ,"Elegance Normal skin lotion","Elegance Dry skin Lotion",
                "MaxiSmooth Herbal","MaxSmooth Natural","Seduce Plesure"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, product);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerproduct.setAdapter(adapter);*/



        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(like.getText().toString().equals("") || suggestion.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this, "Kindly fill all the required fields", Toast.LENGTH_SHORT).show();
                }
                else if (radio1.isChecked() == false && radio2.isChecked() == false && radio3.isChecked() == false && radio4.isChecked() == false && radio5.isChecked() == false){
                    Toast.makeText(MainActivity.this, "Kindly rate the Product ", Toast.LENGTH_SHORT).show();
                }
                else{

                    //coordinates[0] = new String[]{""+location.getLatitude(),""+location.getLongitude()};
                           /* AlertDialog.Builder alertWrong = new AlertDialog.Builder(MainActivity.this);



                            alertWrong.setMessage("User location Coordinates  \n"+"latitude : "+ coordinates[0][0]+"\nlongitude :"+ coordinates[0][1]+"\nProduct : "+session.getproductname()+"\nDislikes : "+
                                    like.getText().toString()+"\nSuggestions : "+suggestion.getText().toString()+"\nrating : "+rating[0]).setCancelable(false)
                                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            dialog.cancel();
                                        }
                                    });
                            AlertDialog alert = alertWrong.create();
                            alert.setTitle("Information send to server");
                            alert.show();*/

                    String url = " http://192.168.1.103/prochem/public/survey/submit";
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("product",session.getproductname());
                    params.put("latitude", coordinates[0][0]);
                    params.put("longitude", coordinates[0][1]);
                    params.put("like_or_dislikes", like.getText().toString());
                    params.put("suggestions", suggestion.getText().toString());
                    params.put("rating", rating[0]);

                    CustomRequest jsObjRequest = new CustomRequest(Request.Method.POST, url, params, new Response.Listener<JSONObject>() {


                        @Override
                        public void onResponse(JSONObject response) {
                            try {


                                if (response.getString("state").equals("success")) {


                                    Toast.makeText(MainActivity.this, "Thank you for participating in the Survey ", Toast.LENGTH_SHORT).show();
                                    Intent intent =  new Intent(".Homepage");
                                    startActivity(intent);
                                }
                                else if (response.getString("state").equals("fail")) {


                                    Toast.makeText(MainActivity.this, "Unfortunately an error was encountered submiting your survey response", Toast.LENGTH_LONG).show();
                                }

                            } catch (Exception e) {
                                Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                    }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError response) {
                            Toast.makeText(MainActivity.this, "Connection to server failed "+response, Toast.LENGTH_LONG).show();
                            Log.d("on",response.toString());

                        }
                    });

                    AppController.getInstance().addToRequestQueue(jsObjRequest);



                }



                /*Intent intent = new Intent(".Homepage");

                startActivity(intent);*/


                // Toast.makeText(MainActivity.this, "Failed to connect to server", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
