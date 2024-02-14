package p136n3;

import android.content.Context;
import android.content.Intent;
import com.arlosoft.macrodroid.triggers.receivers.InvokeMacroReceiver;

/* renamed from: n3.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C15754f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InvokeMacroReceiver f65092a;

    /* renamed from: c */
    public final /* synthetic */ Intent f65093c;

    /* renamed from: d */
    public final /* synthetic */ Context f65094d;

    public /* synthetic */ C15754f(InvokeMacroReceiver invokeMacroReceiver, Intent intent, Context context) {
        this.f65092a = invokeMacroReceiver;
        this.f65093c = intent;
        this.f65094d = context;
    }

    public final void run() {
        this.f65092a.m24031c(this.f65093c, this.f65094d);
    }
}
