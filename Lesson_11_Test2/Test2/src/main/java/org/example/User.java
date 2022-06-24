package org.example;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @SerializedName("user_name")
    private String username;

    @SerializedName("pass_word")
    private String password;

    @Override
    public String toString() {
        return username + " - " + password;
    }
}
