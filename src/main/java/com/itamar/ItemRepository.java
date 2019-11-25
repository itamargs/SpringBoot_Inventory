package com.itamar;

// Spring Data Repository


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //let spring knows that this is our repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
Item findByItemNo(int itemNo);

}