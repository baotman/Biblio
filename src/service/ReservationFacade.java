/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import bean.Reservation;
import bean.ReservationItem;
import java.util.List;

/**
 *
 * @author hp
 */
public class ReservationFacade extends AbstractFacade<Reservation> {

    ReservationItemFacade reservationItemFacade= new ReservationItemFacade();
    public ReservationFacade() {
        super(Reservation.class);
    }
    
    public int save(Reservation reservation, List<ReservationItem> reservationItems){
        create(reservation);
        for (ReservationItem reservationItem : reservationItems) {
            reservationItem.setReservation(reservation);
            reservationItemFacade.create(reservationItem);
        }
        return 1;
    }

    
}
