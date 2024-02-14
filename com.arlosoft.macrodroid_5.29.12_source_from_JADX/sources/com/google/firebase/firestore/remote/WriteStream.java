package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firestore.p228v1.FirestoreGrpc;
import com.google.firestore.p228v1.WriteRequest;
import com.google.firestore.p228v1.WriteResponse;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteStream extends AbstractStream<WriteRequest, WriteResponse, Callback> {

    /* renamed from: s */
    public static final ByteString f54711s = ByteString.f56619a;

    /* renamed from: p */
    private final RemoteSerializer f54712p;

    /* renamed from: q */
    protected boolean f54713q = false;

    /* renamed from: r */
    private ByteString f54714r = f54711s;

    public interface Callback extends Stream.StreamCallback {
        /* renamed from: c */
        void mo63095c(SnapshotVersion snapshotVersion, List<MutationResult> list);

        /* renamed from: e */
        void mo63096e();
    }

    WriteStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        super(firestoreChannel, FirestoreGrpc.m77867c(), asyncQueue, AsyncQueue.TimerId.WRITE_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.WRITE_STREAM_IDLE, callback);
        this.f54712p = remoteSerializer;
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ void mo62992i() {
        super.mo62992i();
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ boolean mo62993j() {
        return super.mo62993j();
    }

    /* renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo62994k() {
        return super.mo62994k();
    }

    /* renamed from: q */
    public void mo62997q() {
        this.f54713q = false;
        super.mo62997q();
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo62998r() {
        super.mo62998r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo62999s() {
        if (this.f54713q) {
            mo63147z(Collections.emptyList());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public ByteString mo63142u() {
        return this.f54714r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo63143v() {
        return this.f54713q;
    }

    /* renamed from: w */
    public void mo62996n(WriteResponse writeResponse) {
        this.f54714r = writeResponse.mo63962W();
        if (!this.f54713q) {
            this.f54713q = true;
            ((Callback) this.f54529k).mo63096e();
            return;
        }
        this.f54528j.mo63182e();
        SnapshotVersion w = this.f54712p.mo63077w(writeResponse.mo63961U());
        int Y = writeResponse.mo63964Y();
        ArrayList arrayList = new ArrayList(Y);
        for (int i = 0; i < Y; i++) {
            arrayList.add(this.f54712p.mo63073n(writeResponse.mo63963X(i), w));
        }
        ((Callback) this.f54529k).mo63095c(w, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo63145x(ByteString byteString) {
        this.f54714r = (ByteString) Preconditions.m76513b(byteString);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo63146y() {
        Assert.m76443d(mo62993j(), "Writing handshake requires an opened stream", new Object[0]);
        Assert.m76443d(!this.f54713q, "Handshake already completed", new Object[0]);
        mo63000t((WriteRequest) WriteRequest.m78257a0().mo63959O(this.f54712p.mo63067a()).build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo63147z(List<Mutation> list) {
        Assert.m76443d(mo62993j(), "Writing mutations requires an opened stream", new Object[0]);
        Assert.m76443d(this.f54713q, "Handshake must be complete before writing mutations", new Object[0]);
        WriteRequest.Builder a0 = WriteRequest.m78257a0();
        for (Mutation K : list) {
            a0.mo63958N(this.f54712p.mo63060K(K));
        }
        a0.mo63960P(this.f54714r);
        mo63000t((WriteRequest) a0.build());
    }
}
