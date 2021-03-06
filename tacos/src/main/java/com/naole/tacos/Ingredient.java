package com.naole.tacos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Ingredient {
   @Id
   private String id;
   private String name;
   private Type type;
   public static enum Type {
       WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
   }
}
