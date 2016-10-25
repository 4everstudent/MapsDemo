package a4everstudent.mapsdemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     *
     // Add a marker in Sydney and move the camera
     LatLng sydney = new LatLng(-34, 151);
     mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
     mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
     //Zooom in
     mMap.animateCamera(CameraUpdateFactory.zoomTo(10));
     // new place
     mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(42.813822, 23.726292), 15));
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        //change map type to terrain
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //change marker position and label to Taj Mahal, also changed color of the marker
        mMap.addMarker(new MarkerOptions().position(new LatLng(27.175010, 78.042144)).title("Taj Mahal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        //move camera to there and zoom it
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(27.175010, 78.042144),15));


    }
}
