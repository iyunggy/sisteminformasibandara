/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesawat.facade;

import com.pesawat.model.Pesawat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author MuhammadKhoirul
 */
@Local
public interface PesawatFacadeLocal {

    void create(Pesawat pesawat);

    void edit(Pesawat pesawat);

    void remove(Pesawat pesawat);

    Pesawat find(Object id);

    List<Pesawat> findAll();

    List<Pesawat> findRange(int[] range);

    int count();
    
}
