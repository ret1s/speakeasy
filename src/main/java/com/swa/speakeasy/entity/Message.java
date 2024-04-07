package com.swa.speakeasy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text_body")
    private String textBody;

    @Column(name = "send_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTime;

    @OneToOne(mappedBy = "message")
    private Conversation conversation;

}
