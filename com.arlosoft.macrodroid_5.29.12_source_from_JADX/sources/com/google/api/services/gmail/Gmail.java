package com.google.api.services.gmail;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Key;
import com.google.api.client.util.Preconditions;
import com.google.api.services.gmail.model.AutoForwarding;
import com.google.api.services.gmail.model.Draft;
import com.google.api.services.gmail.model.Filter;
import com.google.api.services.gmail.model.ForwardingAddress;
import com.google.api.services.gmail.model.ImapSettings;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListDraftsResponse;
import com.google.api.services.gmail.model.ListFiltersResponse;
import com.google.api.services.gmail.model.ListForwardingAddressesResponse;
import com.google.api.services.gmail.model.ListHistoryResponse;
import com.google.api.services.gmail.model.ListLabelsResponse;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.ListSendAsResponse;
import com.google.api.services.gmail.model.ListSmimeInfoResponse;
import com.google.api.services.gmail.model.ListThreadsResponse;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePartBody;
import com.google.api.services.gmail.model.PopSettings;
import com.google.api.services.gmail.model.Profile;
import com.google.api.services.gmail.model.Thread;
import com.google.api.services.gmail.model.VacationSettings;
import com.google.api.services.gmail.model.WatchResponse;
import java.io.IOException;
import java.math.BigInteger;

public class Gmail extends AbstractGoogleJsonClient {

    public static final class Builder extends AbstractGoogleJsonClient.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory, HttpRequestInitializer httpRequestInitializer) {
            super(httpTransport, jsonFactory, "https://www.googleapis.com/", "gmail/v1/users/", httpRequestInitializer, false);
            mo60803j("batch/gmail/v1");
        }

        /* renamed from: h */
        public Gmail mo60801h() {
            return new Gmail(this);
        }

        /* renamed from: i */
        public Builder mo60802i(String str) {
            return (Builder) super.mo60325e(str);
        }

        /* renamed from: j */
        public Builder mo60803j(String str) {
            return (Builder) super.mo60311b(str);
        }

        /* renamed from: k */
        public Builder mo60326f(String str) {
            return (Builder) super.mo60312c(str);
        }

        /* renamed from: l */
        public Builder mo60327g(String str) {
            return (Builder) super.mo60313d(str);
        }
    }

    public class Users {

        public class Drafts {

            public class Create extends GmailRequest<Draft> {
                @Key
                private String userId;

                /* renamed from: v */
                public Create mo60807u(String str, Object obj) {
                    return (Create) super.mo60078d(str, obj);
                }
            }

            public class Delete extends GmailRequest<Void> {
                @Key

                /* renamed from: id */
                private String f52859id;
                @Key
                private String userId;

                /* renamed from: v */
                public Delete mo60807u(String str, Object obj) {
                    return (Delete) super.mo60330s(str, obj);
                }
            }

            public class Get extends GmailRequest<Draft> {
                @Key
                private String format;
                @Key

                /* renamed from: id */
                private String f52860id;
                @Key
                private String userId;

                /* renamed from: v */
                public Get mo60807u(String str, Object obj) {
                    return (Get) super.mo60330s(str, obj);
                }
            }

            public class List extends GmailRequest<ListDraftsResponse> {
                @Key
                private Boolean includeSpamTrash;
                @Key
                private Long maxResults;
                @Key
                private String pageToken;
                @Key

                /* renamed from: q */
                private String f52861q;
                @Key
                private String userId;

                /* renamed from: v */
                public List mo60807u(String str, Object obj) {
                    return (List) super.mo60330s(str, obj);
                }
            }

            public class Send extends GmailRequest<Message> {
                @Key
                private String userId;

                /* renamed from: v */
                public Send mo60807u(String str, Object obj) {
                    return (Send) super.mo60330s(str, obj);
                }
            }

            public class Update extends GmailRequest<Draft> {
                @Key

                /* renamed from: id */
                private String f52862id;
                @Key
                private String userId;

                /* renamed from: v */
                public Update mo60807u(String str, Object obj) {
                    return (Update) super.mo60330s(str, obj);
                }
            }
        }

        public class GetProfile extends GmailRequest<Profile> {
            @Key
            private String userId;

            /* renamed from: v */
            public GetProfile mo60807u(String str, Object obj) {
                return (GetProfile) super.mo60330s(str, obj);
            }
        }

        public class History {

            public class List extends GmailRequest<ListHistoryResponse> {
                @Key
                private java.util.List<String> historyTypes;
                @Key
                private String labelId;
                @Key
                private Long maxResults;
                @Key
                private String pageToken;
                @Key
                private BigInteger startHistoryId;
                @Key
                private String userId;

                /* renamed from: v */
                public List mo60807u(String str, Object obj) {
                    return (List) super.mo60330s(str, obj);
                }
            }
        }

        public class Labels {

            public class Create extends GmailRequest<Label> {
                @Key
                private String userId;

                /* renamed from: v */
                public Create mo60807u(String str, Object obj) {
                    return (Create) super.mo60330s(str, obj);
                }
            }

            public class Delete extends GmailRequest<Void> {
                @Key

                /* renamed from: id */
                private String f52863id;
                @Key
                private String userId;

                /* renamed from: v */
                public Delete mo60807u(String str, Object obj) {
                    return (Delete) super.mo60330s(str, obj);
                }
            }

            public class Get extends GmailRequest<Label> {
                @Key

                /* renamed from: id */
                private String f52864id;
                @Key
                private String userId;

                /* renamed from: v */
                public Get mo60807u(String str, Object obj) {
                    return (Get) super.mo60330s(str, obj);
                }
            }

            public class List extends GmailRequest<ListLabelsResponse> {
                @Key
                private String userId;

                /* renamed from: v */
                public List mo60807u(String str, Object obj) {
                    return (List) super.mo60330s(str, obj);
                }
            }

            public class Patch extends GmailRequest<Label> {
                @Key

                /* renamed from: id */
                private String f52865id;
                @Key
                private String userId;

                /* renamed from: v */
                public Patch mo60807u(String str, Object obj) {
                    return (Patch) super.mo60330s(str, obj);
                }
            }

            public class Update extends GmailRequest<Label> {
                @Key

                /* renamed from: id */
                private String f52866id;
                @Key
                private String userId;

                /* renamed from: v */
                public Update mo60807u(String str, Object obj) {
                    return (Update) super.mo60330s(str, obj);
                }
            }
        }

        public class Messages {

            public class Attachments {

                public class Get extends GmailRequest<MessagePartBody> {
                    @Key

                    /* renamed from: id */
                    private String f52868id;
                    @Key
                    private String messageId;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Get mo60807u(String str, Object obj) {
                        return (Get) super.mo60330s(str, obj);
                    }
                }
            }

            public class BatchDelete extends GmailRequest<Void> {
                @Key
                private String userId;

                /* renamed from: v */
                public BatchDelete mo60807u(String str, Object obj) {
                    return (BatchDelete) super.mo60330s(str, obj);
                }
            }

            public class BatchModify extends GmailRequest<Void> {
                @Key
                private String userId;

                /* renamed from: v */
                public BatchModify mo60807u(String str, Object obj) {
                    return (BatchModify) super.mo60330s(str, obj);
                }
            }

            public class Delete extends GmailRequest<Void> {
                @Key

                /* renamed from: id */
                private String f52869id;
                @Key
                private String userId;

                /* renamed from: v */
                public Delete mo60807u(String str, Object obj) {
                    return (Delete) super.mo60330s(str, obj);
                }
            }

            public class Get extends GmailRequest<Message> {
                @Key
                private String format;
                @Key

                /* renamed from: id */
                private String f52870id;
                @Key
                private java.util.List<String> metadataHeaders;
                @Key
                private String userId;

                /* renamed from: v */
                public Get mo60807u(String str, Object obj) {
                    return (Get) super.mo60330s(str, obj);
                }
            }

            public class GmailImport extends GmailRequest<Message> {
                @Key
                private Boolean deleted;
                @Key
                private String internalDateSource;
                @Key
                private Boolean neverMarkSpam;
                @Key
                private Boolean processForCalendar;
                @Key
                private String userId;

                /* renamed from: v */
                public GmailImport mo60807u(String str, Object obj) {
                    return (GmailImport) super.mo60330s(str, obj);
                }
            }

            public class Insert extends GmailRequest<Message> {
                @Key
                private Boolean deleted;
                @Key
                private String internalDateSource;
                @Key
                private String userId;

                /* renamed from: v */
                public Insert mo60807u(String str, Object obj) {
                    return (Insert) super.mo60330s(str, obj);
                }
            }

            public class List extends GmailRequest<ListMessagesResponse> {
                @Key
                private Boolean includeSpamTrash;
                @Key
                private java.util.List<String> labelIds;
                @Key
                private Long maxResults;
                @Key
                private String pageToken;
                @Key

                /* renamed from: q */
                private String f52871q;
                @Key
                private String userId;

                /* renamed from: v */
                public List mo60807u(String str, Object obj) {
                    return (List) super.mo60330s(str, obj);
                }
            }

            public class Modify extends GmailRequest<Message> {
                @Key

                /* renamed from: id */
                private String f52872id;
                @Key
                private String userId;

                /* renamed from: v */
                public Modify mo60807u(String str, Object obj) {
                    return (Modify) super.mo60330s(str, obj);
                }
            }

            public class Send extends GmailRequest<Message> {
                @Key
                private String userId;

                protected Send(String str, Message message) {
                    super(Gmail.this, "POST", "{userId}/messages/send", message, Message.class);
                    this.userId = (String) Preconditions.m72717e(str, "Required parameter userId must be specified.");
                    mo60315g(message, "content");
                    mo60315g(message.mo60924l(), "Message.getRaw()");
                }

                /* renamed from: v */
                public Send mo60807u(String str, Object obj) {
                    return (Send) super.mo60330s(str, obj);
                }
            }

            public class Trash extends GmailRequest<Message> {
                @Key

                /* renamed from: id */
                private String f52874id;
                @Key
                private String userId;

                /* renamed from: v */
                public Trash mo60807u(String str, Object obj) {
                    return (Trash) super.mo60330s(str, obj);
                }
            }

            public class Untrash extends GmailRequest<Message> {
                @Key

                /* renamed from: id */
                private String f52875id;
                @Key
                private String userId;

                /* renamed from: v */
                public Untrash mo60807u(String str, Object obj) {
                    return (Untrash) super.mo60330s(str, obj);
                }
            }

            public Messages() {
            }

            /* renamed from: a */
            public Send mo60822a(String str, Message message) throws IOException {
                Send send = new Send(str, message);
                Gmail.this.mo60309g(send);
                return send;
            }
        }

        public class Settings {

            public class Filters {

                public class Create extends GmailRequest<Filter> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Create mo60807u(String str, Object obj) {
                        return (Create) super.mo60330s(str, obj);
                    }
                }

                public class Delete extends GmailRequest<Void> {
                    @Key

                    /* renamed from: id */
                    private String f52876id;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Delete mo60807u(String str, Object obj) {
                        return (Delete) super.mo60330s(str, obj);
                    }
                }

                public class Get extends GmailRequest<Filter> {
                    @Key

                    /* renamed from: id */
                    private String f52877id;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Get mo60807u(String str, Object obj) {
                        return (Get) super.mo60330s(str, obj);
                    }
                }

                public class List extends GmailRequest<ListFiltersResponse> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public List mo60807u(String str, Object obj) {
                        return (List) super.mo60330s(str, obj);
                    }
                }
            }

            public class ForwardingAddresses {

                public class Create extends GmailRequest<ForwardingAddress> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Create mo60807u(String str, Object obj) {
                        return (Create) super.mo60330s(str, obj);
                    }
                }

                public class Delete extends GmailRequest<Void> {
                    @Key
                    private String forwardingEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Delete mo60807u(String str, Object obj) {
                        return (Delete) super.mo60330s(str, obj);
                    }
                }

                public class Get extends GmailRequest<ForwardingAddress> {
                    @Key
                    private String forwardingEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Get mo60807u(String str, Object obj) {
                        return (Get) super.mo60330s(str, obj);
                    }
                }

                public class List extends GmailRequest<ListForwardingAddressesResponse> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public List mo60807u(String str, Object obj) {
                        return (List) super.mo60330s(str, obj);
                    }
                }
            }

            public class GetAutoForwarding extends GmailRequest<AutoForwarding> {
                @Key
                private String userId;

                /* renamed from: v */
                public GetAutoForwarding mo60807u(String str, Object obj) {
                    return (GetAutoForwarding) super.mo60330s(str, obj);
                }
            }

            public class GetImap extends GmailRequest<ImapSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public GetImap mo60807u(String str, Object obj) {
                    return (GetImap) super.mo60330s(str, obj);
                }
            }

            public class GetPop extends GmailRequest<PopSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public GetPop mo60807u(String str, Object obj) {
                    return (GetPop) super.mo60330s(str, obj);
                }
            }

            public class GetVacation extends GmailRequest<VacationSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public GetVacation mo60807u(String str, Object obj) {
                    return (GetVacation) super.mo60330s(str, obj);
                }
            }

            public class SendAs {

                public class Create extends GmailRequest<com.google.api.services.gmail.model.SendAs> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Create mo60807u(String str, Object obj) {
                        return (Create) super.mo60330s(str, obj);
                    }
                }

                public class Delete extends GmailRequest<Void> {
                    @Key
                    private String sendAsEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Delete mo60807u(String str, Object obj) {
                        return (Delete) super.mo60330s(str, obj);
                    }
                }

                public class Get extends GmailRequest<com.google.api.services.gmail.model.SendAs> {
                    @Key
                    private String sendAsEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Get mo60807u(String str, Object obj) {
                        return (Get) super.mo60330s(str, obj);
                    }
                }

                public class List extends GmailRequest<ListSendAsResponse> {
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public List mo60807u(String str, Object obj) {
                        return (List) super.mo60330s(str, obj);
                    }
                }

                public class Patch extends GmailRequest<com.google.api.services.gmail.model.SendAs> {
                    @Key
                    private String sendAsEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Patch mo60807u(String str, Object obj) {
                        return (Patch) super.mo60330s(str, obj);
                    }
                }

                public class SmimeInfo {

                    public class Delete extends GmailRequest<Void> {
                        @Key

                        /* renamed from: id */
                        private String f52878id;
                        @Key
                        private String sendAsEmail;
                        @Key
                        private String userId;

                        /* renamed from: v */
                        public Delete mo60807u(String str, Object obj) {
                            return (Delete) super.mo60330s(str, obj);
                        }
                    }

                    public class Get extends GmailRequest<com.google.api.services.gmail.model.SmimeInfo> {
                        @Key

                        /* renamed from: id */
                        private String f52879id;
                        @Key
                        private String sendAsEmail;
                        @Key
                        private String userId;

                        /* renamed from: v */
                        public Get mo60807u(String str, Object obj) {
                            return (Get) super.mo60330s(str, obj);
                        }
                    }

                    public class Insert extends GmailRequest<com.google.api.services.gmail.model.SmimeInfo> {
                        @Key
                        private String sendAsEmail;
                        @Key
                        private String userId;

                        /* renamed from: v */
                        public Insert mo60807u(String str, Object obj) {
                            return (Insert) super.mo60330s(str, obj);
                        }
                    }

                    public class List extends GmailRequest<ListSmimeInfoResponse> {
                        @Key
                        private String sendAsEmail;
                        @Key
                        private String userId;

                        /* renamed from: v */
                        public List mo60807u(String str, Object obj) {
                            return (List) super.mo60330s(str, obj);
                        }
                    }

                    public class SetDefault extends GmailRequest<Void> {
                        @Key

                        /* renamed from: id */
                        private String f52880id;
                        @Key
                        private String sendAsEmail;
                        @Key
                        private String userId;

                        /* renamed from: v */
                        public SetDefault mo60807u(String str, Object obj) {
                            return (SetDefault) super.mo60330s(str, obj);
                        }
                    }
                }

                public class Update extends GmailRequest<com.google.api.services.gmail.model.SendAs> {
                    @Key
                    private String sendAsEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Update mo60807u(String str, Object obj) {
                        return (Update) super.mo60330s(str, obj);
                    }
                }

                public class Verify extends GmailRequest<Void> {
                    @Key
                    private String sendAsEmail;
                    @Key
                    private String userId;

                    /* renamed from: v */
                    public Verify mo60807u(String str, Object obj) {
                        return (Verify) super.mo60330s(str, obj);
                    }
                }
            }

            public class UpdateAutoForwarding extends GmailRequest<AutoForwarding> {
                @Key
                private String userId;

                /* renamed from: v */
                public UpdateAutoForwarding mo60807u(String str, Object obj) {
                    return (UpdateAutoForwarding) super.mo60330s(str, obj);
                }
            }

            public class UpdateImap extends GmailRequest<ImapSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public UpdateImap mo60807u(String str, Object obj) {
                    return (UpdateImap) super.mo60330s(str, obj);
                }
            }

            public class UpdatePop extends GmailRequest<PopSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public UpdatePop mo60807u(String str, Object obj) {
                    return (UpdatePop) super.mo60330s(str, obj);
                }
            }

            public class UpdateVacation extends GmailRequest<VacationSettings> {
                @Key
                private String userId;

                /* renamed from: v */
                public UpdateVacation mo60807u(String str, Object obj) {
                    return (UpdateVacation) super.mo60330s(str, obj);
                }
            }
        }

        public class Stop extends GmailRequest<Void> {
            @Key
            private String userId;

            /* renamed from: v */
            public Stop mo60807u(String str, Object obj) {
                return (Stop) super.mo60330s(str, obj);
            }
        }

        public class Threads {

            public class Delete extends GmailRequest<Void> {
                @Key

                /* renamed from: id */
                private String f52881id;
                @Key
                private String userId;

                /* renamed from: v */
                public Delete mo60807u(String str, Object obj) {
                    return (Delete) super.mo60330s(str, obj);
                }
            }

            public class Get extends GmailRequest<Thread> {
                @Key
                private String format;
                @Key

                /* renamed from: id */
                private String f52882id;
                @Key
                private java.util.List<String> metadataHeaders;
                @Key
                private String userId;

                /* renamed from: v */
                public Get mo60807u(String str, Object obj) {
                    return (Get) super.mo60330s(str, obj);
                }
            }

            public class List extends GmailRequest<ListThreadsResponse> {
                @Key
                private Boolean includeSpamTrash;
                @Key
                private java.util.List<String> labelIds;
                @Key
                private Long maxResults;
                @Key
                private String pageToken;
                @Key

                /* renamed from: q */
                private String f52883q;
                @Key
                private String userId;

                /* renamed from: v */
                public List mo60807u(String str, Object obj) {
                    return (List) super.mo60330s(str, obj);
                }
            }

            public class Modify extends GmailRequest<Thread> {
                @Key

                /* renamed from: id */
                private String f52884id;
                @Key
                private String userId;

                /* renamed from: v */
                public Modify mo60807u(String str, Object obj) {
                    return (Modify) super.mo60330s(str, obj);
                }
            }

            public class Trash extends GmailRequest<Thread> {
                @Key

                /* renamed from: id */
                private String f52885id;
                @Key
                private String userId;

                /* renamed from: v */
                public Trash mo60807u(String str, Object obj) {
                    return (Trash) super.mo60330s(str, obj);
                }
            }

            public class Untrash extends GmailRequest<Thread> {
                @Key

                /* renamed from: id */
                private String f52886id;
                @Key
                private String userId;

                /* renamed from: v */
                public Untrash mo60807u(String str, Object obj) {
                    return (Untrash) super.mo60330s(str, obj);
                }
            }
        }

        public class Watch extends GmailRequest<WatchResponse> {
            @Key
            private String userId;

            /* renamed from: v */
            public Watch mo60807u(String str, Object obj) {
                return (Watch) super.mo60330s(str, obj);
            }
        }

        public Users() {
        }

        /* renamed from: a */
        public Messages mo60806a() {
            return new Messages();
        }
    }

    static {
        Preconditions.m72720h(GoogleUtils.f52229a.intValue() == 1 && GoogleUtils.f52230b.intValue() >= 15, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.23.0 of the Gmail API library.", GoogleUtils.f52232d);
    }

    Gmail(Builder builder) {
        super(builder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo60309g(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
        super.mo60309g(abstractGoogleClientRequest);
    }

    /* renamed from: l */
    public Users mo60800l() {
        return new Users();
    }
}
