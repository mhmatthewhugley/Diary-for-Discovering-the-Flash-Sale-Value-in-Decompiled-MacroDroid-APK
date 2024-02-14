package com.arlosoft.macrodroid.confirmation.validation;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.extensions.C4660g;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.upgrade.C6336g;
import com.arlosoft.macrodroid.upgrade.model.UpgradeResponse;
import com.arlosoft.macrodroid.utils.C6388h1;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13654b;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15414h;
import kotlinx.coroutines.C15423h2;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p104i0.C7393b;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.confirmation.validation.e */
/* compiled from: ValidatePurchaseViewModel.kt */
public final class C4101e extends ViewModel {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7393b f10685a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6336g f10686b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f10687c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MutableLiveData<Boolean> f10688d;

    /* renamed from: e */
    private final LiveData<Boolean> f10689e;

    /* renamed from: f */
    private final C6388h1<Void> f10690f = new C6388h1<>();

    /* renamed from: com.arlosoft.macrodroid.confirmation.validation.e$a */
    /* compiled from: ValidatePurchaseViewModel.kt */
    static final class C4102a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ String $auth;
        final /* synthetic */ String $email;
        final /* synthetic */ String $serial;
        int label;
        final /* synthetic */ C4101e this$0;

        /* renamed from: com.arlosoft.macrodroid.confirmation.validation.e$a$a */
        /* compiled from: ValidatePurchaseViewModel.kt */
        static final class C4103a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ String $email;
            int label;
            final /* synthetic */ C4101e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4103a(C4101e eVar, Activity activity, String str, C13635d<? super C4103a> dVar) {
                super(2, dVar);
                this.this$0 = eVar;
                this.$activity = activity;
                this.$email = str;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4103a(this.this$0, this.$activity, this.$email, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4103a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f10686b.mo32382k(this.$activity, this.$email, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.confirmation.validation.e$a$b */
        /* compiled from: ValidatePurchaseViewModel.kt */
        static final class C4104b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ String $email;
            int label;
            final /* synthetic */ C4101e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4104b(C4101e eVar, Activity activity, String str, C13635d<? super C4104b> dVar) {
                super(2, dVar);
                this.this$0 = eVar;
                this.$activity = activity;
                this.$email = str;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4104b(this.this$0, this.$activity, this.$email, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4104b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.f10686b.mo32382k(this.$activity, this.$email, C17542R$style.Theme_App_Dialog_Invert_Upgrade);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4102a(C4101e eVar, String str, String str2, String str3, Activity activity, C13635d<? super C4102a> dVar) {
            super(2, dVar);
            this.this$0 = eVar;
            this.$auth = str;
            this.$email = str2;
            this.$serial = str3;
            this.$activity = activity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C4102a(this.this$0, this.$auth, this.$email, this.$serial, this.$activity, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4102a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.this$0.f10688d.postValue(C13654b.m87833a(true));
                C7393b g = this.this$0.f10685a;
                String str = this.$auth;
                String str2 = this.$email;
                String str3 = this.$serial;
                this.label = 1;
                obj = g.mo37425c(str, str2, str3, this);
                if (obj == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else if (i == 2) {
                try {
                    C13332o.m85685b(obj);
                    this.this$0.f10688d.postValue(C13654b.m87833a(false));
                } catch (Exception unused) {
                    C4878b.m18868g("Failed to validate serial: " + this.$serial);
                    C15423h2 c2 = C15186a1.m93731c();
                    C4104b bVar = new C4104b(this.this$0, this.$activity, this.$email, (C13635d<? super C4104b>) null);
                    this.label = 3;
                    if (C15414h.m94298g(c2, bVar, this) == c) {
                        return c;
                    }
                }
                return C13339u.f61331a;
            } else if (i == 3) {
                C13332o.m85685b(obj);
                this.this$0.f10688d.postValue(C13654b.m87833a(false));
                return C13339u.f61331a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UpgradeResponse upgradeResponse = (UpgradeResponse) obj;
            if (C13706o.m87924a(upgradeResponse.getUpgradeAuth(), C4660g.m18130h(this.$email + this.$serial + "adb97ac6-f780-4a41-8475-ce661b574999" + this.$serial))) {
                C5163j2.m20157f6(this.$activity, this.$serial);
                C5163j2.m20132c5(this.$activity, false);
                C5163j2.m19968F5(this.this$0.f10687c, false);
                this.this$0.mo28027k().postValue(null);
            } else {
                C4878b.m18868g("Invalid auth code from server when attempting to upgrade: " + upgradeResponse.getUpgradeAuth());
                C15423h2 c3 = C15186a1.m93731c();
                C4103a aVar = new C4103a(this.this$0, this.$activity, this.$email, (C13635d<? super C4103a>) null);
                this.label = 2;
                if (C15414h.m94298g(c3, aVar, this) == c) {
                    return c;
                }
            }
            this.this$0.f10688d.postValue(C13654b.m87833a(false));
            return C13339u.f61331a;
        }
    }

    public C4101e(C7393b bVar, C6336g gVar, Context context) {
        C13706o.m87929f(bVar, "upgradeApi");
        C13706o.m87929f(gVar, "upgradeHelper");
        C13706o.m87929f(context, "context");
        this.f10685a = bVar;
        this.f10686b = gVar;
        this.f10687c = context;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.f10688d = mutableLiveData;
        this.f10689e = mutableLiveData;
    }

    /* renamed from: j */
    public final LiveData<Boolean> mo28026j() {
        return this.f10689e;
    }

    /* renamed from: k */
    public final C6388h1<Void> mo28027k() {
        return this.f10690f;
    }

    /* renamed from: l */
    public final void mo28028l() {
        C5163j2.m19968F5(this.f10687c, false);
        C5163j2.m20157f6(this.f10687c, (String) null);
        C5163j2.m20108Z4(this.f10687c, false);
    }

    /* renamed from: m */
    public final void mo28029m(Activity activity, String str, String str2) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(str, NotificationCompat.CATEGORY_EMAIL);
        C13706o.m87929f(str2, "serial");
        String h = C4660g.m18130h("adb97ac6-f780-4a41-8475-ce661b574999" + str2 + str);
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C4102a(this, h, str, str2, activity, (C13635d<? super C4102a>) null), 2, (Object) null);
    }
}
