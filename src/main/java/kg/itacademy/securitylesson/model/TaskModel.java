package kg.itacademy.securitylesson.model;

import kg.itacademy.securitylesson.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskModel {
    private String title;
    private String text;
    private Boolean isDone;
    
}
