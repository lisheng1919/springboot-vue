package com.lisheng.manage.domain;

import com.lisheng.base.jpa.AbstractAuditingEntityWithId;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode(callSuper=true)
public class User extends AbstractAuditingEntityWithId {

    @Column(length = 20)
    private String name;

    @Column(length = 20)
    private String password;
}
