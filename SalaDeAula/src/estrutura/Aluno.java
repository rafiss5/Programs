package estrutura;

public class Aluno {

    private String name;
    private String registration;
    private String cpf;
    private int age;

    public Aluno() {
        this.name = "";
        this.registration = "";
        this.cpf = "";
        this.age = 0;
    }

    public Aluno(String name, String registration, String cpf, int age) {
        this.name = name;
        this.registration = registration;
        this.cpf = cpf;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name
                + "\nRegistration: " + registration
                + "\nCPF: " + cpf
                + "\nAge: " + age;
    }
}

