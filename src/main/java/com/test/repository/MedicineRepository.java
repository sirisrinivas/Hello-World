/**
 * 
 */
package com.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.model.Medicine;

/**
 * @author satya
 *
 */
public interface MedicineRepository  extends CrudRepository<Medicine, Long>{

}
