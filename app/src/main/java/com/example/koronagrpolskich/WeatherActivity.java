package com.example.koronagrpolskich;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeatherActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView  city, temp, time, latitude, longitude, humidity, sunrise, sunset, pressure, wind;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        editText = findViewById(R.id.editTextTextPersonName);
        button = findViewById(R.id.button);
        city = findViewById(R.id.city);
        temp = findViewById(R.id.textView5);
        time = findViewById(R.id.time);

        latitude = findViewById(R.id.Latitude);
        longitude = findViewById(R.id.Longitude);
        humidity = findViewById(R.id.Humidity);
        sunrise = findViewById(R.id.Sunrise);
        sunset = findViewById(R.id.Sunset);
        pressure = findViewById(R.id.Pressure);
        wind = findViewById(R.id.Windspeed);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findWeather();
            }
        });

    }

    public void findWeather(){

        String cityS = editText.getText().toString();
        String url = "http://api.openweathermap.org/data/2.5/weather?q="+cityS+"&appid=afc6e58e327c50defa49950d75a9b4f9";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
            //API

                try {
                    JSONObject jsonObject = new JSONObject(response);

                    //finding City
                    String city_find = jsonObject.getString("name");
                    city.setText(city_find);

                    //find temperature
                    JSONObject object2 = jsonObject.getJSONObject("main");
                    double temp_find = object2.getDouble("temp");
                    String temp_string = String.format("%.1f", temp_find-273.15);
                    temp.setText(temp_string+"°C");

                    // find date/time
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat std = new SimpleDateFormat("dd/MM/yyyy \nHH:mm:ss");
                    String date = std.format(calendar.getTime());
                    time.setText(date);

                    //find lattitude
                    JSONObject object3 = jsonObject.getJSONObject("coord");
                    double lat_find = object3.getDouble("lat");
                    if(lat_find>=0) latitude.setText(lat_find+"°  N");
                    if(lat_find<0) latitude.setText(-lat_find+"°  S");

                    //find longitude
                    JSONObject object4 = jsonObject.getJSONObject("coord");
                    double lng_find = object4.getDouble("lon");
                    if(lng_find>=0) longitude.setText(lng_find+"°  E");
                    if(lng_find<0) longitude.setText(-lng_find+"°  W");

                    //find humidity
                    JSONObject object5 = jsonObject.getJSONObject("main");
                    int humidity_find = object5.getInt("humidity");
                    humidity.setText(humidity_find+" %");

                    //find sunrise
                    JSONObject object6 = jsonObject.getJSONObject("sys");
                    String sunrise_find = object6.getString("sunrise");
                    long sunrise_find_long = Long.parseLong(sunrise_find);
                    sunrise_find_long = sunrise_find_long*1000;
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
                    String sunrise_date = sdf.format(new Date(sunrise_find_long));
                    sunrise.setText(sunrise_date);

                    //find sunset
                    JSONObject object7 = jsonObject.getJSONObject("sys");
                    String sunset_find = object7.getString("sunset");
                    long sunset_find_long = Long.parseLong(sunset_find);
                    sunset_find_long = sunset_find_long*1000;
                    String sunset_date = sdf.format(new Date(sunset_find_long));
                    sunset.setText(sunset_date);

                    //find pressure
                    JSONObject object8 = jsonObject.getJSONObject("main");
                    String pressure_find = object8.getString("pressure");
                    pressure.setText(pressure_find+"  hPa");

                    //find wind speed
                    JSONObject object9 = jsonObject.getJSONObject("wind");
                    String wind_find = object9.getString("speed");
                    wind.setText(wind_find+"  km/h");



                } catch (JSONException e){
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(WeatherActivity.this, error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(WeatherActivity.this);
        requestQueue.add(stringRequest);

    }




}