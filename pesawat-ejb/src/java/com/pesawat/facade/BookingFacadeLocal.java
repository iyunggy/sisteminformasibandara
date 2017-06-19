/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.facade;

import com.pesawat.model.Booking;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MuhammadKhoirul
 */
@Local
public interface BookingFacadeLocal {

    void create(Booking booking);

    void edit(Booking booking);

    void remove(Booking booking);

    Booking find(Object id);

    List<Booking> findAll();

    List<Booking> findRange(int[] range);

    int count();
    
}
