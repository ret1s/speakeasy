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
@Table(name = "groups")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "creation_datetime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDatetime;

    @OneToMany(mappedBy = "recipient")
    private Set<Conversation> receivedConversations;

    @OneToMany(mappedBy = "group")
    private Set<GroupMembership> memberships;

}
