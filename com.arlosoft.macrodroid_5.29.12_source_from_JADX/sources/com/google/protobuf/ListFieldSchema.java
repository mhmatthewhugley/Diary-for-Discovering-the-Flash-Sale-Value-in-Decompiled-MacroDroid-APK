package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Collections;
import java.util.List;

abstract class ListFieldSchema {

    /* renamed from: a */
    private static final ListFieldSchema f56985a = new ListFieldSchemaFull();

    /* renamed from: b */
    private static final ListFieldSchema f56986b = new ListFieldSchemaLite();

    private static final class ListFieldSchemaFull extends ListFieldSchema {

        /* renamed from: c */
        private static final Class<?> f56987c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m80823f(Object obj, long j) {
            return (List) UnsafeUtil.m81360F(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.LazyStringArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> m80824g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m80823f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.protobuf.LazyStringList
                if (r1 == 0) goto L_0x0014
                com.google.protobuf.LazyStringArrayList r0 = new com.google.protobuf.LazyStringArrayList
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L_0x0024
                com.google.protobuf.Internal$ProtobufList r0 = (com.google.protobuf.Internal.ProtobufList) r0
                com.google.protobuf.Internal$ProtobufList r6 = r0.mo64901q1(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.protobuf.UnsafeUtil.m81376V(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f56987c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.UnsafeUtil.m81376V(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.protobuf.UnmodifiableLazyStringList
                if (r1 == 0) goto L_0x0062
                com.google.protobuf.LazyStringArrayList r1 = new com.google.protobuf.LazyStringArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.UnmodifiableLazyStringList r0 = (com.google.protobuf.UnmodifiableLazyStringList) r0
                r1.addAll(r0)
                com.google.protobuf.UnsafeUtil.m81376V(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.protobuf.PrimitiveNonBoxingCollection
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.protobuf.Internal.ProtobufList
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.protobuf.Internal$ProtobufList r1 = (com.google.protobuf.Internal.ProtobufList) r1
                boolean r2 = r1.mo64749c1()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.Internal$ProtobufList r0 = r1.mo64901q1(r0)
                com.google.protobuf.UnsafeUtil.m81376V(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.ListFieldSchema.ListFieldSchemaFull.m80824g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo65301c(Object obj, long j) {
            Object obj2;
            List list = (List) UnsafeUtil.m81360F(obj, j);
            if (list instanceof LazyStringList) {
                obj2 = ((LazyStringList) list).mo65271L();
            } else if (!f56987c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof PrimitiveNonBoxingCollection) || !(list instanceof Internal.ProtobufList)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.mo64749c1()) {
                        protobufList.mo64743U();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            UnsafeUtil.m81376V(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo65302d(Object obj, Object obj2, long j) {
            List f = m80823f(obj2, j);
            List g = m80824g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            UnsafeUtil.m81376V(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo65303e(Object obj, long j) {
            return m80824g(obj, j, 10);
        }
    }

    private static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        /* renamed from: f */
        static <E> Internal.ProtobufList<E> m80828f(Object obj, long j) {
            return (Internal.ProtobufList) UnsafeUtil.m81360F(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo65301c(Object obj, long j) {
            m80828f(obj, j).mo64743U();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo65302d(Object obj, Object obj2, long j) {
            Internal.ProtobufList f = m80828f(obj, j);
            Internal.ProtobufList f2 = m80828f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo64749c1()) {
                    f = f.mo64901q1(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            UnsafeUtil.m81376V(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo65303e(Object obj, long j) {
            Internal.ProtobufList f = m80828f(obj, j);
            if (f.mo64749c1()) {
                return f;
            }
            int size = f.size();
            Internal.ProtobufList q1 = f.mo64901q1(size == 0 ? 10 : size * 2);
            UnsafeUtil.m81376V(obj, j, q1);
            return q1;
        }
    }

    private ListFieldSchema() {
    }

    /* renamed from: a */
    static ListFieldSchema m80818a() {
        return f56985a;
    }

    /* renamed from: b */
    static ListFieldSchema m80819b() {
        return f56986b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo65301c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo65302d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo65303e(Object obj, long j);
}
