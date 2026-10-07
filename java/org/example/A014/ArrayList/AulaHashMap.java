package org.example.A014.ArrayList;

import java.util.HashMap;

public class AulaHashMap {
    static void main() {

        /*..put("Ana", 28);
        .get("Ana"); - retonar a informação que foi identificada na lista
        .getOrDefault("Zoe", 0); - retorna uma mensagem de erro para caso o usuario procure algo que nao existe
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Rachel", "rachel.green@gmail.com");
        System.out.println(emails.get("Rachel"));
        System.out.println(emails.getOrDefault("rachel.green@gmail.com", "Posição inválida"));


    }
}
