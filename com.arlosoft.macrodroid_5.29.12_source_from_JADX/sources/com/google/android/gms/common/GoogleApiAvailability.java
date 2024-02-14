package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.C1733R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabw;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zac;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: d */
    public static final int f3058d = GoogleApiAvailabilityLight.f3062a;

    /* renamed from: e */
    private static final Object f3059e = new Object();

    /* renamed from: f */
    private static final GoogleApiAvailability f3060f = new GoogleApiAvailability();
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f3061c;

    @NonNull
    /* renamed from: q */
    public static GoogleApiAvailability m3521q() {
        return f3060f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo21150A(Context context) {
        new zac(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: B */
    public final boolean mo21151B(@NonNull Activity activity, @NonNull LifecycleFragment lifecycleFragment, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog v = mo21165v(activity, i, zag.m4634c(lifecycleFragment, mo21153d(activity, i, "d"), 2), onCancelListener);
        if (v == null) {
            return false;
        }
        mo21168y(activity, v, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: C */
    public final boolean mo21152C(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent p;
        if (InstantApps.m4920a(context) || (p = mo21160p(context, connectionResult)) == null) {
            return false;
        }
        mo21169z(context, connectionResult.mo21133l2(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m3650a(context, p, i, true), zap.f39272a | 134217728));
        return true;
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo21153d(@Nullable Context context, int i, @Nullable String str) {
        return super.mo21153d(context, i, str);
    }

    @Nullable
    /* renamed from: e */
    public PendingIntent mo21154e(@NonNull Context context, int i, int i2) {
        return super.mo21154e(context, i, i2);
    }

    @NonNull
    /* renamed from: g */
    public final String mo21155g(int i) {
        return super.mo21155g(i);
    }

    @HideFirstParty
    /* renamed from: i */
    public int mo21156i(@NonNull Context context) {
        return super.mo21156i(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: j */
    public int mo21157j(@NonNull Context context, int i) {
        return super.mo21157j(context, i);
    }

    /* renamed from: m */
    public final boolean mo21158m(int i) {
        return super.mo21158m(i);
    }

    @Nullable
    /* renamed from: o */
    public Dialog mo21159o(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return mo21165v(activity, i, zag.m4633b(activity, mo21153d(activity, i, "d"), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: p */
    public PendingIntent mo21160p(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        if (connectionResult.mo21136o2()) {
            return connectionResult.mo21135n2();
        }
        return mo21154e(context, connectionResult.mo21133l2(), 0);
    }

    @MainThread
    @NonNull
    /* renamed from: r */
    public Task<Void> mo21161r(@NonNull Activity activity) {
        int i = f3058d;
        Preconditions.m4483f("makeGooglePlayServicesAvailable must be called from the main thread");
        int j = mo21157j(activity, i);
        if (j == 0) {
            return Tasks.m66667f(null);
        }
        zacc t = zacc.m4156t(activity);
        t.mo21527s(new ConnectionResult(j, (PendingIntent) null), 0);
        return t.mo21499u();
    }

    /* renamed from: s */
    public boolean mo21162s(@NonNull Activity activity, int i, int i2) {
        return mo21163t(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: t */
    public boolean mo21163t(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo21159o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        mo21168y(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: u */
    public void mo21164u(@NonNull Context context, int i) {
        mo21169z(context, i, (String) null, mo21173f(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: v */
    public final Dialog mo21165v(@NonNull Context context, int i, zag zag, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(zac.m4624d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = zac.m4623c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, zag);
        }
        String g = zac.m4627g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    @NonNull
    /* renamed from: w */
    public final Dialog mo21166w(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(zac.m4624d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo21168y(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    /* renamed from: x */
    public final zabx mo21167x(Context context, zabw zabw) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabx = new zabx(zabw);
        zao.m55863a(context, zabx, intentFilter);
        zabx.mo21493a(context);
        if (mo21175l(context, "com.google.android.gms")) {
            return zabx;
        }
        zabw.mo21450a();
        zabx.mo21494b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo21168y(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.m3581U(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.m3519a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo21169z(Context context, int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i2;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            mo21150A(context);
        } else if (pendingIntent != null) {
            String f = zac.m4626f(context, i);
            String e = zac.m4625e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) Preconditions.m4488k(context.getSystemService("notification"));
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(f).setStyle(new NotificationCompat.BigTextStyle().bigText(e));
            if (DeviceProperties.m4880f(context)) {
                Preconditions.m4493p(PlatformVersion.m4900e());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (DeviceProperties.m4881g(context)) {
                    style.addAction(C1733R.C1735drawable.common_full_open_on_phone, resources.getString(C1733R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(C1733R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e);
            }
            if (PlatformVersion.m4904i()) {
                Preconditions.m4493p(PlatformVersion.m4904i());
                synchronized (f3059e) {
                    str2 = this.f3061c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = zac.m4622b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b, 4));
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                style.setChannelId(str2);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                GooglePlayServicesUtilLight.f3066b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
