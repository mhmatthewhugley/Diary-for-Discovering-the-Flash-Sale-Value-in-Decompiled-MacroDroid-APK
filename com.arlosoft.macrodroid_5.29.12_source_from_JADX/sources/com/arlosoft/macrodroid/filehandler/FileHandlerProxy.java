package com.arlosoft.macrodroid.filehandler;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15186a1;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15561w1;
import p297ja.C13332o;
import p297ja.C13339u;
import p319lc.C15626c;
import p370qa.C16269p;

/* compiled from: FileHandlerProxy.kt */
public final class FileHandlerProxy extends AppCompatActivity {

    /* renamed from: d */
    public Map<Integer, View> f11785d = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a */
    /* compiled from: FileHandlerProxy.kt */
    static final class C4675a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ Uri $uri;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FileHandlerProxy this$0;

        /* renamed from: com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$a */
        /* compiled from: FileHandlerProxy.kt */
        static final class C4676a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ FileHandlerProxy this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4676a(FileHandlerProxy fileHandlerProxy, C13635d<? super C4676a> dVar) {
                super(2, dVar);
                this.this$0 = fileHandlerProxy;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4676a(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4676a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C15626c.m94876a(this.this$0.getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$b */
        /* compiled from: FileHandlerProxy.kt */
        static final class C4677b extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ FileHandlerProxy this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4677b(FileHandlerProxy fileHandlerProxy, C13635d<? super C4677b> dVar) {
                super(2, dVar);
                this.this$0 = fileHandlerProxy;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4677b(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4677b) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    C15626c.m94876a(this.this$0.getApplicationContext(), "The selected file could not be imported into MacroDroid", 1).show();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$c */
        /* compiled from: FileHandlerProxy.kt */
        static final class C4678c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;
            final /* synthetic */ FileHandlerProxy this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4678c(FileHandlerProxy fileHandlerProxy, C13635d<? super C4678c> dVar) {
                super(2, dVar);
                this.this$0 = fileHandlerProxy;
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C4678c(this.this$0, dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C4678c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C13652d.m87832c();
                if (this.label == 0) {
                    C13332o.m85685b(obj);
                    this.this$0.finish();
                    return C13339u.f61331a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4675a(Uri uri, FileHandlerProxy fileHandlerProxy, C13635d<? super C4675a> dVar) {
            super(2, dVar);
            this.$uri = uri;
            this.this$0 = fileHandlerProxy;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m18159r(FileHandlerProxy fileHandlerProxy) {
            C15626c.m94876a(fileHandlerProxy, fileHandlerProxy.getString(C17541R$string.import_failed), 1).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static final void m18160u(FileHandlerProxy fileHandlerProxy) {
            C15626c.m94876a(fileHandlerProxy, fileHandlerProxy.getString(C17541R$string.import_failed), 1).show();
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            C4675a aVar = new C4675a(this.$uri, this.this$0, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C4675a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:60|61|62|63|(1:65)|66) */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0191, code lost:
            if (r13 != null) goto L_0x0193;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0193, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0197, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g("Could not import file: " + r0);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.arlosoft.macrodroid.filehandler.C4680b(r12.this$0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bf, code lost:
            if (r13 != null) goto L_0x01c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c4, code lost:
            r13 = (java.io.BufferedReader) r6.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c8, code lost:
            if (r13 != null) goto L_0x0193;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r12.this$0.getIntent().setClassName(r12.this$0, "com.arlosoft.macrodroid.ExportImportActivity");
            r0 = r12.this$0;
            r0.startActivity(r0.getIntent());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.arlosoft.macrodroid.filehandler.C4679a(r12.this$0));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f5, code lost:
            if (r13 != null) goto L_0x01f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f7, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fa, code lost:
            r13 = (java.io.BufferedReader) r6.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fe, code lost:
            if (r13 == null) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0201, code lost:
            r13 = kotlinx.coroutines.C15186a1.m93731c();
            r0 = new com.arlosoft.macrodroid.filehandler.FileHandlerProxy.C4675a.C4678c(r12.this$0, (kotlin.coroutines.C13635d<? super com.arlosoft.macrodroid.filehandler.FileHandlerProxy.C4675a.C4678c>) null);
            r12.label = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0212, code lost:
            if (kotlinx.coroutines.C15414h.m94298g(r13, r0, r12) != r1) goto L_0x0215;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0214, code lost:
            return r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x015f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x01cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x01e2 */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0197 A[ExcHandler: all (r0v11 'th' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:23:0x00a5] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "com.arlosoft.macrodroid.ExportImportActivity"
                java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
                int r2 = r12.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 == r5) goto L_0x0029
                if (r2 == r4) goto L_0x0020
                if (r2 != r3) goto L_0x0018
                p297ja.C13332o.m85685b(r13)
                goto L_0x0215
            L_0x0018:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0020:
                java.lang.Object r0 = r12.L$0
                java.lang.Exception r0 = (java.lang.Exception) r0
                p297ja.C13332o.m85685b(r13)
                goto L_0x023f
            L_0x0029:
                java.lang.Object r0 = r12.L$0
                java.lang.Exception r0 = (java.lang.Exception) r0
                p297ja.C13332o.m85685b(r13)
                goto L_0x006c
            L_0x0031:
                p297ja.C13332o.m85685b(r13)
                java.lang.Object r13 = r12.L$0
                kotlinx.coroutines.k0 r13 = (kotlinx.coroutines.C15478k0) r13
                android.net.Uri r13 = r12.$uri
                java.lang.String r13 = r13.getScheme()
                java.lang.String r2 = "content"
                boolean r13 = kotlin.jvm.internal.C13706o.m87924a(r2, r13)
                r2 = 0
                if (r13 == 0) goto L_0x0095
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r13 = r12.this$0     // Catch:{ Exception -> 0x0054 }
                android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x0054 }
                android.net.Uri r6 = r12.$uri     // Catch:{ Exception -> 0x0054 }
                java.io.InputStream r13 = r13.openInputStream(r6)     // Catch:{ Exception -> 0x0054 }
                goto L_0x00a0
            L_0x0054:
                r13 = move-exception
                r0 = r13
                kotlinx.coroutines.h2 r13 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$a r3 = new com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$a
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0
                r3.<init>(r4, r2)
                r12.L$0 = r0
                r12.label = r5
                java.lang.Object r13 = kotlinx.coroutines.C15414h.m94298g(r13, r3, r12)
                if (r13 != r1) goto L_0x006c
                return r1
            L_0x006c:
                com.google.firebase.crashlytics.FirebaseCrashlytics r13 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to import macro from input stream: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                r13.mo22936d(r1)
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r13 = r12.this$0
                r13.finish()
                ja.u r13 = p297ja.C13339u.f61331a
                return r13
            L_0x0095:
                java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0227 }
                android.net.Uri r6 = r12.$uri     // Catch:{ Exception -> 0x0227 }
                java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0227 }
                r13.<init>(r6)     // Catch:{ Exception -> 0x0227 }
            L_0x00a0:
                kotlin.jvm.internal.d0 r6 = new kotlin.jvm.internal.d0
                r6.<init>()
                java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r8.<init>(r13)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r7.<init>(r8)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r6.element = r7     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                kotlin.jvm.internal.d0 r7 = new kotlin.jvm.internal.d0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r7.<init>()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.String r8 = ""
                r7.element = r8     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r8.<init>()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
            L_0x00bf:
                T r9 = r6.element     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.io.BufferedReader r9 = (java.io.BufferedReader) r9     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.String r9 = r9.readLine()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r7.element = r9     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                if (r9 == 0) goto L_0x00cf
                r8.append(r9)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                goto L_0x00bf
            L_0x00cf:
                com.google.gson.GsonBuilder r7 = p172u1.C10283c.m40413c()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.Class<com.arlosoft.macrodroid.macro.Macro> r9 = com.arlosoft.macrodroid.macro.Macro.class
                com.arlosoft.macrodroid.macro.g r10 = new com.arlosoft.macrodroid.macro.g     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r11 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Context r11 = r11.getApplicationContext()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r10.<init>(r11, r5, r5, r5)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.google.gson.GsonBuilder r7 = r7.mo64006e(r9, r10)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.Class<com.arlosoft.macrodroid.actionblock.data.ActionBlock> r9 = com.arlosoft.macrodroid.actionblock.data.ActionBlock.class
                com.arlosoft.macrodroid.macro.g r10 = new com.arlosoft.macrodroid.macro.g     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r11 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Context r11 = r11.getApplicationContext()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r10.<init>(r11, r5, r5, r5)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.google.gson.GsonBuilder r7 = r7.mo64006e(r9, r10)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.google.gson.Gson r7 = r7.mo64004c()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.net.Uri r9 = r12.$uri     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.String r9 = r9.toString()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.String r10 = "uri.toString()"
                kotlin.jvm.internal.C13706o.m87928e(r9, r10)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.String r10 = ".ablock"
                r11 = 0
                boolean r4 = kotlin.text.C15176v.m93640u(r9, r10, r11, r4, r2)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                if (r4 == 0) goto L_0x011a
                java.lang.String r4 = r8.toString()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.Class<com.arlosoft.macrodroid.actionblock.data.ActionBlock> r8 = com.arlosoft.macrodroid.actionblock.data.ActionBlock.class
                java.lang.Object r4 = r7.mo63976j(r4, r8)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                goto L_0x0126
            L_0x011a:
                java.lang.String r4 = r8.toString()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                java.lang.Class<com.arlosoft.macrodroid.macro.Macro> r8 = com.arlosoft.macrodroid.macro.Macro.class
                java.lang.Object r4 = r7.mo63976j(r4, r8)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.macro.Macro r4 = (com.arlosoft.macrodroid.macro.Macro) r4     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
            L_0x0126:
                java.lang.String r7 = r4.getName()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                if (r7 == 0) goto L_0x0134
                int r7 = r7.length()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                if (r7 != 0) goto L_0x0133
                goto L_0x0134
            L_0x0133:
                r5 = 0
            L_0x0134:
                if (r5 != 0) goto L_0x0174
                boolean r4 = r4 instanceof com.arlosoft.macrodroid.actionblock.data.ActionBlock     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                if (r4 == 0) goto L_0x0148
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                java.lang.String r7 = "com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity"
                r4.setClassName(r5, r7)     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                goto L_0x0155
            L_0x0148:
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                java.lang.String r7 = "com.arlosoft.macrodroid.editscreen.EditMacroActivity"
                r4.setClassName(r5, r7)     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
            L_0x0155:
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                android.content.Intent r5 = r4.getIntent()     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                r4.startActivity(r5)     // Catch:{ Exception -> 0x015f, all -> 0x0197 }
                goto L_0x0188
            L_0x015f:
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r4.setClassName(r5, r0)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Intent r5 = r4.getIntent()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r4.startActivity(r5)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                goto L_0x0188
            L_0x0174:
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r4.setClassName(r5, r0)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                android.content.Intent r5 = r4.getIntent()     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
                r4.startActivity(r5)     // Catch:{ JsonSyntaxException -> 0x01cd, all -> 0x0197 }
            L_0x0188:
                if (r13 == 0) goto L_0x018d
                r13.close()
            L_0x018d:
                T r13 = r6.element
                java.io.BufferedReader r13 = (java.io.BufferedReader) r13
                if (r13 == 0) goto L_0x0201
            L_0x0193:
                r13.close()
                goto L_0x0201
            L_0x0197:
                r0 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cb }
                r4.<init>()     // Catch:{ all -> 0x01cb }
                java.lang.String r5 = "Could not import file: "
                r4.append(r5)     // Catch:{ all -> 0x01cb }
                r4.append(r0)     // Catch:{ all -> 0x01cb }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01cb }
                com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ all -> 0x01cb }
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x01cb }
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x01cb }
                r0.<init>(r4)     // Catch:{ all -> 0x01cb }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ all -> 0x01cb }
                com.arlosoft.macrodroid.filehandler.b r5 = new com.arlosoft.macrodroid.filehandler.b     // Catch:{ all -> 0x01cb }
                r5.<init>(r4)     // Catch:{ all -> 0x01cb }
                r0.post(r5)     // Catch:{ all -> 0x01cb }
                if (r13 == 0) goto L_0x01c4
                r13.close()
            L_0x01c4:
                T r13 = r6.element
                java.io.BufferedReader r13 = (java.io.BufferedReader) r13
                if (r13 == 0) goto L_0x0201
                goto L_0x0193
            L_0x01cb:
                r0 = move-exception
                goto L_0x0218
            L_0x01cd:
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ all -> 0x01e2 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ all -> 0x01e2 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0     // Catch:{ all -> 0x01e2 }
                r4.setClassName(r5, r0)     // Catch:{ all -> 0x01e2 }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r0 = r12.this$0     // Catch:{ all -> 0x01e2 }
                android.content.Intent r4 = r0.getIntent()     // Catch:{ all -> 0x01e2 }
                r0.startActivity(r4)     // Catch:{ all -> 0x01e2 }
                goto L_0x01f5
            L_0x01e2:
                android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x01cb }
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x01cb }
                r0.<init>(r4)     // Catch:{ all -> 0x01cb }
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0     // Catch:{ all -> 0x01cb }
                com.arlosoft.macrodroid.filehandler.a r5 = new com.arlosoft.macrodroid.filehandler.a     // Catch:{ all -> 0x01cb }
                r5.<init>(r4)     // Catch:{ all -> 0x01cb }
                r0.post(r5)     // Catch:{ all -> 0x01cb }
            L_0x01f5:
                if (r13 == 0) goto L_0x01fa
                r13.close()
            L_0x01fa:
                T r13 = r6.element
                java.io.BufferedReader r13 = (java.io.BufferedReader) r13
                if (r13 == 0) goto L_0x0201
                goto L_0x0193
            L_0x0201:
                kotlinx.coroutines.h2 r13 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$c r0 = new com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$c
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r4 = r12.this$0
                r0.<init>(r4, r2)
                r12.label = r3
                java.lang.Object r13 = kotlinx.coroutines.C15414h.m94298g(r13, r0, r12)
                if (r13 != r1) goto L_0x0215
                return r1
            L_0x0215:
                ja.u r13 = p297ja.C13339u.f61331a
                return r13
            L_0x0218:
                if (r13 == 0) goto L_0x021d
                r13.close()
            L_0x021d:
                T r13 = r6.element
                java.io.BufferedReader r13 = (java.io.BufferedReader) r13
                if (r13 == 0) goto L_0x0226
                r13.close()
            L_0x0226:
                throw r0
            L_0x0227:
                r13 = move-exception
                r0 = r13
                kotlinx.coroutines.h2 r13 = kotlinx.coroutines.C15186a1.m93731c()
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$b r3 = new com.arlosoft.macrodroid.filehandler.FileHandlerProxy$a$b
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r5 = r12.this$0
                r3.<init>(r5, r2)
                r12.L$0 = r0
                r12.label = r4
                java.lang.Object r13 = kotlinx.coroutines.C15414h.m94298g(r13, r3, r12)
                if (r13 != r1) goto L_0x023f
                return r1
            L_0x023f:
                com.google.firebase.crashlytics.FirebaseCrashlytics r13 = com.google.firebase.crashlytics.FirebaseCrashlytics.m6487a()
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to import macro from file: "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                r13.mo22936d(r1)
                com.arlosoft.macrodroid.filehandler.FileHandlerProxy r13 = r12.this$0
                r13.finish()
                ja.u r13 = p297ja.C13339u.f61331a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.filehandler.FileHandlerProxy.C4675a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String action;
        super.onCreate(bundle);
        setContentView((int) C17535R$layout.activity_launcher);
        Intent intent = getIntent();
        boolean z = true;
        if (intent == null || (action = intent.getAction()) == null || !action.equals("android.intent.action.VIEW")) {
            z = false;
        }
        if (z && getIntent().getData() != null) {
            Uri data = getIntent().getData();
            C13706o.m87926c(data);
            String uri = data.toString();
            C13706o.m87928e(uri, "uri.toString()");
            if (C15176v.m93640u(uri, ".mdr", false, 2, (Object) null)) {
                getIntent().setClassName(this, "com.arlosoft.macrodroid.ExportImportActivity");
                startActivity(getIntent());
                finish();
                return;
            }
            C15561w1 unused = C15473j.m94492d(LifecycleOwnerKt.getLifecycleScope(this), C15186a1.m93730b(), (C15486m0) null, new C4675a(data, this, (C13635d<? super C4675a>) null), 2, (Object) null);
        }
    }
}
