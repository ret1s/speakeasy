package com.swa.speakeasy.entity;

import com.swa.speakeasy.entity.keys.GroupMembershipId;
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
@Table(name = "group_memberships")
public class GroupMembership {

    @EmbeddedId
    private GroupMembershipId id;

    @ManyToOne
    @MapsId("groupId")
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "creation_datetime", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDatetime;

}
