package Bakery.src.controller;

import Bakery.src.model.*;

public interface CookieControllerI {

    Dough prepareDough(Recipe recipe);

    Cookie[] makeCookies(Dough dough);
}
