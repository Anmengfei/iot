package com.spdb.iot.locker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "LockerQrcode")
@Wither
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonDeserialize(builder = LockerQrcode.LockerQrcodeBuilder.class)
@Builder(builderClassName = "LockerQrcodeBuilder", toBuilder = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LockerQrcode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String validated_str;

    @NotBlank
    private Integer used;

    @NotBlank
    private Date generated_time;

    private Date validated_time;

    private String lockerNo;

    private String operator;

    private String number;

    private Integer dealer;

    @JsonPOJOBuilder(withPrefix = "")
    public static class LockerQrcodeBuilder {}

}
