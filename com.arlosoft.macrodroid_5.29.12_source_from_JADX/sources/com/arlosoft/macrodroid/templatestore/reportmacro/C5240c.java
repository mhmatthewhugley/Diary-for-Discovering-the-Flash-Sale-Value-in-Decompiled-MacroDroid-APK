package com.arlosoft.macrodroid.templatestore.reportmacro;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.c */
/* compiled from: ReportMacroViewModel.kt */
public abstract class C5240c {

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.c$a */
    /* compiled from: ReportMacroViewModel.kt */
    public static final class C5241a extends C5240c {

        /* renamed from: a */
        private final String f13067a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5241a(String str) {
            super((C13695i) null);
            C13706o.m87929f(str, "commentText");
            this.f13067a = str;
        }

        /* renamed from: a */
        public final String mo30380a() {
            return this.f13067a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C5241a) && C13706o.m87924a(this.f13067a, ((C5241a) obj).f13067a);
        }

        public int hashCode() {
            return this.f13067a.hashCode();
        }

        public String toString() {
            return "Comment(commentText=" + this.f13067a + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.c$b */
    /* compiled from: ReportMacroViewModel.kt */
    public static final class C5242b extends C5240c {

        /* renamed from: a */
        private final int f13068a;

        /* renamed from: b */
        private final int f13069b;

        public C5242b(int i, int i2) {
            super((C13695i) null);
            this.f13068a = i;
            this.f13069b = i2;
        }

        /* renamed from: a */
        public final int mo30384a() {
            return this.f13069b;
        }

        /* renamed from: b */
        public final int mo30385b() {
            return this.f13068a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5242b)) {
                return false;
            }
            C5242b bVar = (C5242b) obj;
            return this.f13068a == bVar.f13068a && this.f13069b == bVar.f13069b;
        }

        public int hashCode() {
            return (this.f13068a * 31) + this.f13069b;
        }

        public String toString() {
            return "ReasonCodeWithCount(reasonCode=" + this.f13068a + ", count=" + this.f13069b + ')';
        }
    }

    /* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.c$c */
    /* compiled from: ReportMacroViewModel.kt */
    public static final class C5243c extends C5240c {

        /* renamed from: a */
        private final int f13070a;

        /* renamed from: b */
        private final int f13071b;

        public C5243c(int i, int i2) {
            super((C13695i) null);
            this.f13070a = i;
            this.f13071b = i2;
        }

        /* renamed from: a */
        public final int mo30389a() {
            return this.f13071b;
        }

        /* renamed from: b */
        public final int mo30390b() {
            return this.f13070a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5243c)) {
                return false;
            }
            C5243c cVar = (C5243c) obj;
            return this.f13070a == cVar.f13070a && this.f13071b == cVar.f13071b;
        }

        public int hashCode() {
            return (this.f13070a * 31) + this.f13071b;
        }

        public String toString() {
            return "Summary(starCount=" + this.f13070a + ", flagCount=" + this.f13071b + ')';
        }
    }

    private C5240c() {
    }

    public /* synthetic */ C5240c(C13695i iVar) {
        this();
    }
}
