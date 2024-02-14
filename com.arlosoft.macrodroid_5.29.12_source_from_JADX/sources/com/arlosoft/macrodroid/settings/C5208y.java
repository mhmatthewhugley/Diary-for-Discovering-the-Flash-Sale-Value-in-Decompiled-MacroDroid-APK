package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.extensions.C4666m;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import p106i2.C7395a;
import p139o1.C8008j0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16270q;

/* renamed from: com.arlosoft.macrodroid.settings.y */
/* compiled from: EditNotificationChannelsActivity.kt */
final class C5208y extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final C8008j0 f13016a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5120b f13017b;

    /* renamed from: com.arlosoft.macrodroid.settings.y$a */
    /* compiled from: EditNotificationChannelsActivity.kt */
    static final class C5209a extends C13665l implements C16270q<C15478k0, View, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C7395a $notificationChannel;
        int label;
        final /* synthetic */ C5208y this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5209a(C5208y yVar, C7395a aVar, C13635d<? super C5209a> dVar) {
            super(3, dVar);
            this.this$0 = yVar;
            this.$notificationChannel = aVar;
        }

        /* renamed from: h */
        public final Object invoke(C15478k0 k0Var, View view, C13635d<? super C13339u> dVar) {
            return new C5209a(this.this$0, this.$notificationChannel, dVar).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C13652d.m87832c();
            if (this.label == 0) {
                C13332o.m85685b(obj);
                this.this$0.f13017b.mo30092I0(this.$notificationChannel);
                return C13339u.f61331a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5208y(C8008j0 j0Var, C5120b bVar) {
        super(j0Var.getRoot());
        C13706o.m87929f(j0Var, "binding");
        C13706o.m87929f(bVar, "channelSelectedCallback");
        this.f13016a = j0Var;
        this.f13017b = bVar;
    }

    /* renamed from: u */
    public final void mo30151u(C7395a aVar) {
        C13706o.m87929f(aVar, "notificationChannel");
        this.f13016a.f19318b.setText(aVar.mo37426a());
        LinearLayout linearLayout = this.f13016a.f19319c;
        C13706o.m87928e(linearLayout, "binding.container");
        C4666m.m18147o(linearLayout, (C13640g) null, new C5209a(this, aVar, (C13635d<? super C5209a>) null), 1, (Object) null);
    }
}
