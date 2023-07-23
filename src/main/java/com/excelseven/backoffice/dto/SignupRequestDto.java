package com.excelseven.backoffice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {

    @NotBlank
    @Size(min = 4, max = 10, message = "4자 이상, 10자 이하로 작성해주세요.")
    @Pattern(regexp = "^[a-z0-9]*$", message = "알파벳 소문자(a~z), 숫자(0~9)")
    private String username;

//    @NotBlank
//    @Size(min = 4, max = 10, message = "4자 이상, 10자 이하")
//    @Pattern(regexp = "^[a-z0-9]*$", message = "알파벳 소문자(a~z), 숫자(0~9)")
//    private String nickname;

    @NotBlank
    @Size(min = 8, max = 15, message = "8자 이상, 15자 이하로 작성해주세요.")
    @Pattern(regexp = "^[A-Za-z0-9`~!@#$%^&*()-_=+]*$", message = "알파벳 대소문자(a~z, A~Z), 숫자(0~9), 특수문자(`~!@#$%^&*()-_=+)")
    private String password;

    @NotBlank
    @Size(min = 6, max = 100, message = "6자 이상, 100자 이하로 작성해주세요.")
    private String introduce;

    @NotBlank
    //이메일 형식만 가능
    @Email
    private String email;
}
