package com.google.api;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.List;

public final class ClientProto {

    /* renamed from: a */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.MethodOptions, List<String>> f52028a;

    /* renamed from: b */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.ServiceOptions, String> f52029b;

    /* renamed from: c */
    public static final GeneratedMessageLite.GeneratedExtension<DescriptorProtos.ServiceOptions, String> f52030c;

    static {
        DescriptorProtos.MethodOptions V = DescriptorProtos.MethodOptions.m80468V();
        WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
        f52028a = GeneratedMessageLite.m80634J(V, (MessageLite) null, (Internal.EnumLiteMap<?>) null, 1051, fieldType, false, String.class);
        WireFormat.FieldType fieldType2 = fieldType;
        f52029b = GeneratedMessageLite.m80635K(DescriptorProtos.ServiceOptions.m80483V(), "", (MessageLite) null, (Internal.EnumLiteMap<?>) null, 1049, fieldType2, String.class);
        f52030c = GeneratedMessageLite.m80635K(DescriptorProtos.ServiceOptions.m80483V(), "", (MessageLite) null, (Internal.EnumLiteMap<?>) null, 1050, fieldType2, String.class);
    }

    private ClientProto() {
    }
}
