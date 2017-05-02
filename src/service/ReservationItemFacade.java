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
 * @author farah
 */
public class ReservationItemFacade extends AbstractFacade<ReservationItem> {

    public ReservationItemFacade() {
        super(ReservationItem.class);
    }

    public List<ReservationItem> findByReservation(Reservation reservation) {
       return  getEntityManager().createQuery("SELECT resItem FROM ReservationItem resItem "
                + "WHERE resItem.reservation.id= " + reservation.getId()).getResultList();
    }

}
