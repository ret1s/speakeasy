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
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "activity", nullable = false)
    private String activity;

    @Column(name = "phone_number", nullable = false)
    private Long phoneNumber;

    @Column(name = "email_address", nullable = false)
    private String email;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String className;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "creation_datetime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDatetime;

    @Column(name = "modification_datetime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificationDatetime;

    @OneToMany(mappedBy = "user")
    private Set<Friendship> friendships; // Friends of user

    @OneToMany(mappedBy = "friend")
    private Set<Friendship> friendOf; // Friendships where this user is 'friend

    @OneToMany(mappedBy = "sender")
    private Set<Conversation> sentConversations;

    @OneToMany(mappedBy = "recipient")
    private Set<Conversation> receivedConversations;

    @OneToMany(mappedBy = "user")
    private Set<GroupMembership> memberships;

}
