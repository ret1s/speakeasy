package com.swa.speakeasy.entity;

import com.swa.speakeasy.enums.MessageStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MessageStatus messageStatus;

    private String messageValue;

    @ManyToOne
    @JoinColumn(name = "sender") // Messages must have a sender
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver") // Messages must have a sender
    private User receiver;

    @ManyToOne
    @JoinColumn(name = "group_chat_id")
    private GroupChat groupChat;

    @ManyToOne
    @JoinColumn(name = "direct_chat_id")
    private DirectChat directChat;
}
