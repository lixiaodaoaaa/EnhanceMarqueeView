package com.sunfusheng.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.sunfusheng.marqueeview.MarqueeView;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class MainActivity extends AppCompatActivity {

    private MarqueeView marqueeView;
    private MarqueeView marqueeView1;
    private MarqueeView marqueeView2;
    private MarqueeView marqueeView3;
    private MarqueeView marqueeView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marqueeView = (MarqueeView) findViewById(R.id.marqueeView);
        marqueeView1 = (MarqueeView) findViewById(R.id.marqueeView1);
        marqueeView2 = (MarqueeView) findViewById(R.id.marqueeView2);
        marqueeView3 = (MarqueeView) findViewById(R.id.marqueeView3);
        marqueeView4 = (MarqueeView) findViewById(R.id.marqueeView4);

        HashMap<String,View.OnClickListener> noticeListenerMap =new LinkedHashMap<>();
        noticeListenerMap.put("lixiaodaoaaa001 is a goodboy", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click first", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa002", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 002", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa003", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 003", Toast.LENGTH_SHORT).show();
            }
        });
        noticeListenerMap.put("lixiaodaoaaa004", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "you click 004", Toast.LENGTH_SHORT).show();
            }
        });

        marqueeView.startWithListAndSetLisenter(noticeListenerMap);

        View.OnClickListener  clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "wori", Toast.LENGTH_LONG).show();
            }
        };

        marqueeView1.startWithText(getString(R.string.marquee_texts),clickListener);
        marqueeView2.startWithText(getString(R.string.marquee_texts),clickListener);
        marqueeView3.startWithText(getString(R.string.marquee_texts),clickListener);
        marqueeView4.startWithText(getString(R.string.marquee_text),clickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_menu_app:
                startActivity(new Intent(this, AboutActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
