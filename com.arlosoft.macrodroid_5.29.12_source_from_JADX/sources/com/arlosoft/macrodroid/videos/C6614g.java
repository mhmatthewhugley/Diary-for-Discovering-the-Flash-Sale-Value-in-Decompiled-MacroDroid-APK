package com.arlosoft.macrodroid.videos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.arlosoft.macrodroid.videos.data.VideoInfo;
import com.arlosoft.macrodroid.videos.data.VideosData;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p062b4.C2247a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.videos.g */
/* compiled from: VideosViewModel.kt */
public final class C6614g extends ViewModel implements C6605a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6606b f15352a;

    /* renamed from: c */
    private final C2247a f15353c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MutableLiveData<VideosData> f15354d;

    /* renamed from: f */
    private final LiveData<VideosData> f15355f;

    /* renamed from: com.arlosoft.macrodroid.videos.g$a */
    /* compiled from: VideosViewModel.kt */
    static final class C6615a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ C6614g this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6615a(C6614g gVar, C13635d<? super C6615a> dVar) {
            super(2, dVar);
            this.this$0 = gVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C6615a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C6615a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                MutableLiveData g = this.this$0.f15354d;
                C6606b f = this.this$0.f15352a;
                this.L$0 = g;
                this.label = 1;
                Object a = f.mo32827a(this);
                if (a == c) {
                    return c;
                }
                mutableLiveData = g;
                obj = a;
            } else if (i == 1) {
                mutableLiveData = (MutableLiveData) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData.postValue(obj);
            return C13339u.f61331a;
        }
    }

    public C6614g(C6606b bVar, C2247a aVar) {
        C13706o.m87929f(bVar, "repository");
        C13706o.m87929f(aVar, "videoHelper");
        this.f15352a = bVar;
        this.f15353c = aVar;
        MutableLiveData<VideosData> mutableLiveData = new MutableLiveData<>();
        this.f15354d = mutableLiveData;
        this.f15355f = mutableLiveData;
        mo32855i();
    }

    /* renamed from: d */
    public void mo32826d(VideoInfo videoInfo) {
        C13706o.m87929f(videoInfo, "videoInfo");
        this.f15353c.mo24471a(videoInfo);
    }

    /* renamed from: h */
    public final LiveData<VideosData> mo32854h() {
        return this.f15355f;
    }

    /* renamed from: i */
    public final void mo32855i() {
        C15561w1 unused = C15473j.m94492d(ViewModelKt.getViewModelScope(this), C15186a1.m93730b(), (C15486m0) null, new C6615a(this, (C13635d<? super C6615a>) null), 2, (Object) null);
    }
}
