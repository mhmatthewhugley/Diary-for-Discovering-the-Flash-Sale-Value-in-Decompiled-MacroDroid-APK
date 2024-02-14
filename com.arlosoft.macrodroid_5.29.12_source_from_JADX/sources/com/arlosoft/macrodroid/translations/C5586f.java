package com.arlosoft.macrodroid.translations;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.translations.data.C5579a;
import com.arlosoft.macrodroid.translations.data.C5580b;
import com.arlosoft.macrodroid.translations.data.Translation;
import com.arlosoft.macrodroid.translations.data.TranslationData;
import com.arlosoft.macrodroid.utils.C6388h1;
import java.util.List;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.translations.f */
/* compiled from: TranslationsViewModel.kt */
public final class C5586f extends ViewModel implements C5573a {

    /* renamed from: g */
    public static final C5587a f13561g = new C5587a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5580b f13562a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MutableLiveData<List<Translation>> f13563c;

    /* renamed from: d */
    private final LiveData<List<Translation>> f13564d;

    /* renamed from: f */
    private final C6388h1<String> f13565f = new C6388h1<>();

    /* renamed from: com.arlosoft.macrodroid.translations.f$a */
    /* compiled from: TranslationsViewModel.kt */
    public static final class C5587a {
        private C5587a() {
        }

        public /* synthetic */ C5587a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.translations.f$b */
    /* compiled from: TranslationsViewModel.kt */
    static final class C5588b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C5586f this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5588b(C5586f fVar, C13635d<? super C5588b> dVar) {
            super(2, dVar);
            this.this$0 = fVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C5588b(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C5588b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                MutableLiveData g = this.this$0.f13563c;
                C5580b f = this.this$0.f13562a;
                this.L$0 = g;
                this.label = 1;
                Object b = f.mo30877b(this);
                if (b == c) {
                    return c;
                }
                mutableLiveData = g;
                obj = b;
            } else if (i == 1) {
                mutableLiveData = (MutableLiveData) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TranslationData translationData = (TranslationData) obj;
            mutableLiveData.postValue(translationData != null ? translationData.getSortedTranslations() : null);
            return C13339u.f61331a;
        }
    }

    public C5586f(C5580b bVar) {
        C13706o.m87929f(bVar, "repository");
        this.f13562a = bVar;
        MutableLiveData<List<Translation>> mutableLiveData = new MutableLiveData<>();
        this.f13563c = mutableLiveData;
        this.f13564d = mutableLiveData;
        m21400j();
    }

    /* renamed from: j */
    private final void m21400j() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C5588b(this, (C13635d<? super C5588b>) null), 2, (Object) null);
    }

    /* renamed from: c */
    public void mo30844c(String str) {
        C13706o.m87929f(str, "languageCode");
        C6388h1<String> h1Var = this.f13565f;
        h1Var.postValue("http://macrodroid.oneskyapp.com/collaboration/translate/project/project/28964/language/" + C5579a.f13548a.mo30876a().get(str));
    }

    /* renamed from: h */
    public final C6388h1<String> mo30882h() {
        return this.f13565f;
    }

    /* renamed from: i */
    public final LiveData<List<Translation>> mo30883i() {
        return this.f13564d;
    }
}
