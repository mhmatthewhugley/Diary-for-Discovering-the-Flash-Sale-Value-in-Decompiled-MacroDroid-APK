package com.arlosoft.macrodroid;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelpActivity extends MacroDroidBaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.help_view);
        setTitle(C17541R$string.macrodroid_help);
        WebView webView = (WebView) findViewById(C17532R$id.help_web_view);
        webView.setScrollBarStyle(33554432);
        if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
            String H = C5163j2.m19977H(this);
            if (H.equals(2)) {
                WebSettingsCompat.setForceDark(webView.getSettings(), 2);
            } else if (H.equals(String.valueOf(-1))) {
                if (getResources().getBoolean(C17527R$bool.is_night_mode)) {
                    WebSettingsCompat.setForceDark(webView.getSettings(), 2);
                } else {
                    WebSettingsCompat.setForceDark(webView.getSettings(), 0);
                }
            }
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().openRawResource(C17540R$raw.helpfile), "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    webView.loadDataWithBaseURL((String) null, sb.toString(), "text/html", "UTF-8", (String) null);
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
