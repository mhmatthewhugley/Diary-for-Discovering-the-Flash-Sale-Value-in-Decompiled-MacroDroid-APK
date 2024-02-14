package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.List;
import p292io.grpc.C12537b1;

public abstract class WatchChange {

    public static final class DocumentChange extends WatchChange {

        /* renamed from: a */
        private final List<Integer> f54687a;

        /* renamed from: b */
        private final List<Integer> f54688b;

        /* renamed from: c */
        private final DocumentKey f54689c;
        @Nullable

        /* renamed from: d */
        private final MutableDocument f54690d;

        public DocumentChange(List<Integer> list, List<Integer> list2, DocumentKey documentKey, @Nullable MutableDocument mutableDocument) {
            super();
            this.f54687a = list;
            this.f54688b = list2;
            this.f54689c = documentKey;
            this.f54690d = mutableDocument;
        }

        /* renamed from: a */
        public DocumentKey mo63116a() {
            return this.f54689c;
        }

        @Nullable
        /* renamed from: b */
        public MutableDocument mo63117b() {
            return this.f54690d;
        }

        /* renamed from: c */
        public List<Integer> mo63118c() {
            return this.f54688b;
        }

        /* renamed from: d */
        public List<Integer> mo63119d() {
            return this.f54687a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || DocumentChange.class != obj.getClass()) {
                return false;
            }
            DocumentChange documentChange = (DocumentChange) obj;
            if (!this.f54687a.equals(documentChange.f54687a) || !this.f54688b.equals(documentChange.f54688b) || !this.f54689c.equals(documentChange.f54689c)) {
                return false;
            }
            MutableDocument mutableDocument = this.f54690d;
            MutableDocument mutableDocument2 = documentChange.f54690d;
            if (mutableDocument != null) {
                return mutableDocument.equals(mutableDocument2);
            }
            if (mutableDocument2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f54687a.hashCode() * 31) + this.f54688b.hashCode()) * 31) + this.f54689c.hashCode()) * 31;
            MutableDocument mutableDocument = this.f54690d;
            return hashCode + (mutableDocument != null ? mutableDocument.hashCode() : 0);
        }

        public String toString() {
            return "DocumentChange{updatedTargetIds=" + this.f54687a + ", removedTargetIds=" + this.f54688b + ", key=" + this.f54689c + ", newDocument=" + this.f54690d + '}';
        }
    }

    public static final class ExistenceFilterWatchChange extends WatchChange {

        /* renamed from: a */
        private final int f54691a;

        /* renamed from: b */
        private final ExistenceFilter f54692b;

        public ExistenceFilterWatchChange(int i, ExistenceFilter existenceFilter) {
            super();
            this.f54691a = i;
            this.f54692b = existenceFilter;
        }

        /* renamed from: a */
        public ExistenceFilter mo63123a() {
            return this.f54692b;
        }

        /* renamed from: b */
        public int mo63124b() {
            return this.f54691a;
        }

        public String toString() {
            return "ExistenceFilterWatchChange{targetId=" + this.f54691a + ", existenceFilter=" + this.f54692b + '}';
        }
    }

    public static final class WatchTargetChange extends WatchChange {

        /* renamed from: a */
        private final WatchTargetChangeType f54693a;

        /* renamed from: b */
        private final List<Integer> f54694b;

        /* renamed from: c */
        private final ByteString f54695c;
        @Nullable

        /* renamed from: d */
        private final C12537b1 f54696d;

        public WatchTargetChange(WatchTargetChangeType watchTargetChangeType, List<Integer> list, ByteString byteString, @Nullable C12537b1 b1Var) {
            super();
            Assert.m76443d(b1Var == null || watchTargetChangeType == WatchTargetChangeType.Removed, "Got cause for a target change that was not a removal", new Object[0]);
            this.f54693a = watchTargetChangeType;
            this.f54694b = list;
            this.f54695c = byteString;
            if (b1Var == null || b1Var.mo69064o()) {
                this.f54696d = null;
            } else {
                this.f54696d = b1Var;
            }
        }

        @Nullable
        /* renamed from: a */
        public C12537b1 mo63126a() {
            return this.f54696d;
        }

        /* renamed from: b */
        public WatchTargetChangeType mo63127b() {
            return this.f54693a;
        }

        /* renamed from: c */
        public ByteString mo63128c() {
            return this.f54695c;
        }

        /* renamed from: d */
        public List<Integer> mo63129d() {
            return this.f54694b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WatchTargetChange.class != obj.getClass()) {
                return false;
            }
            WatchTargetChange watchTargetChange = (WatchTargetChange) obj;
            if (this.f54693a != watchTargetChange.f54693a || !this.f54694b.equals(watchTargetChange.f54694b) || !this.f54695c.equals(watchTargetChange.f54695c)) {
                return false;
            }
            C12537b1 b1Var = this.f54696d;
            if (b1Var != null) {
                if (watchTargetChange.f54696d == null || !b1Var.mo69062m().equals(watchTargetChange.f54696d.mo69062m())) {
                    return false;
                }
                return true;
            } else if (watchTargetChange.f54696d == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            int hashCode = ((((this.f54693a.hashCode() * 31) + this.f54694b.hashCode()) * 31) + this.f54695c.hashCode()) * 31;
            C12537b1 b1Var = this.f54696d;
            return hashCode + (b1Var != null ? b1Var.mo69062m().hashCode() : 0);
        }

        public String toString() {
            return "WatchTargetChange{changeType=" + this.f54693a + ", targetIds=" + this.f54694b + '}';
        }
    }

    public enum WatchTargetChangeType {
        NoChange,
        Added,
        Removed,
        Current,
        Reset
    }

    private WatchChange() {
    }
}
