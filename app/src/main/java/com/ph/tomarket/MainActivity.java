package com.ph.tomarket;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ph.tostart.utils.MarketUtils;

/**
 * Android实现根据包名跳转各大应用市场
 */
public class MainActivity extends AppCompatActivity {
    private TextView tvMarket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tvMarket = findViewById(R.id.tv_market);
        tvMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //参数1.上下文 2.你想跳转的应用包名3.本机的应用市场或者指定的应用市场名,这里以跳转微信为例
                MarketUtils.getTools().startMarket(MainActivity.this, "com.tencent.mm");
            }
        });
    }
}