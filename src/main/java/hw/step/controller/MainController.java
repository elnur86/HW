package hw.step.controller;

import hw.step.service.MainService;

public class MainController {
  private final MainService mainService;

  public MainController() {
    this.mainService = new MainService();
  }

  public String help() {
    return mainService.menuContent();
  }
}
