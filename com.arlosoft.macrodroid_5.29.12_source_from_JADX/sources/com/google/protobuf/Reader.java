package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.io.IOException;
import java.util.List;
import java.util.Map;

interface Reader {
    @Deprecated
    /* renamed from: A */
    <T> T mo64766A(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: B */
    void mo64767B(List<Long> list) throws IOException;

    /* renamed from: C */
    void mo64768C(List<Integer> list) throws IOException;

    /* renamed from: D */
    void mo64769D(List<Integer> list) throws IOException;

    /* renamed from: E */
    long mo64770E() throws IOException;

    /* renamed from: F */
    String mo64771F() throws IOException;

    /* renamed from: G */
    int mo64772G() throws IOException;

    /* renamed from: H */
    void mo64773H(List<String> list) throws IOException;

    /* renamed from: I */
    <T> T mo64774I(Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: J */
    void mo64775J(List<Float> list) throws IOException;

    /* renamed from: K */
    boolean mo64776K() throws IOException;

    /* renamed from: L */
    int mo64777L() throws IOException;

    /* renamed from: M */
    void mo64778M(List<ByteString> list) throws IOException;

    /* renamed from: N */
    void mo64779N(List<Double> list) throws IOException;

    /* renamed from: O */
    long mo64780O() throws IOException;

    /* renamed from: P */
    String mo64781P() throws IOException;

    /* renamed from: a */
    int mo64782a();

    /* renamed from: b */
    long mo64784b() throws IOException;

    /* renamed from: c */
    void mo64786c(List<Integer> list) throws IOException;

    /* renamed from: d */
    void mo64787d(List<Long> list) throws IOException;

    @Deprecated
    /* renamed from: e */
    <T> void mo64789e(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: f */
    boolean mo64790f() throws IOException;

    /* renamed from: g */
    <T> void mo64791g(List<T> list, Schema<T> schema, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: h */
    long mo64792h() throws IOException;

    /* renamed from: i */
    void mo64793i(List<Long> list) throws IOException;

    /* renamed from: j */
    int mo64794j() throws IOException;

    /* renamed from: k */
    void mo64795k(List<Long> list) throws IOException;

    /* renamed from: l */
    void mo64796l(List<Integer> list) throws IOException;

    /* renamed from: m */
    int mo64797m() throws IOException;

    /* renamed from: n */
    int mo64798n() throws IOException;

    /* renamed from: o */
    void mo64799o(List<Boolean> list) throws IOException;

    @Deprecated
    /* renamed from: p */
    <T> T mo64800p(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: q */
    <K, V> void mo64801q(Map<K, V> map, MapEntryLite.Metadata<K, V> metadata, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: r */
    void mo64802r(List<String> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* renamed from: s */
    ByteString mo64805s() throws IOException;

    /* renamed from: t */
    int mo64806t() throws IOException;

    /* renamed from: u */
    void mo64807u(List<Long> list) throws IOException;

    /* renamed from: v */
    void mo64808v(List<Integer> list) throws IOException;

    /* renamed from: w */
    long mo64809w() throws IOException;

    /* renamed from: x */
    void mo64810x(List<Integer> list) throws IOException;

    /* renamed from: y */
    <T> T mo64811y(Class<T> cls, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    /* renamed from: z */
    int mo64812z() throws IOException;
}
