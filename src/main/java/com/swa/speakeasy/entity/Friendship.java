package com.swa.speakeasy.entity;

import com.swa.speakeasy.entity.keys.FriendshipId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "friendships")
public class Friendship {

    @EmbeddedId
    private FriendshipId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("friendId")
    @JoinColumn(name = "friend_id")
    private User friend;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "creation_datetime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDatetime;

}
