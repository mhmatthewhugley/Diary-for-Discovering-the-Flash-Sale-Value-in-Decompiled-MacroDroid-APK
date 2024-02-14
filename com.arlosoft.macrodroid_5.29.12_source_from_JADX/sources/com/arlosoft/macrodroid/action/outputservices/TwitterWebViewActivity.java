package com.arlosoft.macrodroid.action.outputservices;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import p134n0.C7960a;
import p148q0.C8151a;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.auth.AccessToken;

public class TwitterWebViewActivity extends Activity {

    /* renamed from: com.arlosoft.macrodroid.action.outputservices.TwitterWebViewActivity$a */
    class C3324a extends WebViewClient {
        C3324a() {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.contains(TwitterWebViewActivity.this.getResources().getString(C17541R$string.twitter_callback))) {
                return false;
            }
            new C3325b(str).execute((Object[]) null);
            return false;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.outputservices.TwitterWebViewActivity$b */
    private class C3325b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final String f8889a;

        public C3325b(String str) {
            this.f8889a = str;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            Twitter g = C7960a.m33244g();
            try {
                AccessToken oAuthAccessToken = g.getOAuthAccessToken(C7960a.m33243f(), Uri.parse(this.f8889a).getQueryParameter("oauth_verifier"));
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(TwitterWebViewActivity.this).edit();
                edit.putString("twitter_access_token", oAuthAccessToken.getToken());
                edit.putString("twitter_access_token_secret", oAuthAccessToken.getTokenSecret());
                edit.apply();
                return null;
            } catch (TwitterException e) {
                C8151a.m33873n(new RuntimeException("TwitterWebViewActivity: Error in RequestTokenTask: " + e.getMessage()));
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            TwitterWebViewActivity.this.finish();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onProgressUpdate(Void... voidArr) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C17535R$layout.twitterwebview);
        WebView webView = (WebView) findViewById(C17532R$id.webview);
        webView.setWebViewClient(new C3324a());
        webView.loadUrl((String) getIntent().getExtras().get("URL"));
    }

    public void onNewIntent(Intent intent) {
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }
}
