package p134n0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.action.outputservices.TwitterWebViewActivity;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.io.InputStream;
import p037m.C2009f;
import p148q0.C8151a;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

/* renamed from: n0.a */
/* compiled from: TwitterOutput */
public class C7960a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static RequestToken f19091a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Twitter f19092b;

    /* renamed from: n0.a$a */
    /* compiled from: TwitterOutput */
    public interface C7961a {
        /* renamed from: L */
        void mo25739L();
    }

    /* renamed from: n0.a$b */
    /* compiled from: TwitterOutput */
    private static class C7962b extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private Activity f19093a = null;

        /* renamed from: b */
        private final Context f19094b;

        /* renamed from: c */
        private boolean f19095c;

        /* renamed from: d */
        private final C7961a f19096d;

        /* renamed from: e */
        private boolean f19097e;

        /* renamed from: f */
        private C2009f f19098f;

        public C7962b(Context context, C7961a aVar) {
            this.f19094b = context;
            if (context instanceof Activity) {
                this.f19093a = (Activity) context;
            }
            this.f19095c = false;
            this.f19096d = aVar;
            this.f19097e = false;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m33253e(DialogInterface dialogInterface) {
            this.f19097e = true;
            dialogInterface.dismiss();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Void doInBackground(Void... voidArr) {
            MacroDroidApplication u = MacroDroidApplication.m14845u();
            try {
                Twitter unused = C7960a.f19092b = new TwitterFactory().getInstance();
                CookieSyncManager.createInstance(u);
                CookieManager.getInstance().removeSessionCookie();
                C7960a.f19092b.setOAuthAccessToken((AccessToken) null);
            } catch (Exception unused2) {
            }
            C7960a.f19092b.setOAuthConsumer("trfRjDyxtteiIGveHUmMAFoyt", "cvxTiGth538SF0jqOSXPd3wEGY8WFdmPTaI4QNVggjvIvnHH1f");
            try {
                RequestToken unused3 = C7960a.f19091a = C7960a.f19092b.getOAuthRequestToken(u.getResources().getString(C17541R$string.twitter_callback));
                if (!this.f19097e) {
                    Intent intent = new Intent(u, TwitterWebViewActivity.class);
                    intent.putExtra("URL", C7960a.f19091a.getAuthenticationURL() + "&force_login=true");
                    intent.addFlags(268435456);
                    this.f19094b.startActivity(intent);
                }
            } catch (TwitterException e) {
                Log.w("TwitterOutput", "Failed Twitter Auth request: " + e.getMessage());
                this.f19095c = true;
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void onPostExecute(Void voidR) {
            try {
                if (!this.f19097e && this.f19093a != null) {
                    this.f19098f.dismiss();
                    if (this.f19095c) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.f19093a, C17542R$style.Theme_App_Dialog);
                        builder.setTitle((CharSequence) this.f19093a.getString(C17541R$string.twitter_connection_failed));
                        builder.setMessage((CharSequence) this.f19093a.getString(C17541R$string.check_internet_before_retrying)).setCancelable(false).setPositiveButton(17039370, (DialogInterface.OnClickListener) C15751c.f65088a);
                        builder.create().show();
                        return;
                    }
                    C7961a aVar = this.f19096d;
                    if (aVar != null) {
                        aVar.mo25739L();
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            Activity activity = this.f19093a;
            if (activity != null) {
                C2009f s = new C2009f.C2014d(activity).mo24100t(C17541R$string.please_wait).mo24085e(C17541R$string.initialising_twitter).mo24098r(true, 0).mo24084c(false).mo24103w(ContextCompat.getColor(this.f19093a, C17528R$color.actions_primary)).mo24099s();
                this.f19098f = s;
                s.setOnCancelListener(new C15750b(this));
            }
        }
    }

    /* renamed from: n0.a$c */
    /* compiled from: TwitterOutput */
    public enum C7963c {
        Ok,
        ConnectionFailure,
        AuthenticationFailure,
        AlreadyUploaded
    }

    /* renamed from: e */
    public static void m33242e(Context context) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.remove("twitter_access_token");
        edit.remove("twitter_access_token_secret");
        edit.apply();
    }

    /* renamed from: f */
    public static RequestToken m33243f() {
        return f19091a;
    }

    /* renamed from: g */
    public static Twitter m33244g() {
        return f19092b;
    }

    /* renamed from: h */
    public static boolean m33245h(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("twitter_access_token", "");
        String string2 = defaultSharedPreferences.getString("twitter_access_token_secret", "");
        return string != null && string2 != null && string.length() > 0 && string2.length() > 0;
    }

    /* renamed from: i */
    public static void m33246i(Context context, C7961a aVar) {
        new C7962b(context, aVar).execute((Object[]) null);
    }

    /* renamed from: j */
    public static C7963c m33247j(Context context, String str) {
        C7963c cVar;
        C7963c cVar2 = C7963c.Ok;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("twitter_access_token", "");
        try {
            new TwitterFactory(new ConfigurationBuilder().setOAuthConsumerKey("trfRjDyxtteiIGveHUmMAFoyt").setOAuthConsumerSecret("cvxTiGth538SF0jqOSXPd3wEGY8WFdmPTaI4QNVggjvIvnHH1f").setOAuthAccessToken(string).setOAuthAccessTokenSecret(defaultSharedPreferences.getString("twitter_access_token_secret", "")).build()).getInstance().updateStatus(str);
            return cVar2;
        } catch (TwitterException e) {
            C4878b.m18868g("Twitter upload failed: " + e.getErrorMessage());
            String errorMessage = e.getErrorMessage();
            if (errorMessage != null && errorMessage.contains("duplicate")) {
                cVar = C7963c.AlreadyUploaded;
            } else if (e.getStatusCode() == 401 || e.getStatusCode() == 403) {
                m33242e(context);
                C4878b.m18868g("Please re-configure the action");
                cVar = C7963c.AuthenticationFailure;
            } else if (errorMessage == null || !errorMessage.contains("not authenticate")) {
                cVar = C7963c.ConnectionFailure;
            } else {
                cVar = C7963c.AuthenticationFailure;
            }
            return cVar;
        } catch (Exception e2) {
            C8151a.m33873n(new RuntimeException("Unexpected Twitter Failure: " + e2.getMessage()));
            return cVar2;
        }
    }

    /* renamed from: k */
    public static C7963c m33248k(Context context, Uri uri) {
        C7963c cVar;
        C7963c cVar2 = C7963c.Ok;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("twitter_access_token", "");
        String string2 = defaultSharedPreferences.getString("twitter_access_token_secret", "");
        if (string.length() == 0 || string2.length() == 0) {
            return C7963c.AuthenticationFailure;
        }
        Configuration build = new ConfigurationBuilder().setOAuthConsumerKey("trfRjDyxtteiIGveHUmMAFoyt").setOAuthConsumerSecret("cvxTiGth538SF0jqOSXPd3wEGY8WFdmPTaI4QNVggjvIvnHH1f").setOAuthAccessToken(string).setOAuthAccessTokenSecret(string2).build();
        InputStream inputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            Twitter instance = new TwitterFactory(build).getInstance();
            StatusUpdate statusUpdate = new StatusUpdate("");
            statusUpdate.setMedia("", inputStream);
            instance.updateStatus(statusUpdate);
        } catch (Exception e) {
            String message = e.getMessage();
            Log.w("TwitterOutput", "Twitter upload photo failed: " + message);
            if (message != null && message.contains("duplicate")) {
                cVar = C7963c.AlreadyUploaded;
            } else if (message == null || !message.contains("not authenticate")) {
                cVar = C7963c.ConnectionFailure;
            } else {
                cVar = C7963c.AuthenticationFailure;
            }
            cVar2 = cVar;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
            throw th;
        }
        try {
            inputStream.close();
        } catch (Exception unused2) {
        }
        return cVar2;
    }
}
