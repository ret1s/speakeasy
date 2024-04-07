package com.swa.speakeasy.entity;

import com.swa.speakeasy.entity.keys.ConversationId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conversations")
public class Conversation {

    @EmbeddedId
    private ConversationId id;

    @ManyToOne
    @MapsId("senderId")
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @MapsId("recipientId")
    @JoinColumn(name = "recipient_id")
    private Object recipient;

    @OneToOne
    @MapsId("messageId")
    @JoinColumn(name = "message_id")
    private Message message;

}
