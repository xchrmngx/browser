package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private WebView web;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = (WebView) findViewById(R.id.WebView);

        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("https://www.google.com/");
        web.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        // btn = (Button) findViewById(R.id.webBtn);
        if (web.canGoBack())
            web.goBack();
        else
            super.onBackPressed();
    }
}
