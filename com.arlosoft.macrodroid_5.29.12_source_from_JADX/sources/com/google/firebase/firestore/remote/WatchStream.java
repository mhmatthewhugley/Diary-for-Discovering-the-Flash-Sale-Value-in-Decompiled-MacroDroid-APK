package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firestore.p228v1.FirestoreGrpc;
import com.google.firestore.p228v1.ListenRequest;
import com.google.firestore.p228v1.ListenResponse;
import com.google.protobuf.ByteString;
import java.util.Map;

public class WatchStream extends AbstractStream<ListenRequest, ListenResponse, Callback> {

    /* renamed from: q */
    public static final ByteString f54709q = ByteString.f56619a;

    /* renamed from: p */
    private final RemoteSerializer f54710p;

    interface Callback extends Stream.StreamCallback {
        /* renamed from: d */
        void mo63094d(SnapshotVersion snapshotVersion, WatchChange watchChange);
    }

    WatchStream(FirestoreChannel firestoreChannel, AsyncQueue asyncQueue, RemoteSerializer remoteSerializer, Callback callback) {
        super(firestoreChannel, FirestoreGrpc.m77866b(), asyncQueue, AsyncQueue.TimerId.LISTEN_STREAM_CONNECTION_BACKOFF, AsyncQueue.TimerId.LISTEN_STREAM_IDLE, callback);
        this.f54710p = remoteSerializer;
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
    public /* bridge */ /* synthetic */ void mo62997q() {
        super.mo62997q();
    }

    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo62998r() {
        super.mo62998r();
    }

    /* renamed from: u */
    public void mo62996n(ListenResponse listenResponse) {
        this.f54528j.mo63182e();
        WatchChange y = this.f54710p.mo63079y(listenResponse);
        ((Callback) this.f54529k).mo63094d(this.f54710p.mo63078x(listenResponse), y);
    }

    /* renamed from: v */
    public void mo63140v(int i) {
        Assert.m76443d(mo62993j(), "Unwatching targets requires an open stream", new Object[0]);
        mo63000t((ListenRequest) ListenRequest.m77899b0().mo63823P(this.f54710p.mo63067a()).mo63824R(i).build());
    }

    /* renamed from: w */
    public void mo63141w(TargetData targetData) {
        Assert.m76443d(mo62993j(), "Watching queries requires an open stream", new Object[0]);
        ListenRequest.Builder O = ListenRequest.m77899b0().mo63823P(this.f54710p.mo63067a()).mo63822O(this.f54710p.mo63062Q(targetData));
        Map<String, String> J = this.f54710p.mo63059J(targetData);
        if (J != null) {
            O.mo63821N(J);
        }
        mo63000t((ListenRequest) O.build());
    }
}
