package com.example.validatingforminput;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {
  // null値を許可しない
  @NotNull
  // 2~30文字の名前を使用できる
  @Size(min = 2, max = 30)
  private String name;

  @NotNull
  // 年齢を18歳以下にはできない
  @Min(18)
  private Integer age;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String toString() {
    return "person(Name: " + this.name + ", Age: " + this.age + ")";
  }
}
