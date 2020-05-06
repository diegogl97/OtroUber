package com.example.otrouber

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val super0 = LatLng(19.285613, -99.137731)
        mMap.addMarker(MarkerOptions().position(super0).title("Mega Soriana Tec"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(super0))

        val super1 = LatLng(19.284560, -99.176787)
        mMap.addMarker(MarkerOptions().position(super1).title("Walmart Patio Tlalpan"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(super1))

        val super2 = LatLng(19.284543, -99.138120)
        mMap.addMarker(MarkerOptions().position(super2).title("Costco"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(super2))

        val super3 = LatLng( 19.299072, -99.135975)
        mMap.addMarker(MarkerOptions().position(super3).title("Superama Acoxpa"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(super3))

        val super4 = LatLng( 19.312811, -99.135242)
        mMap.addMarker(MarkerOptions().position(super4).title("Chedrahui"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(super4))

        mMap.animateCamera(
            CameraUpdateFactory.newLatLngZoom(
                super0,
                14f
            )
        )
        mMap.addPolyline(
            PolylineOptions().add(super1).add(super0).width(8f).color(Color.RED)
        )
        mMap.addCircle(
            CircleOptions().center(super2)
                .radius(50.0).strokeWidth(8f)
                .strokeColor(Color.RED).fillColor(Color.BLUE)
        )

    }
}
