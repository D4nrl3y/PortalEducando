package com.example.exit.portaleducando;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
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


        // Add a marker in Sydney and move the camera
        LatLng portal = new LatLng(-8.3357786, -36.4235973);
        mMap.addMarker(new MarkerOptions().position(portal).title("Portal Educando"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(portal, 15));

        LatLng moura = new LatLng(-8.335654, -36.416928);
        mMap.addPolyline(new PolylineOptions().add(
                portal,
                new LatLng(-8.335803, -36.423494),
                new LatLng(-8.335999, -36.423564),
                new LatLng(-8.335776, -36.424106),
                new LatLng(-8.336158, -36.424291),
                new LatLng(-8.336298, -36.424007),
                new LatLng(-8.336487, -36.423450),
                new LatLng(-8.336520, -36.423152),
                new LatLng(-8.336522, -36.422845),
                new LatLng(-8.336706, -36.422794),
                new LatLng(-8.336478, -36.422094),
                new LatLng(-8.336730, -36.421965),
                new LatLng(-8.336672, -36.421614),
                new LatLng(-8.336741, -36.421292),
                new LatLng(-8.336475, -36.421298),
                new LatLng(-8.336751, -36.420432),
                new LatLng(-8.336825, -36.420310),
                new LatLng(-8.336929, -36.420220),
                new LatLng(-8.336514, -36.419614),
                new LatLng(-8.336082, -36.418903),
                new LatLng(-8.335428, -36.417050),
                new LatLng(-8.335610, -36.417093),
                new LatLng(-8.335646, -36.416921),
                moura

        )
            .width(10)
                .color(Color.RED)
        );
    }
}
