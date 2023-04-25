package test;

import controller.Controller;
import controller.IController;
import ordination.Laegemiddel;
import ordination.Ordination;
import ordination.Patient;
import org.junit.Assert;
import org.junit.Test;
import storage.IStorage;
import storage.Storage;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class IControllerTest {
    IController controller;
    IStorage mockedStorage;
    Ordination mockedOrdination;
    Laegemiddel mockLaegemiddel;

    @Test
    public void Mocking_antalOrdinationerPrVægtPrLægemiddel() {
        double vægtStart = 45;
        double vægtSlut = 55;
        ArrayList<Ordination> ordinationer = new ArrayList<>();
        ArrayList<Patient> patienter = new ArrayList<>();
        Laegemiddel laegemiddel = new Laegemiddel("Ritalin", 1, 4, 10, "enhed");
        Patient patient = mock(Patient.class);
        patienter.add(patient);
        when(patient.getVaegt()).thenReturn(46.0);
        Ordination ordination = mock(Ordination.class);
        ordinationer.add(ordination);
        when(ordination.getLaegemiddel()).thenReturn(laegemiddel);
        when(patient.getOrdinationer()).thenReturn(ordinationer);
        Storage storage = mock(Storage.class);
        when(storage.getAllPatienter()).thenReturn(patienter);
        Controller controller = new Controller(storage);

        //act
        int resultat = controller.antalOrdinationerPrVægtPrLægemiddel(vægtStart, vægtSlut, laegemiddel);

        //assert
        assertEquals(1, resultat);
        /*
        //Arrange
        controller = Controller.getController();
        mockedStorage = mock(IStorage.class);
        mockedOrdination = mock(Ordination.class);
        mockLaegemiddel = mock(Laegemiddel.class);
        ArrayList<Patient> patients = new ArrayList<>();
        Patient patient = new Patient("1", "ma", 100);
        Patient patient2 = new Patient("2", "ca", 101);
        patients.add(patient);
        patients.add(patient2);

        when(mockedStorage.getAllPatienter()).thenReturn(patients);

        //Act
        Controller.getController().antalOrdinationerPrVægtPrLægemiddel(5, 100, mockLaegemiddel);

        //Assert
        verify(mockedStorage).getAllPatienter();
        int faktisk = verify(Controller.getController()).antalOrdinationerPrVægtPrLægemiddel(5, 100, mockLaegemiddel);
        assertEquals(faktisk, 2);
        */

    }
}
