package dev.skomlach.biometric.compat.impl;

import android.view.View;
import dev.skomlach.biometric.compat.AuthenticationFailureReason;
import dev.skomlach.biometric.compat.AuthenticationResult;
import dev.skomlach.biometric.compat.BiometricAuthRequest;
import dev.skomlach.biometric.compat.BiometricConfirmation;
import dev.skomlach.biometric.compat.BiometricCryptoObject;
import dev.skomlach.biometric.compat.BiometricCryptographyPurpose;
import dev.skomlach.biometric.compat.BiometricPromptCompat;
import dev.skomlach.biometric.compat.BiometricType;
import dev.skomlach.biometric.compat.engine.BiometricAuthentication;
import dev.skomlach.biometric.compat.engine.BiometricAuthenticationListener;
import dev.skomlach.biometric.compat.impl.AuthResult;
import dev.skomlach.biometric.compat.impl.dialogs.BiometricPromptCompatDialogImpl;
import dev.skomlach.biometric.compat.utils.DevicesWithKnownBugs;
import dev.skomlach.biometric.compat.utils.HardwareAccessImpl;
import dev.skomlach.biometric.compat.utils.Vibro;
import dev.skomlach.biometric.compat.utils.activityView.IconStateHelper;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.biometric.compat.utils.notification.BiometricNotificationManager;
import dev.skomlach.common.misc.C12114c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001*B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)J&\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010$\u0012\u0004\u0012\u00020%0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/BiometricPromptGenericImpl;", "Ldev/skomlach/biometric/compat/impl/IBiometricPromptImpl;", "Ldev/skomlach/biometric/compat/impl/AuthCallback;", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "module", "Ldev/skomlach/biometric/compat/impl/AuthResult$AuthResultState;", "authResult", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "Lja/u;", "checkAuthResult", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "callback", "authenticate", "cancelAuthentication", "startAuth", "stopAuth", "cancelAuth", "onUiOpened", "onUiClosed", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "builder", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "getBuilder", "()Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;", "dialog", "Ldev/skomlach/biometric/compat/impl/dialogs/BiometricPromptCompatDialogImpl;", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "fmAuthCallback", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "Ldev/skomlach/biometric/compat/BiometricPromptCompat$AuthenticationCallback;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isFingerprint", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "Ldev/skomlach/biometric/compat/BiometricType;", "Ldev/skomlach/biometric/compat/impl/AuthResult;", "authFinished", "Ljava/util/Map;", "<init>", "(Ldev/skomlach/biometric/compat/BiometricPromptCompat$Builder;)V", "BiometricAuthenticationCallbackImpl", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricPromptGenericImpl.kt */
public final class BiometricPromptGenericImpl implements IBiometricPromptImpl, AuthCallback {
    private final Map<BiometricType, AuthResult> authFinished;
    private final BiometricPromptCompat.Builder builder;
    private BiometricPromptCompat.AuthenticationCallback callback;
    /* access modifiers changed from: private */
    public BiometricPromptCompatDialogImpl dialog;
    private final BiometricAuthenticationListener fmAuthCallback = new BiometricAuthenticationCallbackImpl();
    private final AtomicBoolean isFingerprint;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\u0010"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/BiometricPromptGenericImpl$BiometricAuthenticationCallbackImpl;", "Ldev/skomlach/biometric/compat/engine/BiometricAuthenticationListener;", "Ldev/skomlach/biometric/compat/AuthenticationResult;", "module", "Lja/u;", "onSuccess", "", "msg", "onHelp", "Ldev/skomlach/biometric/compat/AuthenticationFailureReason;", "failureReason", "Ldev/skomlach/biometric/compat/BiometricType;", "onFailure", "onCanceled", "<init>", "(Ldev/skomlach/biometric/compat/impl/BiometricPromptGenericImpl;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricPromptGenericImpl.kt */
    private final class BiometricAuthenticationCallbackImpl implements BiometricAuthenticationListener {
        public BiometricAuthenticationCallbackImpl() {
        }

        public void onCanceled(BiometricType biometricType) {
            BiometricPromptGenericImpl.this.cancelAuth();
            BiometricPromptGenericImpl.this.cancelAuthentication();
        }

        public void onFailure(AuthenticationFailureReason authenticationFailureReason, BiometricType biometricType) {
            BiometricPromptGenericImpl.this.checkAuthResult(new AuthenticationResult(biometricType, (BiometricCryptoObject) null, 2, (C13695i) null), AuthResult.AuthResultState.FATAL_ERROR, authenticationFailureReason);
        }

        public void onHelp(CharSequence charSequence) {
            BiometricPromptCompatDialogImpl access$getDialog$p;
            if (!(charSequence == null || charSequence.length() == 0) && BiometricPromptGenericImpl.this.dialog != null && (access$getDialog$p = BiometricPromptGenericImpl.this.dialog) != null) {
                access$getDialog$p.onHelp(charSequence);
            }
        }

        public void onSuccess(AuthenticationResult authenticationResult) {
            BiometricPromptGenericImpl.checkAuthResult$default(BiometricPromptGenericImpl.this, authenticationResult, AuthResult.AuthResultState.SUCCESS, (AuthenticationFailureReason) null, 4, (Object) null);
        }
    }

    public BiometricPromptGenericImpl(BiometricPromptCompat.Builder builder2) {
        C13706o.m87929f(builder2, "builder");
        this.builder = builder2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.isFingerprint = atomicBoolean;
        this.authFinished = new HashMap();
        atomicBoolean.set(getBuilder().getAllAvailableTypes().contains(BiometricType.BIOMETRIC_FINGERPRINT));
    }

    /* access modifiers changed from: private */
    public final void checkAuthResult(AuthenticationResult authenticationResult, AuthResult.AuthResultState authResultState, AuthenticationFailureReason authenticationFailureReason) {
        T t = null;
        if (authResultState == AuthResult.AuthResultState.SUCCESS) {
            IconStateHelper.INSTANCE.successType(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            if (getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL) {
                Vibro.INSTANCE.start();
            }
        } else if (authResultState == AuthResult.AuthResultState.FATAL_ERROR) {
            IconStateHelper.INSTANCE.errorType(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
            if (biometricPromptCompatDialogImpl != null) {
                biometricPromptCompatDialogImpl.onFailure(authenticationFailureReason == AuthenticationFailureReason.LOCKED_OUT);
            }
        }
        if (!C13566b0.m87414O(C13614t.m87754p(AuthenticationFailureReason.SENSOR_FAILED, AuthenticationFailureReason.AUTHENTICATION_FAILED), authenticationFailureReason)) {
            this.authFinished.put(authenticationResult != null ? authenticationResult.getConfirmed() : null, new AuthResult(authResultState, authenticationResult, authenticationFailureReason));
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl2 = this.dialog;
            if (biometricPromptCompatDialogImpl2 != null) {
                biometricPromptCompatDialogImpl2.setAuthFinishedCopy(this.authFinished);
            }
            BiometricNotificationManager.INSTANCE.dismiss(authenticationResult != null ? authenticationResult.getConfirmed() : null);
            ArrayList arrayList = new ArrayList(this.authFinished.keySet());
            ArrayList arrayList2 = new ArrayList(getBuilder().getAllAvailableTypes());
            arrayList2.removeAll(arrayList);
            BiometricLoggerImpl biometricLoggerImpl = BiometricLoggerImpl.INSTANCE;
            BiometricAuthRequest biometricAuthRequest = getBuilder().getBiometricAuthRequest();
            Map<BiometricType, AuthResult> map = this.authFinished;
            HashSet<BiometricType> allAvailableTypes = getBuilder().getAllAvailableTypes();
            biometricLoggerImpl.mo68217d("checkAuthResult.authFinished - " + biometricAuthRequest + ": " + arrayList2 + "; (" + map + " / " + allAvailableTypes + ")");
            T t2 = null;
            for (T next : this.authFinished.values()) {
                if (((AuthResult) next).getAuthResultState() == AuthResult.AuthResultState.FATAL_ERROR) {
                    t2 = next;
                }
            }
            AuthResult authResult = (AuthResult) t2;
            for (T next2 : this.authFinished.values()) {
                if (((AuthResult) next2).getAuthResultState() == AuthResult.AuthResultState.SUCCESS) {
                    t = next2;
                }
            }
            AuthResult authResult2 = (AuthResult) t;
            BiometricLoggerImpl biometricLoggerImpl2 = BiometricLoggerImpl.INSTANCE;
            BiometricAuthRequest biometricAuthRequest2 = getBuilder().getBiometricAuthRequest();
            biometricLoggerImpl2.mo68217d("checkAuthResult.authFinished - " + biometricAuthRequest2 + ": " + authResult + "/" + authResult2);
            if (((authResult2 != null || arrayList2.isEmpty()) && getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ANY) || (getBuilder().getBiometricAuthRequest().getConfirmation() == BiometricConfirmation.ALL && arrayList2.isEmpty())) {
                C12114c.f58379a.mo68305g(new C12068k(this, authResult2, authResult));
            }
        }
    }

    static /* synthetic */ void checkAuthResult$default(BiometricPromptGenericImpl biometricPromptGenericImpl, AuthenticationResult authenticationResult, AuthResult.AuthResultState authResultState, AuthenticationFailureReason authenticationFailureReason, int i, Object obj) {
        if ((i & 4) != 0) {
            authenticationFailureReason = null;
        }
        biometricPromptGenericImpl.checkAuthResult(authenticationResult, authResultState, authenticationFailureReason);
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResult$lambda-6  reason: not valid java name */
    public static final void m101316checkAuthResult$lambda6(BiometricPromptGenericImpl biometricPromptGenericImpl, AuthResult authResult, AuthResult authResult2) {
        boolean z;
        AuthenticationResult authenticationResult;
        AuthenticationResult successData;
        BiometricCryptoObject biometricCryptoObject;
        C13706o.m87929f(biometricPromptGenericImpl, "this$0");
        biometricPromptGenericImpl.cancelAuthentication();
        if (authResult != null) {
            Map<BiometricType, AuthResult> map = biometricPromptGenericImpl.authFinished;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<Map.Entry<BiometricType, AuthResult>> it = map.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((AuthResult) next.getValue()).getAuthResultState() != AuthResult.AuthResultState.SUCCESS) {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(next.getKey(), next.getValue());
                }
            }
            BiometricCryptographyPurpose cryptographyPurpose = biometricPromptGenericImpl.getBuilder().getCryptographyPurpose();
            if ((cryptographyPurpose != null ? Integer.valueOf(cryptographyPurpose.getPurpose()) : null) != null) {
                z = false;
            }
            BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptGenericImpl.callback;
            if (authenticationCallback != null) {
                List<BiometricType> F0 = C13566b0.m87402F0(linkedHashMap.keySet());
                ArrayList arrayList = new ArrayList();
                for (BiometricType biometricType : F0) {
                    AuthResult authResult3 = (AuthResult) linkedHashMap.get(biometricType);
                    if (authResult3 == null || (successData = authResult3.getSuccessData()) == null) {
                        authenticationResult = null;
                    } else {
                        BiometricType confirmed = successData.getConfirmed();
                        if (z) {
                            biometricCryptoObject = null;
                        } else {
                            biometricCryptoObject = successData.getCryptoObject();
                        }
                        authenticationResult = new AuthenticationResult(confirmed, biometricCryptoObject);
                    }
                    if (authenticationResult != null) {
                        arrayList.add(authenticationResult);
                    }
                }
                authenticationCallback.onSucceeded(C13566b0.m87407K0(arrayList));
            }
        } else if (authResult2 == null) {
        } else {
            if (authResult2.getFailureReason() != AuthenticationFailureReason.LOCKED_OUT) {
                BiometricPromptCompat.AuthenticationCallback authenticationCallback2 = biometricPromptGenericImpl.callback;
                if (authenticationCallback2 != null) {
                    BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback2, authResult2.getFailureReason(), (CharSequence) null, 2, (Object) null);
                    return;
                }
                return;
            }
            HardwareAccessImpl.Companion.getInstance(biometricPromptGenericImpl.getBuilder().getBiometricAuthRequest()).lockout();
            C12114c.f58379a.mo68306h(new C12067j(biometricPromptGenericImpl, authResult2), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuthResult$lambda-6$lambda-5  reason: not valid java name */
    public static final void m101317checkAuthResult$lambda6$lambda5(BiometricPromptGenericImpl biometricPromptGenericImpl, AuthResult authResult) {
        C13706o.m87929f(biometricPromptGenericImpl, "this$0");
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = biometricPromptGenericImpl.callback;
        if (authenticationCallback != null) {
            BiometricPromptCompat.AuthenticationCallback.onFailed$default(authenticationCallback, authResult.getFailureReason(), (CharSequence) null, 2, (Object) null);
        }
    }

    public void authenticate(BiometricPromptCompat.AuthenticationCallback authenticationCallback) {
        boolean z = true;
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptGenericImpl.authenticate():");
        this.callback = authenticationCallback;
        if (!(this.isFingerprint.get() && DevicesWithKnownBugs.INSTANCE.isHideDialogInstantly())) {
            BiometricPromptCompat.Builder builder2 = getBuilder();
            if (!this.isFingerprint.get() || !DevicesWithKnownBugs.INSTANCE.getHasUnderDisplayFingerprint()) {
                z = false;
            }
            BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = new BiometricPromptCompatDialogImpl(builder2, this, z);
            this.dialog = biometricPromptCompatDialogImpl;
            biometricPromptCompatDialogImpl.showDialog();
        } else {
            startAuth();
        }
        onUiOpened();
    }

    public void cancelAuth() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onCanceled();
        }
    }

    public void cancelAuthentication() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptGenericImpl.cancelAuthentication():");
        BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
        if (biometricPromptCompatDialogImpl == null) {
            stopAuth();
        } else if (biometricPromptCompatDialogImpl != null) {
            biometricPromptCompatDialogImpl.dismissDialog();
        }
        onUiClosed();
    }

    public BiometricPromptCompat.Builder getBuilder() {
        return this.builder;
    }

    public void onUiClosed() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onUIClosed();
        }
    }

    public void onUiOpened() {
        BiometricPromptCompat.AuthenticationCallback authenticationCallback = this.callback;
        if (authenticationCallback != null) {
            authenticationCallback.onUIOpened();
        }
    }

    public void startAuth() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptGenericImpl.startAuth():");
        ArrayList arrayList = new ArrayList(getBuilder().getAllAvailableTypes());
        BiometricAuthentication biometricAuthentication = BiometricAuthentication.INSTANCE;
        BiometricCryptographyPurpose cryptographyPurpose = getBuilder().getCryptographyPurpose();
        BiometricPromptCompatDialogImpl biometricPromptCompatDialogImpl = this.dialog;
        View view = null;
        if (!(biometricPromptCompatDialogImpl == null || biometricPromptCompatDialogImpl == null)) {
            view = biometricPromptCompatDialogImpl.getAuthPreview();
        }
        biometricAuthentication.authenticate(cryptographyPurpose, view, (List<? extends BiometricType>) arrayList, this.fmAuthCallback);
    }

    public void stopAuth() {
        BiometricLoggerImpl.INSTANCE.mo68217d("BiometricPromptGenericImpl.stopAuth():");
        BiometricAuthentication.INSTANCE.cancelAuthentication();
    }
}
