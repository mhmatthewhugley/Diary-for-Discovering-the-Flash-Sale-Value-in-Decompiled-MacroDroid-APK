package com.arlosoft.macrodroid;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.arlosoft.macrodroid.homescreen.NewHomeScreenActivity;
import com.arlosoft.macrodroid.settings.C5124c;
import com.arlosoft.macrodroid.settings.C5163j2;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricApi;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricConfirmation;
import dev.skomlach.biometric.compat.BiometricManagerCompat;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p319lc.C15626c;

/* renamed from: com.arlosoft.macrodroid.g0 */
/* compiled from: PasswordProtection.kt */
public final class C4699g0 {

    /* renamed from: a */
    public static final C4699g0 f11814a = new C4699g0();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f11815b;

    /* renamed from: c */
    private static WeakReference<View> f11816c;

    /* renamed from: d */
    private static BiometricPromptCompat f11817d;

    /* renamed from: com.arlosoft.macrodroid.g0$a */
    /* compiled from: PasswordProtection.kt */
    public static final class C4700a extends DialogFragment {

        /* renamed from: a */
        public Map<Integer, View> f11818a = new LinkedHashMap();

        /* renamed from: com.arlosoft.macrodroid.g0$a$a */
        /* compiled from: PasswordProtection.kt */
        public static final class C4701a implements TextWatcher {

            /* renamed from: a */
            final /* synthetic */ Button f11819a;

            /* renamed from: c */
            final /* synthetic */ EditText f11820c;

            C4701a(Button button, EditText editText) {
                this.f11819a = button;
                this.f11820c = editText;
            }

            public void afterTextChanged(Editable editable) {
                C13706o.m87929f(editable, "s");
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C13706o.m87929f(charSequence, "s");
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C13706o.m87929f(charSequence, "s");
                Button button = this.f11819a;
                if (button != null) {
                    button.setEnabled(this.f11820c.getText().length() > 3);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: X */
        public static final void m18228X(EditText editText, C4700a aVar, AppCompatDialog appCompatDialog, View view) {
            C13706o.m87929f(aVar, "this$0");
            C13706o.m87929f(appCompatDialog, "$dialog");
            C13706o.m87926c(editText);
            String obj = editText.getText().toString();
            if (C13706o.m87924a(obj, C5163j2.m20152f1(aVar.getActivity())) || C13706o.m87924a(obj, C5124c.f12863a)) {
                appCompatDialog.cancel();
                C4699g0 g0Var = C4699g0.f11814a;
                FragmentActivity requireActivity = aVar.requireActivity();
                C13706o.m87928e(requireActivity, "requireActivity()");
                g0Var.m18218h(requireActivity);
                C4699g0.f11815b = false;
                return;
            }
            C15626c.m94876a(aVar.requireActivity().getApplicationContext(), aVar.requireActivity().getString(C17541R$string.invalid_password), 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: Z */
        public static final void m18229Z(AppCompatDialog appCompatDialog, C4700a aVar, View view) {
            C13706o.m87929f(appCompatDialog, "$dialog");
            C13706o.m87929f(aVar, "this$0");
            appCompatDialog.cancel();
            C4699g0.f11814a.m18217g(aVar.getActivity());
        }

        /* renamed from: W */
        public void mo29142W() {
            this.f11818a.clear();
        }

        public Dialog onCreateDialog(Bundle bundle) {
            AppCompatDialog appCompatDialog = new AppCompatDialog(requireActivity(), C17542R$style.Theme_App_Dialog);
            appCompatDialog.setContentView((int) C17535R$layout.enter_password_dialog);
            appCompatDialog.setTitle((int) C17541R$string.macrodroid);
            appCompatDialog.setCancelable(false);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = appCompatDialog.getWindow();
            C13706o.m87926c(window);
            layoutParams.copyFrom(window.getAttributes());
            if (!requireActivity().getResources().getBoolean(C17527R$bool.is_tablet)) {
                layoutParams.width = -1;
            }
            Window window2 = appCompatDialog.getWindow();
            C13706o.m87926c(window2);
            window2.setAttributes(layoutParams);
            Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
            Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
            EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_password_dialog_password);
            Object systemService = requireActivity().getSystemService("input_method");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            if (button != null) {
                button.setOnClickListener(new C4543e0(editText, this, appCompatDialog));
            }
            if (button2 != null) {
                button2.setOnClickListener(new C4674f0(appCompatDialog, this));
            }
            if (editText != null) {
                editText.addTextChangedListener(new C4701a(button, editText));
            }
            Window window3 = appCompatDialog.getWindow();
            C13706o.m87926c(window3);
            window3.setSoftInputMode(4);
            return appCompatDialog;
        }

        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            mo29142W();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.g0$b */
    /* compiled from: PasswordProtection.kt */
    public static final class C4702b extends BiometricPromptCompat.AuthenticationCallback {

        /* renamed from: a */
        final /* synthetic */ AppCompatActivity f11821a;

        C4702b(AppCompatActivity appCompatActivity) {
            this.f11821a = appCompatActivity;
        }

        public void onCanceled() {
            C4699g0.f11814a.m18217g(this.f11821a);
        }

        public void onFailed(AuthenticationFailureReason authenticationFailureReason, CharSequence charSequence) {
            C4699g0.f11814a.m18216f(this.f11821a);
        }

        @MainThread
        public void onSucceeded(Set<AuthenticationResult> set) {
            C13706o.m87929f(set, "confirmed");
            if (this.f11821a.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
                C4699g0.f11814a.m18218h(this.f11821a);
                C4699g0.f11815b = false;
            }
        }

        public void onUIClosed() {
        }

        public void onUIOpened() {
        }
    }

    private C4699g0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m18216f(AppCompatActivity appCompatActivity) {
        try {
            C4700a aVar = new C4700a();
            aVar.setCancelable(false);
            aVar.show(appCompatActivity.getSupportFragmentManager(), "MyProgressDialog");
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m18217g(Context context) {
        Intent intent = new Intent(context, NewHomeScreenActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addFlags(268468224);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.putExtra("exitApp", true);
        C13706o.m87926c(context);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m18218h(Activity activity) {
        new Handler(Looper.getMainLooper()).post(C4357d0.f11091a);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m18219i() {
        WeakReference<View> weakReference = f11816c;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            ViewParent parent = view.getParent();
            try {
                C13706o.m87927d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    public static final void m18220j() {
        BiometricPromptCompat biometricPromptCompat = f11817d;
        if (biometricPromptCompat != null) {
            biometricPromptCompat.cancelAuthentication();
        }
        f11817d = null;
    }

    /* renamed from: k */
    public static final void m18221k(AppCompatActivity appCompatActivity) {
        C13706o.m87929f(appCompatActivity, "activity");
        C4699g0 g0Var = f11814a;
        if (f11815b && !TextUtils.isEmpty(C5163j2.m20152f1(appCompatActivity))) {
            if (C5163j2.m20222o(appCompatActivity)) {
                g0Var.m18222m(appCompatActivity);
                g0Var.m18224o(appCompatActivity);
                return;
            }
            g0Var.m18222m(appCompatActivity);
            g0Var.m18216f(appCompatActivity);
        }
    }

    /* renamed from: m */
    private final void m18222m(AppCompatActivity appCompatActivity) {
        View view = new View(appCompatActivity);
        view.setBackgroundColor(Color.argb(100, 0, 0, 0));
        appCompatActivity.addContentView(view, new ViewGroup.LayoutParams(-1, -1));
        view.setClickable(true);
        f11816c = new WeakReference<>(view);
    }

    /* renamed from: n */
    private final void m18223n(Activity activity, String str) {
        C15626c.m94876a(activity, str, 1).show();
    }

    /* renamed from: o */
    private final void m18224o(AppCompatActivity appCompatActivity) {
        C13339u uVar;
        BiometricAuthRequest biometricAuthRequest = new BiometricAuthRequest(BiometricApi.AUTO, BiometricType.BIOMETRIC_ANY, BiometricConfirmation.ANY);
        if (BiometricManagerCompat.isBiometricSensorPermanentlyLocked(biometricAuthRequest) || BiometricManagerCompat.isLockOut(biometricAuthRequest)) {
            C4699g0 g0Var = f11814a;
            String string = appCompatActivity.getString(C17541R$string.macrodroid_password_biometrics_not_available);
            C13706o.m87928e(string, "activity.getString(R.str…biometrics_not_available)");
            g0Var.m18223n(appCompatActivity, string);
            g0Var.m18216f(appCompatActivity);
            return;
        }
        BiometricPromptCompat build = new BiometricPromptCompat.Builder(biometricAuthRequest, appCompatActivity).build();
        f11817d = build;
        if (build != null) {
            build.authenticate(new C4702b(appCompatActivity));
            uVar = C13339u.f61331a;
        } else {
            uVar = null;
        }
        if (uVar == null) {
            String string2 = appCompatActivity.getString(C17541R$string.macrodroid_password_biometrics_not_available);
            C13706o.m87928e(string2, "activity.getString(R.str…biometrics_not_available)");
            m18223n(appCompatActivity, string2);
            m18216f(appCompatActivity);
        }
    }

    /* renamed from: l */
    public final void mo29141l() {
        f11815b = true;
    }
}
