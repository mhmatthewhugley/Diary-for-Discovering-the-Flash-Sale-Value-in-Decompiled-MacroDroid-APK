package com.arlosoft.macrodroid.action.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import java.util.concurrent.TimeUnit;
import p148q0.C8151a;

public class AndroidWearService extends IntentService {
    public AndroidWearService() {
        super("AndroidWearService");
    }

    /* renamed from: a */
    private GoogleApiClient m14318a() {
        try {
            GoogleApiClient d = new GoogleApiClient.Builder(getApplicationContext()).mo21264a(Wearable.f48096f).mo21267d();
            if (d.mo21248d(30, TimeUnit.SECONDS).mo21137p2()) {
                return d;
            }
            Log.e("AndroidWearService", "Failed to connect to GoogleApiClient.");
            return null;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private String m14319b(GoogleApiClient googleApiClient) {
        NodeApi.GetConnectedNodesResult d = Wearable.f48094d.mo56223a(googleApiClient).mo21271d();
        if (d.mo56224s().size() > 0) {
            return d.mo56224s().iterator().next().getId();
        }
        return null;
    }

    /* renamed from: c */
    private void m14320c(int i) {
        GoogleApiClient a = m14318a();
        if (a != null) {
            String b = m14319b(a);
            if (b != null) {
                MessageApi messageApi = Wearable.f48093c;
                StringBuilder sb = new StringBuilder();
                sb.append("SENT: Message sending result = ");
                sb.append(messageApi.mo56209a(a, b, "/macrodroid/request-set-brightness/" + i, (byte[]) null).mo21271d().getStatus());
            }
            a.mo21250f();
        }
    }

    /* renamed from: d */
    private void m14321d(String str) {
        GoogleApiClient a = m14318a();
        if (a != null) {
            String b = m14319b(a);
            if (b != null) {
                MessageApi messageApi = Wearable.f48093c;
                StringBuilder sb = new StringBuilder();
                sb.append("SENT: Message sending result = ");
                sb.append(messageApi.mo56209a(a, b, "/macrodroid/request-open-app/" + str, (byte[]) null).mo21271d().getStatus());
            }
            a.mo21250f();
        }
    }

    /* renamed from: e */
    private void m14322e(int i) {
        GoogleApiClient a = m14318a();
        if (a != null) {
            String b = m14319b(a);
            if (b != null) {
                MessageApi messageApi = Wearable.f48093c;
                StringBuilder sb = new StringBuilder();
                sb.append("SENT: Message sending result = ");
                sb.append(messageApi.mo56209a(a, b, "/macrodroid/request-set-wifi/" + i, (byte[]) null).mo21271d().getStatus());
            }
            a.mo21250f();
        }
    }

    /* renamed from: f */
    private void m14323f(String[] strArr, String[] strArr2, boolean z) {
        GoogleApiClient a = m14318a();
        if (a != null) {
            try {
                PutDataMapRequest b = PutDataMapRequest.m66808b("/macrodroid/transfer-macro-list");
                b.mo56227c().mo56204e("macro-names", strArr);
                b.mo56227c().mo56204e("macro-resource-names", strArr2);
                b.mo56227c().mo56203d("/macrodroid/force_update", z);
                Wearable.f48091a.mo56194a(a, b.mo56226a());
            } catch (Exception e) {
                C8151a.m33873n(e);
            }
            a.mo21250f();
        }
    }

    /* renamed from: g */
    private void m14324g(int i) {
        GoogleApiClient a = m14318a();
        if (a != null) {
            String b = m14319b(a);
            if (b != null) {
                MessageApi messageApi = Wearable.f48093c;
                StringBuilder sb = new StringBuilder();
                sb.append("SENT: Message sending result = ");
                sb.append(messageApi.mo56209a(a, b, "/macrodroid/request-vibrate/" + i, (byte[]) null).mo21271d().getStatus());
            }
            a.mo21250f();
        }
    }

    /* renamed from: h */
    private void m14325h() {
        GoogleApiClient a = m14318a();
        if (a != null) {
            String b = m14319b(a);
            if (b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SENT: Message sending result = ");
                sb.append(Wearable.f48093c.mo56209a(a, b, "/macrodroid/request-wake-screen", (byte[]) null).mo21271d().getStatus());
            }
            a.mo21250f();
        }
    }

    /* renamed from: i */
    public static void m14326i(Context context, String str) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("OpenApp");
        intent.putExtra("OpenAppPackage", str);
        context.startService(intent);
    }

    /* renamed from: j */
    public static void m14327j(Context context, int i) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("SetBrightness");
        intent.putExtra(ExifInterface.TAG_BRIGHTNESS_VALUE, i);
        context.startService(intent);
    }

    /* renamed from: k */
    public static void m14328k(Context context, int i) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("SetWifi");
        intent.putExtra("WifiOption", i);
        context.startService(intent);
    }

    /* renamed from: l */
    public static void m14329l(Context context, String[] strArr, String[] strArr2, boolean z) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("SyncMacros");
        intent.putExtra("MacroNameList", strArr);
        intent.putExtra("MacroResourceNameList", strArr2);
        intent.putExtra("ForceUpdate", z);
        context.startService(intent);
    }

    /* renamed from: m */
    public static void m14330m(Context context, int i) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("Vibrate");
        intent.putExtra("VibratePattern", i);
        context.startService(intent);
    }

    /* renamed from: n */
    public static void m14331n(Context context) {
        Intent intent = new Intent(context, AndroidWearService.class);
        intent.setAction("WakeScreen");
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                String action = intent.getAction();
                char c = 65535;
                switch (action.hashCode()) {
                    case -645237129:
                        if (action.equals("SetWifi")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -388161342:
                        if (action.equals("SyncMacros")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 270618448:
                        if (action.equals("WakeScreen")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 401430359:
                        if (action.equals("OpenApp")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1923506739:
                        if (action.equals("SetBrightness")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 2115964239:
                        if (action.equals("Vibrate")) {
                            c = 1;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    m14321d(intent.getStringExtra("OpenAppPackage"));
                } else if (c == 1) {
                    m14324g(intent.getIntExtra("VibratePattern", 0));
                } else if (c == 2) {
                    m14320c(intent.getIntExtra(ExifInterface.TAG_BRIGHTNESS_VALUE, 0));
                } else if (c == 3) {
                    m14325h();
                } else if (c == 4) {
                    m14323f(intent.getStringArrayExtra("MacroNameList"), intent.getStringArrayExtra("MacroResourceNameList"), intent.getBooleanExtra("ForceUpdate", false));
                } else if (c == 5) {
                    m14322e(intent.getIntExtra("WifiOption", 0));
                }
            } catch (IllegalStateException unused) {
            }
        }
        stopSelf();
    }
}
