package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

public final class MessagingClientEvent {

    /* renamed from: p */
    private static final MessagingClientEvent f55110p = new Builder().mo63471a();

    /* renamed from: a */
    private final long f55111a;

    /* renamed from: b */
    private final String f55112b;

    /* renamed from: c */
    private final String f55113c;

    /* renamed from: d */
    private final MessageType f55114d;

    /* renamed from: e */
    private final SDKPlatform f55115e;

    /* renamed from: f */
    private final String f55116f;

    /* renamed from: g */
    private final String f55117g;

    /* renamed from: h */
    private final int f55118h;

    /* renamed from: i */
    private final int f55119i;

    /* renamed from: j */
    private final String f55120j;

    /* renamed from: k */
    private final long f55121k;

    /* renamed from: l */
    private final Event f55122l;

    /* renamed from: m */
    private final String f55123m;

    /* renamed from: n */
    private final long f55124n;

    /* renamed from: o */
    private final String f55125o;

    public static final class Builder {

        /* renamed from: a */
        private long f55126a = 0;

        /* renamed from: b */
        private String f55127b = "";

        /* renamed from: c */
        private String f55128c = "";

        /* renamed from: d */
        private MessageType f55129d = MessageType.UNKNOWN;

        /* renamed from: e */
        private SDKPlatform f55130e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        private String f55131f = "";

        /* renamed from: g */
        private String f55132g = "";

        /* renamed from: h */
        private int f55133h = 0;

        /* renamed from: i */
        private int f55134i = 0;

        /* renamed from: j */
        private String f55135j = "";

        /* renamed from: k */
        private long f55136k = 0;

        /* renamed from: l */
        private Event f55137l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f55138m = "";

        /* renamed from: n */
        private long f55139n = 0;

        /* renamed from: o */
        private String f55140o = "";

        Builder() {
        }

        /* renamed from: a */
        public MessagingClientEvent mo63471a() {
            return new MessagingClientEvent(this.f55126a, this.f55127b, this.f55128c, this.f55129d, this.f55130e, this.f55131f, this.f55132g, this.f55133h, this.f55134i, this.f55135j, this.f55136k, this.f55137l, this.f55138m, this.f55139n, this.f55140o);
        }

        /* renamed from: b */
        public Builder mo63472b(String str) {
            this.f55138m = str;
            return this;
        }

        /* renamed from: c */
        public Builder mo63473c(String str) {
            this.f55132g = str;
            return this;
        }

        /* renamed from: d */
        public Builder mo63474d(String str) {
            this.f55140o = str;
            return this;
        }

        /* renamed from: e */
        public Builder mo63475e(Event event) {
            this.f55137l = event;
            return this;
        }

        /* renamed from: f */
        public Builder mo63476f(String str) {
            this.f55128c = str;
            return this;
        }

        /* renamed from: g */
        public Builder mo63477g(String str) {
            this.f55127b = str;
            return this;
        }

        /* renamed from: h */
        public Builder mo63478h(MessageType messageType) {
            this.f55129d = messageType;
            return this;
        }

        /* renamed from: i */
        public Builder mo63479i(String str) {
            this.f55131f = str;
            return this;
        }

        /* renamed from: j */
        public Builder mo63480j(long j) {
            this.f55126a = j;
            return this;
        }

        /* renamed from: k */
        public Builder mo63481k(SDKPlatform sDKPlatform) {
            this.f55130e = sDKPlatform;
            return this;
        }

        /* renamed from: l */
        public Builder mo63482l(String str) {
            this.f55135j = str;
            return this;
        }

        /* renamed from: m */
        public Builder mo63483m(int i) {
            this.f55134i = i;
            return this;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private Event(int i) {
            this.number_ = i;
        }

        /* renamed from: c */
        public int mo19517c() {
            return this.number_;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private MessageType(int i) {
            this.number_ = i;
        }

        /* renamed from: c */
        public int mo19517c() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private SDKPlatform(int i) {
            this.number_ = i;
        }

        /* renamed from: c */
        public int mo19517c() {
            return this.number_;
        }
    }

    MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f55111a = j;
        this.f55112b = str;
        this.f55113c = str2;
        this.f55114d = messageType;
        this.f55115e = sDKPlatform;
        this.f55116f = str3;
        this.f55117g = str4;
        this.f55118h = i;
        this.f55119i = i2;
        this.f55120j = str5;
        this.f55121k = j2;
        this.f55122l = event;
        this.f55123m = str6;
        this.f55124n = j3;
        this.f55125o = str7;
    }

    /* renamed from: p */
    public static Builder m77112p() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    /* renamed from: a */
    public String mo63456a() {
        return this.f55123m;
    }

    @Protobuf(tag = 11)
    /* renamed from: b */
    public long mo63457b() {
        return this.f55121k;
    }

    @Protobuf(tag = 14)
    /* renamed from: c */
    public long mo63458c() {
        return this.f55124n;
    }

    @Protobuf(tag = 7)
    /* renamed from: d */
    public String mo63459d() {
        return this.f55117g;
    }

    @Protobuf(tag = 15)
    /* renamed from: e */
    public String mo63460e() {
        return this.f55125o;
    }

    @Protobuf(tag = 12)
    /* renamed from: f */
    public Event mo63461f() {
        return this.f55122l;
    }

    @Protobuf(tag = 3)
    /* renamed from: g */
    public String mo63462g() {
        return this.f55113c;
    }

    @Protobuf(tag = 2)
    /* renamed from: h */
    public String mo63463h() {
        return this.f55112b;
    }

    @Protobuf(tag = 4)
    /* renamed from: i */
    public MessageType mo63464i() {
        return this.f55114d;
    }

    @Protobuf(tag = 6)
    /* renamed from: j */
    public String mo63465j() {
        return this.f55116f;
    }

    @Protobuf(tag = 8)
    /* renamed from: k */
    public int mo63466k() {
        return this.f55118h;
    }

    @Protobuf(tag = 1)
    /* renamed from: l */
    public long mo63467l() {
        return this.f55111a;
    }

    @Protobuf(tag = 5)
    /* renamed from: m */
    public SDKPlatform mo63468m() {
        return this.f55115e;
    }

    @Protobuf(tag = 10)
    /* renamed from: n */
    public String mo63469n() {
        return this.f55120j;
    }

    @Protobuf(tag = 9)
    /* renamed from: o */
    public int mo63470o() {
        return this.f55119i;
    }
}
