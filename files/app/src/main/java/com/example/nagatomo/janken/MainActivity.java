package com.example.nagatomo.janken;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;



public class MainActivity extends ActionBarActivity {
    ImageView cpu;
    ImageView player;
    TextView result;
    Random r = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cpu = (ImageView)findViewById(R.id.cpu);
        player = (ImageView)findViewById(R.id.player);
        result = (TextView)findViewById(R.id.result);
    }

    public void goo(View v){
        player.setImageResource(R.drawable.goo);
        int random =r.nextInt(3);
        if(random == 0){
            cpu.setImageResource(R.drawable.goosazae);
            result.setText("no game");
        }
        else if(random == 1){
            cpu.setImageResource(R.drawable.chokisazae);
            result.setText("you're winner");
        }
        else if(random == 2){
            cpu.setImageResource(R.drawable.paasazae);
            result.setText("you're loser");
        }
    }
    public void choki(View v){
        player.setImageResource(R.drawable.choki);
        int random =r.nextInt(3);
        if(random == 0){
            cpu.setImageResource(R.drawable.goosazae);
            result.setText("you're loser");
        }
        else if(random == 1){
            cpu.setImageResource(R.drawable.chokisazae);
            result.setText("no game");
        }
        else if(random == 2){
            cpu.setImageResource(R.drawable.paasazae);
            result.setText("you're winner");
        }
    }
    public void paa(View v){
        player.setImageResource(R.drawable.paa);
        int random =r.nextInt(3);
        if(random == 0){
            cpu.setImageResource(R.drawable.goosazae);
            result.setText("you're winner");
        }
        else if(random == 1){
            cpu.setImageResource(R.drawable.chokisazae);
            result.setText("you're loser");
        }
        else if(random == 2){
            cpu.setImageResource(R.drawable.paasazae);
            result.setText("no game");
        }
    }

    public void reset(View v){
        cpu.setImageResource(R.drawable.sazae3);
        player.setImageResource(R.drawable.katsuo);
        result.setText("waiting...");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
