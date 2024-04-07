package com.swa.speakeasy.entity.keys;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ConversationId implements Serializable {

    private Integer senderId;
    private Integer recipientId;
    private Long messageId;

}
