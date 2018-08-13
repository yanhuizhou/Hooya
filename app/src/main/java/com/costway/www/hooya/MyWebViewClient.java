package com.costway.www.hooya;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    public boolean shouldOverrideUrlLoading(WebView webView,String url){
        webView.loadUrl(url);
        return true;//就是这句话，让每个超链接都在app的webview打开，而不是浏览器，返回 真就是使用app打开，返回假就调用浏览器打开
    }
}
