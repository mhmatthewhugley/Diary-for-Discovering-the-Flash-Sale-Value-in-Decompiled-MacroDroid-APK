package com.arlosoft.macrodroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.arlosoft.macrodroid.common.NonAppActivity;
import com.arlosoft.macrodroid.drawer.DrawerOverlayHandleService;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.services.FloatingTextService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: DummyActivity.kt */
public final class DummyActivity extends NonAppActivity {

    /* renamed from: o */
    public Map<Integer, View> f7008o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.DummyActivity$a */
    /* compiled from: DummyActivity.kt */
    static final class C2289a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        int label;
        final /* synthetic */ DummyActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2289a(DummyActivity dummyActivity, C13635d<? super C2289a> dVar) {
            super(2, dVar);
            this.this$0 = dummyActivity;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2289a(this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2289a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                this.label = 1;
                if (C15552u0.m94699a(100, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (C5163j2.m20013M0(this.this$0)) {
                Macro.setMacroDroidEnabledState(false);
                C4934n.m18998M().mo29694n0();
                MacroDroidService.f7040a.mo24641f(this.this$0);
                Macro.setMacroDroidEnabledState(true);
                C4934n.m18998M().mo29694n0();
                C5163j2.m19935B4(this.this$0, true);
                if (C5163j2.m20085W2(this.this$0)) {
                    Intent intent = new Intent(this.this$0, DrawerOverlayHandleService.class);
                    this.this$0.stopService(intent);
                    this.this$0.startService(intent);
                }
                FloatingTextService.f14458E.mo32048a(this.this$0);
            }
            this.this$0.finish();
            return C13339u.f61331a;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93731c(), (C15486m0) null, new C2289a(this, (C13635d<? super C2289a>) null), 2, (Object) null);
    }
}
