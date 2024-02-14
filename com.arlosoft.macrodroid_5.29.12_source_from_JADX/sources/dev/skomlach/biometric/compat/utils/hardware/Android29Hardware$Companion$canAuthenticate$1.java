package dev.skomlach.biometric.compat.utils.hardware;

import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13658f;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlinx.coroutines.C15478k0;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo71668d2 = {"Lkotlinx/coroutines/k0;", "Lja/u;", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
@C13658f(mo71893c = "dev.skomlach.biometric.compat.utils.hardware.Android29Hardware$Companion$canAuthenticate$1", mo71894f = "Android29Hardware.kt", mo71895l = {}, mo71896m = "invokeSuspend")
/* compiled from: Android29Hardware.kt */
final class Android29Hardware$Companion$canAuthenticate$1 extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
    int label;

    Android29Hardware$Companion$canAuthenticate$1(C13635d<? super Android29Hardware$Companion$canAuthenticate$1> dVar) {
        super(2, dVar);
    }

    public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
        return new Android29Hardware$Companion$canAuthenticate$1(dVar);
    }

    public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
        return ((Android29Hardware$Companion$canAuthenticate$1) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = C13652d.m87832c();
        if (this.label == 0) {
            C13332o.m85685b(obj);
            Android29Hardware.Companion.updateCodeSync();
            return C13339u.f61331a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
