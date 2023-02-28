package test;

import BilForsikring.model.BilForsikring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilForsikringTest extends Throwable {

    @Test
    void beregnPraemie_24m_0år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 0;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 1250;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_24k_0år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 0;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 1187.5;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_24m_3år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 3;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 1062.5;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_24k_3år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 3;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 1009.375;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_24m_8år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 8;

        // Act
        // Arrenge
        Exception forventet = assertThrows(RuntimeException.class, () -> {
            bf.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertEquals(forventet.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }

    @Test
    void beregnPraemie_24k_8år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 8;

        // Act

        // Arrenge
        Exception forventet = assertThrows(RuntimeException.class, () -> {
            bf.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertEquals(forventet.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }

    @Test
    void beregnPraemie_26m_3år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 3;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 1062.5;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_26k_3år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 3;

        // Act

        // Arrenge

    }

    @Test
    void beregnPraemie_26m_6år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 6;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 937.5;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_26k_6år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 6;

        // Act
        double faktisk = bf.beregnPraemie(alder, isKvinde, skadeFrieaer);

        // Arrenge
        double forventet = 890.625;
        assertEquals(forventet, faktisk);
    }

    @Test
    void beregnPraemie_26m_9år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = false;
        int skadeFrieaer = 9;

        // Act

        // Arrenge
        Exception forventet = assertThrows(RuntimeException.class, () -> {
            bf.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertEquals(forventet.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }

    @Test
    void beregnPraemie_26k_9år() {
        BilForsikring bf = new BilForsikring();
        bf.setGrundpaemie(1000);

        // Arrange
        int alder = 24;
        boolean isKvinde = true;
        int skadeFrieaer = 9;

        // Act

        // Arrenge
        Exception forventet = assertThrows(RuntimeException.class, () -> {
            bf.beregnPraemie(alder, isKvinde, skadeFrieaer);
        });
        assertEquals(forventet.getMessage(), "Du kan ikke have kaert skadefri saelaenge");
    }
}