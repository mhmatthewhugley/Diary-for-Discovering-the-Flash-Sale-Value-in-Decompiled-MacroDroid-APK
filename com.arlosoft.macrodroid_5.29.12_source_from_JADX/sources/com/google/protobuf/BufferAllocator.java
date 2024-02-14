package com.google.protobuf;

import java.nio.ByteBuffer;

abstract class BufferAllocator {

    /* renamed from: a */
    private static final BufferAllocator f56615a = new BufferAllocator() {
        /* renamed from: a */
        public AllocatedBuffer mo64904a(int i) {
            return AllocatedBuffer.m79318i(ByteBuffer.allocateDirect(i));
        }

        /* renamed from: b */
        public AllocatedBuffer mo64905b(int i) {
            return AllocatedBuffer.m79319j(new byte[i]);
        }
    };

    BufferAllocator() {
    }

    /* renamed from: a */
    public abstract AllocatedBuffer mo64904a(int i);

    /* renamed from: b */
    public abstract AllocatedBuffer mo64905b(int i);
}
