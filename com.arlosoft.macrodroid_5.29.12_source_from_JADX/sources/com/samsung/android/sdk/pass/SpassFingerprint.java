package com.samsung.android.sdk.pass;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.fingerprint.FingerprintIdentifyDialog;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.fingerprint.IFingerprintClient;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.SdkSupporter;
import com.samsung.android.sdk.pass.support.p233v1.FingerprintManagerProxyFactory;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class SpassFingerprint {
    public static final String ACTION_FINGERPRINT_ADDED = "com.samsung.android.intent.action.FINGERPRINT_ADDED";
    public static final String ACTION_FINGERPRINT_REMOVED = "com.samsung.android.intent.action.FINGERPRINT_REMOVED";
    public static final String ACTION_FINGERPRINT_RESET = "com.samsung.android.intent.action.FINGERPRINT_RESET";
    public static final int STATUS_AUTHENTIFICATION_FAILED = 16;
    public static final int STATUS_AUTHENTIFICATION_PASSWORD_SUCCESS = 100;
    public static final int STATUS_AUTHENTIFICATION_SUCCESS = 0;
    public static final int STATUS_BUTTON_PRESSED = 9;
    public static final int STATUS_OPERATION_DENIED = 51;
    public static final int STATUS_QUALITY_FAILED = 12;
    public static final int STATUS_SENSOR_FAILED = 7;
    public static final int STATUS_TIMEOUT_FAILED = 4;
    public static final int STATUS_USER_CANCELLED = 8;
    public static final int STATUS_USER_CANCELLED_BY_TOUCH_OUTSIDE = 13;
    public static final String TAG = "SpassFingerprintSDK";

    /* renamed from: n */
    private static int f57558n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f57559o = false;

    /* renamed from: p */
    private static boolean f57560p = false;

    /* renamed from: q */
    private static boolean f57561q = false;

    /* renamed from: r */
    private static boolean f57562r = false;

    /* renamed from: a */
    private IFingerprintManagerProxy f57563a;

    /* renamed from: b */
    private Context f57564b;

    /* renamed from: c */
    private int f57565c = -1;

    /* renamed from: d */
    private String f57566d = null;

    /* renamed from: e */
    private ArrayList f57567e = null;

    /* renamed from: f */
    private String f57568f = null;

    /* renamed from: g */
    private int f57569g = -1;

    /* renamed from: h */
    private String f57570h = null;

    /* renamed from: i */
    private int f57571i = -1;

    /* renamed from: j */
    private boolean f57572j = false;

    /* renamed from: k */
    private String f57573k = null;

    /* renamed from: l */
    private String f57574l = null;

    /* renamed from: m */
    private boolean f57575m = false;

    /* renamed from: s */
    private Dialog f57576s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C11717b f57577t = null;

    /* renamed from: u */
    private C11717b f57578u = null;

    /* renamed from: v */
    private IBinder f57579v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public Handler f57580w;

    public interface IdentifyListener {
        void onCompleted();

        void onFinished(int i);

        void onReady();

        void onStarted();
    }

    public interface RegisterListener {
        void onFinished();
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$a */
    private static class C11716a {

        /* renamed from: a */
        private Bundle f57581a;

        public C11716a() {
            Bundle bundle = new Bundle();
            this.f57581a = bundle;
            bundle.putString("sdk_version", "Pass-v1.2.6");
        }

        /* renamed from: a */
        public final Bundle mo66356a() {
            return this.f57581a;
        }

        /* renamed from: a */
        public final C11716a mo66357a(int[] iArr) {
            if (iArr.length > 0) {
                this.f57581a.putIntArray("request_template_index_list", iArr);
            }
            return this;
        }
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$b */
    private class C11717b extends IFingerprintClient.Stub {

        /* renamed from: a */
        private IdentifyListener f57582a;

        /* renamed from: b */
        private final int f57583b;

        private C11717b(IdentifyListener identifyListener) {
            this.f57583b = SpassFingerprint.f57559o ? 16 : 13;
            this.f57582a = identifyListener;
        }

        /* synthetic */ C11717b(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b) {
            this(identifyListener);
        }

        /* renamed from: a */
        public final IdentifyListener mo66358a() {
            return this.f57582a;
        }

        /* renamed from: a */
        public final void mo66359a(IdentifyListener identifyListener) {
            this.f57582a = identifyListener;
        }

        public final void onFingerprintEvent(FingerprintEvent fingerprintEvent) throws RemoteException {
            String str;
            if (fingerprintEvent == null) {
                str = "onFingerprintEvent: null event will be ignored!";
            } else {
                try {
                    StringBuilder sb = new StringBuilder("evt : ");
                    sb.append(fingerprintEvent.eventId);
                    sb.append(", ");
                    sb.append(fingerprintEvent.eventResult);
                    sb.append(", ");
                    sb.append(fingerprintEvent.eventStatus);
                    IdentifyListener identifyListener = this.f57582a;
                    if (fingerprintEvent.eventId == this.f57583b) {
                        new StringBuilder("onFingerprintEvent : completed = ").append(this.f57583b);
                        SpassFingerprint.this.f57577t = null;
                        SpassFingerprint.this.m81894f();
                    }
                    if (identifyListener == null) {
                        return;
                    }
                    if (SpassFingerprint.this.f57580w != null) {
                        SpassFingerprint.this.f57580w.post(new C11723e(this, fingerprintEvent, identifyListener));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    str = "onFingerprintEvent: Error : " + e;
                }
            }
            Log.w(SpassFingerprint.TAG, str);
        }
    }

    /* renamed from: com.samsung.android.sdk.pass.SpassFingerprint$c */
    private class C11718c implements FingerprintIdentifyDialog.FingerprintListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public IdentifyListener f57585a;

        /* renamed from: b */
        private FingerprintEvent f57586b;

        private C11718c(IdentifyListener identifyListener) {
            this.f57585a = identifyListener;
        }

        /* synthetic */ C11718c(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b) {
            this(identifyListener);
        }

        /* renamed from: a */
        public final void mo66361a() {
            FingerprintEvent fingerprintEvent = this.f57586b;
            IdentifyListener identifyListener = this.f57585a;
            if (fingerprintEvent != null && identifyListener != null && SpassFingerprint.this.f57580w != null) {
                SpassFingerprint.this.f57580w.post(new C11725g(this, fingerprintEvent, identifyListener));
                this.f57585a = null;
                this.f57586b = null;
            }
        }

        public final void onEvent(FingerprintEvent fingerprintEvent) {
            try {
                if (fingerprintEvent.eventId == 13 || SpassFingerprint.this.f57580w == null) {
                    this.f57586b = fingerprintEvent;
                } else {
                    SpassFingerprint.this.f57580w.post(new C11724f(this, fingerprintEvent));
                }
            } catch (Exception e) {
                Log.w(SpassFingerprint.TAG, "onFingerprintEvent: Error : " + e);
            }
        }
    }

    public SpassFingerprint(Context context) {
        if (context != null) {
            this.f57564b = context;
            if (!f57560p) {
                f57561q = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
                f57562r = m81895g();
                f57560p = true;
            }
            if (f57561q) {
                this.f57563a = FingerprintManagerProxyFactory.create(this.f57564b);
                this.f57580w = new Handler(context.getMainLooper());
                if (this.f57563a != null) {
                    try {
                        if (this.f57563a.getSensorType() == FingerprintManager.class.getField("SENSOR_TYPE_TOUCH").getInt((Object) null)) {
                            f57559o = true;
                        }
                    } catch (Exception e) {
                        Log.i(TAG, "SpassFingerprint : " + e.toString());
                    }
                    f57558n = this.f57563a.getVersion();
                }
            }
            Log.i(TAG, "SpassFingerprint : 1.2.6, " + f57558n + ", " + f57559o);
            return;
        }
        throw new IllegalArgumentException("context is null.");
    }

    /* renamed from: a */
    static void m81885a(Context context, String str) {
        if (m81895g() && context.checkCallingOrSelfPermission("com.samsung.android.providers.context.permission.WRITE_USE_APP_FEATURE_SURVEY") == 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", SpassFingerprint.class.getPackage().getName());
            contentValues.put("feature", String.valueOf(context.getPackageName()) + "#12");
            if (str != null) {
                contentValues.put("extra", str);
            }
            Intent intent = new Intent();
            intent.setAction("com.samsung.android.providers.context.log.action.USE_APP_FEATURE_SURVEY");
            intent.putExtra(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA, contentValues);
            intent.setPackage("com.samsung.android.providers.context");
            context.sendBroadcast(intent);
            Log.i(TAG, "insertLog : " + contentValues.toString());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m81887a(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, FingerprintEvent fingerprintEvent, int i) {
        spassFingerprint.f57566d = "";
        if (fingerprintEvent == null) {
            spassFingerprint.f57565c = 0;
        } else {
            spassFingerprint.f57565c = fingerprintEvent.getFingerIndex();
            if (fingerprintEvent.eventStatus == 12 || fingerprintEvent.eventStatus == 11) {
                spassFingerprint.f57566d = fingerprintEvent.getImageQualityFeedback();
            }
            int i2 = fingerprintEvent.eventStatus;
            i = 9;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 4) {
                i = 4;
            } else if (i2 == 51) {
                i = 51;
            } else if (i2 != 100) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        if (i2 != 9) {
                            switch (i2) {
                                case 11:
                                    i = 16;
                                    break;
                                case 12:
                                    i = 12;
                                    break;
                                case 13:
                                    i = 13;
                                    break;
                            }
                        }
                    } else {
                        i = 8;
                    }
                }
                i = 7;
            } else {
                i = 100;
            }
        }
        identifyListener.onFinished(i);
        spassFingerprint.f57565c = -1;
        spassFingerprint.f57566d = null;
        if (!spassFingerprint.f57575m) {
            spassFingerprint.f57575m = true;
            m81885a(spassFingerprint.f57564b, "IdentifyListener.onFinished");
        }
    }

    /* renamed from: a */
    static boolean m81888a() {
        return f57558n >= 16843008;
    }

    /* renamed from: a */
    private boolean m81889a(String str) {
        String packageName = this.f57564b.getPackageName();
        try {
            Resources resourcesForApplication = this.f57564b.getPackageManager().getResourcesForApplication(packageName);
            if (resourcesForApplication == null) {
                return false;
            }
            try {
                int identifier = resourcesForApplication.getIdentifier(str, "drawable", packageName);
                if (identifier != 0) {
                    if (identifier != -1) {
                        return BitmapFactory.decodeResource(resourcesForApplication, identifier) != null;
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: e */
    private synchronized void m81893e() throws UnsupportedOperationException {
        if (!f57561q) {
            throw new UnsupportedOperationException("Fingerprint Service is not supported in the platform.");
        } else if (this.f57563a == null) {
            Log.i(TAG, "ensureServiceSupported : proxy is null, retry to create proxy");
            IFingerprintManagerProxy create = FingerprintManagerProxyFactory.create(this.f57564b);
            this.f57563a = create;
            if (create == null) {
                throw new UnsupportedOperationException("Fingerprint Service is not running on the device.");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m81894f() {
        this.f57563a.unregisterClient(this.f57579v);
        this.f57579v = null;
        C11717b bVar = this.f57578u;
        if (bVar != null) {
            bVar.mo66359a((IdentifyListener) null);
        }
    }

    /* renamed from: g */
    private static boolean m81895g() {
        Class<String> cls = String.class;
        if (f57560p) {
            return f57562r;
        }
        boolean z = false;
        try {
            Class<?> cls2 = Class.forName("com.samsung.android.feature.FloatingFeature");
            Object invoke = cls2.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            z = ((Boolean) cls2.getMethod("getEnableStatus", new Class[]{cls}).invoke(invoke, new Object[]{"SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE"})).booleanValue();
        } catch (Exception e) {
            new StringBuilder("Survey Mode : ").append(e.toString());
            try {
                Class<?> cls3 = Class.forName("com.samsung.android.feature.SemFloatingFeature");
                Object invoke2 = cls3.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
                z = ((Boolean) cls3.getMethod("getBoolean", new Class[]{cls}).invoke(invoke2, new Object[]{"SEC_FLOATING_FEATURE_CONTEXTSERVICE_ENABLE_SURVEY_MODE"})).booleanValue();
            } catch (Exception e2) {
                new StringBuilder("Survey Mode : ").append(e2.toString());
            }
        }
        Log.i(TAG, "Survey Mode : " + z);
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo66333b() {
        m81893e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportFingerprintIds", new Class[0]);
            return this.f57563a.isSupportFingerprintIds();
        } catch (Exception e) {
            Log.w(TAG, e);
            return m81888a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo66334c() {
        m81893e();
        try {
            Class.forName(SdkSupporter.CLASSNAME_FINGERPRINT_MANAGER).getMethod("isSupportBackupPassword", new Class[0]);
            return this.f57563a.isSupportBackupPassword();
        } catch (Exception e) {
            Log.w(TAG, e);
            return true;
        }
    }

    public void cancelIdentify() {
        Handler handler;
        m81893e();
        IBinder iBinder = this.f57579v;
        if (iBinder == null && this.f57577t == null && this.f57576s == null) {
            throw new IllegalStateException("No Identify request.");
        }
        IdentifyListener identifyListener = null;
        if (iBinder != null) {
            C11717b bVar = this.f57578u;
            if (bVar != null) {
                identifyListener = bVar.mo66358a();
            }
            m81894f();
            if (identifyListener != null && (handler = this.f57580w) != null) {
                handler.postDelayed(new C11719a(this, identifyListener), 100);
            }
        } else if (this.f57577t != null || this.f57576s != null) {
            this.f57563a.notifyAppActivityState(4, (Bundle) null);
            this.f57577t = null;
            this.f57576s = null;
        }
    }

    public void changeStandbyString(String str) {
        m81893e();
        if (mo66334c()) {
            throw new IllegalStateException("setStandbyString is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the standby text passed is null.");
        } else if (str.length() <= 100) {
            this.f57574l = str;
        } else {
            throw new IllegalArgumentException("the standby text passed is longer than 100 characters.");
        }
    }

    public String getGuideForPoorQuality() {
        m81893e();
        String str = this.f57566d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("FingerprintGuide is Invalid. This API must be called inside IdentifyListener.onFinished() with STATUS_QUALITY_FAILED only.");
    }

    public int getIdentifiedFingerprintIndex() {
        m81893e();
        int i = this.f57565c;
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException("FingerprintIndex is Invalid. This API must be called inside IdentifyListener.onFinished() only.");
    }

    public SparseArray getRegisteredFingerprintName() {
        m81893e();
        SparseArray sparseArray = new SparseArray();
        int enrolledFingers = this.f57563a.getEnrolledFingers();
        if (enrolledFingers <= 0) {
            return null;
        }
        for (int i = 1; i <= 10; i++) {
            if (((1 << i) & enrolledFingers) != 0) {
                sparseArray.put(i, this.f57563a.getIndexName(i));
            }
        }
        return sparseArray;
    }

    public SparseArray getRegisteredFingerprintUniqueID() {
        m81893e();
        if (mo66333b()) {
            SparseArray sparseArray = new SparseArray();
            int enrolledFingers = this.f57563a.getEnrolledFingers();
            if (enrolledFingers <= 0) {
                return null;
            }
            for (int i = 1; i <= 10; i++) {
                if (((1 << i) & enrolledFingers) != 0) {
                    sparseArray.put(i, this.f57563a.getFingerprintId(i));
                }
            }
            return sparseArray;
        }
        throw new IllegalStateException("getRegisteredFingerprintUniqueID is not supported.");
    }

    public boolean hasRegisteredFinger() {
        m81893e();
        return this.f57563a.getEnrolledFingers() != 0;
    }

    public void registerFinger(Context context, RegisterListener registerListener) {
        m81893e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        } else if (registerListener != null) {
            if (this.f57563a.isEnrolling()) {
                this.f57563a.notifyEnrollEnd();
            }
            try {
                context.getPackageManager();
                try {
                    this.f57563a.startEnrollActivity(context, new C11722d(registerListener), toString());
                } catch (UndeclaredThrowableException unused) {
                    throw new IllegalArgumentException("activityContext is invalid");
                }
            } catch (NullPointerException unused2) {
                throw new IllegalArgumentException("activityContext is invalid");
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        m81893e();
        if (m81888a()) {
            this.f57572j = z;
            return;
        }
        throw new IllegalStateException("setCanceledOnTouchOutside is not supported.");
    }

    public void setDialogBgTransparency(int i) {
        m81893e();
        if (!m81888a()) {
            throw new IllegalStateException("setDialogBGTransparency is not supported.");
        } else if (i < 0 || i > 255) {
            throw new IllegalArgumentException("the transparency passed is not valid.");
        } else {
            this.f57571i = i;
        }
    }

    public void setDialogButton(String str) {
        m81893e();
        if (mo66334c()) {
            throw new IllegalStateException("setDialogButton is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the buttonText passed is null.");
        } else if (str.length() <= 32) {
            this.f57573k = str;
        } else {
            throw new IllegalArgumentException("the title text passed is longer than 32 characters.");
        }
    }

    public void setDialogIcon(String str) {
        m81893e();
        if (!m81888a()) {
            throw new IllegalStateException("setDialogIcon is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the iconName passed is null.");
        } else if (m81889a(str)) {
            this.f57570h = str;
        } else {
            throw new IllegalArgumentException("the iconName passed is not valid.");
        }
    }

    public void setDialogTitle(String str, int i) {
        m81893e();
        if (!m81888a()) {
            throw new IllegalStateException("setDialogTitle is not supported.");
        } else if (str == null) {
            throw new IllegalArgumentException("the titletext passed is null.");
        } else if (str.length() > 256) {
            throw new IllegalArgumentException("the title text passed is longer than 256 characters.");
        } else if ((i >>> 24) == 0) {
            this.f57568f = str;
            this.f57569g = i + ViewCompat.MEASURED_STATE_MASK;
        } else {
            throw new IllegalArgumentException("alpha value is not supported in the titleColor.");
        }
    }

    public void setIntendedFingerprintIndex(ArrayList arrayList) {
        m81893e();
        if (arrayList == null) {
            Log.w(TAG, "requestedIndex is null. Identify is carried out for all indexes.");
        } else if (m81888a()) {
            this.f57567e = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                this.f57567e.add((Integer) arrayList.get(i));
            }
        } else {
            throw new IllegalStateException("setIntendedFingerprintIndex is not supported.");
        }
    }

    public void startIdentify(IdentifyListener identifyListener) {
        C11716a aVar = new C11716a();
        ArrayList arrayList = this.f57567e;
        if (arrayList != null && arrayList.size() > 0) {
            int[] iArr = new int[this.f57567e.size()];
            for (int i = 0; i < this.f57567e.size(); i++) {
                iArr[i] = ((Integer) this.f57567e.get(i)).intValue();
            }
            this.f57567e = null;
            aVar.mo66357a(iArr);
        }
        m81893e();
        if (this.f57563a.getEnrolledFingers() == 0) {
            throw new IllegalStateException("Identify operation is failed.");
        } else if (this.f57579v != null) {
            throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
        } else if (identifyListener != null) {
            if (this.f57578u == null) {
                this.f57578u = new C11717b(this, identifyListener, (byte) 0);
            }
            Bundle a = aVar.mo66356a();
            a.putString("appName", this.f57564b.getPackageName());
            IBinder registerClient = this.f57563a.registerClient(this.f57578u, a);
            this.f57579v = registerClient;
            if (registerClient == null) {
                IBinder registerClient2 = this.f57563a.registerClient(this.f57578u, a);
                this.f57579v = registerClient2;
                if (registerClient2 == null) {
                    Handler handler = this.f57580w;
                    if (handler != null) {
                        handler.post(new C11720b(this, identifyListener));
                        return;
                    }
                    throw new IllegalStateException("failed because registerClient returned null.");
                }
            }
            int identify = this.f57563a.identify(this.f57579v, (String) null);
            if (identify != 0) {
                m81894f();
                Log.i(TAG, "startIdentify : failed, " + identify);
                if (identify == -2) {
                    throw new IllegalStateException("Identify request is denied because a previous request is still in progress.");
                } else if (identify == 51) {
                    throw new SpassInvalidStateException("Identify request is denied because 5 identify attempts are failed.", 1);
                } else {
                    throw new IllegalStateException("Identify operation is failed.");
                }
            } else {
                this.f57578u.mo66359a(identifyListener);
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }

    public void startIdentifyWithDialog(Context context, IdentifyListener identifyListener, boolean z) {
        int[] iArr;
        m81893e();
        if (context == null) {
            throw new IllegalArgumentException("activityContext passed is null.");
        } else if (identifyListener != null) {
            try {
                context.getPackageManager();
                if (!(context instanceof Activity)) {
                    Log.w(TAG, "startIdentifyWithDialog : No Actvity Context");
                }
                if (m81888a()) {
                    ArrayList arrayList = this.f57567e;
                    if (arrayList == null || arrayList.size() <= 0) {
                        iArr = null;
                    } else {
                        iArr = new int[this.f57567e.size()];
                        for (int i = 0; i < this.f57567e.size(); i++) {
                            iArr[i] = ((Integer) this.f57567e.get(i)).intValue();
                        }
                    }
                    this.f57577t = new C11717b(this, identifyListener, (byte) 0);
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("password", z);
                        bundle.putString("packageName", context.getPackageName());
                        bundle.putString("sdk_version", "Pass-v1.2.6");
                        bundle.putBoolean("demandExtraEvent", true);
                        if (iArr != null) {
                            bundle.putIntArray("request_template_index_list", iArr);
                        }
                        String str = this.f57568f;
                        if (str != null) {
                            bundle.putString("titletext", str);
                        }
                        int i2 = this.f57569g;
                        if (i2 != -1) {
                            bundle.putInt("titlecolor", i2);
                        }
                        String str2 = this.f57570h;
                        if (str2 != null) {
                            bundle.putString("iconname", str2);
                        }
                        int i3 = this.f57571i;
                        if (i3 != -1) {
                            bundle.putInt("transparency", i3);
                        }
                        boolean z2 = this.f57572j;
                        if (z2) {
                            bundle.putBoolean("touchoutside", z2);
                        }
                        String str3 = this.f57573k;
                        if (str3 != null) {
                            bundle.putString("button_name", str3);
                        }
                        String str4 = this.f57574l;
                        if (str4 != null) {
                            bundle.putString("standby_string", str4);
                        }
                        if (this.f57563a.identifyWithDialog(context, this.f57577t, bundle) != 0) {
                            throw new IllegalStateException("Identify operation is failed.");
                        }
                    } finally {
                        this.f57567e = null;
                        this.f57568f = null;
                        this.f57569g = -1;
                        this.f57571i = -1;
                        this.f57570h = null;
                        this.f57572j = false;
                        this.f57574l = null;
                        this.f57573k = null;
                    }
                } else {
                    C11718c cVar = new C11718c(this, identifyListener, (byte) 0);
                    Dialog showIdentifyDialog = this.f57563a.showIdentifyDialog(context, cVar, (String) null, z);
                    this.f57576s = showIdentifyDialog;
                    if (showIdentifyDialog != null) {
                        showIdentifyDialog.setOnDismissListener(new C11721c(cVar));
                        this.f57576s.show();
                        return;
                    }
                    throw new IllegalStateException("Identify operation is failed.");
                }
            } catch (NullPointerException unused) {
                throw new IllegalArgumentException("activityContext is invalid");
            }
        } else {
            throw new IllegalArgumentException("listener passed is null.");
        }
    }
}
