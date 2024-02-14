package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    /* renamed from: A */
    void mo64813A(int i, long j) throws IOException;

    /* renamed from: B */
    void mo64855B(int i, boolean z) throws IOException;

    /* renamed from: C */
    void mo64814C(int i, int i2) throws IOException;

    @Deprecated
    /* renamed from: D */
    void mo64856D(int i) throws IOException;

    /* renamed from: E */
    void mo64815E(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: F */
    void mo64817F(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: G */
    void mo64819G(int i, List<Boolean> list, boolean z) throws IOException;

    /* renamed from: H */
    <K, V> void mo64820H(int i, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) throws IOException;

    /* renamed from: I */
    void mo64821I(int i, float f) throws IOException;

    @Deprecated
    /* renamed from: J */
    void mo64858J(int i) throws IOException;

    /* renamed from: K */
    void mo64822K(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: L */
    void mo64823L(int i, int i2) throws IOException;

    /* renamed from: M */
    void mo64824M(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: N */
    void mo64825N(int i, List<Double> list, boolean z) throws IOException;

    /* renamed from: O */
    void mo64861O(int i, int i2) throws IOException;

    /* renamed from: P */
    void mo64826P(int i, List<ByteString> list) throws IOException;

    /* renamed from: a */
    void mo64832a(int i, List<?> list, Schema schema) throws IOException;

    /* renamed from: b */
    void mo64834b(int i, List<Float> list, boolean z) throws IOException;

    /* renamed from: c */
    void mo64836c(int i, Object obj) throws IOException;

    /* renamed from: d */
    void mo64865d(int i, int i2) throws IOException;

    /* renamed from: e */
    void mo64837e(int i, List<String> list) throws IOException;

    /* renamed from: f */
    void mo64866f(int i, String str) throws IOException;

    /* renamed from: g */
    void mo64867g(int i, long j) throws IOException;

    /* renamed from: h */
    void mo64839h(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    /* renamed from: i */
    void mo64868i(int i, Object obj, Schema schema) throws IOException;

    /* renamed from: j */
    void mo64869j(int i, ByteString byteString) throws IOException;

    /* renamed from: k */
    void mo64870k(int i, int i2) throws IOException;

    /* renamed from: l */
    void mo64841l(int i, long j) throws IOException;

    /* renamed from: m */
    void mo64842m(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: n */
    void mo64843n(int i, List<Integer> list, boolean z) throws IOException;

    /* renamed from: o */
    void mo64844o(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: p */
    void mo64871p(int i, long j) throws IOException;

    /* renamed from: q */
    void mo64846q(int i, List<Integer> list, boolean z) throws IOException;

    @Deprecated
    /* renamed from: r */
    void mo64847r(int i, List<?> list, Schema schema) throws IOException;

    /* renamed from: s */
    void mo64872s(int i, int i2) throws IOException;

    /* renamed from: t */
    void mo64848t(int i, double d) throws IOException;

    /* renamed from: u */
    void mo64850u(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: v */
    void mo64851v(int i, List<Long> list, boolean z) throws IOException;

    /* renamed from: w */
    void mo64873w(int i, Object obj, Schema schema) throws IOException;

    /* renamed from: x */
    void mo64874x(int i, long j) throws IOException;

    /* renamed from: y */
    FieldOrder mo64853y();

    /* renamed from: z */
    void mo64875z(int i, Object obj) throws IOException;
}
