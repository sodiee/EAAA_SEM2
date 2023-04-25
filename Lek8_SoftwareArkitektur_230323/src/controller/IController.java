package controller;

import ordination.Laegemiddel;

public interface IController {
    int antalOrdinationerPrVægtPrLægemiddel(double vægtStart, double dægtSlut, Laegemiddel laegemiddel);
}
