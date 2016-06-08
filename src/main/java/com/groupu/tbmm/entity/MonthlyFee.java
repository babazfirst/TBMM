package com.groupu.tbmm.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Created by baba on 6/9/2016.
 */
@Document(collection = "MonthlyFee")
public class MonthlyFee {

    @Id
    private String id;
    @DBRef
    private Member member;
    private LocalDateTime month;
    private boolean isPaid;

    public MonthlyFee() {
    }

    public MonthlyFee(String id, Member member, LocalDateTime month, boolean isPaid) {
        this.id = id;
        this.member = member;
        this.month = month;
        this.isPaid = isPaid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDateTime getMonth() {
        return month;
    }

    public void setMonth(LocalDateTime month) {
        this.month = month;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
