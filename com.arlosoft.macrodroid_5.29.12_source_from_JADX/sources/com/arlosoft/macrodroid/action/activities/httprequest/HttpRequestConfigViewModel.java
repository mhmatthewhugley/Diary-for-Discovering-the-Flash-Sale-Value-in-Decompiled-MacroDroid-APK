package com.arlosoft.macrodroid.action.activities.httprequest;

import android.content.res.Resources;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.arlosoft.macrodroid.action.C2966c7;
import com.arlosoft.macrodroid.action.HttpParam;
import com.arlosoft.macrodroid.action.HttpRequestAction;
import com.arlosoft.macrodroid.action.HttpRequestConfig;
import com.arlosoft.macrodroid.action.activities.httprequest.C2868q;
import com.arlosoft.macrodroid.utils.C6388h1;
import com.arlosoft.macrodroid.variables.DictionaryKeys;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

/* compiled from: HttpRequestConfigViewModel.kt */
public final class HttpRequestConfigViewModel extends ViewModel implements LifecycleObserver {

    /* renamed from: a */
    private final Resources f7907a;

    /* renamed from: c */
    private boolean f7908c;

    /* renamed from: d */
    private HttpRequestConfig f7909d;

    /* renamed from: f */
    private final MutableLiveData<C2851g> f7910f;

    /* renamed from: g */
    private final LiveData<C2851g> f7911g;

    /* renamed from: o */
    private final C6388h1<String> f7912o = new C6388h1<>();

    /* renamed from: p */
    private final C6388h1<C13339u> f7913p = new C6388h1<>();

    /* renamed from: s */
    private final C6388h1<C13339u> f7914s = new C6388h1<>();

    /* renamed from: z */
    private final C6388h1<C13339u> f7915z = new C6388h1<>();

    public HttpRequestConfigViewModel(Resources resources) {
        C13706o.m87929f(resources, "resources");
        this.f7907a = resources;
        HttpRequestConfig b = C2966c7.f8098a.mo26351b();
        C13706o.m87926c(b);
        this.f7909d = b;
        MutableLiveData<C2851g> mutableLiveData = new MutableLiveData<>();
        this.f7910f = mutableLiveData;
        this.f7911g = mutableLiveData;
    }

    /* renamed from: A */
    public final void mo26201A(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C13706o.m87929f(str3, "folderUri");
        C13706o.m87929f(str4, "displayName");
        if (!C13706o.m87924a(str3, this.f7909d.getSaveResponseFolderPathUri()) || !C13706o.m87924a(str4, this.f7909d.getSaveResponseFolderPathDisplayName())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, str, str2, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33505279, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: B */
    public final void mo26202B(int i) {
        if (i != this.f7909d.getSaveResponseType()) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, i, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33552383, (Object) null);
        }
    }

    /* renamed from: C */
    public final void mo26203C(boolean z) {
        if (z != this.f7909d.getSaveReturnCodeToVariable()) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, z, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554175, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: D */
    public final void mo26204D(int i) {
        if (i != this.f7909d.getRequestTimeOutSeconds()) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, i, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554427, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: E */
    public final void mo26205E(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "urlText");
        if (!C13706o.m87924a(str2, this.f7909d.getUrlToOpen())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, str, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554429, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: F */
    public final void mo26206F(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C13706o.m87929f(str3, "fileUri");
        C13706o.m87929f(str4, "displayName");
        if (!C13706o.m87924a(str3, this.f7909d.getContentBodyFileUri()) || !C13706o.m87924a(str4, this.f7909d.getContentBodyFileDisplayName())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, str, str2, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554239, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: G */
    public final void mo26207G(C2868q.C2873c cVar, HttpParam httpParam, HttpParam httpParam2) {
        C13706o.m87929f(cVar, "paramType");
        C13706o.m87929f(httpParam, "paramOld");
        C13706o.m87929f(httpParam2, "paramNew");
        this.f7908c = true;
        if (cVar == C2868q.C2873c.HEADER_PARAMS) {
            this.f7909d.getHeaderParams().set(this.f7909d.getHeaderParams().indexOf(httpParam), httpParam2);
        } else if (cVar == C2868q.C2873c.QUERY_PARAMS) {
            this.f7909d.getQueryParams().set(this.f7909d.getQueryParams().indexOf(httpParam), httpParam2);
        }
        MutableLiveData<C2851g> mutableLiveData = this.f7910f;
        HttpRequestConfig httpRequestConfig = this.f7909d;
        HttpRequestAction a = C2966c7.f8098a.mo26350a();
        C13706o.m87926c(a);
        mutableLiveData.postValue(new C2851g(httpRequestConfig, a));
    }

    /* renamed from: f */
    public final void mo26208f(C2868q.C2873c cVar, HttpParam httpParam) {
        C13706o.m87929f(cVar, "paramType");
        C13706o.m87929f(httpParam, "param");
        this.f7908c = true;
        if (cVar == C2868q.C2873c.HEADER_PARAMS) {
            this.f7909d.getHeaderParams().add(httpParam);
        } else if (cVar == C2868q.C2873c.QUERY_PARAMS) {
            this.f7909d.getQueryParams().add(httpParam);
        }
        MutableLiveData<C2851g> mutableLiveData = this.f7910f;
        HttpRequestConfig httpRequestConfig = this.f7909d;
        HttpRequestAction a = C2966c7.f8098a.mo26350a();
        C13706o.m87926c(a);
        mutableLiveData.postValue(new C2851g(httpRequestConfig, a));
    }

    /* renamed from: g */
    public final void mo26209g(C2868q.C2873c cVar, HttpParam httpParam) {
        C13706o.m87929f(cVar, "paramType");
        C13706o.m87929f(httpParam, "param");
        this.f7908c = true;
        if (cVar == C2868q.C2873c.HEADER_PARAMS) {
            this.f7909d.getHeaderParams().remove(httpParam);
        } else if (cVar == C2868q.C2873c.QUERY_PARAMS) {
            this.f7909d.getQueryParams().remove(httpParam);
        }
        MutableLiveData<C2851g> mutableLiveData = this.f7910f;
        HttpRequestConfig httpRequestConfig = this.f7909d;
        HttpRequestAction a = C2966c7.f8098a.mo26350a();
        C13706o.m87926c(a);
        mutableLiveData.postValue(new C2851g(httpRequestConfig, a));
    }

    /* renamed from: h */
    public final C6388h1<C13339u> mo26210h() {
        return this.f7913p;
    }

    /* renamed from: i */
    public final C6388h1<String> mo26211i() {
        return this.f7912o;
    }

    /* renamed from: j */
    public final LiveData<C2851g> mo26212j() {
        return this.f7911g;
    }

    /* renamed from: k */
    public final C6388h1<C13339u> mo26213k() {
        return this.f7914s;
    }

    /* renamed from: l */
    public final void mo26214l() {
        if (this.f7908c) {
            this.f7914s.postValue(null);
        } else {
            this.f7913p.postValue(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if ((r0 == null || r0.length() == 0) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e0, code lost:
        if (r1 != false) goto L_0x00e2;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26215m() {
        /*
            r5 = this;
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            int r0 = r0.getSaveResponseType()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L_0x0042
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getSaveResponseFileName()
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            if (r0 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 != 0) goto L_0x0033
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getSaveResponseFolderPathUri()
            if (r0 == 0) goto L_0x0030
            int r0 = r0.length()
            if (r0 != 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x0042
        L_0x0033:
            com.arlosoft.macrodroid.utils.h1<java.lang.String> r0 = r5.f7912o
            android.content.res.Resources r1 = r5.f7907a
            r2 = 2131953863(0x7f1308c7, float:1.954421E38)
            java.lang.String r1 = r1.getString(r2)
            r0.postValue(r1)
            return
        L_0x0042:
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            int r0 = r0.getSaveResponseType()
            if (r0 != r2) goto L_0x0082
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getResponseVariableName()
            if (r0 == 0) goto L_0x005b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = 0
            goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            if (r0 != 0) goto L_0x0073
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getResponseVariableName()
            android.content.res.Resources r3 = r5.f7907a
            r4 = 2131955476(0x7f130f14, float:1.954748E38)
            java.lang.String r3 = r3.getString(r4)
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r0 == 0) goto L_0x0082
        L_0x0073:
            com.arlosoft.macrodroid.utils.h1<java.lang.String> r0 = r5.f7912o
            android.content.res.Resources r1 = r5.f7907a
            r2 = 2131953864(0x7f1308c8, float:1.9544211E38)
            java.lang.String r1 = r1.getString(r2)
            r0.postValue(r1)
            return
        L_0x0082:
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            boolean r0 = r0.hasBody()
            if (r0 == 0) goto L_0x00b5
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            int r0 = r0.getContentBodySource()
            if (r0 != r2) goto L_0x00b5
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getContentBodyFileUri()
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r0 = 0
            goto L_0x00a4
        L_0x00a3:
            r0 = 1
        L_0x00a4:
            if (r0 == 0) goto L_0x00b5
            com.arlosoft.macrodroid.utils.h1<java.lang.String> r0 = r5.f7912o
            android.content.res.Resources r1 = r5.f7907a
            r2 = 2131953862(0x7f1308c6, float:1.9544207E38)
            java.lang.String r1 = r1.getString(r2)
            r0.postValue(r1)
            return
        L_0x00b5:
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            boolean r0 = r0.getBasicAuthEnabled()
            if (r0 == 0) goto L_0x00f1
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getBasicAuthUsername()
            if (r0 == 0) goto L_0x00ce
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r0 = 0
            goto L_0x00cf
        L_0x00ce:
            r0 = 1
        L_0x00cf:
            if (r0 != 0) goto L_0x00e2
            com.arlosoft.macrodroid.action.HttpRequestConfig r0 = r5.f7909d
            java.lang.String r0 = r0.getBasicAuthPassword()
            if (r0 == 0) goto L_0x00df
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00e0
        L_0x00df:
            r1 = 1
        L_0x00e0:
            if (r1 == 0) goto L_0x00f1
        L_0x00e2:
            com.arlosoft.macrodroid.utils.h1<java.lang.String> r0 = r5.f7912o
            android.content.res.Resources r1 = r5.f7907a
            r2 = 2131953879(0x7f1308d7, float:1.9544241E38)
            java.lang.String r1 = r1.getString(r2)
            r0.postValue(r1)
            return
        L_0x00f1:
            com.arlosoft.macrodroid.action.c7 r0 = com.arlosoft.macrodroid.action.C2966c7.f8098a
            com.arlosoft.macrodroid.action.HttpRequestConfig r1 = r5.f7909d
            r0.mo26353d(r1)
            com.arlosoft.macrodroid.utils.h1<ja.u> r0 = r5.f7913p
            r1 = 0
            r0.postValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.activities.httprequest.HttpRequestConfigViewModel.mo26215m():void");
    }

    /* renamed from: n */
    public final void mo26216n(boolean z) {
        if (this.f7909d.getAllowAnyCertificate() != z) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, z, false, false, (String) null, (String) null, (List) null, (List) null, 33292287, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: o */
    public final void mo26217o(boolean z) {
        if (this.f7909d.getBasicAuthEnabled() != z) {
            HttpRequestConfig copy$default = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, z, (String) null, (String) null, (List) null, (List) null, 32505855, (Object) null);
            this.f7909d = copy$default;
            this.f7908c = true;
            MutableLiveData<C2851g> mutableLiveData = this.f7910f;
            HttpRequestAction a = C2966c7.f8098a.mo26350a();
            C13706o.m87926c(a);
            mutableLiveData.postValue(new C2851g(copy$default, a));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        MutableLiveData<C2851g> mutableLiveData = this.f7910f;
        HttpRequestConfig httpRequestConfig = this.f7909d;
        HttpRequestAction a = C2966c7.f8098a.mo26350a();
        C13706o.m87926c(a);
        mutableLiveData.postValue(new C2851g(httpRequestConfig, a));
    }

    /* renamed from: p */
    public final void mo26219p(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "password");
        if (!C13706o.m87924a(str2, this.f7909d.getBasicAuthPassword())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, str, (List) null, (List) null, 29360127, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: q */
    public final void mo26220q(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "userName");
        if (!C13706o.m87924a(str2, this.f7909d.getBasicAuthUsername())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, str, (String) null, (List) null, (List) null, 31457279, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: r */
    public final void mo26221r(boolean z) {
        if (this.f7909d.getBlockNextAction() != z) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, z, false, false, false, (String) null, (String) null, (List) null, (List) null, 33423359, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: s */
    public final void mo26222s(int i) {
        if (i != this.f7909d.getContentBodySource()) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, i, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554415, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: t */
    public final void mo26223t(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "contentBodyText");
        if (!C13706o.m87924a(str2, this.f7909d.getContentBodyText())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, str, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554399, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: u */
    public final void mo26224u(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "contentType");
        if (!C13706o.m87924a(str2, this.f7909d.getContentType())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, str, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554423, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: v */
    public final void mo26225v(boolean z) {
        if (this.f7909d.getFollowRedirects() != z) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, z, false, (String) null, (String) null, (List) null, (List) null, 33030143, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: w */
    public final void mo26226w(int i) {
        if (this.f7909d.getRequestType() != i) {
            HttpRequestConfig copy$default = HttpRequestConfig.copy$default(this.f7909d, i, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33554430, (Object) null);
            this.f7909d = copy$default;
            this.f7908c = true;
            MutableLiveData<C2851g> mutableLiveData = this.f7910f;
            HttpRequestAction a = C2966c7.f8098a.mo26350a();
            C13706o.m87926c(a);
            mutableLiveData.postValue(new C2851g(copy$default, a));
        }
    }

    /* renamed from: x */
    public final void mo26227x(String str, List<String> list) {
        String str2 = str;
        List<String> list2 = list;
        C13706o.m87929f(str2, "variableName");
        if (!C13706o.m87924a(str2, this.f7909d.getReturnCodeVariableName())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, str, list2 != null ? new DictionaryKeys(list2) : null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33552895, (Object) null);
            this.f7908c = true;
        }
    }

    /* renamed from: y */
    public final void mo26228y(String str, List<String> list) {
        String str2 = str;
        List<String> list2 = list;
        C13706o.m87929f(str2, "variableName");
        DictionaryKeys dictionaryKeys = null;
        if (C13706o.m87924a(str2, this.f7909d.getResponseVariableName())) {
            DictionaryKeys responseDictionaryKeys = this.f7909d.getResponseDictionaryKeys();
            if (C13706o.m87924a(list2, responseDictionaryKeys != null ? responseDictionaryKeys.getKeys() : null)) {
                return;
            }
        }
        HttpRequestConfig httpRequestConfig = this.f7909d;
        if (list2 != null) {
            dictionaryKeys = new DictionaryKeys(list2);
        }
        this.f7909d = HttpRequestConfig.copy$default(httpRequestConfig, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, str, dictionaryKeys, (String) null, (String) null, (String) null, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33542143, (Object) null);
        this.f7908c = true;
    }

    /* renamed from: z */
    public final void mo26229z(String str) {
        String str2 = str;
        C13706o.m87929f(str2, "saveResponseFileName");
        if (!C13706o.m87924a(str2, this.f7909d.getSaveResponseFileName())) {
            this.f7909d = HttpRequestConfig.copy$default(this.f7909d, 0, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, false, (String) null, (DictionaryKeys) null, 0, (String) null, (DictionaryKeys) null, (String) null, (String) null, str, false, false, false, false, (String) null, (String) null, (List) null, (List) null, 33488895, (Object) null);
            this.f7908c = true;
        }
    }
}
