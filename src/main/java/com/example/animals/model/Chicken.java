package com.example.animals.model;

import com.example.animals.model.constant.Constant;
import com.example.animals.model.interfaces.CanSing;
import com.example.animals.model.interfaces.CanWalk;

import java.util.HashMap;
import java.util.Map;

public class Chicken extends Bird implements CanWalk, CanSing {

  private Map<String, String> languages = new HashMap<>();

  public Chicken(boolean isMale) {
    this.setMale(isMale);
    if (this.isMale()) {
      this.setLanguage("English");
      languages.clear();
      setLanguages();
    }
  }

  public void sing() {
    if (this.isMale()) {
      System.out.println(this.languages.get(this.getLanguage()));
    } else {
      System.out.println(Constant.CHICKEN_SING);
    }
  }

  @Override
  public void walk() {
    System.out.println(Constant.CAN_WALK);
  }

  private void setLanguages() {
    languages.put("Danish","kykyliky");
    languages.put("Dutch","kukeleku");
    languages.put("Finnish","kukko kiekuu");
    languages.put("French","cocorico");
    languages.put("German","kikeriki");
    languages.put("Greek","kikiriki");
    languages.put("Hebrew","coo-koo-ri-koo");
    languages.put("Hungarian","kukuriku");
    languages.put("Italian","chicchirichi");
    languages.put("Japanese","ko-ke-kok-ko-o");
    languages.put("Portuguese","cucurucu");
    languages.put("Russian","kukareku");
    languages.put("Swedish","kuckeliku");
    languages.put("Turkish","kuk-kurri-kuuu");
    languages.put("Urdu","kuklooku");

  }

}
