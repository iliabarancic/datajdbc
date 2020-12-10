package de.ilia.datajdbc

import org.junit.jupiter.api.Test
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest
import org.springframework.test.context.jdbc.Sql

@DataJdbcTest
@Sql("/init.sql")
class JediRepositoryTest {


    /**
     * Test 1: Jedi Klasse mit JDBCRepository speichern. Ein Attribut ändern und erneut speichern
     */

    /**
     * Test 2: Ein Jedi kann 1 bis n Lichschwerter haben ( Attribute kann man selber erfinden z.B. Farbe) .
     *  Modelliert die Relation als ein Set, speichert und entfert die Lichtschwerter im Test. Ändert die Beziehung zu einer Liste.
     *  Was hat sich geändert?
     */

    /**
     * Test 3: Schreibt einer Custom query mit einer @Query Annotation.
     */

    /**
     * Test 4 (Bonusaufgabe): implementiert Optimistic Locking
     */

}
