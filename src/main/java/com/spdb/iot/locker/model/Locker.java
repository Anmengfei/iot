package com.spdb.iot.locker.model;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.*;

import lombok.experimental.Wither;

import java.util.Date;

/**
 * @author xiecf
 */
@Entity
@Table(name = "Locker")
@Wither
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonDeserialize(builder = Locker.LockerBuilder.class)
@Builder(builderClassName = "LockerBuilder", toBuilder = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Locker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String lockerNo;

    @NotBlank
    private String dealer;

    @NotBlank
    private String supervisor;

    @NotNull
    private Integer active;

    private Date heartbeat_time;
    /**
     * @author xiecf
     */
    @JsonPOJOBuilder(withPrefix = "")
    public static class LockerBuilder {}
}


