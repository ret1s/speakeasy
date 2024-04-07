package com.swa.speakeasy.entity.keys;

import jakarta.persistence.Embeddable;

@Embeddable
public class GroupMembershipId {

    private Integer groupId;
    private Integer userId;

}
