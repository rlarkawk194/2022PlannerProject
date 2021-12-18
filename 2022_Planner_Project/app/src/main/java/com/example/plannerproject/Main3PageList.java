package com.example.plannerproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.plannerproject.databinding.ActivityMain3PageListBinding;
import com.example.plannerproject.databinding.ActivityMainBinding;

public class Main3PageList extends AppCompatActivity {

    private ActivityMain3PageListBinding pageListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageListBinding = ActivityMain3PageListBinding.inflate(getLayoutInflater());
        View view = pageListBinding.getRoot();
        setContentView(view);


        WebSettings ws = pageListBinding.webView1.getSettings();
        ws.setJavaScriptEnabled(true); // 자바스크립트 사용 허가

        pageListBinding.webView1.loadUrl("https://www.naver.com/");
        pageListBinding.webView1.setWebViewClient(new WebViewClient());//웹뷰에 크롬 사용 허용//이 부분이 없으면 크롬에서 alert가 뜨지 않음
        pageListBinding.webView1.setWebViewClient(new WebViewClientClass());//새창열기 없이 웹뷰 내에서 다시 열기//페이지 이동 원활히 하기위해 사용
    }
    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("check URL",url);
            view.loadUrl(url);
            return true;
        }
    }





}