package hw.step.service;

import hw.step.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
