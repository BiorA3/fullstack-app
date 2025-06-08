package com.example.pasir_kamil_lenczyk.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppInfo {
    public String appName;
    public String appVersion;
    public String message;
}

