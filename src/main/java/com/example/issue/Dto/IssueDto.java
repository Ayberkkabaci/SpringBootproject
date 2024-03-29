package com.example.issue.Dto;
import com.example.issue.entity.IssueStatus;
import lombok.Data;
import java.util.Date;
@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto projectDto;
}
