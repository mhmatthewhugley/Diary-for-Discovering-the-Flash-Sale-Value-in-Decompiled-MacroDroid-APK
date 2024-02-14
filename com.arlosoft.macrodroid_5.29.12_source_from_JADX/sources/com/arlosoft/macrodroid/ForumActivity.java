package com.arlosoft.macrodroid;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.InflateException;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ViewFlipper;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;

public class ForumActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    private WebView f7033o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ViewFlipper f7034p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7035s = false;

    /* renamed from: com.arlosoft.macrodroid.ForumActivity$a */
    class C2295a extends WebViewClient {
        C2295a() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!ForumActivity.this.f7035s) {
                ForumActivity.this.f7034p.setDisplayedChild(3);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            boolean unused = ForumActivity.this.f7035s = true;
            ForumActivity.this.f7034p.setDisplayedChild(2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("http://www.macrodroidlink.com/macrostore?")) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                ForumActivity.this.startActivity(intent);
                return true;
            }
            if (str.endsWith(".pdf")) {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(str));
                try {
                    webView.getContext().startActivity(intent2);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m9491V1(View view) {
        m9492W1("https://www.macrodroidforum.com");
    }

    /* renamed from: W1 */
    private void m9492W1(String str) {
        this.f7035s = false;
        this.f7034p.setDisplayedChild(1);
        if (!str.contains("://")) {
            str = "http://" + str;
        }
        this.f7033o.resumeTimers();
        this.f7033o.loadUrl(str);
    }

    /* renamed from: U1 */
    public void mo24627U1() {
        this.f7034p.removeAllViews();
        WebSettings settings = this.f7033o.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        this.f7033o.clearHistory();
        this.f7033o.clearCache(true);
        this.f7033o.loadUrl("about:blank");
        this.f7033o.onPause();
        this.f7033o.removeAllViews();
        this.f7033o.destroyDrawingCache();
        this.f7033o.pauseTimers();
        this.f7033o.destroy();
        this.f7033o = null;
    }

    public void onBackPressed() {
        if (this.f7033o.canGoBack()) {
            this.f7033o.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(C17535R$layout.remote_web_activity);
            setTitle(C17541R$string.macrodroid_forum);
            Uri data = getIntent().getData();
            WebView webView = (WebView) findViewById(C17532R$id.remote_web_view);
            this.f7033o = webView;
            webView.getSettings().setJavaScriptEnabled(false);
            this.f7034p = (ViewFlipper) findViewById(C17532R$id.view_flipper);
            Button button = (Button) findViewById(C17532R$id.retry_button);
            this.f7033o.setWebViewClient(new C2295a());
            WebSettings settings = this.f7033o.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setAllowContentAccess(true);
            settings.setDatabaseEnabled(true);
            settings.setUserAgentString(settings.getUserAgentString().replace("; wv", ""));
            this.f7033o.setWebChromeClient(new WebChromeClient());
            m9492W1(data != null ? data.toString() : "https://www.macrodroidforum.com");
            button.setOnClickListener(new C6658z(this));
        } catch (InflateException e) {
            C4878b.m18868g("Failed to initialse web view, maybe Google Play is currently updating your web view? : " + e.toString());
            finish();
        }
    }

    public void onDestroy() {
        try {
            mo24627U1();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }
}
