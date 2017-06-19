/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.bean;

import com.pesawat.facade.BookingFacadeLocal;
import com.pesawat.model.Booking;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author KHOIRUL
 */
@ManagedBean(name = "bookingBean")
@SessionScoped
public class BookingBean implements Serializable  {
    @EJB
    private BookingFacadeLocal bookingDao;
    
    private List<Booking> bookings=new ArrayList<>();
   
    private Booking booking;
    
    /**
     * Creates a new instance of BookingBean
     */
    public BookingBean() {
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    
    public List<Booking> getBookings() {
        bookings = bookingDao.findAll();
        return bookings;
    }
    
    public void submitBooking(ActionEvent e) {
        try {
            if(this.getBooking().getId()== 0) { bookingDao.create(this.getBooking()); return;}
            bookingDao.edit(this.getBooking());
        }catch(Exception ex) {
            System.out.print(ex.toString());
        }

    }
    
    public void edit(Booking b){
      this.booking=b;
    }
    
    public void add(ActionEvent e) {
        this.booking=new Booking();
    }
    
}
