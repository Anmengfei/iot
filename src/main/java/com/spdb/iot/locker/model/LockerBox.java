package com.spdb.iot.locker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "LockerBox")
@Wither
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonDeserialize(builder = LockerBox.LockerBoxBuilder.class)
@Builder(builderClassName = "LockerBoxBuilder", toBuilder = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LockerBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private Integer lockerId;

    @NotBlank
    private String number;

    @NotBlank
    private String vin_code;

    @NotBlank
    private String status;

    @JsonPOJOBuilder(withPrefix = "")
    public static class LockerBoxBuilder {}

}
