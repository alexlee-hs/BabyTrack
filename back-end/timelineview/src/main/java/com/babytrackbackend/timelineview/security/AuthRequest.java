package com.babytrackbackend.timelineview.security;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AuthRequest {
    private String username;
    private String password;
}
