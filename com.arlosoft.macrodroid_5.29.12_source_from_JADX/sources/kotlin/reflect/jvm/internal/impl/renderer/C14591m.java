package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: kotlin.reflect.jvm.internal.impl.renderer.m */
/* compiled from: DescriptorRenderer.kt */
public enum C14591m {
    ;

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.m$a */
    /* compiled from: DescriptorRenderer.kt */
    static final class C14592a extends C14591m {
        C14592a(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* renamed from: d */
        public String mo73689d(String str) {
            C13706o.m87929f(str, TypedValues.Custom.S_STRING);
            return C15176v.m93630E(C15176v.m93630E(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.m$b */
    /* compiled from: DescriptorRenderer.kt */
    static final class C14593b extends C14591m {
        C14593b(String str, int i) {
            super(str, i, (C13695i) null);
        }

        /* renamed from: d */
        public String mo73689d(String str) {
            C13706o.m87929f(str, TypedValues.Custom.S_STRING);
            return str;
        }
    }

    /* renamed from: d */
    public abstract String mo73689d(String str);
}
