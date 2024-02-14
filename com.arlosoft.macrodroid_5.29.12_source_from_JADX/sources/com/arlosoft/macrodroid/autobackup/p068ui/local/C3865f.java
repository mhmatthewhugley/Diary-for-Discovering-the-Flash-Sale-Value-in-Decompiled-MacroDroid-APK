package com.arlosoft.macrodroid.autobackup.p068ui.local;

import android.content.Context;
import com.arlosoft.macrodroid.autobackup.worker.AutoBackupWorker;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13684d0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15482l0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15510r0;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.C15573z;
import p171u0.C10280a;
import p193y0.C10392a;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f */
/* compiled from: AutoBackupLocalPresenter.kt */
public final class C3865f extends C10280a<C3872g> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f10014c;

    /* renamed from: d */
    private final C15573z f10015d = C15198b2.m93746b((C15561w1) null, 1, (Object) null);

    /* renamed from: f */
    private C15573z f10016f = C15198b2.m93746b((C15561w1) null, 1, (Object) null);

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$a */
    /* compiled from: Comparisons.kt */
    public static final class C3866a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C15612b.m94865a(Long.valueOf(((File) t2).lastModified()), Long.valueOf(((File) t).lastModified()));
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$b */
    /* compiled from: AutoBackupLocalPresenter.kt */
    static final class C3867b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C3865f this$0;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$b$a */
        /* compiled from: AutoBackupLocalPresenter.kt */
        static final class C3868a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C13684d0<List<C10392a>> $backupList;
            int label;
            final /* synthetic */ C3865f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3868a(C13684d0<List<C10392a>> d0Var, C3865f fVar, C13635d<? super C3868a> dVar) {
                super(2, dVar);
                this.$backupList = d0Var;
                this.this$0 = fVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3868a(this.$backupList, this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3868a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.$backupList.element = this.this$0.m15037s();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3867b(C3865f fVar, C13635d<? super C3867b> dVar) {
            super(2, dVar);
            this.this$0 = fVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C3867b bVar = new C3867b(this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3867b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            C13684d0 d0Var;
            Object c = C13652d.m87832c();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                C13332o.m85685b(obj);
                C13684d0 d0Var2 = new C13684d0();
                C15510r0 b = C15473j.m94490b((C15478k0) this.L$0, C15186a1.m93730b(), (C15486m0) null, new C3868a(d0Var2, this.this$0, (C13635d<? super C3868a>) null), 2, (Object) null);
                this.L$0 = d0Var2;
                this.label = 1;
                if (b.mo74869h(this) == c) {
                    return c;
                }
                d0Var = d0Var2;
            } else if (i == 1) {
                d0Var = (C13684d0) this.L$0;
                C13332o.m85685b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) d0Var.element;
            if (list == null || list.isEmpty()) {
                z = false;
            }
            if (!z) {
                C3872g gVar = (C3872g) this.this$0.mo40890k();
                if (gVar != null) {
                    gVar.mo27393B();
                }
            } else {
                C3872g gVar2 = (C3872g) this.this$0.mo40890k();
                if (gVar2 != null) {
                    T t = d0Var.element;
                    C13706o.m87926c(t);
                    gVar2.mo27401Q((List) t);
                }
            }
            return C13339u.f61331a;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$c */
    /* compiled from: AutoBackupLocalPresenter.kt */
    static final class C3869c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ C10392a $backupFile;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C3865f this$0;

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$c$a */
        /* compiled from: AutoBackupLocalPresenter.kt */
        static final class C3870a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            final /* synthetic */ C10392a $backupFile;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3870a(C10392a aVar, C13635d<? super C3870a> dVar) {
                super(2, dVar);
                this.$backupFile = aVar;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3870a(this.$backupFile, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3870a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
                kotlin.p312io.C13667b.m87853a(r2, r5);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
                throw r0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object unused = kotlin.coroutines.intrinsics.C13652d.m87832c()
                    int r0 = r4.label
                    if (r0 != 0) goto L_0x0070
                    p297ja.C13332o.m85685b(r5)
                    y0.a r5 = r4.$backupFile
                    java.io.File r5 = r5.mo41077a()
                    java.nio.charset.Charset r0 = kotlin.text.C15147d.f64349b
                    r1 = 8192(0x2000, float:1.14794E-41)
                    java.io.InputStreamReader r2 = new java.io.InputStreamReader
                    java.io.FileInputStream r3 = new java.io.FileInputStream
                    r3.<init>(r5)
                    r2.<init>(r3, r0)
                    boolean r5 = r2 instanceof java.io.BufferedReader
                    if (r5 == 0) goto L_0x0025
                    java.io.BufferedReader r2 = (java.io.BufferedReader) r2
                    goto L_0x002b
                L_0x0025:
                    java.io.BufferedReader r5 = new java.io.BufferedReader
                    r5.<init>(r2, r1)
                    r2 = r5
                L_0x002b:
                    r5 = 0
                    java.lang.String r0 = kotlin.p312io.C13675i.m87863f(r2)     // Catch:{ all -> 0x0069 }
                    kotlin.p312io.C13667b.m87853a(r2, r5)
                    com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r1 = 1
                    java.util.List r5 = r5.mo29686U(r0, r1)
                    if (r5 == 0) goto L_0x005a
                    boolean r0 = r5.isEmpty()
                    r0 = r0 ^ r1
                    if (r0 == 0) goto L_0x005a
                    com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r0.mo29691j0()
                    com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r0.mo29693m0(r5)
                    com.arlosoft.macrodroid.macro.n r5 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                    r5.mo29702s0()
                L_0x005a:
                    x8.c r5 = p161s1.C10180a.m40075a()
                    com.arlosoft.macrodroid.events.RefreshHomeScreenEvent r0 = new com.arlosoft.macrodroid.events.RefreshHomeScreenEvent
                    r0.<init>()
                    r5.mo80018i(r0)
                    ja.u r5 = p297ja.C13339u.f61331a
                    return r5
                L_0x0069:
                    r5 = move-exception
                    throw r5     // Catch:{ all -> 0x006b }
                L_0x006b:
                    r0 = move-exception
                    kotlin.p312io.C13667b.m87853a(r2, r5)
                    throw r0
                L_0x0070:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.autobackup.p068ui.local.C3865f.C3869c.C3870a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.autobackup.ui.local.f$c$b */
        /* compiled from: AutoBackupLocalPresenter.kt */
        static final class C3871b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;

            C3871b(C13635d<? super C3871b> dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3871b(dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3871b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    Thread.sleep(1800);
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3869c(C3865f fVar, C10392a aVar, C13635d<? super C3869c> dVar) {
            super(2, dVar);
            this.this$0 = fVar;
            this.$backupFile = aVar;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C3869c cVar = new C3869c(this.this$0, this.$backupFile, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C3869c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7 A[Catch:{ Exception -> 0x0018, all -> 0x0015 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4 A[Catch:{ Exception -> 0x0018, all -> 0x0015 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00d1 A[Catch:{ Exception -> 0x0018, all -> 0x0015 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r1 = r12.label
                r2 = 2
                r3 = 0
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r5) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                p297ja.C13332o.m85685b(r13)     // Catch:{ Exception -> 0x0018 }
                goto L_0x008f
            L_0x0015:
                r13 = move-exception
                goto L_0x011b
            L_0x0018:
                r13 = move-exception
                goto L_0x00d5
            L_0x001b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0023:
                java.lang.Object r1 = r12.L$0
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.C15510r0) r1
                p297ja.C13332o.m85685b(r13)     // Catch:{ Exception -> 0x0018 }
                goto L_0x0084
            L_0x002b:
                p297ja.C13332o.m85685b(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.k0 r13 = (kotlinx.coroutines.C15478k0) r13
                com.arlosoft.macrodroid.macro.Macro.setMacroDroidEnabledState(r4)     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.MacroDroidService$a r1 = com.arlosoft.macrodroid.MacroDroidService.f7040a     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.f r6 = r12.this$0     // Catch:{ Exception -> 0x0018 }
                android.content.Context r6 = r6.f10014c     // Catch:{ Exception -> 0x0018 }
                r1.mo24642g(r6)     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.macro.n r1 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ Exception -> 0x0018 }
                r1.mo29694n0()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.f r1 = r12.this$0     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r1 = r1.mo40890k()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r1 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r1     // Catch:{ Exception -> 0x0018 }
                if (r1 == 0) goto L_0x0054
                r1.mo27400P(r5)     // Catch:{ Exception -> 0x0018 }
            L_0x0054:
                kotlinx.coroutines.h0 r7 = kotlinx.coroutines.C15186a1.m93730b()     // Catch:{ Exception -> 0x0018 }
                r8 = 0
                com.arlosoft.macrodroid.autobackup.ui.local.f$c$a r9 = new com.arlosoft.macrodroid.autobackup.ui.local.f$c$a     // Catch:{ Exception -> 0x0018 }
                y0.a r1 = r12.$backupFile     // Catch:{ Exception -> 0x0018 }
                r9.<init>(r1, r3)     // Catch:{ Exception -> 0x0018 }
                r10 = 2
                r11 = 0
                r6 = r13
                kotlinx.coroutines.r0 r1 = kotlinx.coroutines.C15473j.m94490b(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0018 }
                kotlinx.coroutines.h0 r7 = kotlinx.coroutines.C15186a1.m93730b()     // Catch:{ Exception -> 0x0018 }
                r8 = 0
                com.arlosoft.macrodroid.autobackup.ui.local.f$c$b r9 = new com.arlosoft.macrodroid.autobackup.ui.local.f$c$b     // Catch:{ Exception -> 0x0018 }
                r9.<init>(r3)     // Catch:{ Exception -> 0x0018 }
                r10 = 2
                r11 = 0
                r6 = r13
                kotlinx.coroutines.r0 r13 = kotlinx.coroutines.C15473j.m94490b(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0018 }
                r12.L$0 = r13     // Catch:{ Exception -> 0x0018 }
                r12.label = r5     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r1 = r1.mo74869h(r12)     // Catch:{ Exception -> 0x0018 }
                if (r1 != r0) goto L_0x0083
                return r0
            L_0x0083:
                r1 = r13
            L_0x0084:
                r12.L$0 = r3     // Catch:{ Exception -> 0x0018 }
                r12.label = r2     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r13 = r1.mo74869h(r12)     // Catch:{ Exception -> 0x0018 }
                if (r13 != r0) goto L_0x008f
                return r0
            L_0x008f:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0018 }
                r13.<init>()     // Catch:{ Exception -> 0x0018 }
                java.lang.String r0 = "Restored from auto backup file: "
                r13.append(r0)     // Catch:{ Exception -> 0x0018 }
                y0.a r0 = r12.$backupFile     // Catch:{ Exception -> 0x0018 }
                java.io.File r0 = r0.mo41077a()     // Catch:{ Exception -> 0x0018 }
                java.io.File r0 = r0.getAbsoluteFile()     // Catch:{ Exception -> 0x0018 }
                r13.append(r0)     // Catch:{ Exception -> 0x0018 }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18873l(r13)     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.f r13 = r12.this$0     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r13 = r13.mo40890k()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r13 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r13     // Catch:{ Exception -> 0x0018 }
                if (r13 == 0) goto L_0x00ba
                r13.mo27399O()     // Catch:{ Exception -> 0x0018 }
            L_0x00ba:
                com.arlosoft.macrodroid.autobackup.ui.local.f r13 = r12.this$0     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r13 = r13.mo40890k()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r13 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r13     // Catch:{ Exception -> 0x0018 }
                if (r13 == 0) goto L_0x00c7
                r13.mo27400P(r4)     // Catch:{ Exception -> 0x0018 }
            L_0x00c7:
                com.arlosoft.macrodroid.autobackup.ui.local.f r13 = r12.this$0     // Catch:{ Exception -> 0x0018 }
                java.lang.Object r13 = r13.mo40890k()     // Catch:{ Exception -> 0x0018 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r13 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r13     // Catch:{ Exception -> 0x0018 }
                if (r13 == 0) goto L_0x0103
                r13.mo27402S()     // Catch:{ Exception -> 0x0018 }
                goto L_0x0103
            L_0x00d5:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
                r0.<init>()     // Catch:{ all -> 0x0015 }
                java.lang.String r1 = "Failed to restore auto backup: "
                r0.append(r1)     // Catch:{ all -> 0x0015 }
                r0.append(r13)     // Catch:{ all -> 0x0015 }
                java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0015 }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r13)     // Catch:{ all -> 0x0015 }
                com.arlosoft.macrodroid.autobackup.ui.local.f r13 = r12.this$0     // Catch:{ all -> 0x0015 }
                java.lang.Object r13 = r13.mo40890k()     // Catch:{ all -> 0x0015 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r13 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r13     // Catch:{ all -> 0x0015 }
                if (r13 == 0) goto L_0x00f6
                r13.mo27394C()     // Catch:{ all -> 0x0015 }
            L_0x00f6:
                com.arlosoft.macrodroid.autobackup.ui.local.f r13 = r12.this$0     // Catch:{ all -> 0x0015 }
                java.lang.Object r13 = r13.mo40890k()     // Catch:{ all -> 0x0015 }
                com.arlosoft.macrodroid.autobackup.ui.local.g r13 = (com.arlosoft.macrodroid.autobackup.p068ui.local.C3872g) r13     // Catch:{ all -> 0x0015 }
                if (r13 == 0) goto L_0x0103
                r13.mo27400P(r4)     // Catch:{ all -> 0x0015 }
            L_0x0103:
                com.arlosoft.macrodroid.macro.Macro.setMacroDroidEnabledState(r5)
                com.arlosoft.macrodroid.MacroDroidService$a r13 = com.arlosoft.macrodroid.MacroDroidService.f7040a
                com.arlosoft.macrodroid.autobackup.ui.local.f r0 = r12.this$0
                android.content.Context r0 = r0.f10014c
                r13.mo24641f(r0)
                com.arlosoft.macrodroid.macro.n r13 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                r13.mo29694n0()
                ja.u r13 = p297ja.C13339u.f61331a
                return r13
            L_0x011b:
                com.arlosoft.macrodroid.macro.Macro.setMacroDroidEnabledState(r5)
                com.arlosoft.macrodroid.MacroDroidService$a r0 = com.arlosoft.macrodroid.MacroDroidService.f7040a
                com.arlosoft.macrodroid.autobackup.ui.local.f r1 = r12.this$0
                android.content.Context r1 = r1.f10014c
                r0.mo24641f(r1)
                com.arlosoft.macrodroid.macro.n r0 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
                r0.mo29694n0()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.autobackup.p068ui.local.C3865f.C3869c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C3865f(Context context) {
        C13706o.m87929f(context, "context");
        this.f10014c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final List<C10392a> m15037s() {
        File file = new File(this.f10014c.getFilesDir().getAbsolutePath(), "MacroDroid/AutoBackup");
        File file2 = new File(this.f10014c.getExternalFilesDir((String) null), "MacroDroid/AutoBackup");
        if (!file2.exists() && !file.exists()) {
            return C13614t.m87748j();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        File[] listFiles2 = file2.listFiles();
        if (listFiles2 == null) {
            listFiles2 = new File[0];
        }
        List<File> Y = C13596m.m87600Y((File[]) C13593l.m87569p(listFiles, listFiles2), new C3866a());
        ArrayList arrayList = new ArrayList(C13616u.m87774u(Y, 10));
        for (File file3 : Y) {
            C13706o.m87928e(file3, "file");
            arrayList.add(new C10392a(file3));
        }
        return arrayList;
    }

    /* renamed from: x */
    private final void m15038x() {
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().plus(this.f10016f)), (C13640g) null, (C15486m0) null, new C3867b(this, (C13635d<? super C3867b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo27412l() {
        C15561w1.C15562a.m94723a(this.f10015d, (CancellationException) null, 1, (Object) null);
        C15561w1.C15562a.m94723a(this.f10016f, (CancellationException) null, 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo27413m() {
        m15038x();
    }

    /* renamed from: q */
    public final void mo27414q() {
        File[] listFiles = new File(this.f10014c.getFilesDir().getAbsolutePath(), "MacroDroid/AutoBackup").listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        File[] listFiles2 = new File(this.f10014c.getExternalFilesDir((String) null), "MacroDroid/AutoBackup").listFiles();
        if (listFiles2 != null) {
            for (File delete2 : listFiles2) {
                delete2.delete();
            }
        }
        C3872g gVar = (C3872g) mo40890k();
        if (gVar != null) {
            gVar.mo27393B();
        }
    }

    /* renamed from: r */
    public final void mo27415r(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        List I0 = C13566b0.m87405I0(m15037s());
        I0.remove(aVar);
        if (I0.isEmpty()) {
            C3872g gVar = (C3872g) mo40890k();
            if (gVar != null) {
                gVar.mo27393B();
            }
        } else {
            C3872g gVar2 = (C3872g) mo40890k();
            if (gVar2 != null) {
                gVar2.mo27401Q(I0);
            }
        }
        aVar.mo41077a().delete();
    }

    /* renamed from: t */
    public final void mo27416t(boolean z) {
        if (z) {
            AutoBackupWorker.f10020c.mo27431b();
            C5163j2.m20202l3(this.f10014c, true);
            return;
        }
        AutoBackupWorker.f10020c.mo27430a();
        C5163j2.m20202l3(this.f10014c, false);
    }

    /* renamed from: u */
    public final void mo27417u(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        C3872g gVar = (C3872g) mo40890k();
        if (gVar != null) {
            gVar.mo27396F(aVar);
        }
    }

    /* renamed from: v */
    public final void mo27418v(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        C3872g gVar = (C3872g) mo40890k();
        if (gVar != null) {
            gVar.mo27398M(aVar);
        }
    }

    /* renamed from: w */
    public final void mo27419w() {
        C3872g gVar = (C3872g) mo40890k();
        if (gVar != null) {
            gVar.mo27397H();
        }
    }

    /* renamed from: y */
    public final void mo27420y(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        C15561w1 unused = C15473j.m94492d(C15482l0.m94502a(C15186a1.m93731c().plus(this.f10015d)), (C13640g) null, (C15486m0) null, new C3869c(this, aVar, (C13635d<? super C3869c>) null), 3, (Object) null);
    }

    /* renamed from: z */
    public final void mo27421z(C10392a aVar) {
        C13706o.m87929f(aVar, "backupFile");
        C3872g gVar = (C3872g) mo40890k();
        if (gVar != null) {
            gVar.mo27395D(aVar);
        }
    }
}
