package com.example.springmvc2.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * お問い合わせフォーム用のModelです。
 * <p>バリデーション用のアノテーションでエラーチェックを行います。
 */
@Data
public class Inquiry {

    /**
     * お名前
     * <p>必須入力、60文字まで
     */
    @NotBlank
    @Size(max = 60)
    private String name;

    /**
     * Email
     * <p>必須入力、Email形式、254文字まで
     */
    @NotBlank
    @Email
    @Size(max = 254)
    private String email;

    /**
     * お問い合わせ
     * <p>必須入力、500文字まで
     */
    @NotBlank
    @Size(max = 500)
    private String inquiry;

}
