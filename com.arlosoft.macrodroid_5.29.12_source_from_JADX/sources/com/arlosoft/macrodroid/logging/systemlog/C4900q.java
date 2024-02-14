package com.arlosoft.macrodroid.logging.systemlog;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.arlosoft.macrodroid.C17528R$color;
import com.arlosoft.macrodroid.database.room.C4402h;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.jvm.internal.C13656d;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.q */
/* compiled from: SystemLogHelper.kt */
public final class C4900q {

    /* renamed from: a */
    private final Context f12321a;

    /* renamed from: b */
    private final MacroDroidRoomDatabase f12322b;

    /* renamed from: c */
    private final SimpleDateFormat f12323c = new SimpleDateFormat("dd-MM-yy HH:mm:ss", Locale.getDefault());

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.q$a */
    /* compiled from: SystemLogHelper.kt */
    public /* synthetic */ class C4901a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12324a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12325b;

        static {
            int[] iArr = new int[C4402h.values().length];
            iArr[C4402h.TRIGGER.ordinal()] = 1;
            iArr[C4402h.ACTION.ordinal()] = 2;
            iArr[C4402h.CONSTRAINT.ordinal()] = 3;
            iArr[C4402h.LOCAL_VARIABLE.ordinal()] = 4;
            iArr[C4402h.GLOBAL_VARIABLE.ordinal()] = 5;
            f12324a = iArr;
            int[] iArr2 = new int[C4403i.values().length];
            iArr2[C4403i.VERBOSE.ordinal()] = 1;
            iArr2[C4403i.WARNING.ordinal()] = 2;
            iArr2[C4403i.ERROR.ordinal()] = 3;
            iArr2[C4403i.DEBUG.ordinal()] = 4;
            f12325b = iArr2;
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.q$b */
    /* compiled from: SystemLogHelper.kt */
    static final class C4902b extends C13656d {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C4900q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4902b(C4900q qVar, C13635d<? super C4902b> dVar) {
            super(dVar);
            this.this$0 = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo29495a(false, (C4403i) null, this);
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.q$c */
    /* compiled from: SystemLogHelper.kt */
    static final class C4903c extends C13656d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C4900q this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4903c(C4900q qVar, C13635d<? super C4903c> dVar) {
            super(dVar);
            this.this$0 = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo29496b((C4403i) null, this);
        }
    }

    public C4900q(Context context, MacroDroidRoomDatabase macroDroidRoomDatabase) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(macroDroidRoomDatabase, "roomDatabase");
        this.f12321a = context;
        this.f12322b = macroDroidRoomDatabase;
    }

    /* renamed from: c */
    private final String m18947c(C4402h hVar) {
        int i = C4901a.f12324a[hVar.ordinal()];
        return i != 1 ? i != 2 ? "" : "A: " : "T: ";
    }

    /* renamed from: d */
    private final String m18948d(SystemLogEntry systemLogEntry, boolean z) {
        if (systemLogEntry.mo28690f() != 0) {
            Macro Q = C4934n.m18998M().mo29682Q(systemLogEntry.mo28690f());
            if (Q == null) {
                return "";
            }
            if (z) {
                return " <font color=\"" + m18951g(ContextCompat.getColor(this.f12321a, C17528R$color.log_text_macro_name)) + "\"><u>" + Q.getName() + "</u></font>";
            }
            return " (" + Q.getName() + ')';
        } else if (systemLogEntry.mo28694i() == null) {
            return "";
        } else {
            if (z) {
                return " (<a href=\"" + systemLogEntry.mo28694i() + "\">" + systemLogEntry.mo28694i() + "</a>)";
            }
            return " (" + systemLogEntry.mo28694i() + ')';
        }
    }

    /* renamed from: e */
    private final int m18949e(SystemLogEntry systemLogEntry) {
        int i = C4901a.f12324a[systemLogEntry.mo28683a().ordinal()];
        if (i == 1) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_text_trigger);
        }
        if (i == 2) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_text_action);
        }
        if (i == 3) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_text_action_constraint_fail);
        }
        if (i == 4 || i == 5) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_variable);
        }
        return m18950f(systemLogEntry);
    }

    /* renamed from: f */
    private final int m18950f(SystemLogEntry systemLogEntry) {
        int i = C4901a.f12325b[systemLogEntry.mo28686d().ordinal()];
        if (i == 1) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_detailed);
        }
        if (i == 2) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_text_warning);
        }
        if (i == 3) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.log_text_error);
        }
        if (i != 4) {
            return ContextCompat.getColor(this.f12321a, C17528R$color.default_text_color);
        }
        return ContextCompat.getColor(this.f12321a, C17528R$color.log_debug);
    }

    /* renamed from: g */
    private final String m18951g(int i) {
        return String.format("#%06X", new Object[]{Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK)});
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075 A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078 A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fd A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x016d A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0194 A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x019e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo29495a(boolean r11, com.arlosoft.macrodroid.database.room.C4403i r12, kotlin.coroutines.C13635d<? super java.lang.String> r13) {
        /*
            r10 = this;
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            boolean r1 = r13 instanceof com.arlosoft.macrodroid.logging.systemlog.C4900q.C4902b
            if (r1 == 0) goto L_0x0015
            r1 = r13
            com.arlosoft.macrodroid.logging.systemlog.q$b r1 = (com.arlosoft.macrodroid.logging.systemlog.C4900q.C4902b) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001a
        L_0x0015:
            com.arlosoft.macrodroid.logging.systemlog.q$b r1 = new com.arlosoft.macrodroid.logging.systemlog.q$b
            r1.<init>(r10, r13)
        L_0x001a:
            java.lang.Object r13 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003e
            if (r3 != r5) goto L_0x0036
            boolean r11 = r1.Z$0
            java.lang.Object r12 = r1.L$1
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.L$0
            com.arlosoft.macrodroid.logging.systemlog.q r1 = (com.arlosoft.macrodroid.logging.systemlog.C4900q) r1
            p297ja.C13332o.m85685b(r13)     // Catch:{ Exception -> 0x01ca }
            goto L_0x0071
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003e:
            p297ja.C13332o.m85685b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca }
            r13.<init>()     // Catch:{ Exception -> 0x01ca }
            android.content.Context r3 = r10.f12321a     // Catch:{ Exception -> 0x01ca }
            java.io.File r3 = r3.getExternalFilesDir(r4)     // Catch:{ Exception -> 0x01ca }
            r13.append(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "/MacroDroidLog.html"
            r13.append(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x01ca }
            com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r3 = r10.f12322b     // Catch:{ Exception -> 0x01ca }
            com.arlosoft.macrodroid.database.room.s r3 = r3.mo28681g()     // Catch:{ Exception -> 0x01ca }
            r1.L$0 = r10     // Catch:{ Exception -> 0x01ca }
            r1.L$1 = r13     // Catch:{ Exception -> 0x01ca }
            r1.Z$0 = r11     // Catch:{ Exception -> 0x01ca }
            r1.label = r5     // Catch:{ Exception -> 0x01ca }
            java.lang.Object r12 = r3.mo28777b(r12, r1)     // Catch:{ Exception -> 0x01ca }
            if (r12 != r2) goto L_0x006d
            return r2
        L_0x006d:
            r1 = r10
            r9 = r13
            r13 = r12
            r12 = r9
        L_0x0071:
            java.util.List r13 = (java.util.List) r13     // Catch:{ Exception -> 0x01ca }
            if (r11 == 0) goto L_0x0078
            java.lang.String r11 = "#222222"
            goto L_0x007a
        L_0x0078:
            java.lang.String r11 = "#FFFFFF"
        L_0x007a:
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x01ca }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01ca }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ca }
            r6.<init>(r12)     // Catch:{ Exception -> 0x01ca }
            r3.<init>(r6)     // Catch:{ Exception -> 0x01ca }
            r2.<init>(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "<html>\n"
            java.nio.charset.Charset r6 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x01ca }
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "<head>\n"
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "<style type=\"text/css\">\n"
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "p {margin-bottom: 0.2em; margin-top: 0.2em;}\n"
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "</style>\n"
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = "</head>\n"
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca }
            r3.<init>()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r7 = "<body style=\"background-color:"
            r3.append(r7)     // Catch:{ Exception -> 0x01ca }
            r3.append(r11)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r11 = ";font-family: sans-serif;margin: 0\">\n"
            r3.append(r11)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r11 = r3.toString()     // Catch:{ Exception -> 0x01ca }
            byte[] r11 = r11.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r11)     // Catch:{ Exception -> 0x01ca }
            java.util.Iterator r11 = r13.iterator()     // Catch:{ Exception -> 0x01ca }
        L_0x00f7:
            boolean r13 = r11.hasNext()     // Catch:{ Exception -> 0x01ca }
            if (r13 == 0) goto L_0x01ac
            java.lang.Object r13 = r11.next()     // Catch:{ Exception -> 0x01ca }
            com.arlosoft.macrodroid.database.room.SystemLogEntry r13 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r13     // Catch:{ Exception -> 0x01ca }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ca }
            r3.<init>()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r6 = "<p style=\"color:"
            r3.append(r6)     // Catch:{ Exception -> 0x01ca }
            int r6 = r1.m18949e(r13)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r6 = r1.m18951g(r6)     // Catch:{ Exception -> 0x01ca }
            r3.append(r6)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r6 = "\">"
            r3.append(r6)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01ca }
            java.nio.charset.Charset r6 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x01ca }
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.text.SimpleDateFormat r3 = r1.f12323c     // Catch:{ Exception -> 0x01ca }
            long r7 = r13.mo28691g()     // Catch:{ Exception -> 0x01ca }
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.C13654b.m87835c(r7)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = r3.format(r7)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r7 = "logDateTimeFormat.format(it.timeStamp)"
            kotlin.jvm.internal.C13706o.m87928e(r3, r7)     // Catch:{ Exception -> 0x01ca }
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = " - "
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            com.arlosoft.macrodroid.database.room.h r3 = r13.mo28683a()     // Catch:{ Exception -> 0x01ca }
            java.lang.String r3 = r1.m18947c(r3)     // Catch:{ Exception -> 0x01ca }
            r7 = 0
            if (r3 == 0) goto L_0x016a
            int r8 = r3.length()     // Catch:{ Exception -> 0x01ca }
            if (r8 != 0) goto L_0x0168
            goto L_0x016a
        L_0x0168:
            r8 = 0
            goto L_0x016b
        L_0x016a:
            r8 = 1
        L_0x016b:
            if (r8 != 0) goto L_0x0177
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
        L_0x0177:
            java.lang.String r3 = r13.mo28688e()     // Catch:{ Exception -> 0x01ca }
            byte[] r3 = r3.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r3, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r3)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r13 = r1.m18948d(r13, r5)     // Catch:{ Exception -> 0x01ca }
            if (r13 == 0) goto L_0x0191
            int r3 = r13.length()     // Catch:{ Exception -> 0x01ca }
            if (r3 != 0) goto L_0x0192
        L_0x0191:
            r7 = 1
        L_0x0192:
            if (r7 != 0) goto L_0x019e
            byte[] r13 = r13.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r13, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r13)     // Catch:{ Exception -> 0x01ca }
        L_0x019e:
            java.lang.String r13 = "</p>\n"
            byte[] r13 = r13.getBytes(r6)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r13, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r13)     // Catch:{ Exception -> 0x01ca }
            goto L_0x00f7
        L_0x01ac:
            java.lang.String r11 = "</body>\n"
            java.nio.charset.Charset r13 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x01ca }
            byte[] r11 = r11.getBytes(r13)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r11)     // Catch:{ Exception -> 0x01ca }
            java.lang.String r11 = "</html>\n"
            byte[] r11 = r11.getBytes(r13)     // Catch:{ Exception -> 0x01ca }
            kotlin.jvm.internal.C13706o.m87928e(r11, r0)     // Catch:{ Exception -> 0x01ca }
            r2.write(r11)     // Catch:{ Exception -> 0x01ca }
            r2.close()     // Catch:{ Exception -> 0x01ca }
            return r12
        L_0x01ca:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Failed to output system log file: "
            r13.append(r0)
            java.lang.String r11 = r11.getMessage()
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            p148q0.C8151a.m33873n(r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.systemlog.C4900q.mo29495a(boolean, com.arlosoft.macrodroid.database.room.i, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[Catch:{ Exception -> 0x00dd }, LOOP:0: B:21:0x0080->B:23:0x0086, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo29496b(com.arlosoft.macrodroid.database.room.C4403i r10, kotlin.coroutines.C13635d<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.arlosoft.macrodroid.logging.systemlog.C4900q.C4903c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.arlosoft.macrodroid.logging.systemlog.q$c r0 = (com.arlosoft.macrodroid.logging.systemlog.C4900q.C4903c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.arlosoft.macrodroid.logging.systemlog.q$c r0 = new com.arlosoft.macrodroid.logging.systemlog.q$c
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C13652d.m87832c()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r4) goto L_0x0032
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r0.L$0
            com.arlosoft.macrodroid.logging.systemlog.q r0 = (com.arlosoft.macrodroid.logging.systemlog.C4900q) r0
            p297ja.C13332o.m85685b(r11)     // Catch:{ Exception -> 0x00dd }
            goto L_0x006b
        L_0x0032:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003a:
            p297ja.C13332o.m85685b(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r11.<init>()     // Catch:{ Exception -> 0x00dd }
            android.content.Context r2 = r9.f12321a     // Catch:{ Exception -> 0x00dd }
            java.io.File r2 = r2.getExternalFilesDir(r3)     // Catch:{ Exception -> 0x00dd }
            r11.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "/MacroDroidLog.txt"
            r11.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.MacroDroidRoomDatabase r2 = r9.f12322b     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.s r2 = r2.mo28681g()     // Catch:{ Exception -> 0x00dd }
            r0.L$0 = r9     // Catch:{ Exception -> 0x00dd }
            r0.L$1 = r11     // Catch:{ Exception -> 0x00dd }
            r0.label = r4     // Catch:{ Exception -> 0x00dd }
            java.lang.Object r10 = r2.mo28777b(r10, r0)     // Catch:{ Exception -> 0x00dd }
            if (r10 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L_0x006b:
            java.util.List r11 = (java.util.List) r11     // Catch:{ Exception -> 0x00dd }
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00dd }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00dd }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x00dd }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00dd }
            r2.<init>(r4)     // Catch:{ Exception -> 0x00dd }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x00dd }
        L_0x0080:
            boolean r2 = r11.hasNext()     // Catch:{ Exception -> 0x00dd }
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.SystemLogEntry r2 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r2     // Catch:{ Exception -> 0x00dd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dd }
            r4.<init>()     // Catch:{ Exception -> 0x00dd }
            java.text.SimpleDateFormat r5 = r0.f12323c     // Catch:{ Exception -> 0x00dd }
            long r6 = r2.mo28691g()     // Catch:{ Exception -> 0x00dd }
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.C13654b.m87835c(r6)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = r5.format(r6)     // Catch:{ Exception -> 0x00dd }
            r4.append(r5)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = " - "
            r4.append(r5)     // Catch:{ Exception -> 0x00dd }
            com.arlosoft.macrodroid.database.room.h r5 = r2.mo28683a()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = r0.m18947c(r5)     // Catch:{ Exception -> 0x00dd }
            r4.append(r5)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r5 = r2.mo28688e()     // Catch:{ Exception -> 0x00dd }
            r4.append(r5)     // Catch:{ Exception -> 0x00dd }
            r5 = 0
            java.lang.String r2 = r0.m18948d(r2, r5)     // Catch:{ Exception -> 0x00dd }
            r4.append(r2)     // Catch:{ Exception -> 0x00dd }
            r2 = 10
            r4.append(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00dd }
            java.nio.charset.Charset r4 = kotlin.text.C15147d.f64349b     // Catch:{ Exception -> 0x00dd }
            byte[] r2 = r2.getBytes(r4)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C13706o.m87928e(r2, r4)     // Catch:{ Exception -> 0x00dd }
            r1.write(r2)     // Catch:{ Exception -> 0x00dd }
            goto L_0x0080
        L_0x00d9:
            r1.close()     // Catch:{ Exception -> 0x00dd }
            return r10
        L_0x00dd:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to output system log file: "
            r0.append(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            p148q0.C8151a.m33873n(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.systemlog.C4900q.mo29496b(com.arlosoft.macrodroid.database.room.i, kotlin.coroutines.d):java.lang.Object");
    }
}
