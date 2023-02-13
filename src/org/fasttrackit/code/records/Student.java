package org.fasttrackit.code.records;

public record Student(
        String name,
        Integer age,
        Integer grade
) {
    public void saySomething(){
        System.out.println("Bau");
    }
}
