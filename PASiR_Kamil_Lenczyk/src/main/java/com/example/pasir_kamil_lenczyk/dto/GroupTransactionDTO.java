package com.example.pasir_kamil_lenczyk.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class GroupTransactionDTO {
    private Long groupId;
    private Double amount;
    private String type;
    private String title;
    private List<Long> selectedUserIds;
}
