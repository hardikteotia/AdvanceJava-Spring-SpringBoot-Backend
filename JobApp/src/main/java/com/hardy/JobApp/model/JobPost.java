package com.Hardy.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Component
public class JobPost {


    private int postId;
    private String postProfile;
    private String postDesc;
    private int postExperience;
    private List<String> postStack;
}
