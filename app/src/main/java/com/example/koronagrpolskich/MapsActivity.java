package com.example.koronagrpolskich;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;

    private List<MarkerOptions> markerList;

    private void initMarkers() {
        markerList = new ArrayList<>();
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.65597974904006, 20.276747739454148))
                .title("Mogielica")
                .snippet("1170")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.17977, 20.08803))
                .title("Rysy")
                .snippet("2503")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.57396902136253, 19.530882200778183))
                .title("Babia Góra")
                .snippet("1725")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.73664091824822, 15.739688178747647))
                .title("Śnieżka")
                .snippet("1602")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.21328434672711, 16.847346836461984))
                .title("Śnieżnik")
                .snippet("1425")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.075489628460105, 22.726276817162653))
                .title("Tarnica")
                .snippet("1346")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.54344610675864, 20.111387685416048))
                .title("Turbacz")
                .snippet("1310")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.450093117286556, 20.60413137001527))
                .title("Radziejowa")
                .snippet("1262")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.68508693586849, 19.030290716189814))
                .title("Skrzyczne")
                .snippet("1257")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.85070357998458, 15.419401455536365))
                .title("Wysoka Kopa")
                .snippet("1126")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.24548224851119, 16.97636103928281))
                .title("Rudawiec")
                .snippet("1112")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.35071853086843, 16.349811185244214))
                .title("Orlica")
                .snippet("1084")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.38634701868041, 20.55804791572441))
                .title("Wysoka")
                .snippet("1050")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.38634701868041, 20.55804791572441))
                .title("Wielka Sowa")
                .snippet("1015")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.427135501248785, 21.1025899486808))
                .title("Lackowa")
                .snippet("997")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.264200262507366, 17.01388046247619))
                .title("Kowadło")
                .snippet("989")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.25288636944188, 16.564949988198798))
                .title("Jagodna")
                .snippet("977")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.80864899280983, 15.899964049444382))
                .title("Skalnik")
                .snippet("945")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.680939713981175, 16.27810472345634))
                .title("Waligóra")
                .snippet("936")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.766327681478245, 19.1552050631697))
                .title("Czupel")
                .snippet("934")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.48426517108458, 16.343203891162712))
                .title("Szczeliniec Wielki")
                .snippet("919")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(49.76708136073559, 20.05958178637773))
                .title("Lubomir")
                .snippet("912")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.257259696317895, 17.42868197219536))
                .title("Biskupia Kopia")
                .snippet("889")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.78045365290661, 16.211987552567702))
                .title("Chełmiec")
                .snippet("869")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.45227979770458, 16.753640878394627))
                .title("Kłodzka Góra")
                .snippet("765")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.944094285290184, 15.88468003774538))
                .title("Skopiec")
                .snippet("724")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.865048228394336, 16.708609841657445))
                .title("Ślęża")
                .snippet("718")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
        );
        markerList.add(new MarkerOptions()
                .position(new LatLng(50.89211685609258, 20.89652729828751))
                .title("Łysica")
                .snippet("612")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW))
        );




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        initMarkers();
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.radioButton1).setOnClickListener(this);
        findViewById(R.id.radioButton2).setOnClickListener(this);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker on Rysy and move the camera
        LatLng rysy = new LatLng(49.17977, 20.08803);
        mMap.addMarker(new MarkerOptions().position(rysy).title("Znacznik na Rysach"));
//        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rysy, 10.0f));

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(49.17977, 20.08803), 11.0f));


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateFade(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                mMap.clear();
                for (MarkerOptions m : markerList) {
                    mMap.addMarker(m);
                }
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(49.17977, 20.08803), 6.0f));
                break;
            case R.id.radioButton1:
                if (((RadioButton) findViewById(R.id.radioButton1)).isChecked()) {
                    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                }
                break;
            case R.id.radioButton2:
                if (((RadioButton) findViewById(R.id.radioButton2)).isChecked()) {
                    mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                }
                break;

        }
    }
}