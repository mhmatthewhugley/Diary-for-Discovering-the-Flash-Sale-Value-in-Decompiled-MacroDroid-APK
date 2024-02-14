package com.google.firebase.firestore.local;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.bundle.BundledQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.NoDocument;
import com.google.firebase.firestore.proto.Target;
import com.google.firebase.firestore.proto.UnknownDocument;
import com.google.firebase.firestore.proto.WriteBatch;
import com.google.firebase.firestore.remote.RemoteSerializer;
import com.google.firebase.firestore.util.Assert;
import com.google.firestore.bundle.BundledQuery;
import com.google.firestore.p228v1.Document;
import com.google.firestore.p228v1.DocumentTransform;
import com.google.firestore.p228v1.Target;
import com.google.firestore.p228v1.Write;
import com.google.protobuf.ByteString;
import java.util.ArrayList;

public final class LocalSerializer {

    /* renamed from: a */
    private final RemoteSerializer f54176a;

    /* renamed from: com.google.firebase.firestore.local.LocalSerializer$1 */
    static /* synthetic */ class C112201 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54177a;

        /* renamed from: b */
        static final /* synthetic */ int[] f54178b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.google.firebase.firestore.proto.Target$TargetTypeCase[] r0 = com.google.firebase.firestore.proto.Target.TargetTypeCase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54178b = r0
                r1 = 1
                com.google.firebase.firestore.proto.Target$TargetTypeCase r2 = com.google.firebase.firestore.proto.Target.TargetTypeCase.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f54178b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.proto.Target$TargetTypeCase r3 = com.google.firebase.firestore.proto.Target.TargetTypeCase.QUERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase[] r2 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f54177a = r2
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r3 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f54177a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r2 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.NO_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f54177a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.firestore.proto.MaybeDocument$DocumentTypeCase r1 = com.google.firebase.firestore.proto.MaybeDocument.DocumentTypeCase.UNKNOWN_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.local.LocalSerializer.C112201.<clinit>():void");
        }
    }

    public LocalSerializer(RemoteSerializer remoteSerializer) {
        this.f54176a = remoteSerializer;
    }

    /* renamed from: b */
    private MutableDocument m75315b(Document document, boolean z) {
        MutableDocument p = MutableDocument.m75871p(this.f54176a.mo63070j(document.mo63782a0()), this.f54176a.mo63077w(document.mo63783b0()), ObjectValue.m75893g(document.mo63781Y()));
        return z ? p.mo62859t() : p;
    }

    /* renamed from: e */
    private MutableDocument m75316e(NoDocument noDocument, boolean z) {
        MutableDocument r = MutableDocument.m75873r(this.f54176a.mo63070j(noDocument.mo62957X()), this.f54176a.mo63077w(noDocument.mo62958Y()));
        return z ? r.mo62859t() : r;
    }

    /* renamed from: g */
    private MutableDocument m75317g(UnknownDocument unknownDocument) {
        return MutableDocument.m75874s(this.f54176a.mo63070j(unknownDocument.mo62977X()), this.f54176a.mo63077w(unknownDocument.mo62978Y()));
    }

    /* renamed from: i */
    private Document m75318i(MutableDocument mutableDocument) {
        Document.Builder e0 = Document.m77789e0();
        e0.mo63785O(this.f54176a.mo63058H(mutableDocument.getKey()));
        e0.mo63784N(mutableDocument.getData().mo62869l());
        e0.mo63786P(this.f54176a.mo63063R(mutableDocument.getVersion().mo62876d()));
        return (Document) e0.build();
    }

    /* renamed from: l */
    private NoDocument m75319l(MutableDocument mutableDocument) {
        NoDocument.Builder Z = NoDocument.m76041Z();
        Z.mo62959N(this.f54176a.mo63058H(mutableDocument.getKey()));
        Z.mo62960O(this.f54176a.mo63063R(mutableDocument.getVersion().mo62876d()));
        return (NoDocument) Z.build();
    }

    /* renamed from: n */
    private UnknownDocument m75320n(MutableDocument mutableDocument) {
        UnknownDocument.Builder Z = UnknownDocument.m76092Z();
        Z.mo62979N(this.f54176a.mo63058H(mutableDocument.getKey()));
        Z.mo62980O(this.f54176a.mo63063R(mutableDocument.getVersion().mo62876d()));
        return (UnknownDocument) Z.build();
    }

    /* renamed from: a */
    public BundledQuery mo62596a(com.google.firestore.bundle.BundledQuery bundledQuery) {
        Query.LimitType limitType;
        if (bundledQuery.mo63753X().equals(BundledQuery.LimitType.FIRST)) {
            limitType = Query.LimitType.LIMIT_TO_FIRST;
        } else {
            limitType = Query.LimitType.LIMIT_TO_LAST;
        }
        return new com.google.firebase.firestore.bundle.BundledQuery(this.f54176a.mo63075s(bundledQuery.mo63754Y(), bundledQuery.mo63755Z()), limitType);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public MutableDocument mo62597c(MaybeDocument maybeDocument) {
        int i = C112201.f54177a[maybeDocument.mo62949Z().ordinal()];
        if (i == 1) {
            return m75315b(maybeDocument.mo62948Y(), maybeDocument.mo62950a0());
        }
        if (i == 2) {
            return m75316e(maybeDocument.mo62951b0(), maybeDocument.mo62950a0());
        }
        if (i == 3) {
            return m75317g(maybeDocument.mo62952c0());
        }
        throw Assert.m76440a("Unknown MaybeDocument %s", maybeDocument);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public MutationBatch mo62598d(WriteBatch writeBatch) {
        int e0 = writeBatch.mo62983e0();
        Timestamp u = this.f54176a.mo63076u(writeBatch.mo62984f0());
        int d0 = writeBatch.mo62982d0();
        ArrayList arrayList = new ArrayList(d0);
        for (int i = 0; i < d0; i++) {
            arrayList.add(this.f54176a.mo63072m(writeBatch.mo62981c0(i)));
        }
        ArrayList arrayList2 = new ArrayList(writeBatch.mo62986h0());
        int i2 = 0;
        while (i2 < writeBatch.mo62986h0()) {
            Write g0 = writeBatch.mo62985g0(i2);
            int i3 = i2 + 1;
            if (i3 < writeBatch.mo62986h0() && writeBatch.mo62985g0(i3).mo63949l0()) {
                Assert.m76443d(writeBatch.mo62985g0(i2).mo63950m0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                Write.Builder p0 = Write.m78224p0(g0);
                for (DocumentTransform.FieldTransform N : writeBatch.mo62985g0(i3).mo63943f0().mo63798V()) {
                    p0.mo63952N(N);
                }
                arrayList2.add(this.f54176a.mo63072m((Write) p0.build()));
                i2 = i3;
            } else {
                arrayList2.add(this.f54176a.mo63072m(g0));
            }
            i2++;
        }
        return new MutationBatch(e0, u, arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public TargetData mo62599f(Target target) {
        com.google.firebase.firestore.core.Target target2;
        int j0 = target.mo62967j0();
        SnapshotVersion w = this.f54176a.mo63077w(target.mo62966i0());
        SnapshotVersion w2 = this.f54176a.mo63077w(target.mo62962e0());
        ByteString h0 = target.mo62965h0();
        long f0 = target.mo62963f0();
        int i = C112201.f54178b[target.mo62968k0().ordinal()];
        if (i == 1) {
            target2 = this.f54176a.mo63068d(target.mo62961d0());
        } else if (i == 2) {
            target2 = this.f54176a.mo63074r(target.mo62964g0());
        } else {
            throw Assert.m76440a("Unknown targetType %d", target.mo62968k0());
        }
        return new TargetData(target2, j0, f0, QueryPurpose.LISTEN, w, w2, h0);
    }

    /* renamed from: h */
    public com.google.firestore.bundle.BundledQuery mo62600h(com.google.firebase.firestore.bundle.BundledQuery bundledQuery) {
        BundledQuery.LimitType limitType;
        Target.QueryTarget O = this.f54176a.mo63061O(bundledQuery.mo23792b());
        BundledQuery.Builder a0 = com.google.firestore.bundle.BundledQuery.m77694a0();
        if (bundledQuery.mo23791a().equals(Query.LimitType.LIMIT_TO_FIRST)) {
            limitType = BundledQuery.LimitType.FIRST;
        } else {
            limitType = BundledQuery.LimitType.LAST;
        }
        a0.mo63756N(limitType);
        a0.mo63757O(O.mo63905X());
        a0.mo63758P(O.mo63906Y());
        return (com.google.firestore.bundle.BundledQuery) a0.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public MaybeDocument mo62601j(MutableDocument mutableDocument) {
        MaybeDocument.Builder d0 = MaybeDocument.m76018d0();
        if (mutableDocument.mo62821d()) {
            d0.mo62955P(m75319l(mutableDocument));
        } else if (mutableDocument.mo62822e()) {
            d0.mo62953N(m75318i(mutableDocument));
        } else if (mutableDocument.mo62857n()) {
            d0.mo62956R(m75320n(mutableDocument));
        } else {
            throw Assert.m76440a("Cannot encode invalid document %s", mutableDocument);
        }
        d0.mo62954O(mutableDocument.mo62818a());
        return (MaybeDocument) d0.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public WriteBatch mo62602k(MutationBatch mutationBatch) {
        WriteBatch.Builder i0 = WriteBatch.m76109i0();
        i0.mo62989P(mutationBatch.mo62914e());
        i0.mo62990R(this.f54176a.mo63063R(mutationBatch.mo62917g()));
        for (Mutation K : mutationBatch.mo62913d()) {
            i0.mo62987N(this.f54176a.mo63060K(K));
        }
        for (Mutation K2 : mutationBatch.mo62918h()) {
            i0.mo62988O(this.f54176a.mo63060K(K2));
        }
        return (WriteBatch) i0.build();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public com.google.firebase.firestore.proto.Target mo62603m(TargetData targetData) {
        QueryPurpose queryPurpose = QueryPurpose.LISTEN;
        Assert.m76443d(queryPurpose.equals(targetData.mo62782b()), "Only queries with purpose %s may be stored, got %s", queryPurpose, targetData.mo62782b());
        Target.Builder l0 = com.google.firebase.firestore.proto.Target.m76059l0();
        l0.mo62976V(targetData.mo62788g()).mo62972R(targetData.mo62784d()).mo62971P(this.f54176a.mo63065T(targetData.mo62781a())).mo62975U(this.f54176a.mo63065T(targetData.mo62785e())).mo62974T(targetData.mo62783c());
        com.google.firebase.firestore.core.Target f = targetData.mo62787f();
        if (f.mo23963j()) {
            l0.mo62970O(this.f54176a.mo63057C(f));
        } else {
            l0.mo62973S(this.f54176a.mo63061O(f));
        }
        return (com.google.firebase.firestore.proto.Target) l0.build();
    }
}
