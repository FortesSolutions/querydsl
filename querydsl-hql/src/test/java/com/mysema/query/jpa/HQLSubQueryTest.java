package com.mysema.query.jpa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mysema.query.hql.domain.QCat;
import com.mysema.query.jpa.HQLSubQuery;

public class HQLSubQueryTest {
    
    @Test
    public void Multiple_Projections(){
        HQLSubQuery query = new HQLSubQuery();
        query.from(QCat.cat);
        assertEquals(1, query.list(QCat.cat).getMetadata().getProjection().size());
        assertEquals(1, query.list(QCat.cat).getMetadata().getProjection().size());
    }

}