package com.example.gopinath.citizenmax.MySaftyTracker;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.gopinath.citizenmax.R;

public class MySaftyTracker extends AppCompatActivity implements View.OnClickListener {
    Button Audio, Stop;
    Toolbar toolbar;
    TextView WifiText, AudioMode;
    ImageView tic, AudioImage;
    private Menu optionsMenu;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final AudioManager am;
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        am = (AudioManager) getBaseContext().getSystemService(Context.AUDIO_SERVICE);
        setContentView(R.layout.my_safty_tracker);
       /* OffSilent= (Button) findViewById(R.id.OffSilent);
        OffSilent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                am.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            }
        });*/
        AudioMode = (TextView) findViewById(R.id.AudioMode);
        AudioImage = (ImageView) findViewById(R.id.AudiImage);
        if (am.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
            AudioMode.setText("Mobile is in Normal Mode");
            AudioImage.setImageResource(R.drawable.right);
        } else {
            AudioMode.setText("Put Mobile is in Sound Mode");
            AudioImage.setImageResource(R.drawable.wrong);
        }

        WifiText = (TextView) findViewById(R.id.wifiText);
        tic = (ImageView) findViewById(R.id.tic);
        ConnectivityManager conMan = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        //mobile
        // NetworkInfo.State mobile = conMan.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
        //wifi
        NetworkInfo.State wifi = conMan.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        //  and then use it like that:
      /*  if (mobile == NetworkInfo.State.CONNECTED || mobile == NetworkInfo.State.CONNECTING) {
            WifiText.setText("Mobile Data Connected");
            tic.setImageResource(R.drawable.right);
        } */
        if (wifi == NetworkInfo.State.CONNECTED || wifi == NetworkInfo.State.CONNECTING) {
            WifiText.setText("Wifi Connected");
            tic.setImageResource(R.drawable.right);
        } else {
            WifiText.setText("Please Connect Wifi or Mobile Data");
            tic.setImageResource(R.drawable.wrong);
        }
        Audio = (Button) findViewById(R.id.Audio);
        Audio.setOnClickListener(this);
        Stop = (Button) findViewById(R.id.Stop);
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });
    }

    public void setRefreshActionButtonState(final boolean refreshing) {
        if (optionsMenu != null) {
            final MenuItem refreshItem = optionsMenu
                    .findItem(R.id.airport_menuRefresh);
            if (refreshItem != null) {
                if (refreshing) {
                    refreshItem.setActionView(R.layout.my_safty_tracker);
                } else {
                    refreshItem.setActionView(null);
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.airport_menuRefresh:
                // Complete with your code
                Intent intent = getIntent();
                finish();
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.optionsMenu = menu;
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.refersh_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        int resId;
        switch (v.getId()) {
            case R.id.Audio:
                resId = R.raw.a;
                break;
            default:
                resId = R.raw.a;
                break;
        }
        // Release any resources from previous MediaPlayer
        if (mp != null) {
            mp.release();
        }
        // Create a new MediaPlayer to play this sound
        mp = MediaPlayer.create(this, resId);
        mp.start();
    }

    @Override
    protected void onDestroy() {
        if (null != mp) {
            mp.release();
        }
        super.onDestroy();
    }
}
