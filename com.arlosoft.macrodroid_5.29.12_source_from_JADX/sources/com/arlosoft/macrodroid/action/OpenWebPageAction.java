package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.MacroDroidVariable;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6440u1;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import okhttp3.C15915d0;
import okhttp3.C15970o;
import okhttp3.C15993w;
import org.apache.http.auth.AUTH;
import p057a2.C2212a;
import p057a2.C2222k;
import p057a2.C2224m;
import p128m0.C7789l2;
import p148q0.C8151a;
import p319lc.C15626c;

public class OpenWebPageAction extends Action implements C2222k, C2212a, C2224m {
    public static final Parcelable.Creator<OpenWebPageAction> CREATOR = new C2563d();
    private X509TrustManager TRUST_ALL_CERTS;
    private boolean allowAnyCertificate;
    private boolean blockNextAction;
    private boolean m_disableUrlEncode;
    private boolean m_httpGet;
    private String m_urlToOpen;
    private MacroDroidVariable m_variableSuccessResponse;
    private MacroDroidVariable m_variableToSaveResponse;
    private transient PowerManager.WakeLock wakelock;

    /* renamed from: com.arlosoft.macrodroid.action.OpenWebPageAction$a */
    class C2560a implements X509TrustManager {
        C2560a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OpenWebPageAction$b */
    class C2561b implements HostnameVerifier {
        C2561b() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OpenWebPageAction$c */
    class C2562c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ Button f7400a;

        /* renamed from: c */
        final /* synthetic */ EditText f7401c;

        C2562c(Button button, EditText editText) {
            this.f7400a = button;
            this.f7401c = editText;
        }

        public void afterTextChanged(Editable editable) {
            this.f7400a.setEnabled(this.f7401c.getText().length() > 0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OpenWebPageAction$d */
    class C2563d implements Parcelable.Creator<OpenWebPageAction> {
        C2563d() {
        }

        /* renamed from: a */
        public OpenWebPageAction createFromParcel(Parcel parcel) {
            return new OpenWebPageAction(parcel, (C2560a) null);
        }

        /* renamed from: b */
        public OpenWebPageAction[] newArray(int i) {
            return new OpenWebPageAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.OpenWebPageAction$e */
    private class C2564e implements C15993w {

        /* renamed from: a */
        private String f7403a;

        public C2564e(String str, String str2) {
            this.f7403a = C15970o.m96244a(str, str2);
        }

        public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
            return aVar.mo76309a(aVar.mo76312m().mo75918h().mo75927f(AUTH.WWW_AUTH_RESP, this.f7403a).mo75923b());
        }
    }

    /* synthetic */ OpenWebPageAction(Parcel parcel, C2560a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: A3 */
    public /* synthetic */ void m11687A3(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, Spinner spinner, Spinner spinner2, CompoundButton compoundButton, boolean z) {
        checkBox.setEnabled(z);
        checkBox2.setEnabled(z);
        checkBox3.setEnabled(z);
        checkBox4.setEnabled(z);
        if (!z || this.m_variableToSaveResponse == null) {
            spinner.setEnabled(false);
        } else {
            spinner.setEnabled(true);
        }
        if (!z || this.m_variableSuccessResponse == null) {
            spinner2.setEnabled(false);
        } else {
            spinner2.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B3 */
    public /* synthetic */ void m11688B3(CheckBox checkBox, EditText editText, CheckBox checkBox2, CheckBox checkBox3, AppCompatDialog appCompatDialog, CheckBox checkBox4, Spinner spinner, CheckBox checkBox5, Spinner spinner2, CheckBox checkBox6, View view) {
        this.m_httpGet = checkBox.isChecked();
        this.m_urlToOpen = editText.getText().toString();
        this.blockNextAction = checkBox2.isChecked();
        this.allowAnyCertificate = checkBox3.isChecked();
        appCompatDialog.cancel();
        if (checkBox4.isChecked()) {
            try {
                this.m_variableToSaveResponse = mo27861q(spinner.getSelectedItem().toString());
            } catch (Exception unused) {
                this.m_variableToSaveResponse = null;
            }
        } else {
            this.m_variableToSaveResponse = null;
        }
        if (checkBox5.isChecked()) {
            try {
                this.m_variableSuccessResponse = mo27861q(spinner2.getSelectedItem().toString());
            } catch (Exception unused2) {
                this.m_variableSuccessResponse = null;
            }
        } else {
            this.m_variableSuccessResponse = null;
        }
        this.m_disableUrlEncode = !checkBox6.isChecked();
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: D3 */
    public static /* synthetic */ void m11690D3(EditText editText, C4023j0.C4029f fVar) {
        int max = Math.max(editText.getSelectionStart(), 0);
        int max2 = Math.max(editText.getSelectionEnd(), 0);
        Editable text = editText.getText();
        int min = Math.min(max, max2);
        int max3 = Math.max(max, max2);
        String str = fVar.f10575a;
        text.replace(min, max3, str, 0, str.length());
    }

    /* access modifiers changed from: private */
    /* renamed from: E3 */
    public /* synthetic */ void m11691E3(boolean z, int i, TriggerContextInfo triggerContextInfo, boolean z2, Stack stack, ResumeMacroInfo resumeMacroInfo) {
        if (this.blockNextAction && !z) {
            mo27837X0().invokeActions(mo27837X0().getActions(), i, triggerContextInfo, z2, stack, resumeMacroInfo);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[Catch:{ all -> 0x016c, all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[Catch:{ all -> 0x016c, all -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ce A[SYNTHETIC, Splitter:B:36:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0168 A[SYNTHETIC, Splitter:B:56:0x0168] */
    /* renamed from: F3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m11692F3(java.lang.String r14, java.lang.String r15, boolean r16, int r17, com.arlosoft.macrodroid.triggers.TriggerContextInfo r18, boolean r19, java.util.Stack r20, com.arlosoft.macrodroid.data.ResumeMacroInfo r21) {
        /*
            r13 = this;
            r9 = r13
            r1 = r14
            r2 = r15
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r9.m_variableSuccessResponse
            r3 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r3
        L_0x000f:
            r5 = 0
            java.lang.String r0 = "@"
            boolean r0 = r14.contains(r0)     // Catch:{ all -> 0x016c }
            r6 = 20
            r8 = 1
            if (r0 == 0) goto L_0x0074
            android.net.Uri r0 = android.net.Uri.parse(r14)     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = r0.getUserInfo()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r10 = ":"
            java.lang.String[] r0 = r0.split(r10)     // Catch:{ Exception -> 0x0030 }
            r10 = r0[r5]     // Catch:{ Exception -> 0x0030 }
            r0 = r0[r8]     // Catch:{ Exception -> 0x002e }
            goto L_0x0053
        L_0x002e:
            r0 = move-exception
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            r10 = r3
        L_0x0032:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x016c }
            r11.<init>()     // Catch:{ all -> 0x016c }
            java.lang.String r12 = "Error trying to parse url: "
            r11.append(r12)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x016c }
            r11.append(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x016c }
            java.lang.Long r11 = r13.mo27840Y0()     // Catch:{ all -> 0x016c }
            long r11 = r11.longValue()     // Catch:{ all -> 0x016c }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r11)     // Catch:{ all -> 0x016c }
            r0 = r3
        L_0x0053:
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x016c }
            if (r11 != 0) goto L_0x0074
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x016c }
            if (r11 != 0) goto L_0x0074
            okhttp3.z$a r11 = new okhttp3.z$a     // Catch:{ all -> 0x016c }
            r11.<init>()     // Catch:{ all -> 0x016c }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x016c }
            okhttp3.z$a r11 = r11.mo76370L(r6, r12)     // Catch:{ all -> 0x016c }
            com.arlosoft.macrodroid.action.OpenWebPageAction$e r12 = new com.arlosoft.macrodroid.action.OpenWebPageAction$e     // Catch:{ all -> 0x016c }
            r12.<init>(r10, r0)     // Catch:{ all -> 0x016c }
            okhttp3.z$a r0 = r11.mo76374a(r12)     // Catch:{ all -> 0x016c }
            goto L_0x0075
        L_0x0074:
            r0 = r3
        L_0x0075:
            if (r0 != 0) goto L_0x0082
            okhttp3.z$a r0 = new okhttp3.z$a     // Catch:{ all -> 0x016c }
            r0.<init>()     // Catch:{ all -> 0x016c }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x016c }
            okhttp3.z$a r0 = r0.mo76370L(r6, r10)     // Catch:{ all -> 0x016c }
        L_0x0082:
            boolean r6 = r9.allowAnyCertificate     // Catch:{ all -> 0x016c }
            if (r6 == 0) goto L_0x00ab
            java.lang.String r6 = "SSL"
            javax.net.ssl.SSLContext r6 = javax.net.ssl.SSLContext.getInstance(r6)     // Catch:{ all -> 0x016c }
            javax.net.ssl.TrustManager[] r7 = new javax.net.ssl.TrustManager[r8]     // Catch:{ all -> 0x016c }
            javax.net.ssl.X509TrustManager r10 = r9.TRUST_ALL_CERTS     // Catch:{ all -> 0x016c }
            r7[r5] = r10     // Catch:{ all -> 0x016c }
            java.security.SecureRandom r10 = new java.security.SecureRandom     // Catch:{ all -> 0x016c }
            r10.<init>()     // Catch:{ all -> 0x016c }
            r6.init(r3, r7, r10)     // Catch:{ all -> 0x016c }
            javax.net.ssl.SSLSocketFactory r6 = r6.getSocketFactory()     // Catch:{ all -> 0x016c }
            javax.net.ssl.X509TrustManager r7 = r9.TRUST_ALL_CERTS     // Catch:{ all -> 0x016c }
            r0.mo76372N(r6, r7)     // Catch:{ all -> 0x016c }
            com.arlosoft.macrodroid.action.OpenWebPageAction$b r6 = new com.arlosoft.macrodroid.action.OpenWebPageAction$b     // Catch:{ all -> 0x016c }
            r6.<init>()     // Catch:{ all -> 0x016c }
            r0.mo76369K(r6)     // Catch:{ all -> 0x016c }
        L_0x00ab:
            okhttp3.z r0 = r0.mo76376c()     // Catch:{ all -> 0x016c }
            okhttp3.b0$a r6 = new okhttp3.b0$a     // Catch:{ all -> 0x016c }
            r6.<init>()     // Catch:{ all -> 0x016c }
            okhttp3.b0$a r6 = r6.mo75935n(r14)     // Catch:{ all -> 0x016c }
            okhttp3.b0 r6 = r6.mo75923b()     // Catch:{ all -> 0x016c }
            okhttp3.e r0 = r0.mo76008a(r6)     // Catch:{ all -> 0x0164 }
            okhttp3.d0 r6 = r0.execute()     // Catch:{ all -> 0x0164 }
            int r0 = r6.mo75971g()     // Catch:{ all -> 0x0162 }
            r7 = 200(0xc8, float:2.8E-43)
            java.lang.String r10 = "HTTP GET response code: "
            if (r0 < r7) goto L_0x00f5
            int r0 = r6.mo75971g()     // Catch:{ all -> 0x0162 }
            r7 = 299(0x12b, float:4.19E-43)
            if (r0 > r7) goto L_0x00f5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r0.<init>()     // Catch:{ all -> 0x0162 }
            r0.append(r10)     // Catch:{ all -> 0x0162 }
            int r7 = r6.mo75971g()     // Catch:{ all -> 0x0162 }
            r0.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0162 }
            java.lang.Long r7 = r13.mo27840Y0()     // Catch:{ all -> 0x0162 }
            long r10 = r7.longValue()     // Catch:{ all -> 0x0162 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18874m(r0, r10)     // Catch:{ all -> 0x0162 }
            goto L_0x0114
        L_0x00f5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0162 }
            r0.<init>()     // Catch:{ all -> 0x0162 }
            r0.append(r10)     // Catch:{ all -> 0x0162 }
            int r7 = r6.mo75971g()     // Catch:{ all -> 0x0162 }
            r0.append(r7)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0162 }
            java.lang.Long r7 = r13.mo27840Y0()     // Catch:{ all -> 0x0162 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0162 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r0, r7)     // Catch:{ all -> 0x0162 }
            r8 = 0
        L_0x0114:
            if (r2 == 0) goto L_0x012c
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r13.mo27861q(r15)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x012c
            com.arlosoft.macrodroid.variables.VariableValue$StringValue r7 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue     // Catch:{ all -> 0x0162 }
            okhttp3.e0 r10 = r6.mo75966b()     // Catch:{ all -> 0x0162 }
            java.lang.String r10 = r10.string()     // Catch:{ all -> 0x0162 }
            r7.<init>(r10, r3)     // Catch:{ all -> 0x0162 }
            r13.mo27832M2(r0, r7)     // Catch:{ all -> 0x0162 }
        L_0x012c:
            if (r4 == 0) goto L_0x013c
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r13.mo27861q(r4)     // Catch:{ all -> 0x0162 }
            if (r0 == 0) goto L_0x013c
            com.arlosoft.macrodroid.variables.VariableValue$BooleanValue r7 = new com.arlosoft.macrodroid.variables.VariableValue$BooleanValue     // Catch:{ all -> 0x0162 }
            r7.<init>(r8, r3)     // Catch:{ all -> 0x0162 }
            r13.mo27832M2(r0, r7)     // Catch:{ all -> 0x0162 }
        L_0x013c:
            r6.close()     // Catch:{ all -> 0x016c }
            android.os.PowerManager$WakeLock r0 = r9.wakelock
            r0.release()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.arlosoft.macrodroid.action.tb r10 = new com.arlosoft.macrodroid.action.tb
            r1 = r10
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x01da
        L_0x0162:
            r0 = move-exception
            goto L_0x0166
        L_0x0164:
            r0 = move-exception
            r6 = r3
        L_0x0166:
            if (r6 == 0) goto L_0x016b
            r6.close()     // Catch:{ all -> 0x016c }
        L_0x016b:
            throw r0     // Catch:{ all -> 0x016c }
        L_0x016c:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01de }
            r6.<init>()     // Catch:{ all -> 0x01de }
            java.lang.String r7 = "HTTP Get failed: "
            r6.append(r7)     // Catch:{ all -> 0x01de }
            r6.append(r14)     // Catch:{ all -> 0x01de }
            java.lang.String r1 = " Reason:"
            r6.append(r1)     // Catch:{ all -> 0x01de }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x01de }
            r6.append(r1)     // Catch:{ all -> 0x01de }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x01de }
            java.lang.Long r6 = r13.mo27840Y0()     // Catch:{ all -> 0x01de }
            long r6 = r6.longValue()     // Catch:{ all -> 0x01de }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r1, r6)     // Catch:{ all -> 0x01de }
            if (r2 == 0) goto L_0x01a9
            com.arlosoft.macrodroid.common.MacroDroidVariable r1 = r13.mo27861q(r15)     // Catch:{ all -> 0x01de }
            if (r1 == 0) goto L_0x01a9
            com.arlosoft.macrodroid.variables.VariableValue$StringValue r2 = new com.arlosoft.macrodroid.variables.VariableValue$StringValue     // Catch:{ all -> 0x01de }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01de }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x01de }
            r13.mo27832M2(r1, r2)     // Catch:{ all -> 0x01de }
        L_0x01a9:
            if (r4 == 0) goto L_0x01b9
            com.arlosoft.macrodroid.common.MacroDroidVariable r0 = r13.mo27861q(r4)     // Catch:{ all -> 0x01de }
            if (r0 == 0) goto L_0x01b9
            com.arlosoft.macrodroid.variables.VariableValue$BooleanValue r1 = new com.arlosoft.macrodroid.variables.VariableValue$BooleanValue     // Catch:{ all -> 0x01de }
            r1.<init>(r5, r3)     // Catch:{ all -> 0x01de }
            r13.mo27832M2(r0, r1)     // Catch:{ all -> 0x01de }
        L_0x01b9:
            android.os.PowerManager$WakeLock r0 = r9.wakelock
            r0.release()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.arlosoft.macrodroid.action.tb r10 = new com.arlosoft.macrodroid.action.tb
            r1 = r10
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x01da:
            r0.post(r10)
            return
        L_0x01de:
            r0 = move-exception
            android.os.PowerManager$WakeLock r1 = r9.wakelock
            r1.release()
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r10.<init>(r1)
            com.arlosoft.macrodroid.action.tb r11 = new com.arlosoft.macrodroid.action.tb
            r1 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.post(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.OpenWebPageAction.m11692F3(java.lang.String, java.lang.String, boolean, int, com.arlosoft.macrodroid.triggers.TriggerContextInfo, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo):void");
    }

    /* renamed from: G3 */
    private void m11693G3(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        mo27827K0().startActivity(intent);
    }

    /* renamed from: u3 */
    private void m11705u3(String str, TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        if (this.wakelock == null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:OpenWebPageAction");
            this.wakelock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.wakelock.acquire(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        MacroDroidVariable macroDroidVariable = this.m_variableToSaveResponse;
        new Thread(new C2971cc(this, str, macroDroidVariable != null ? macroDroidVariable.getName() : null, z2, i, triggerContextInfo, z, stack, resumeMacroInfo)).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public /* synthetic */ void m11706v3(Activity activity, C4023j0.C4028e eVar, View view) {
        C4023j0.m15698D(activity, eVar, mo27837X0(), C17542R$style.Theme_App_Dialog_Action_SmallText, mo24686E1());
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public /* synthetic */ void m11707w3(Activity activity, Spinner spinner, View view) {
        C6440u1.m24747d(activity, spinner, this, mo24688L0(), 0, (C6440u1.C6442b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m11708x3(Activity activity, Spinner spinner, View view) {
        C6440u1.m24747d(activity, spinner, this, mo24688L0(), 2, (C6440u1.C6442b) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static /* synthetic */ void m11709y3(Spinner spinner, CheckBox checkBox, Activity activity, CompoundButton compoundButton, boolean z) {
        if (spinner.getCount() > 1 || !spinner.getItemAtPosition(0).equals(SelectableItem.m15535j1(C17541R$string.trigger_variable_no_variables))) {
            spinner.setEnabled(z);
            return;
        }
        checkBox.setChecked(false);
        C15626c.makeText(activity.getApplicationContext(), C17541R$string.trigger_variable_no_variables, 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static /* synthetic */ void m11710z3(Spinner spinner, CheckBox checkBox, Activity activity, CompoundButton compoundButton, boolean z) {
        if (spinner.getCount() > 1 || !spinner.getItemAtPosition(0).equals(SelectableItem.m15535j1(C17541R$string.trigger_variable_no_variables))) {
            spinner.setEnabled(z);
            return;
        }
        checkBox.setChecked(false);
        C15626c.makeText(activity.getApplicationContext(), C17541R$string.trigger_variable_no_variables, 0).show();
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_urlToOpen};
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        if (!this.m_httpGet) {
            return SelectableItem.m15535j1(C17541R$string.action_open_web_page);
        }
        return SelectableItem.m15535j1(C17541R$string.action_open_web_page_http_get);
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 1) {
            this.m_urlToOpen = strArr[0];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_urlToOpen;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7789l2.m32523u();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24421h(com.arlosoft.macrodroid.triggers.TriggerContextInfo r20, int r21, boolean r22, java.util.Stack<java.lang.Integer> r23, com.arlosoft.macrodroid.data.ResumeMacroInfo r24, boolean r25) {
        /*
            r19 = this;
            r9 = r19
            java.lang.String r0 = r9.m_urlToOpen     // Catch:{ Exception -> 0x007b }
            r10 = r20
            java.lang.String r0 = r9.mo24690R2(r0, r10)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r1 = "://"
            boolean r1 = r0.contains(r1)     // Catch:{ Exception -> 0x0079 }
            if (r1 != 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0079 }
            r1.<init>()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "http://"
            r1.append(r2)     // Catch:{ Exception -> 0x0079 }
            r1.append(r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0079 }
        L_0x0023:
            boolean r1 = r9.m_disableUrlEncode     // Catch:{ Exception -> 0x0079 }
            if (r1 == 0) goto L_0x0028
            goto L_0x0057
        L_0x0028:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0079 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0079 }
            java.net.URI r0 = new java.net.URI     // Catch:{ Exception -> 0x0079 }
            java.lang.String r12 = r1.getProtocol()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r13 = r1.getUserInfo()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r14 = r1.getHost()     // Catch:{ Exception -> 0x0079 }
            int r15 = r1.getPort()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r16 = r1.getPath()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r17 = r1.getQuery()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r18 = r1.getRef()     // Catch:{ Exception -> 0x0079 }
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0079 }
            java.net.URL r0 = r0.toURL()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0079 }
        L_0x0057:
            java.lang.String r1 = "%20&%20"
            java.lang.String r2 = "%20%26%20"
            java.lang.String r2 = r0.replace(r1, r2)     // Catch:{ Exception -> 0x0079 }
            boolean r0 = r9.m_httpGet     // Catch:{ Exception -> 0x0079 }
            if (r0 == 0) goto L_0x0075
            r1 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r1.m11705u3(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0079 }
            goto L_0x00a0
        L_0x0075:
            r9.m11693G3(r2)     // Catch:{ Exception -> 0x0079 }
            goto L_0x00a0
        L_0x0079:
            r0 = move-exception
            goto L_0x007e
        L_0x007b:
            r0 = move-exception
            r10 = r20
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not launch website: "
            r1.append(r2)
            java.lang.String r2 = r9.m_urlToOpen
            r1.append(r2)
            java.lang.String r2 = ", Error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x00a0:
            if (r25 != 0) goto L_0x00c3
            boolean r0 = r9.m_httpGet
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r9.blockNextAction
            if (r0 != 0) goto L_0x00c3
        L_0x00aa:
            com.arlosoft.macrodroid.macro.Macro r1 = r19.mo27837X0()
            com.arlosoft.macrodroid.macro.Macro r0 = r19.mo27837X0()
            java.util.ArrayList r2 = r0.getActions()
            r3 = r21
            r4 = r20
            r5 = r22
            r6 = r23
            r7 = r24
            r1.invokeActions(r2, r3, r4, r5, r6, r7)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.OpenWebPageAction.mo24421h(com.arlosoft.macrodroid.triggers.TriggerContextInfo, int, boolean, java.util.Stack, com.arlosoft.macrodroid.data.ResumeMacroInfo, boolean):void");
    }

    /* renamed from: j */
    public List<MacroDroidVariable> mo24437j() {
        ArrayList arrayList = new ArrayList();
        MacroDroidVariable macroDroidVariable = this.m_variableSuccessResponse;
        if (macroDroidVariable != null) {
            arrayList.add(macroDroidVariable);
        }
        MacroDroidVariable macroDroidVariable2 = this.m_variableToSaveResponse;
        if (macroDroidVariable2 != null) {
            arrayList.add(macroDroidVariable2);
        }
        return arrayList;
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " '" + mo24690R2(this.m_urlToOpen, triggerContextInfo) + "'";
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        boolean z;
        Iterator<MacroDroidVariable> it;
        Activity j0 = mo27850j0();
        AppCompatDialog appCompatDialog = new AppCompatDialog(j0, mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.enter_url_dialog);
        appCompatDialog.setTitle((int) C17541R$string.action_open_web_page);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        Button button = (Button) appCompatDialog.findViewById(C17532R$id.okButton);
        Button button2 = (Button) appCompatDialog.findViewById(C17532R$id.cancelButton);
        EditText editText = (EditText) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_url);
        CheckBox checkBox = (CheckBox) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_url_encode_checkbox);
        CheckBox checkBox2 = (CheckBox) appCompatDialog.findViewById(C17532R$id.block_next_action_checkbox);
        CheckBox checkBox3 = (CheckBox) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_save_success_state);
        Spinner spinner = (Spinner) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_boolean_spinner);
        CheckBox checkBox4 = (CheckBox) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_save_http_response);
        CheckBox checkBox5 = (CheckBox) appCompatDialog.findViewById(C17532R$id.allow_any_certificate);
        Spinner spinner2 = (Spinner) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_variable_spinner);
        CheckBox checkBox6 = (CheckBox) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_http_get_checkbox);
        ArrayList<MacroDroidVariable> v0 = mo27870v0();
        ArrayList<MacroDroidVariable> u0 = mo27869u0();
        Button button3 = (Button) appCompatDialog.findViewById(C17532R$id.enter_url_dialog_magic_text_button);
        ((Button) appCompatDialog.findViewById(C17532R$id.addBooleanVariableButton)).setOnClickListener(new C3540vb(this, j0, spinner));
        ((Button) appCompatDialog.findViewById(C17532R$id.addStringVariableButton)).setOnClickListener(new C3513ub(this, j0, spinner2));
        ArrayList arrayList = new ArrayList();
        if (v0.size() == 0) {
            arrayList.add(SelectableItem.m15535j1(C17541R$string.trigger_variable_no_variables));
        }
        Iterator<MacroDroidVariable> it2 = v0.iterator();
        Button button4 = button2;
        int i = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            MacroDroidVariable next = it2.next();
            MacroDroidVariable macroDroidVariable = this.m_variableToSaveResponse;
            if (macroDroidVariable != null) {
                it = it2;
                if (macroDroidVariable.getName().equals(next.getName())) {
                    i = i2;
                }
            } else {
                it = it2;
            }
            arrayList.add(next.getName());
            i2++;
            it2 = it;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(j0, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);
        spinner2.setSelection(i, false);
        ArrayList arrayList2 = new ArrayList();
        if (u0.size() == 0) {
            arrayList2.add(SelectableItem.m15535j1(C17541R$string.trigger_variable_no_variables));
        }
        int i3 = 0;
        int i4 = 0;
        for (MacroDroidVariable next2 : u0) {
            MacroDroidVariable macroDroidVariable2 = this.m_variableSuccessResponse;
            if (macroDroidVariable2 != null && macroDroidVariable2.getName().equals(next2.getName())) {
                i4 = i3;
            }
            arrayList2.add(next2.getName());
            i3++;
        }
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(j0, 17367048, arrayList2);
        arrayAdapter2.setDropDownViewResource(C17535R$layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter2);
        spinner.setSelection(i4, false);
        if (this.m_variableToSaveResponse != null) {
            checkBox4.setChecked(true);
            spinner2.setEnabled(this.m_httpGet);
        } else {
            checkBox4.setChecked(false);
            spinner2.setEnabled(false);
        }
        checkBox5.setChecked(this.allowAnyCertificate);
        if (this.m_variableSuccessResponse != null) {
            checkBox3.setChecked(true);
            spinner.setEnabled(this.m_httpGet);
        } else {
            checkBox3.setChecked(false);
            spinner.setEnabled(false);
        }
        checkBox4.setOnCheckedChangeListener(new C3649zb(spinner2, checkBox4, j0));
        checkBox3.setOnCheckedChangeListener(new C3622yb(spinner, checkBox3, j0));
        checkBox4.setEnabled(this.m_httpGet);
        checkBox3.setEnabled(this.m_httpGet);
        spinner.setEnabled(this.m_httpGet);
        checkBox2.setEnabled(this.m_httpGet);
        checkBox5.setEnabled(this.m_httpGet);
        Spinner spinner3 = spinner2;
        CheckBox checkBox7 = checkBox5;
        CheckBox checkBox8 = checkBox4;
        Spinner spinner4 = spinner;
        CheckBox checkBox9 = checkBox3;
        CheckBox checkBox10 = checkBox2;
        Spinner spinner5 = spinner3;
        Activity activity = j0;
        CheckBox checkBox11 = checkBox6;
        Spinner spinner6 = spinner3;
        CheckBox checkBox12 = checkBox10;
        checkBox11.setOnCheckedChangeListener(new C2815ac(this, checkBox4, checkBox2, checkBox3, checkBox7, spinner5, spinner4));
        checkBox12.setChecked(this.blockNextAction);
        String str = this.m_urlToOpen;
        if (str != null) {
            editText.setText(str);
            z = true;
            button.setEnabled(true);
        } else {
            z = true;
            button.setEnabled(false);
        }
        editText.setSelection(editText.length());
        checkBox.setChecked(z ^ this.m_disableUrlEncode);
        checkBox11.setChecked(this.m_httpGet);
        editText.addTextChangedListener(new C2562c(button, editText));
        C3595xb xbVar = r0;
        C3595xb xbVar2 = new C3595xb(this, checkBox11, editText, checkBox12, checkBox7, appCompatDialog, checkBox8, spinner6, checkBox9, spinner4, checkBox);
        button.setOnClickListener(xbVar);
        button4.setOnClickListener(new C3423sb(appCompatDialog));
        Activity activity2 = activity;
        button3.setOnClickListener(new C3568wb(this, activity2, new C2943bc(editText)));
        appCompatDialog.show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_urlToOpen);
        parcel.writeInt(this.m_httpGet ? 1 : 0);
        parcel.writeParcelable(this.m_variableToSaveResponse, i);
        parcel.writeParcelable(this.m_variableSuccessResponse, i);
        parcel.writeInt(this.m_disableUrlEncode ? 1 : 0);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeInt(this.allowAnyCertificate ? 1 : 0);
    }

    public OpenWebPageAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private OpenWebPageAction() {
        this.TRUST_ALL_CERTS = new C2560a();
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo27827K0().getSystemService("power")).newWakeLock(1, "macrodroid:OpenWebPageAction");
        this.wakelock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    private OpenWebPageAction(Parcel parcel) {
        super(parcel);
        this.TRUST_ALL_CERTS = new C2560a();
        this.m_urlToOpen = parcel.readString();
        boolean z = true;
        this.m_httpGet = parcel.readInt() != 0;
        this.m_variableToSaveResponse = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_variableSuccessResponse = (MacroDroidVariable) parcel.readParcelable(MacroDroidVariable.class.getClassLoader());
        this.m_disableUrlEncode = parcel.readInt() != 0;
        this.blockNextAction = parcel.readInt() != 0;
        this.allowAnyCertificate = parcel.readInt() == 0 ? false : z;
    }
}
