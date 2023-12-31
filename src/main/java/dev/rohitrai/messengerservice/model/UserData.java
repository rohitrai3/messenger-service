package dev.rohitrai.messengerservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
public class UserData {

    @NonNull
    private String username;
    @NonNull
    private String name;
    @NonNull
    private String photoUrl;
}
