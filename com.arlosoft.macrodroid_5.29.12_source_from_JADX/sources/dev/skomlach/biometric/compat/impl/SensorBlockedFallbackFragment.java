package dev.skomlach.biometric.compat.impl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import dev.skomlach.biometric.compat.utils.activityView.ActiveWindow;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12114c;
import dev.skomlach.common.misc.C12120d;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/SensorBlockedFallbackFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Lja/u;", "onAttach", "<init>", "()V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SensorBlockedFallbackFragment.kt */
public final class SensorBlockedFallbackFragment extends Fragment {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final String MESSAGE = "message";
    private static final String TITLE = "title";
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();
    /* access modifiers changed from: private */
    public static final AtomicBoolean isFallbackFragmentShown = new AtomicBoolean(false);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005R\u0014\u0010\u000f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/SensorBlockedFallbackFragment$Companion;", "", "", "title", "msg", "Lja/u;", "showFragment", "Landroid/content/Context;", "context", "name", "getString", "", "isUnblockDialogShown", "askForCameraUnblock", "askForMicUnblock", "MESSAGE", "Ljava/lang/String;", "TITLE", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFallbackFragmentShown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SensorBlockedFallbackFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String getString(Context context, String str) {
            Field field;
            boolean isAccessible;
            try {
                Field[] declaredFields = Class.forName("com.android.internal.R$string").getDeclaredFields();
                C13706o.m87928e(declaredFields, "fields");
                int length = declaredFields.length;
                for (int i = 0; i < length; i++) {
                    field = declaredFields[i];
                    if (field.getName().equals(str)) {
                        isAccessible = field.isAccessible();
                        boolean z = true;
                        if (!isAccessible) {
                            field.setAccessible(true);
                        }
                        Object obj = field.get((Object) null);
                        C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                        String string = context.getString(((Integer) obj).intValue());
                        C13706o.m87928e(string, "context.getString(field[null] as Int)");
                        if (string.length() != 0) {
                            z = false;
                        }
                        if (!z) {
                            if (!isAccessible) {
                                field.setAccessible(false);
                            }
                            return string;
                        }
                        throw new RuntimeException("String is empty");
                    }
                }
            } catch (Throwable th) {
                BiometricLoggerImpl.INSTANCE.mo68218e(th);
            }
            return null;
        }

        private final void showFragment(String str, String str2) {
            if (!(str == null || str.length() == 0)) {
                C12114c.f58379a.mo68306h(new C12046b0(str, str2), ((long) SensorBlockedFallbackFragment.appContext.getResources().getInteger(17694722)) * ((long) 2));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: showFragment$lambda-2  reason: not valid java name */
        public static final void m101334showFragment$lambda2(String str, String str2) {
            boolean z;
            String str3 = SensorBlockedFallbackFragment.Companion.getClass().getName() + HelpFormatter.DEFAULT_OPT_PREFIX + str.hashCode() + HelpFormatter.DEFAULT_OPT_PREFIX + (str2 != null ? Integer.valueOf(str2.hashCode()) : null);
            Activity f = C12104a.f58372a.mo68282f();
            if (f instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) f;
                if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(str3) == null) {
                    try {
                        ActiveWindow activeWindow = ActiveWindow.INSTANCE;
                        z = activeWindow.getActiveWindow(C13566b0.m87405I0(activeWindow.getActiveWindows((FragmentActivity) f))).hasWindowFocus();
                    } catch (Throwable unused) {
                        z = false;
                    }
                    if (z) {
                        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
                        SensorBlockedFallbackFragment sensorBlockedFallbackFragment = new SensorBlockedFallbackFragment();
                        Bundle bundle = new Bundle();
                        bundle.putString(SensorBlockedFallbackFragment.TITLE, str);
                        bundle.putString(SensorBlockedFallbackFragment.MESSAGE, str2);
                        sensorBlockedFallbackFragment.setArguments(bundle);
                        beginTransaction.add((Fragment) sensorBlockedFallbackFragment, str3).commitAllowingStateLoss();
                    }
                }
            }
        }

        public final void askForCameraUnblock() {
            showFragment(getString(SensorBlockedFallbackFragment.appContext, "sensor_privacy_start_use_camera_notification_content_title"), getString(SensorBlockedFallbackFragment.appContext, "face_sensor_privacy_enabled"));
        }

        public final void askForMicUnblock() {
            showFragment(getString(SensorBlockedFallbackFragment.appContext, "sensor_privacy_start_use_mic_notification_content_title"), (String) null);
        }

        public final boolean isUnblockDialogShown() {
            if (SensorBlockedFallbackFragment.isFallbackFragmentShown.get()) {
                return true;
            }
            Activity f = C12104a.f58372a.mo68282f();
            boolean z = false;
            if (!(f instanceof FragmentActivity)) {
                return false;
            }
            try {
                ActiveWindow activeWindow = ActiveWindow.INSTANCE;
                z = activeWindow.getActiveWindow(C13566b0.m87405I0(activeWindow.getActiveWindows((FragmentActivity) f))).hasWindowFocus();
            } catch (Throwable unused) {
            }
            return !z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttach$lambda-2  reason: not valid java name */
    public static final void m101332onAttach$lambda2(Context context, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(context, "$context");
        C12120d.f58384a.mo68318e(new Intent("android.settings.PRIVACY_SETTINGS"), context);
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttach$lambda-3  reason: not valid java name */
    public static final void m101333onAttach$lambda3(SensorBlockedFallbackFragment sensorBlockedFallbackFragment, DialogInterface dialogInterface) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(sensorBlockedFallbackFragment, "this$0");
        try {
            FragmentActivity activity = sensorBlockedFallbackFragment.getActivity();
            if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (beginTransaction = supportFragmentManager.beginTransaction()) == null || (remove = beginTransaction.remove(sensorBlockedFallbackFragment)) == null)) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            isFallbackFragmentShown.set(false);
            throw th;
        }
        isFallbackFragmentShown.set(false);
    }

    public void onAttach(Context context) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        String string;
        C13706o.m87929f(context, "context");
        super.onAttach(context);
        try {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
            Bundle arguments = getArguments();
            AlertDialog.Builder title = builder.setTitle((CharSequence) arguments != null ? arguments.getString(TITLE) : null);
            Bundle arguments2 = getArguments();
            if (!(arguments2 == null || (string = arguments2.getString(MESSAGE)) == null)) {
                title.setMessage((CharSequence) string);
            }
            AlertDialog.Builder negativeButton = title.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            String access$getString = Companion.getString(appContext, "sensor_privacy_start_use_dialog_turn_on_button");
            if (access$getString == null) {
                access$getString = getString(17039370);
                C13706o.m87928e(access$getString, "getString(android.R.string.ok)");
            }
            negativeButton.setPositiveButton((CharSequence) access$getString, (DialogInterface.OnClickListener) new C12083z(context)).setOnDismissListener(new C12044a0(this)).show();
            isFallbackFragmentShown.set(true);
            return;
        } catch (Throwable th) {
            try {
                BiometricLoggerImpl.INSTANCE.mo68220e("SensorBlockedFragment", th.getMessage(), th);
            } catch (Throwable th2) {
                isFallbackFragmentShown.set(false);
                throw th2;
            }
        }
        isFallbackFragmentShown.set(false);
    }
}
