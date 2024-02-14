package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r */
/* compiled from: AutoBackupCloudViewModel.kt */
public abstract class C3839r {

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$a */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3840a extends C3839r {

        /* renamed from: a */
        public static final C3840a f9983a = new C3840a();

        private C3840a() {
            super((C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$b */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3841b extends C3839r {

        /* renamed from: a */
        private final boolean f9984a;

        /* renamed from: b */
        private final List<C3847t> f9985b;

        /* renamed from: c */
        private final boolean f9986c;

        /* renamed from: d */
        private final String f9987d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3841b(boolean z, List<C3847t> list, boolean z2, String str) {
            super((C13695i) null);
            C13706o.m87929f(list, "backupList");
            this.f9984a = z;
            this.f9985b = list;
            this.f9986c = z2;
            this.f9987d = str;
        }

        /* renamed from: a */
        public final List<C3847t> mo27374a() {
            return this.f9985b;
        }

        /* renamed from: b */
        public final String mo27375b() {
            return this.f9987d;
        }

        /* renamed from: c */
        public final boolean mo27376c() {
            return this.f9986c;
        }

        /* renamed from: d */
        public final boolean mo27377d() {
            return this.f9984a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C3841b(boolean z, List list, boolean z2, String str, int i, C13695i iVar) {
            this(z, list, z2, (i & 8) != 0 ? null : str);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$c */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3842c extends C3839r {

        /* renamed from: a */
        public static final C3842c f9988a = new C3842c();

        private C3842c() {
            super((C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$d */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3843d extends C3839r {

        /* renamed from: a */
        public static final C3843d f9989a = new C3843d();

        private C3843d() {
            super((C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$e */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3844e extends C3839r {

        /* renamed from: a */
        public static final C3844e f9990a = new C3844e();

        private C3844e() {
            super((C13695i) null);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.r$f */
    /* compiled from: AutoBackupCloudViewModel.kt */
    public static final class C3845f extends C3839r {

        /* renamed from: a */
        public static final C3845f f9991a = new C3845f();

        private C3845f() {
            super((C13695i) null);
        }
    }

    private C3839r() {
    }

    public /* synthetic */ C3839r(C13695i iVar) {
        this();
    }
}
