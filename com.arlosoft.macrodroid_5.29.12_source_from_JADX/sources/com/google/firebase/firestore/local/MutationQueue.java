package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.protobuf.ByteString;
import java.util.List;

interface MutationQueue {
    /* renamed from: a */
    void mo62668a();

    /* renamed from: b */
    List<MutationBatch> mo62669b(Iterable<DocumentKey> iterable);

    @Nullable
    /* renamed from: c */
    MutationBatch mo62670c(int i);

    @Nullable
    /* renamed from: d */
    MutationBatch mo62671d(int i);

    /* renamed from: e */
    ByteString mo62672e();

    /* renamed from: f */
    void mo62673f(MutationBatch mutationBatch, ByteString byteString);

    /* renamed from: g */
    MutationBatch mo62674g(Timestamp timestamp, List<Mutation> list, List<Mutation> list2);

    /* renamed from: h */
    List<MutationBatch> mo62675h(DocumentKey documentKey);

    /* renamed from: i */
    void mo62676i(ByteString byteString);

    /* renamed from: j */
    int mo62677j();

    /* renamed from: k */
    void mo62678k(MutationBatch mutationBatch);

    /* renamed from: l */
    List<MutationBatch> mo62679l(Query query);

    /* renamed from: m */
    List<MutationBatch> mo62680m();

    void start();
}
