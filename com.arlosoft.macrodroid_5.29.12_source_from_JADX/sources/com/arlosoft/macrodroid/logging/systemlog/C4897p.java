package com.arlosoft.macrodroid.logging.systemlog;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.arlosoft.macrodroid.database.room.SystemLogEntry;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15415h0;
import p139o1.C8022q0;

/* renamed from: com.arlosoft.macrodroid.logging.systemlog.p */
/* compiled from: SystemLogAdapter.kt */
public final class C4897p extends PagingDataAdapter<SystemLogEntry, C4904r> {

    /* renamed from: e */
    public static final C4899b f12315e = new C4899b((C13695i) null);

    /* renamed from: f */
    private static final DiffUtil.ItemCallback<SystemLogEntry> f12316f = new C4898a();

    /* renamed from: a */
    private final C4876a f12317a;

    /* renamed from: b */
    private final boolean f12318b;

    /* renamed from: c */
    private boolean f12319c;

    /* renamed from: d */
    private int f12320d;

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.p$a */
    /* compiled from: SystemLogAdapter.kt */
    public static final class C4898a extends DiffUtil.ItemCallback<SystemLogEntry> {
        C4898a() {
        }

        /* renamed from: a */
        public boolean areContentsTheSame(SystemLogEntry systemLogEntry, SystemLogEntry systemLogEntry2) {
            C13706o.m87929f(systemLogEntry, "oldItem");
            C13706o.m87929f(systemLogEntry2, "newItem");
            return C13706o.m87924a(systemLogEntry, systemLogEntry2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(SystemLogEntry systemLogEntry, SystemLogEntry systemLogEntry2) {
            C13706o.m87929f(systemLogEntry, "oldItem");
            C13706o.m87929f(systemLogEntry2, "newItem");
            return systemLogEntry.mo28685c() == systemLogEntry2.mo28685c();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.logging.systemlog.p$b */
    /* compiled from: SystemLogAdapter.kt */
    public static final class C4899b {
        private C4899b() {
        }

        public /* synthetic */ C4899b(C13695i iVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4897p(C4876a aVar, boolean z, boolean z2) {
        super(f12316f, (C15415h0) null, (C15415h0) null, 6, (C13695i) null);
        C13706o.m87929f(aVar, "macroMovementMethod");
        this.f12317a = aVar;
        this.f12318b = z;
        this.f12319c = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (r1.compareTo(r9) > 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r1.compareTo(r9) < 0) goto L_0x005b;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.arlosoft.macrodroid.logging.systemlog.C4904r r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C13706o.m87929f(r8, r0)
            java.lang.Object r0 = r7.getItem(r9)
            r2 = r0
            com.arlosoft.macrodroid.database.room.SystemLogEntry r2 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r2
            if (r2 == 0) goto L_0x00b9
            r0 = 0
            r4 = 0
            boolean r1 = r7.f12319c
            r3 = 1
            if (r1 != 0) goto L_0x005d
            if (r9 != 0) goto L_0x0032
            oe.e r9 = p352oe.C15861e.m95542r0()
            long r5 = r2.mo28691g()
            oe.e r1 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            boolean r9 = kotlin.jvm.internal.C13706o.m87924a(r9, r1)
            if (r9 != 0) goto L_0x00af
            long r0 = r2.mo28691g()
            oe.e r9 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r0)
            goto L_0x007e
        L_0x0032:
            if (r9 <= r3) goto L_0x00af
            int r9 = r9 - r3
            java.lang.Object r9 = r7.getItem(r9)
            com.arlosoft.macrodroid.database.room.SystemLogEntry r9 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r9
            if (r9 == 0) goto L_0x00af
            long r5 = r9.mo28691g()
            oe.e r9 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            long r5 = r2.mo28691g()
            oe.e r1 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            int r3 = r9.compareTo(r1)
            if (r3 <= 0) goto L_0x0055
        L_0x0053:
            r0 = r1
            goto L_0x00af
        L_0x0055:
            int r1 = r1.compareTo(r9)
            if (r1 <= 0) goto L_0x00af
        L_0x005b:
            r0 = r9
            goto L_0x00af
        L_0x005d:
            int r1 = r7.getItemCount()
            int r1 = r1 - r3
            if (r9 != r1) goto L_0x0080
            oe.e r9 = p352oe.C15861e.m95542r0()
            long r5 = r2.mo28691g()
            oe.e r1 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            boolean r9 = kotlin.jvm.internal.C13706o.m87924a(r9, r1)
            if (r9 != 0) goto L_0x00af
            long r0 = r2.mo28691g()
            oe.e r9 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r0)
        L_0x007e:
            r3 = r9
            goto L_0x00b0
        L_0x0080:
            int r1 = r7.getItemCount()
            int r1 = r1 + -2
            if (r9 >= r1) goto L_0x00af
            int r9 = r9 + r3
            java.lang.Object r9 = r7.getItem(r9)
            com.arlosoft.macrodroid.database.room.SystemLogEntry r9 = (com.arlosoft.macrodroid.database.room.SystemLogEntry) r9
            if (r9 == 0) goto L_0x00af
            long r5 = r9.mo28691g()
            oe.e r9 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            long r5 = r2.mo28691g()
            oe.e r1 = com.arlosoft.macrodroid.extensions.C4658e.m18119b(r5)
            int r3 = r9.compareTo(r1)
            if (r3 >= 0) goto L_0x00a8
            goto L_0x0053
        L_0x00a8:
            int r1 = r1.compareTo(r9)
            if (r1 >= 0) goto L_0x00af
            goto L_0x005b
        L_0x00af:
            r3 = r0
        L_0x00b0:
            int r9 = r7.f12320d
            float r5 = (float) r9
            boolean r6 = r7.f12318b
            r1 = r8
            r1.mo29497t(r2, r3, r4, r5, r6)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.logging.systemlog.C4897p.onBindViewHolder(com.arlosoft.macrodroid.logging.systemlog.r, int):void");
    }

    /* renamed from: C */
    public C4904r onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8022q0 c = C8022q0.m33400c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C4904r(c, this.f12317a);
    }

    /* renamed from: D */
    public final void mo29491D(boolean z) {
        this.f12319c = z;
        notifyDataSetChanged();
    }

    /* renamed from: E */
    public final void mo29492E(int i) {
        this.f12320d = i;
        notifyDataSetChanged();
    }
}
