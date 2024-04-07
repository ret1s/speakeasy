package com.swa.speakeasy.entity.keys;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FriendshipId implements Serializable {

    private Integer userId;
    private Integer friendId;

}
