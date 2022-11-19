package com.backend.reservationservice.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Reservation {

    @Id
    private String id;

    private Long owner;

    private Long responsable;

    private List<Long> players;

    private Date dateReservation;

    private Long pitch;

    private Date created_at;

}
