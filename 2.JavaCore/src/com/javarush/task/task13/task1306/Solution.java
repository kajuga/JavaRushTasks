package com.javarush.task.task13.task1306;

/* 
Баг в initializeIdAndName
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
        System.out.println(Matrix.TRINITY);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
        public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return new User();
        }


        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }

}
/*
Все довольно просто, вижу, что возникает недопонимание, по сему объясняю то, как усвоил урок я:
 1. интерфейсы могут лишь объявлять методы, но реализуются они уже в классах, именно по-этому интерфейс
 в задаче будет выполнен следующим образом:
 interface DBObject {
 DBObject initializeIdAndName(long id, String name);
 }
 2. По условию задачи и по смыслу кода у "Матрицы" создаются 2 новых пользователя NEO и TRINITY,
 мы видим это в реализации класса Matrix : public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
 3. Исходя из пункта 2 создаются эти "персонажи матрицы" через метод User().initializeIdAndName(id, name),
 а это значит, что нам нужно корректно прописать этот метод, стало быть в классе User() мы пишем реализацию метода:
 public User initializeIdAndName(long id, String name) {
 this.id = id;
 this.name = name;
 return new User();
 }

 */