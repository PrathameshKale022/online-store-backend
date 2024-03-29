package com.ekfcstore.onlinestore.auth.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private Collection<String> roles;
}
