package com.arlosoft.macrodroid.variables;

import com.arlosoft.macrodroid.common.MacroDroidVariable;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.variables.q0 */
/* compiled from: VariableWithTypeSpinnerAdapter.kt */
public abstract class C6585q0 {

    /* renamed from: a */
    private final String f15272a;

    /* renamed from: com.arlosoft.macrodroid.variables.q0$a */
    /* compiled from: VariableWithTypeSpinnerAdapter.kt */
    public static final class C6586a extends C6585q0 {

        /* renamed from: b */
        private final String f15273b;

        /* renamed from: c */
        private final int f15274c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6586a(String str, int i) {
            super(str, (C13695i) null);
            C13706o.m87929f(str, "option");
            this.f15273b = str;
            this.f15274c = i;
        }

        /* renamed from: b */
        public final int mo32790b() {
            return this.f15274c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6586a)) {
                return false;
            }
            C6586a aVar = (C6586a) obj;
            return C13706o.m87924a(this.f15273b, aVar.f15273b) && this.f15274c == aVar.f15274c;
        }

        public int hashCode() {
            return (this.f15273b.hashCode() * 31) + this.f15274c;
        }

        public String toString() {
            return "Option(option=" + this.f15273b + ", index=" + this.f15274c + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.variables.q0$b */
    /* compiled from: VariableWithTypeSpinnerAdapter.kt */
    public static final class C6587b extends C6585q0 {

        /* renamed from: b */
        private final MacroDroidVariable f15275b;

        /* renamed from: c */
        private final String f15276c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6587b(MacroDroidVariable macroDroidVariable, String str) {
            super(macroDroidVariable.getName() + str, (C13695i) null);
            C13706o.m87929f(macroDroidVariable, "variable");
            C13706o.m87929f(str, "suffixText");
            this.f15275b = macroDroidVariable;
            this.f15276c = str;
        }

        /* renamed from: b */
        public final MacroDroidVariable mo32794b() {
            return this.f15275b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6587b)) {
                return false;
            }
            C6587b bVar = (C6587b) obj;
            return C13706o.m87924a(this.f15275b, bVar.f15275b) && C13706o.m87924a(this.f15276c, bVar.f15276c);
        }

        public int hashCode() {
            return (this.f15275b.hashCode() * 31) + this.f15276c.hashCode();
        }

        public String toString() {
            return "Variable(variable=" + this.f15275b + ", suffixText=" + this.f15276c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C6587b(MacroDroidVariable macroDroidVariable, String str, int i, C13695i iVar) {
            this(macroDroidVariable, (i & 2) != 0 ? "" : str);
        }
    }

    private C6585q0(String str) {
        this.f15272a = str;
    }

    public /* synthetic */ C6585q0(String str, C13695i iVar) {
        this(str);
    }

    /* renamed from: a */
    public final String mo32789a() {
        return this.f15272a;
    }
}
