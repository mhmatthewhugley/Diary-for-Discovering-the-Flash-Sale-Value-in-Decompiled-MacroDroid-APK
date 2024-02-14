package com.samsung.android.sdk.pass;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.SsdkInterface;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.SsdkVendorCheck;

public class Spass implements SsdkInterface {
    public static final int DEVICE_FINGERPRINT = 0;
    public static final int DEVICE_FINGERPRINT_AVAILABLE_PASSWORD = 4;
    public static final int DEVICE_FINGERPRINT_CUSTOMIZED_DIALOG = 2;
    public static final int DEVICE_FINGERPRINT_FINGER_INDEX = 1;
    public static final int DEVICE_FINGERPRINT_UNIQUE_ID = 3;

    /* renamed from: a */
    private static boolean f57553a = false;

    /* renamed from: b */
    private static boolean f57554b = false;

    /* renamed from: c */
    private static boolean f57555c = false;

    /* renamed from: d */
    private static boolean f57556d = false;

    /* renamed from: e */
    private Context f57557e;

    public int getVersionCode() {
        return 12;
    }

    public String getVersionName() {
        return "1.2.6";
    }

    public void initialize(Context context) throws SsdkUnsupportedException {
        if (this.f57557e == null) {
            if (context == null) {
                throw new IllegalArgumentException("context passed is null.");
            } else if (SsdkVendorCheck.isSamsungDevice()) {
                try {
                    boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("com.sec.feature.fingerprint_manager_service");
                    f57553a = hasSystemFeature;
                    if (hasSystemFeature) {
                        SpassFingerprint spassFingerprint = new SpassFingerprint(context);
                        f57555c = SpassFingerprint.m81888a();
                        f57554b = spassFingerprint.mo66333b();
                        f57556d = spassFingerprint.mo66334c();
                        this.f57557e = context;
                        Log.i(SpassFingerprint.TAG, "initialize : BP=" + f57556d + ",CD=" + f57555c + ",ID=" + f57554b + ",GT=false");
                        SpassFingerprint.m81885a(context, (String) null);
                        return;
                    }
                    throw new SsdkUnsupportedException("This device does not provide FingerprintService.", 1);
                } catch (NullPointerException unused) {
                    throw new IllegalArgumentException("context is not valid.");
                }
            } else {
                throw new SsdkUnsupportedException("This is not Samsung device.", 0);
            }
        }
    }

    public boolean isFeatureEnabled(int i) {
        if (this.f57557e == null) {
            throw new IllegalStateException("initialize() is not Called first.");
        } else if (i == 0) {
            return f57553a;
        } else {
            if (i == 1 || i == 2) {
                return f57555c;
            }
            if (i == 3) {
                return f57554b;
            }
            if (i == 4) {
                return f57556d;
            }
            throw new IllegalArgumentException("type passed is not valid");
        }
    }
}
