package com.spdb.iot.locker.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;
import lombok.experimental.Wither;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "LockerRecord")
@Wither
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@JsonDeserialize(builder = LockerRecord.LockerRecordBuilder.class)
@Builder(builderClassName = "LockerRecordBuilder", toBuilder = true)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LockerRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private Integer locker_box_id;

    @NotNull
    private Date record_time;

    @NotBlank
    private String operation;

    private String operator;


    @JsonPOJOBuilder(withPrefix = "")
    public static class LockerRecordBuilder {}
}
