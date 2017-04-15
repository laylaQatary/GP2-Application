package com.example.laylakatary.gp;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    int x = 0;
    // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();
    private LocationManager locationmanager;
    private String provider;
    // Session Manager Class
    SessionManagement session;
    Location location;
    Context c;
    double lat;
    double lon;
    private TextView textView;
    private GPSTracker gps;


    ArrayList<Branch> ArrayBranch = new ArrayList<>();
    ListView listView;

    public ArrayList<Branch> setItemList() {
        //  List<Branch> list = new ArrayList<>();
        Branch bb = new Branch();
        for (int i = 0; i < 3; i++) {
            bb.setLatitude(23.45 + i);
            bb.setLongitude(86.45 + i);
            bb.setName("Metro_Giza");
            bb.setId(i);
            ArrayBranch.add(bb);
            bb = new Branch();
        }
        return ArrayBranch;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetLocation gpsTracker = new GetLocation(MainActivity.this);
        String stringLatitude = "", stringLongitude = "";
        gpsTracker.getLocation();
        textView = (TextView) findViewById(R.id.text_view);
        textView.setOnClickListener(this);
        session = new SessionManagement(getApplicationContext());
        session.checkLogin();
        Button button1 = (Button) findViewById(R.id.ca);
        Toast.makeText(MainActivity.this, String.valueOf(gpsTracker.getLatitude()) + " " + String.valueOf(gpsTracker.getLongitude()), Toast.LENGTH_SHORT).show();
        if (gpsTracker.getIsGPSTrackingEnabled()) {
            stringLatitude = String.valueOf(gpsTracker.latitude);
            stringLongitude = String.valueOf(gpsTracker.longitude);
            Log.i("xxxxxxxxxxxxxxxxx" + stringLatitude, "yyyyyyyyyyyyyyyyyyyyyy" + stringLongitude);
        } else {

            gpsTracker.showSettingsAlert();
        }
        double l = gpsTracker.latitude;
        double n = gpsTracker.longitude;




            listView = (ListView) findViewById(R.id.branch_list_view);
            listView.setAdapter(new BranchAdapter(this, setItemList()));


    }

    public void sort() {
        Branch bb = new Branch();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_view:
                gps = new GPSTracker(MainActivity.this);

                // check if GPS enabled
                if (gps.canGetLocation()) {

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();
                } else {
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }
                break;
        }
    }
}
