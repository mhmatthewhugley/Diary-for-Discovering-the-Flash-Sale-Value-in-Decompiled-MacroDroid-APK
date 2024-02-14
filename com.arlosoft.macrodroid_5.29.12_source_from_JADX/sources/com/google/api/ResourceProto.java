package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class ResourceProto {

    /* renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FieldOptions, ResourceReference> f52146a;

    /* renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.FileOptions, List<ResourceDescriptor>> f52147b;

    /* renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MessageOptions, ResourceDescriptor> f52148c;

    static {
        DescriptorProtos.FieldOptions V = DescriptorProtos.FieldOptions.m80431V();
        ResourceReference U = ResourceReference.m71450U();
        ResourceReference U2 = ResourceReference.m71450U();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f52146a = GeneratedMessageLite.m80635K(V, U, U2, (Internal.EnumLiteMap<?>) null, 1055, fieldType, ResourceReference.class);
        f52147b = GeneratedMessageLite.m80634J(DescriptorProtos.FileOptions.m80450V(), ResourceDescriptor.m71442U(), (Internal.EnumLiteMap<?>) null, 1053, fieldType, false, ResourceDescriptor.class);
        f52148c = GeneratedMessageLite.m80635K(DescriptorProtos.MessageOptions.m80463V(), ResourceDescriptor.m71442U(), ResourceDescriptor.m71442U(), (Internal.EnumLiteMap<?>) null, 1053, fieldType, ResourceDescriptor.class);
    }

    private ResourceProto() {
    }
}
