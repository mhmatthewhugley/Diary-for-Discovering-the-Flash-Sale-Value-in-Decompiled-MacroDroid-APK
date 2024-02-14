package kotlin.reflect.jvm.internal;

import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14005l;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Lkotlin/reflect/jvm/internal/a;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/l;", "Lkotlin/reflect/jvm/internal/f;", "Lja/u;", "Lkotlin/reflect/jvm/internal/impl/descriptors/y;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lja/u;)Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/jvm/internal/impl/descriptors/t0;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lja/u;)Lkotlin/reflect/jvm/internal/f;", "Lkotlin/reflect/jvm/internal/i;", "a", "Lkotlin/reflect/jvm/internal/i;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/i;)V", "kotlin-reflection"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.reflect.jvm.internal.a */
/* compiled from: util.kt */
public class C13718a extends C14005l<C13792f<?>, C13339u> {

    /* renamed from: a */
    private final C13832i f61936a;

    public C13718a(C13832i iVar) {
        C13706o.m87929f(iVar, "container");
        this.f61936a = iVar;
    }

    /* renamed from: p */
    public C13792f<?> mo71974i(C14154y yVar, C13339u uVar) {
        C13706o.m87929f(yVar, "descriptor");
        C13706o.m87929f(uVar, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        return new C15047j(this.f61936a, yVar);
    }

    /* renamed from: q */
    public C13792f<?> mo71973c(C14140t0 t0Var, C13339u uVar) {
        C13706o.m87929f(t0Var, "descriptor");
        C13706o.m87929f(uVar, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        int i = 0;
        int i2 = t0Var.mo72231L() != null ? 1 : 0;
        if (t0Var.mo72232P() != null) {
            i = 1;
        }
        int i3 = i2 + i;
        if (t0Var.mo72440N()) {
            if (i3 == 0) {
                return new C15052k(this.f61936a, t0Var);
            }
            if (i3 == 1) {
                return new C15055l(this.f61936a, t0Var);
            }
            if (i3 == 2) {
                return new C15058m(this.f61936a, t0Var);
            }
        } else if (i3 == 0) {
            return new C15073q(this.f61936a, t0Var);
        } else {
            if (i3 == 1) {
                return new C15077r(this.f61936a, t0Var);
            }
            if (i3 == 2) {
                return new C15081s(this.f61936a, t0Var);
            }
        }
        throw new C13719a0("Unsupported property: " + t0Var);
    }
}
