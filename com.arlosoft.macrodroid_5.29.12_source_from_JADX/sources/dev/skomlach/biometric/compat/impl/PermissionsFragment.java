package dev.skomlach.biometric.compat.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.content.PackageManagerCompat;
import androidx.core.text.TextUtilsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.common.util.concurrent.ListenableFuture;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12113b;
import dev.skomlach.common.misc.C12114c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.p353io.IOUtils;
import p261f9.C12250b;
import p269g9.C12317a;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u001e\u0010\r\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016J/\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/PermissionsFragment;", "Landroidx/fragment/app/Fragment;", "Lja/u;", "unusedAppRestrictionsDisabled", "", "appRestrictionsStatus", "onResult", "handleRestrictions", "", "", "permissions", "requestPermissions", "permissionRequestCode", "showPermissionDeniedDialog", "showMandatoryPermissionsNeedDialog", "keys", "extractDescriptionsForPermissions", "name", "getString", "onDetach", "Landroid/content/Context;", "context", "onAttach", "onResume", "requestCode", "", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "permissionsRequestState", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "Companion", "PermissionRequestState", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: PermissionsFragment.kt */
public final class PermissionsFragment extends Fragment {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final String INTENT_KEY = "intent_key";
    private static final String LIST_KEY = "permissions_list";
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();
    private AtomicInteger permissionsRequestState = new AtomicInteger(PermissionRequestState.NONE.ordinal());

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/PermissionsFragment$Companion;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "", "permissions", "Ljava/lang/Runnable;", "callback", "Lja/u;", "askForPermissions", "INTENT_KEY", "Ljava/lang/String;", "LIST_KEY", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: PermissionsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final void askForPermissions(FragmentActivity fragmentActivity, List<String> list, Runnable runnable) {
            C13706o.m87929f(fragmentActivity, "activity");
            C13706o.m87929f(list, "permissions");
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment.askForPermissions()");
            if ((!list.isEmpty()) && !C12250b.f58845a.mo68574c(list)) {
                String str = PermissionsFragment.Companion.getClass().getName() + HelpFormatter.DEFAULT_OPT_PREFIX + C13566b0.m87432g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null).hashCode();
                if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(str) == null) {
                    PermissionsFragment permissionsFragment = new PermissionsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList(PermissionsFragment.LIST_KEY, new ArrayList(list));
                    permissionsFragment.setArguments(bundle);
                    C12113b.f58378a.mo68299a(PermissionsFragment.appContext, new PermissionsFragment$Companion$askForPermissions$1(runnable), new IntentFilter(PermissionsFragment.INTENT_KEY));
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) permissionsFragment, str).commitAllowingStateLoss();
                }
            } else if (runnable != null) {
                C12114c.f58379a.mo68305g(runnable);
            }
        }
    }

    @Metadata(mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/PermissionsFragment$PermissionRequestState;", "", "(Ljava/lang/String;I)V", "NORMAL_REQUEST", "RATIONAL_REQUEST", "MANUAL_REQUEST", "NONE", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: PermissionsFragment.kt */
    private enum PermissionRequestState {
        NORMAL_REQUEST,
        RATIONAL_REQUEST,
        MANUAL_REQUEST,
        NONE
    }

    private final String extractDescriptionsForPermissions(List<String> list) {
        HashMap<String, String> b = C12250b.f58845a.mo68573b(list);
        boolean z = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 0;
        if (!(!b.isEmpty())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : b.keySet()) {
            String str2 = b.get(str);
            if (!(str2 == null || str2.length() == 0)) {
                if (list.size() <= 1) {
                    sb.append(String.valueOf(str2));
                } else if (z) {
                    sb.append("- " + str2 + IOUtils.LINE_SEPARATOR_UNIX);
                } else {
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX + str2 + " -");
                }
            }
        }
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "sb.toString()");
        return C15177w.m93672R0(sb2).toString();
    }

    private final String getString(String str) {
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
                    FragmentActivity requireActivity = requireActivity();
                    Object obj = field.get((Object) null);
                    C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Int");
                    String string = requireActivity.getString(((Integer) obj).intValue());
                    C13706o.m87928e(string, "requireActivity().getString(field[null] as Int)");
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

    private final void handleRestrictions() {
        try {
            Intent createManageUnusedAppRestrictionsIntent = IntentCompat.createManageUnusedAppRestrictionsIntent(requireActivity(), requireActivity().getPackageName());
            C13706o.m87928e(createManageUnusedAppRestrictionsIntent, "createManageUnusedAppRes…packageName\n            )");
            startActivityForResult(createManageUnusedAppRestrictionsIntent, 5678);
        } catch (Throwable unused) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", requireActivity().getPackageName(), (String) null));
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttach$lambda-0  reason: not valid java name */
    public static final void m101318onAttach$lambda0(PermissionsFragment permissionsFragment, List list) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C13706o.m87929f(list, "$permissions");
        permissionsFragment.requestPermissions(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttach$lambda-1  reason: not valid java name */
    public static final void m101319onAttach$lambda1(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onRequestPermissionsResult$lambda-3  reason: not valid java name */
    public static final void m101320onRequestPermissionsResult$lambda3(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    private final void onResult(int i) {
        this.permissionsRequestState.set(PermissionRequestState.MANUAL_REQUEST.ordinal());
        if (i == 0 || i == 1 || i == 2) {
            unusedAppRestrictionsDisabled();
        } else if (i == 3 || i == 4 || i == 5) {
            handleRestrictions();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onResume$lambda-2  reason: not valid java name */
    public static final void m101321onResume$lambda2(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    private final void requestPermissions(List<String> list) {
        boolean z;
        boolean z2 = list instanceof Collection;
        boolean z3 = true;
        if (!z2 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), (String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            C12317a.f58995a.mo68640a("BiometricCompat_PermissionsFragment").edit().putBoolean("denied", true).apply();
            showPermissionDeniedDialog(list, 1001);
            return;
        }
        if (!z2 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), (String) it2.next())) {
                    break;
                }
            }
        }
        z3 = false;
        if (z3 || !C12317a.f58995a.mo68640a("BiometricCompat_PermissionsFragment").getBoolean("denied", false)) {
            this.permissionsRequestState.set(PermissionRequestState.NORMAL_REQUEST.ordinal());
            Object[] array = list.toArray(new String[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            requestPermissions((String[]) array, 1001);
            return;
        }
        showMandatoryPermissionsNeedDialog(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showMandatoryPermissionsNeedDialog(java.util.List<java.lang.String> r8) {
        /*
            r7 = this;
            java.lang.String r8 = r7.extractDescriptionsForPermissions(r8)
            java.lang.String r0 = "turn_on_magnification_settings_action"
            java.lang.String r0 = r7.getString(r0)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "global_action_settings"
            java.lang.String r0 = r7.getString(r0)
        L_0x0012:
            java.lang.String r1 = "error_message_change_not_allowed"
            java.lang.String r1 = r7.getString(r1)
            r2 = 0
            r3 = 1
            if (r8 == 0) goto L_0x0025
            int r4 = r8.length()
            if (r4 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r4 = 0
            goto L_0x0026
        L_0x0025:
            r4 = 1
        L_0x0026:
            if (r4 != 0) goto L_0x0044
            if (r1 == 0) goto L_0x0033
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = 1
        L_0x0034:
            if (r4 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0041
            int r4 = r0.length()
            if (r4 != 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r4 = 0
            goto L_0x0042
        L_0x0041:
            r4 = 1
        L_0x0042:
            if (r4 == 0) goto L_0x0065
        L_0x0044:
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()     // Catch:{ all -> 0x0062 }
            com.google.common.util.concurrent.ListenableFuture r4 = androidx.core.content.PackageManagerCompat.getUnusedAppRestrictionsStatus(r4)     // Catch:{ all -> 0x0062 }
            java.lang.String r5 = "getUnusedAppRestrictionsStatus(requireActivity())"
            kotlin.jvm.internal.C13706o.m87928e(r4, r5)     // Catch:{ all -> 0x0062 }
            dev.skomlach.biometric.compat.impl.n r5 = new dev.skomlach.biometric.compat.impl.n     // Catch:{ all -> 0x0062 }
            r5.<init>(r7, r4)     // Catch:{ all -> 0x0062 }
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()     // Catch:{ all -> 0x0062 }
            java.util.concurrent.Executor r6 = androidx.core.content.ContextCompat.getMainExecutor(r6)     // Catch:{ all -> 0x0062 }
            r4.addListener(r5, r6)     // Catch:{ all -> 0x0062 }
            goto L_0x0065
        L_0x0062:
            r7.unusedAppRestrictionsDisabled()
        L_0x0065:
            androidx.appcompat.app.AlertDialog$Builder r4 = new androidx.appcompat.app.AlertDialog$Builder
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            r4.<init>(r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            int r5 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r5)
            if (r5 != 0) goto L_0x0079
            r2 = 1
        L_0x0079:
            java.lang.String r5 = ":"
            if (r2 == 0) goto L_0x0089
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            goto L_0x0094
        L_0x0089:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
        L_0x0094:
            java.lang.String r1 = r2.toString()
            r4.setTitle((java.lang.CharSequence) r1)
            r4.setCancelable(r3)
            r4.setMessage((java.lang.CharSequence) r8)
            dev.skomlach.biometric.compat.impl.l r8 = new dev.skomlach.biometric.compat.impl.l
            r8.<init>(r7)
            r4.setOnCancelListener(r8)
            dev.skomlach.biometric.compat.impl.r r8 = new dev.skomlach.biometric.compat.impl.r
            r8.<init>(r7)
            r4.setPositiveButton((java.lang.CharSequence) r0, (android.content.DialogInterface.OnClickListener) r8)
            r4.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.impl.PermissionsFragment.showMandatoryPermissionsNeedDialog(java.util.List):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: showMandatoryPermissionsNeedDialog$lambda-13  reason: not valid java name */
    public static final void m101322showMandatoryPermissionsNeedDialog$lambda13(PermissionsFragment permissionsFragment, ListenableFuture listenableFuture) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C13706o.m87929f(listenableFuture, "$future");
        Object obj = listenableFuture.get();
        C13706o.m87928e(obj, "future.get()");
        permissionsFragment.onResult(((Number) obj).intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: showMandatoryPermissionsNeedDialog$lambda-18$lambda-15  reason: not valid java name */
    public static final void m101323showMandatoryPermissionsNeedDialog$lambda18$lambda15(PermissionsFragment permissionsFragment, DialogInterface dialogInterface) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C12114c.f58379a.mo68306h(new C12077t(permissionsFragment), 250);
    }

    /* access modifiers changed from: private */
    /* renamed from: showMandatoryPermissionsNeedDialog$lambda-18$lambda-15$lambda-14  reason: not valid java name */
    public static final void m101324showMandatoryPermissionsNeedDialog$lambda18$lambda15$lambda14(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showMandatoryPermissionsNeedDialog$lambda-18$lambda-17  reason: not valid java name */
    public static final void m101325showMandatoryPermissionsNeedDialog$lambda18$lambda17(PermissionsFragment permissionsFragment, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(permissionsFragment, "this$0");
        dialogInterface.dismiss();
        try {
            ListenableFuture<Integer> unusedAppRestrictionsStatus = PackageManagerCompat.getUnusedAppRestrictionsStatus(permissionsFragment.requireActivity());
            C13706o.m87928e(unusedAppRestrictionsStatus, "getUnusedAppRestrictionsStatus(requireActivity())");
            unusedAppRestrictionsStatus.addListener(new C12072o(permissionsFragment, unusedAppRestrictionsStatus), ContextCompat.getMainExecutor(permissionsFragment.requireActivity()));
        } catch (Throwable unused) {
            permissionsFragment.unusedAppRestrictionsDisabled();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showMandatoryPermissionsNeedDialog$lambda-18$lambda-17$lambda-16  reason: not valid java name */
    public static final void m101326showMandatoryPermissionsNeedDialog$lambda18$lambda17$lambda16(PermissionsFragment permissionsFragment, ListenableFuture listenableFuture) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C13706o.m87929f(listenableFuture, "$future");
        Object obj = listenableFuture.get();
        C13706o.m87928e(obj, "future.get()");
        permissionsFragment.onResult(((Number) obj).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        if (r2 != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showPermissionDeniedDialog(java.util.List<java.lang.String> r8, int r9) {
        /*
            r7 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r3 = 0
            java.lang.String r4 = "grant_permissions_header_text"
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = r7.getString(r4)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x003b
            java.lang.String r4 = r7.extractDescriptionsForPermissions(r8)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0035
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            r5.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = ": "
            r5.append(r0)     // Catch:{ all -> 0x006e }
            r5.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x006e }
            goto L_0x006f
        L_0x0035:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x003b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0041:
            java.lang.String r0 = r7.extractDescriptionsForPermissions(r8)     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0068
            java.lang.String r4 = r7.getString(r4)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0062
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            r5.append(r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = " :"
            r5.append(r0)     // Catch:{ all -> 0x006e }
            r5.append(r4)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x006e }
            goto L_0x006f
        L_0x0062:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0068:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = r3
        L_0x006f:
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()     // Catch:{ all -> 0x0092 }
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()     // Catch:{ all -> 0x0092 }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ all -> 0x0092 }
            androidx.fragment.app.FragmentActivity r6 = r7.requireActivity()     // Catch:{ all -> 0x0092 }
            android.app.Application r6 = r6.getApplication()     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0092 }
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r2)     // Catch:{ all -> 0x0092 }
            int r5 = r5.labelRes     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = r4.getString(r5)     // Catch:{ all -> 0x0092 }
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            if (r0 == 0) goto L_0x009e
            int r4 = r0.length()
            if (r4 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r4 = 0
            goto L_0x009f
        L_0x009e:
            r4 = 1
        L_0x009f:
            if (r4 != 0) goto L_0x00ac
            if (r3 == 0) goto L_0x00a9
            int r4 = r3.length()
            if (r4 != 0) goto L_0x00aa
        L_0x00a9:
            r2 = 1
        L_0x00aa:
            if (r2 == 0) goto L_0x00b8
        L_0x00ac:
            dev.skomlach.common.misc.c r2 = dev.skomlach.common.misc.C12114c.f58379a
            dev.skomlach.biometric.compat.impl.y r4 = new dev.skomlach.biometric.compat.impl.y
            r4.<init>(r7)
            r5 = 250(0xfa, double:1.235E-321)
            r2.mo68306h(r4, r5)
        L_0x00b8:
            androidx.appcompat.app.AlertDialog$Builder r2 = new androidx.appcompat.app.AlertDialog$Builder
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()
            r2.<init>(r4)
            r2.setTitle((java.lang.CharSequence) r3)
            r2.setCancelable(r1)
            r2.setMessage((java.lang.CharSequence) r0)
            dev.skomlach.biometric.compat.impl.q r0 = new dev.skomlach.biometric.compat.impl.q
            r0.<init>(r7)
            r2.setOnCancelListener(r0)
            r0 = 17039370(0x104000a, float:2.42446E-38)
            dev.skomlach.biometric.compat.impl.s r1 = new dev.skomlach.biometric.compat.impl.s
            r1.<init>(r7, r8, r9)
            r2.setPositiveButton((int) r0, (android.content.DialogInterface.OnClickListener) r1)
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.impl.PermissionsFragment.showPermissionDeniedDialog(java.util.List, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: showPermissionDeniedDialog$lambda-12$lambda-10  reason: not valid java name */
    public static final void m101327showPermissionDeniedDialog$lambda12$lambda10(PermissionsFragment permissionsFragment, DialogInterface dialogInterface) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C12114c.f58379a.mo68306h(new C12070m(permissionsFragment), 250);
    }

    /* access modifiers changed from: private */
    /* renamed from: showPermissionDeniedDialog$lambda-12$lambda-10$lambda-9  reason: not valid java name */
    public static final void m101328showPermissionDeniedDialog$lambda12$lambda10$lambda9(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showPermissionDeniedDialog$lambda-12$lambda-11  reason: not valid java name */
    public static final void m101329showPermissionDeniedDialog$lambda12$lambda11(PermissionsFragment permissionsFragment, List list, int i, DialogInterface dialogInterface, int i2) {
        C13706o.m87929f(permissionsFragment, "this$0");
        C13706o.m87929f(list, "$permissions");
        dialogInterface.dismiss();
        permissionsFragment.permissionsRequestState.set(PermissionRequestState.RATIONAL_REQUEST.ordinal());
        Object[] array = list.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        permissionsFragment.requestPermissions((String[]) array, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: showPermissionDeniedDialog$lambda-8  reason: not valid java name */
    public static final void m101330showPermissionDeniedDialog$lambda8(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    private final void unusedAppRestrictionsDisabled() {
        boolean z;
        this.permissionsRequestState.set(PermissionRequestState.MANUAL_REQUEST.ordinal());
        Bundle arguments = getArguments();
        List stringArrayList = arguments != null ? arguments.getStringArrayList(LIST_KEY) : null;
        if (stringArrayList == null) {
            stringArrayList = C13614t.m87748j();
        }
        if (!(stringArrayList instanceof Collection) || !stringArrayList.isEmpty()) {
            Iterator it = stringArrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (ActivityCompat.shouldShowRequestPermissionRationale(requireActivity(), (String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z || !C12317a.f58995a.mo68640a("BiometricCompat_PermissionsFragment").getBoolean("denied", false)) {
            C12114c.f58379a.mo68306h(new C12081x(this), 250);
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", requireActivity().getPackageName(), (String) null));
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: unusedAppRestrictionsDisabled$lambda-5  reason: not valid java name */
    public static final void m101331unusedAppRestrictionsDisabled$lambda5(PermissionsFragment permissionsFragment) {
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction;
        FragmentTransaction remove;
        C13706o.m87929f(permissionsFragment, "this$0");
        try {
            FragmentActivity activity = permissionsFragment.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (remove = beginTransaction.remove(permissionsFragment)) != null) {
                remove.commitNowAllowingStateLoss();
            }
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68220e("PermissionsFragment", th.getMessage(), th);
        }
    }

    public void onAttach(Context context) {
        C13706o.m87929f(context, "context");
        super.onAttach(context);
        Bundle arguments = getArguments();
        List stringArrayList = arguments != null ? arguments.getStringArrayList(LIST_KEY) : null;
        if (stringArrayList == null) {
            stringArrayList = C13614t.m87748j();
        }
        if (!(!stringArrayList.isEmpty()) || C12250b.f58845a.mo68574c(stringArrayList)) {
            C12114c.f58379a.mo68306h(new C12078u(this), 250);
        } else {
            C12114c.f58379a.mo68306h(new C12073p(this, stringArrayList), 250);
        }
    }

    public void onDetach() {
        super.onDetach();
        C12113b.f58378a.mo68300b(appContext, new Intent(INTENT_KEY));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C13706o.m87929f(strArr, "permissions");
        C13706o.m87929f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.permissionsRequestState.get() != PermissionRequestState.NONE.ordinal()) {
            C12114c.f58379a.mo68306h(new C12080w(this), 250);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.permissionsRequestState.get() == PermissionRequestState.MANUAL_REQUEST.ordinal()) {
            C12114c.f58379a.mo68306h(new C12079v(this), 250);
        }
    }
}
