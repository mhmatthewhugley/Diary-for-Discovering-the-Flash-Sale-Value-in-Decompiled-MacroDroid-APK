package com.arlosoft.macrodroid.remoteconfig;

import com.arlosoft.macrodroid.C17543R$xml;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.remoteconfig.a */
/* compiled from: RemoteConfig.kt */
public final class C5070a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FirebaseRemoteConfig f12698a;

    /* renamed from: com.arlosoft.macrodroid.remoteconfig.a$a */
    /* compiled from: RemoteConfig.kt */
    static final class C5071a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ C5070a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5071a(C5070a aVar, C13635d<? super C5071a> dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5071a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5071a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                FirebaseRemoteConfigSettings c = new FirebaseRemoteConfigSettings.Builder().mo63522d(86400).mo63521c();
                C13706o.m87928e(c, "Builder()\n              …                 .build()");
                this.this$0.f12698a.mo63516w(C17543R$xml.remote_config_defaults);
                this.this$0.f12698a.mo63515v(c);
                this.this$0.f12698a.mo63511i();
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C5070a() {
        FirebaseRemoteConfig k = FirebaseRemoteConfig.m77184k();
        C13706o.m87928e(k, "getInstance()");
        this.f12698a = k;
        try {
            C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, C15186a1.m93730b(), (C15486m0) null, new C5071a(this, (C13635d<? super C5071a>) null), 2, (Object) null);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public final long mo29975b() {
        return this.f12698a.mo63513m("adverts_blocked_show_own_ad_percent");
    }

    /* renamed from: c */
    public final long mo29976c() {
        return this.f12698a.mo63513m("encourageUpgradeMessageDaysToWait");
    }

    /* renamed from: d */
    public final long mo29977d() {
        return this.f12698a.mo63513m("encourageUpgradeMessageVariant");
    }

    /* renamed from: e */
    public final long mo29978e() {
        return this.f12698a.mo63513m("flashSaleDayWait");
    }

    /* renamed from: f */
    public final String mo29979f() {
        String n = this.f12698a.mo63514n("helpTranslateMessage");
        C13706o.m87928e(n, "firebaseRemoteConfig.get…Y_HELP_TRANSLATE_MESSAGE)");
        return n;
    }

    /* renamed from: g */
    public final String mo29980g() {
        String n = this.f12698a.mo63514n("privacyPolicyLink");
        C13706o.m87928e(n, "firebaseRemoteConfig.get…(KEY_PRIVACY_POLICY_LINK)");
        return n;
    }

    /* renamed from: h */
    public final long mo29981h() {
        return this.f12698a.mo63513m("proAdvertCountDownSeconds");
    }

    /* renamed from: i */
    public final String mo29982i() {
        String n = this.f12698a.mo63514n("proAdvertImageType");
        C13706o.m87928e(n, "firebaseRemoteConfig.get…EY_PRO_ADVERT_IMAGE_TYPE)");
        return n;
    }

    /* renamed from: j */
    public final boolean mo29983j() {
        return this.f12698a.mo63512j("proValveEnabled");
    }

    /* renamed from: k */
    public final long mo29984k() {
        return this.f12698a.mo63513m("show_pro_upgrade_advert_percent");
    }

    /* renamed from: l */
    public final long mo29985l() {
        return this.f12698a.mo63513m("validatePurchasesFrequencyDays");
    }

    /* renamed from: m */
    public final boolean mo29986m() {
        return true;
    }

    /* renamed from: n */
    public final boolean mo29987n() {
        return this.f12698a.mo63512j("upgradeButtonShimmer");
    }

    /* renamed from: o */
    public final String mo29988o() {
        String n = this.f12698a.mo63514n("iapIdFlashSale");
        C13706o.m87928e(n, "firebaseRemoteConfig.get…ng(KEY_IAP_FLASH_SALE_ID)");
        return n;
    }

    /* renamed from: p */
    public final String mo29989p() {
        String n = this.f12698a.mo63514n("iapId");
        C13706o.m87928e(n, "firebaseRemoteConfig.getString(KEY_IAP_ID)");
        return n;
    }
}
