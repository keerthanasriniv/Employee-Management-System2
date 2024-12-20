
package com.spring.emps.repo;

import com.spring.emps.model.EmpsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpsRepo extends JpaRepository<EmpsModel,Integer> {

}
