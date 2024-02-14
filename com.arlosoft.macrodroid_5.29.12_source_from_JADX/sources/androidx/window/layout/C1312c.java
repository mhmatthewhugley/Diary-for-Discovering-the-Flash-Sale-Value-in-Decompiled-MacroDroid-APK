package androidx.window.layout;

import androidx.core.util.Consumer;
import kotlinx.coroutines.channels.C15239r;

/* renamed from: androidx.window.layout.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1312c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C15239r f708a;

    public /* synthetic */ C1312c(C15239r rVar) {
        this.f708a = rVar;
    }

    public final void accept(Object obj) {
        WindowInfoTrackerImpl$windowLayoutInfo$1.m101285invokeSuspend$lambda0(this.f708a, (WindowLayoutInfo) obj);
    }
}
